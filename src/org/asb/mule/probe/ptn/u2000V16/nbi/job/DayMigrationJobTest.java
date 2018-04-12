package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.util.SysProperty;
import managedElement.ManagedElement_T;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.PWTrail;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
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

public class DayMigrationJobTest extends MigrateCommonJob implements CommandBean {

	private FileLogger nbilog = null;
	private String name = "";
	private String emstype = "OTN";
    private SqliteConn sqliteConn = null;
	@Override
	public void execute(JobExecutionContext arg0) {
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

		nbilog.info("Start for task : " + serial);
        nbilog.info("emstype="+emstype);
		nbilog.info("Start to migrate all data from ems: " + service.getEmsName());
		String dbName = getJobName() + ".db";
		nbilog.info("db: " + dbName);
		// name = "";// set empty to create new db instance
		try {
			// 0. set new db for new task.
            sqliteConn = new SqliteConn();
			sqliteConn.setDataPath(dbName);
			sqliteConn.init();

            if (!emstype.equals(EMS_TYPE_PTN)) {
                nbilog.info("getAllProtectionSubnetworks");
                SubnetworkProtectionDataTask subnetworkProtectionDataTask = new SubnetworkProtectionDataTask();
                subnetworkProtectionDataTask.setSqliteConn(sqliteConn);
                subnetworkProtectionDataTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
                subnetworkProtectionDataTask.excute();
                nbilog.info("getAllProtectionSubnetworks finish");
            }

			// 1.ne
			nbilog.info("ManagedElementDataTask : ");

			ManagedElementDataTask neTask = new ManagedElementDataTask();
            neTask.setSqliteConn(sqliteConn);
			neTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
			Vector<BObject> neList = neTask.excute();

			// 2.rack,shelf,slot,card,port
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
			final Vector<BObject> phyVector = new Vector<BObject>();
			TaskPoolExecutor executor = new TaskPoolExecutor(2);
			for (BObject ne : neList) {
				PhysicalDataTask phyTask = new PhysicalDataTask();
                phyTask.setSqliteConn(sqliteConn);
				phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, true);
                nbilog.info("ne="+((ManagedElement)ne).getNativeEMSName());
				executor.executeTask(phyTask, new TaskResultHandler() {
					@Override
					public void handleResult(DataTask task, Object result) throws Exception {
						phyVector.addAll((Vector) result);
					}
				});

				//PTN����Ҫ�ɼ�CC
				CrossConnectionDataTask ccTask = new CrossConnectionDataTask();
                ccTask.setSqliteConn(sqliteConn);
				ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
				executor.executeTask(ccTask);
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

			if (emstype.equals(EMS_TYPE_PTN)) {

				nbilog.info("FlowDomainFragmentDataTask: ");
				FlowDomainFragmentDataTask ffdrTask = new FlowDomainFragmentDataTask();
                ffdrTask.setSqliteConn(sqliteConn);
				ffdrTask.CreateTask(service, getJobName(), null, nbilog);
				Vector<BObject> fdfrVector = ffdrTask.excute();
				nbilog.info("TrafficTrunkDataTask: ");
				// test
				List<String> names = ((U2000Service) service).retrieveAllTrafficTrunkNames();
				nbilog.debug("TrafficTrunkNames: " + names.size());
				// end
				TrafficTrunkDataTask ttTask = new TrafficTrunkDataTask();
                ttTask.setSqliteConn(sqliteConn);
				ttTask.CreateTask(service, getJobName(), null, nbilog);
				Vector<BObject> ttVector = ttTask.excute();

				// nbilog.info("FTPAndPTPDataTask: ");
				if (retrieveFtpPtp) {
					TaskPoolExecutor executor3 = new TaskPoolExecutor(6);
					System.out.println("phyVector size = " + (phyVector == null ? null : phyVector.size()));
					for (BObject phy : phyVector) {
						if (phy.getDn().contains("type=ethtrunk") || phy.getDn().contains("type=ima")) {
							// if (phy != null && phy instanceof PTP && phy.getDn().indexOf("FTP") != -1) {
							FTPAndPTPDataTask FtpAndPtpTask = new FTPAndPTPDataTask();
                            FtpAndPtpTask.setSqliteConn(sqliteConn);
							FtpAndPtpTask.CreateTask(service, getJobName(), phy.getDn(), nbilog);
							executor3.executeTask(FtpAndPtpTask);
							// FtpAndPtpTask.excute();
						}
					}
					nbilog.info("FTPAndPTPDataTask: waitingForAllFinish.");
					executor3.waitingForAllFinish();
					nbilog.info("FTPAndPTPDataTask: waitingForInsertBObject.");
				}

				nbilog.info("ProtectionGroupDataTask: ");
				ProtectionGroupDataTask pgTask = new ProtectionGroupDataTask();
				pgTask.CreateTask(service, getJobName(), null, nbilog);
                pgTask.setSqliteConn(sqliteConn);
				pgTask.excute();

				nbilog.info("FDFrRouteDataTask: ");
				FDFrRouteDataTask fdfrRouteTask = new FDFrRouteDataTask();
				for (BObject fdfr : fdfrVector) {
					fdfrRouteTask.CreateTask(service, getJobName(), fdfr.getDn(), nbilog);
                    fdfrRouteTask.setSqliteConn(sqliteConn);
					fdfrRouteTask.excute();
				}

				nbilog.info("TrafficTrunkAndCrossConnectionAndSectionDataTask: ");
				HashMap tpSectionMap = getSectionByTp(sectionList);
				TaskPoolExecutor executor2 = new TaskPoolExecutor(1);
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
				TaskPoolExecutor executor3 = new TaskPoolExecutor(1);
				for (BObject trafficTrunk : ttVector) {
					if (trafficTrunk != null && trafficTrunk instanceof TrafficTrunk) {
						if (trafficTrunk.getDn().contains("PWTRAIL")) {
							PWTrailDataTask task = new PWTrailDataTask();
							task.CreateTask(service, getJobName(), trafficTrunk.getDn(), nbilog);
                            task.setSqliteConn(sqliteConn);
							executor3.executeTask(task);
						}
					}
				}
				nbilog.info("PWTrailDataTask: waitingForAllFinish.");
				executor3.waitingForAllFinish();
				nbilog.info("PWTrailDataTask: waitingForInsertBObject.");

				sqliteConn.waitingForInsertBObject();

				fdfrVector.clear();
				ttVector.clear();
			} else {


				nbilog.info("HW_MSTPDataTask: ");
				TaskPoolExecutor mstpExecutor = new TaskPoolExecutor(1);
				for (BObject ne : neList) {
					HW_MSTPDataTask task = new HW_MSTPDataTask();
					task.CreateTask(service, getJobName(), ne.getDn(), nbilog);
                    task.setSqliteConn(sqliteConn);
					mstpExecutor.executeTask(task);
				}
				nbilog.info("HW_MSTPDataTask: waitingForAllFinish.");
				mstpExecutor.waitingForAllFinish();
				nbilog.info("HW_MSTPDataTask: waitingForInsertBObject.");
				sqliteConn.waitingForInsertBObject();

				nbilog.info("ELLDataTask: ");
				ELLDataTask ellTask = new ELLDataTask();
				ellTask.CreateTask(service, getJobName(), null, nbilog);
                ellTask.setSqliteConn(sqliteConn);
				ellTask.excute();

				nbilog.info("SNCDataTask: ");
				SNCDataTask ttTask = new SNCDataTask();
				ttTask.CreateTask(service, getJobName(), null, nbilog);
                ttTask.setSqliteConn(sqliteConn);
				Vector<BObject> ttVector = ttTask.excute();


                    nbilog.info("SNCAndCCAndSectionDataTask: ");
                    TaskPoolExecutor executor2 = new TaskPoolExecutor(1);
                    if (!SysProperty.getString("u2000.sbi.task.sncroute","").equalsIgnoreCase("off")) {
                        for (BObject snc : ttVector) {
                            SNCAndCCAndSectionDataTask task = new SNCAndCCAndSectionDataTask();
                            task.CreateTask(service, getJobName(), snc.getDn(), nbilog);
                            task.setSqliteConn(sqliteConn);
                            executor2.executeTask(task);
                        }
                    } else {
                        nbilog.info("sbi.sncroute = off");
                    }
                    nbilog.info("SNCAndCCAndSectionDataTask: waitingForAllFinish.");
                    executor2.waitingForAllFinish();

                    nbilog.info("SNCAndCCAndSectionDataTask: waitingForInsertBObject.");

				sqliteConn.waitingForInsertBObject();

			}

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
		}

		// message
        nbilog.info("Uploading file...");
        try {
            FtpInfo ftpInfo = FtpUtil.uploadFile("SDH", "HUAWEI", service.getEmsName(), new File(dbName));
            nbilog.info("Uploading file to :"+ftpInfo);
        } catch (Exception e) {
            nbilog.error(e, e);
        }
        nbilog.info("End of task : " + serial);
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {

        }
        nbilog.info("System Exit");
        System.exit(0);

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

			name = CodeTool.getDatetimeStr() + "-" + service.getEmsName() + "-DayMigration";
		}
		return name;
	}

	@Override
	public void execute() {
		execute(null);
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
        ManagedElement_T[] nes = (ManagedElement_T[]) ObjectUtil.readObjectByPath("d:\\work\\Huawei.U2000.NEList");
        String nativeEMSName = nes[0].nativeEMSName;
        System.out.println("nativeEMSName = " + new String(nativeEMSName.getBytes("ISO-8859-1"),"GBK"));

    }
}
