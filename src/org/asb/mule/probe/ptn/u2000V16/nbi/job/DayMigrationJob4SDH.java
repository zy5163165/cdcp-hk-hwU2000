package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import java.io.File;
import java.util.*;

import com.alcatelsbell.cdcp.domain.SummaryUtil;
import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.MessageUtil;
import com.alcatelsbell.cdcp.nodefx.NodeContext;
import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.util.SysProperty;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.*;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;

import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.*;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class DayMigrationJob4SDH extends MigrateCommonJob implements CommandBean {

    private FileLogger nbilog = null;
    private String name = "";
    private String emstype = "OTN";
    private SqliteConn sqliteConn = null;
    public String getEmstype() {
        return emstype;
    }


    public void setEmstype(String emstype) {
        this.emstype = emstype;
    }
    private long start = System.currentTimeMillis();

    @Override
    public void execute(JobExecutionContext arg0) {

        Date startTime = new Date();
        // nbilog = new FileLogger(service.getEmsName() + "/nbi.log");
        nbilog = ((U2000Service) service).getCorbaService().getNbilog();
        //
        if (!service.getConnectState()) {
            nbilog.error(">>>EMS is disconnect.");
            return;
        }


        boolean retrieveTrunckRoute = true;
        boolean retrieveFtpPtp = true;
        boolean debugMode = false;

        nbilog.info("Using"+getClass());

        nbilog.info("Start for task : " + serial);
        nbilog.error("trace",new java.lang.Exception("trace"));
        nbilog.info("logical="+logical);
        nbilog.info("Start to migrate all data from ems: " + service.getEmsName());
        ObjectUtil.newFolder("../cache/"+service.getEmsName());
        String dir = SysProperty.getString("cdcp.node.db.dir", "");
        if (!dir.isEmpty() && !(dir.endsWith("/") || dir.endsWith("\\"))) dir += File.separator;
        if (!dir.isEmpty() && new File(dir).isDirectory()) new File(dir).mkdirs();
        String dbName = dir +getJobName() + ".db";
        nbilog.info("db: " + dbName);
        // name = "";// set empty to create new db instance
        try {
            // 0. set new db for new task.
            sqliteConn = new SqliteConn();
            sqliteConn.setDataPath(dbName);
            sqliteConn.init();

            if (!emstype.equals(EMS_TYPE_PTN)) {
                try {
                    nbilog.info("getAllProtectionSubnetworks");
                    SubnetworkProtectionDataTask subnetworkProtectionDataTask = new SubnetworkProtectionDataTask();
                    subnetworkProtectionDataTask.setSqliteConn(sqliteConn);
                    subnetworkProtectionDataTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
                    subnetworkProtectionDataTask.excute();
                    nbilog.info("getAllProtectionSubnetworks finish");
                } catch (Throwable e) {
                    nbilog.error(e,e);
                }
            }

            // 1.ne
            nbilog.info("ManagedElementDataTask : ");
            ObjectUtil.newFolder("../cache/"+service.getEmsName());

            ManagedElementDataTask neTask = new ManagedElementDataTask();
            neTask.setSqliteConn(sqliteConn);
            neTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
            Vector<BObject> neList = neTask.excute();

            // 2.rack,shelf,slot,card,port
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
            final Vector<BObject> phyVector = new Vector<BObject>();
            TaskPoolExecutor executor = new TaskPoolExecutor(5);
            for (BObject ne : neList) {
                PhysicalDataTask phyTask = new PhysicalDataTask();
                phyTask.logical = logical;

                if (logical)
                    phyTask.includeCC = true;

                phyTask.setSqliteConn(sqliteConn);
                phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, true);

                executor.executeTask(phyTask, new TaskResultHandler() {
                    @Override
                    public void handleResult(DataTask task, Object result) throws Exception {
                        phyVector.addAll((Vector) result);
                    }
                });

//                //PTN����Ҫ�ɼ�CC
//                if (logical) {
//                    CrossConnectionDataTask ccTask = new CrossConnectionDataTask();
//                    ccTask.setSqliteConn(sqliteConn);
//                    ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
//                    executor.executeTask(ccTask);
//                }
            }
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForAllFinish.");
            executor.waitingForAllFinish();
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForInsertBObject.");
            sqliteConn.waitingForInsertBObject();

            nbilog.info("SectionDataTask: ");
            SectionDataTask sectionTask = new SectionDataTask();
            sectionTask.setSqliteConn(sqliteConn);
            sectionTask.CreateTask(service, getJobName(), null, nbilog);
            Vector<BObject> sectionList = sectionTask.excute();

            
            //  3.sdh/otn
			nbilog.info("HW_MSTPDataTask: ");
			TaskPoolExecutor mstpExecutor = new TaskPoolExecutor(6);
			for (BObject ne : neList) {
				HW_MSTPDataTask task = new HW_MSTPDataTask();
				task.setSqliteConn(sqliteConn);
				task.CreateTask(service, getJobName(), ne.getDn(), nbilog);
				mstpExecutor.executeTask(task);
			}
			nbilog.info("HW_MSTPDataTask: waitingForAllFinish.");
			mstpExecutor.waitingForAllFinish();
			nbilog.info("HW_MSTPDataTask: waitingForInsertBObject.");
			sqliteConn.waitingForInsertBObject();

			if (logical) {
				nbilog.info("ELLDataTask: ");
				ELLDataTask ellTask = new ELLDataTask();
				ellTask.setSqliteConn(sqliteConn);
				ellTask.CreateTask(service, getJobName(), null, nbilog);
				ellTask.excute();

				nbilog.info("SNCDataTask: ");
				SNCDataTask ttTask = new SNCDataTask();
				ttTask.setSqliteConn(sqliteConn);
				ttTask.CreateTask(service, getJobName(), null, nbilog);
				Vector<BObject> ttVector = ttTask.excute();

				nbilog.info("SNCAndCCAndSectionDataTask: ");
				TaskPoolExecutor executor2 = new TaskPoolExecutor(6);
				for (BObject snc : ttVector) {
					SNCAndCCAndSectionDataTask task = new SNCAndCCAndSectionDataTask();
					task.setSqliteConn(sqliteConn);
					task.CreateTask(service, getJobName(), snc.getDn(), nbilog);
					executor2.executeTask(task);
				}
				nbilog.info("SNCAndCCAndSectionDataTask: waitingForAllFinish.");
				executor2.waitingForAllFinish();
				nbilog.info("SNCAndCCAndSectionDataTask: waitingForInsertBObject.");
				sqliteConn.waitingForInsertBObject();
			}
			
			
			//  4.ptn
			if (logical) {
				int multiThreadPoolSize = 3;
				nbilog.info("FlowDomainFragmentDataTask: ");
				MessageUtil.sendSBIMessage(serial, "FlowDomainFragmentDataTask", 40);
				FlowDomainFragmentDataTask ffdrTask = new FlowDomainFragmentDataTask();
				ffdrTask.CreateTask(service, getJobName(), null, nbilog);
				ffdrTask.setSqliteConn(sqliteConn);
				Vector<BObject> fdfrVector = ffdrTask.excute();

				nbilog.info("TrafficTrunkDataTask: ");
				MessageUtil.sendSBIMessage(serial, "TrafficTrunkDataTask", 50);
				// test
				List<String> names = ((U2000Service) service).retrieveAllTrafficTrunkNames();
				nbilog.debug("TrafficTrunkNames: " + names.size());
				// end
				TrafficTrunkDataTask ttTask = new TrafficTrunkDataTask();
				ttTask.CreateTask(service, getJobName(), null, nbilog);
				ttTask.setSqliteConn(sqliteConn);
				Vector<BObject> ttVector = ttTask.excute();
				
				nbilog.info("IPCrossConnectionDataTask: ");
				TaskPoolExecutor executor4 = new TaskPoolExecutor(multiThreadPoolSize);
				for (BObject ne : neList) {
					IPCrossConnectionDataTask task = new IPCrossConnectionDataTask();
					task.setSqliteConn(sqliteConn);
					task.CreateTask(service, getJobName(), ne.getDn(), nbilog);
					executor4.executeTask(task);
				}
				nbilog.info("IPCrossConnectionDataTask: waitingForAllFinish.");
				executor4.waitingForAllFinish();
				nbilog.info("IPCrossConnectionDataTask: waitingForInsertBObject.");

				nbilog.info("FTPAndPTPDataTask: ");
				MessageUtil.sendSBIMessage(serial, "FTPAndPTPDataTask", 60);
				TaskPoolExecutor executor3 = new TaskPoolExecutor(multiThreadPoolSize);
				System.out.println("phyVector size = " + (phyVector == null ? null : phyVector.size()));
				for (BObject phy : phyVector) {
					if (phy != null && phy instanceof PTP && phy.getDn().indexOf("FTP") != -1 && phy.getDn().contains("type=ethtrunk")) {
						// if (phy != null && phy instanceof PTP && phy.getDn().indexOf("FTP") != -1) {
						FTPAndPTPDataTask FtpAndPtpTask = new FTPAndPTPDataTask();
						FtpAndPtpTask.CreateTask(service, getJobName(), phy.getDn(), nbilog);
						FtpAndPtpTask.setSqliteConn(sqliteConn);
						executor3.executeTask(FtpAndPtpTask);
						// FtpAndPtpTask.excute();
					}
				}
				nbilog.info("FTPAndPTPDataTask: waitingForAllFinish.");
				executor3.waitingForAllFinish();
				nbilog.info("FTPAndPTPDataTask: waitingForInsertBObject.");

				nbilog.info("ProtectionGroupDataTask: ");
				MessageUtil.sendSBIMessage(serial, "ProtectionGroupDataTask", 65);
				ProtectionGroupDataTask pgTask = new ProtectionGroupDataTask();
				pgTask.CreateTask(service, getJobName(), null, nbilog);
				pgTask.setSqliteConn(sqliteConn);
				pgTask.excute();

				nbilog.info("FDFrRouteDataTask: ");
				MessageUtil.sendSBIMessage(serial, "FDFrRouteDataTask", 70);
				FDFrRouteDataTask fdfrRouteTask = new FDFrRouteDataTask();
				for (BObject fdfr : fdfrVector) {
					fdfrRouteTask.CreateTask(service, getJobName(), fdfr.getDn(), nbilog);
					fdfrRouteTask.setSqliteConn(sqliteConn);
					fdfrRouteTask.excute();
				}

				nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: ");
				MessageUtil.sendSBIMessage(serial, "TrafficTrunkAndCrossConnectionAndSectionDataTask", 75);
				HashMap tpSectionMap = getSectionByTp(sectionList);
				TaskPoolExecutor executor2 = new TaskPoolExecutor(multiThreadPoolSize);
				for (BObject traffic : ttVector) {
					TrafficTrunk trafficTrunk = (TrafficTrunk) traffic;
					if (trafficTrunk.getDn().contains("TUNNELTRAIL")) {
						TrafficTrunkAndCrossConnectionAndSectionDataTask task = new TrafficTrunkAndCrossConnectionAndSectionDataTask();
						task.CreateTask(service, getJobName(), trafficTrunk.getDn(), nbilog);
						task.setSqliteConn(sqliteConn);
						task.setTpSectionMap(tpSectionMap);
						task.setTunnelName(trafficTrunk.getNativeEMSName());
						executor2.executeTask(task);
					}
				}
				nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForAllFinish.");
				executor2.waitingForAllFinish();
				nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: waitingForInsertBObject.");

				nbilog.info("PWTrailDataTask: ");
				MessageUtil.sendSBIMessage(serial, "PWTrailDataTask", 80);
				TaskPoolExecutor executorpw = new TaskPoolExecutor(multiThreadPoolSize);
				HashSet dns = new HashSet();
				for (BObject trafficTrunk : ttVector) {
					if (trafficTrunk != null && trafficTrunk instanceof TrafficTrunk) {
						if (trafficTrunk.getDn().contains("PWTRAIL")) {
							if (dns.contains(trafficTrunk.getDn())) continue;
							dns.add(trafficTrunk.getDn());
							PWTrailDataTask task = new PWTrailDataTask();
							task.CreateTask(service, getJobName(), trafficTrunk.getDn(), nbilog);
							task.setSqliteConn(sqliteConn);
							executorpw.executeTask(task);
						}
					}
				}
				nbilog.info("PWTrailDataTask: waitingForAllFinish.");
				executorpw.waitingForAllFinish();
			}
			nbilog.info("PWTrailDataTask: waitingForInsertBObject.");
			sqliteConn.waitingForInsertBObject();
			

            // // clear
            neList.clear();

            // phyVector.clear();
            sectionList.clear();
            sqliteConn.waitingForInsertBObject();

            // printTalbe();
            nbilog.info("End to migrate all data from ems.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            nbilog.error("DayMigrationJob.execute Exception:", e);
            try {
                MessageUtil.sendSBIFailedMessage("SBI ERROR.", serial);
            } catch (Exception e1) {
                nbilog.error("DayMigrationJob.Message Exception:", e);
            }
        }

        //EDS_PTN eds = geyEDS(dbName);
        EDS_PTN eds = null;
        try {
            eds = SummaryUtil.geyEDS(serial, sqliteConn, service.getEmsName(), dbName);
        } catch (Exception e) {
            nbilog.error(e, e);
        }
        queryCount();
        try {
            sqliteConn.release();
        } catch (Exception e) {
            nbilog.error(e, e);
        }

        FtpInfo ftpInfo = null;
        // ftp
        try {
            MessageUtil.sendSBIMessage(serial, "ftpFile", 85);
            // String localfile="2013-09-16-170120-QZ-U2000-1-P-DayMigration.db";
            nbilog.info("Try to upload db :"+dbName);
            String replacedEmsName = StringUtils.replace(service.getEmsName(), "/", "-");
            ftpInfo = FtpUtil.uploadFile(emstype, "HUAWEI", replacedEmsName, new File(dbName));
            ftpInfo.getAttributes().put("logical",""+logical);
            nbilog.info("db file uploaded : "+ftpInfo);

            HashMap map = new HashMap();
            map.put("logical",logical);
            eds.setUserObject(map);
            eds.setStartTime(startTime);
            MessageUtil.sendSBIFinishMessage(ftpInfo, serial, eds);
        } catch (Exception e) {
            nbilog.error("DayMigrationJob.ftp Exception:", e);
            try {
                MessageUtil.sendSBIFailedMessage("FTP ERROR.", serial);
            } catch (Exception e1) {
                nbilog.error("DayMigrationJob.Message Exception:", e);
            }
        }

        try {
            if (ftpInfo != null) {
                File file = new File(dbName);
                file.delete();
            }
            MessageUtil.sendSBIMessage(serial, "End", 90);
        } catch (Exception e) {
            nbilog.error("DayMigrationJob.Message Exception:", e);
        }

        nbilog.info("End of task : " + serial);
        // message

    }


    private void queryCount() {
        Logger logger = NodeContext.getNodeContext().getLogger();
        long t = System.currentTimeMillis() - start;
        synchronized (logger) {
            logger.info("");
            logger.info("===================="+(t/3600000l)+" Hours  ["+service.getEmsName()+"]"+getJobName()+" =========================================================");
            try {
                JPASupport jpaSupport = sqliteConn.getJpaSupport();
                HashMap<String,String> sqls = new HashMap<String, String>();
                sqls.put("NE:","SELECT count(ne.dn)     FROM  ManagedElement ne ");
                sqls.put("slot:","SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ");
                sqls.put("subslot:", "SELECT count(subslot.dn)    FROM  EquipmentHolder subslot WHERE subslot.holderType='sub_slot' ");
                sqls.put("card:","SELECT count(card.dn)       FROM  Equipment card ");
                sqls.put("ptp:","SELECT count(ptp.dn)        FROM  PTP ptp WHERE dn like '%PTP%' ");
                sqls.put("ftp:","SELECT count(ftp.dn)        FROM  PTP ftp WHERE dn like '%FTP%' ");
                sqls.put("ctp:","SELECT count(id)        FROM  CTP ");
                sqls.put("crossconnect:","SELECT count(id)        FROM  CrossConnect ");
                sqls.put("subnetworkconnection:","SELECT count(id) FROM SubnetworkConnection ");
                sqls.put("section:","SELECT count(id) FROM Section ");
                sqls.put("R_TrafficTrunk_CC_Section:","SELECT count(id) FROM R_TrafficTrunk_CC_Section ");
                //ptn
                sqls.put("Tunnel:","SELECT count(tunnel.dn)    FROM  TrafficTrunk tunnel where tunnel.rate='8011' ");
                sqls.put("PW:","SELECT count(pw.dn)    FROM  TrafficTrunk pw   where pw.rate='8010' ");
                sqls.put("PWE3:","SELECT count(fdfr.dn)    FROM  FlowDomainFragment fdfr ");
                sqls.put("Route:","SELECT count(route.dn)    FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ");
                sqls.put("TunnelPG:","SELECT count(pg.dn)    FROM  TrailNtwProtection pg ");
                
                Set<String> keySet = sqls.keySet();
                for (String key : keySet) {
                    String sql = sqls.get(key);
                    List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
                    int count = ((Long) list.get(0)).intValue();
                    nbilog.info(key+" "+count);
                    logger.info(key+" "+count);
                }


                // jpaSupport.end();
            } catch (Exception e) {
                nbilog.error(e,e);
            }
            logger.info("===============================================================================================================");
            logger.info("");
        }

    }

    private EDS_PTN geyEDS(String dn) {
        EDS_PTN eds = new EDS_PTN();
        try {
            JPASupport jpaSupport = sqliteConn.getJpaSupport();
            // jpaSupport.begin();
            String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
                    "SELECT count(slot.dn)       FROM  EquipmentHolder slot WHERE slot.holderType='slot' ",
                    "SELECT count(subslot.dn)    FROM  EquipmentHolder subslot WHERE subslot.holderType='sub_slot' ",
                    "SELECT count(card.dn)       FROM  Equipment card ", "SELECT count(ptp.dn)        FROM  PTP ptp WHERE dn like '%PTP%' ",
                    "SELECT count(ftp.dn)        FROM  PTP ftp WHERE dn like '%FTP%' ", "SELECT count(section.dn)    FROM  Section section ",
                    "SELECT count(tunnel.dn)     FROM  TrafficTrunk tunnel where tunnel.rate='8011' ",
                    "SELECT count(pw.dn)         FROM  TrafficTrunk pw   where pw.rate='8010' ", "SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr ",
                    "SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
                    "SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
            StringBuilder sb = new StringBuilder();
            int[] count = new int[sqls.length];
            for (int i = 0; i < sqls.length; i++) {
                List list = JPAUtil.getInstance().queryQL(jpaSupport, sqls[i]);
                sb.append(list.get(0)).append("	");

                count[i] = ((Long) list.get(0)).intValue();
            }
            nbilog.info("\nNE,Slot,subSlot,Equipment,PTP,FTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
            // jpaSupport.end();
            // jpaSupport.release();

            eds.setDn(dn);
            eds.setCollectTime(new Date());
            eds.setCreateDate(new Date());
            eds.setTaskSerial(serial);
            eds.setEmsname(service.getEmsName());
            eds.setNeCount(count[0]);
            eds.setSlotCount(count[1]);
            eds.setSubSlotCount(count[2]);
            eds.setEquipmentCount(count[3]);
            eds.setPtpCount(count[4]);
            eds.setFtpCount(count[5]);
            eds.setSectionCount(count[6]);
            eds.setTunnelCount(count[7]);
            eds.setPwCount(count[8]);
            eds.setPwe3Count(count[9]);
            eds.setRouteCount(count[10]);
            eds.setTunnelPG(count[11]);
        } catch (Exception e) {
            nbilog.error("DayMigrationJob.count Exception:", e);
        }
        return eds;
    }
    private void printTalbe() {
        JPASupport jpaSupport = sqliteConn.getJpaSupport();
        try {
            // jpaSupport.begin();
            String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
                    "SELECT count(slot.dn)    FROM  EquipmentHolder slot WHERE slot.holderType='slot' ",
                    "SELECT count(subslot.dn) FROM  EquipmentHolder subslot WHERE subslot.holderType='sub_slot' ",
                    "SELECT count(card.dn)  FROM  Equipment card ", "SELECT count(ptp.dn)   FROM  PTP ptp WHERE dn like '%PTP%' ",
                    "SELECT count(ftp.dn)   FROM  PTP ftp WHERE dn like '%FTP%' ", "SELECT count(section.dn)  FROM  Section section ",
                    "SELECT count(tunnel.dn)     FROM  TrafficTrunk tunnel where tunnel.rate='8011' ",
                    "SELECT count(pw.dn)         FROM  TrafficTrunk pw   where pw.rate='8010' ", "SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr ",
                    "SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
                    "SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
            StringBuilder sb = new StringBuilder();
            for (String sql : sqls) {
                List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
                sb.append(list.get(0)).append("	");
            }
            nbilog.info("\nNE,Slot,subSlot,Equipment,PTP,FTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
            // jpaSupport.end();
            // jpaSupport.release();
        } catch (Exception e) {
            e.printStackTrace();
            nbilog.error("printTalbe Exception:", e);
        }

    }

    private void executeTask(TaskPoolExecutor executor, DataTask task) {
        executor.executeTask(task);
    }

    /**
     * store tp and sectionDn relation key:ptpDn value:sectionDn
     *
     * @param sectionList
     * @return
     */
    private HashMap getSectionByTp(Vector<BObject> sectionList) {
        HashMap map = new HashMap<String, Section>();
        for (BObject section : sectionList) {
            if (section instanceof Section) {
                map.put(((Section) section).getaEndTP(), section);
                map.put(((Section) section).getzEndTP(), section);
            }
        }
        return map;
    }

    /**
     * define job name ,as unique id for migration job. It can be used in failed
     * job to migrate ems data from ems.
     *
     * @return
     */
    private String getJobName() {
        if (name.trim().length() == 0) {
            // name =
            // CodeTool.getDatetime()+"-"+service.getEmsName()+"-DayMigration";

        	String replacedEmsName = StringUtils.replace(service.getEmsName(), "/", "-");
            name = CodeTool.getDatetimeStr() + "-" + replacedEmsName + "-DayMigration";
        }
        return name;
    }

    @Override
    public void execute() {
        execute(null);
    }

    public static void main(String[] args) {
        System.out.println("args = " + File.pathSeparator);
        System.out.println("args2 = " + File.separator);
    }
}
