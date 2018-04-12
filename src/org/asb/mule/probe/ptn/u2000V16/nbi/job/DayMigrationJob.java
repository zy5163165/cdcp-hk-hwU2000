package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import java.io.File;
import java.util.*;

import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.EDS_PTN;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;
import org.asb.mule.probe.framework.service.SqliteConn;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.CrossConnectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.FDFrRouteDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.FTPAndPTPDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.FlowDomainFragmentDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.ManagedElementDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.PWTrailDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.PhysicalDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.ProtectionGroupDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.SectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.TrafficTrunkAndCrossConnectionAndSectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.TrafficTrunkDataTask;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import com.alcatelsbell.cdcp.nodefx.MessageUtil;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class DayMigrationJob extends MigrateCommonJob implements CommandBean {

	private FileLogger nbilog = null;
	private String name = "";
	private SqliteConn sqliteConn = null;
	@Override
	public void execute(JobExecutionContext arg0) {
		// nbilog = new FileLogger(service.getEmsName() + "/nbi.log");
		int multiThreadPoolSize = 3;
		//if (serial.contains(""))
		nbilog = ((U2000Service) service).getCorbaService().getNbilog();
		//
		if (!service.getConnectState()) {
			nbilog.error(">>>EMS is disconnect.");
			try {
				MessageUtil.sendSBIFailedMessage("EMS is disconnect.", serial);
			} catch (Exception e) {
				nbilog.error("DayMigrationJob.Message Exception:", e);
			}
			return;
		}
        nbilog.info("Using"+getClass());
        nbilog.info("DayMigrationJob : begin...");
		nbilog.info("Start for task : " + serial);
		nbilog.info("Start to migrate all data from ems: " + service.getEmsName());
		String dbName = getJobName() + ".db";
		nbilog.info("db: " + dbName);
		nbilog.info("isLogical: " + logical);
		// name = "";// set empty to create new db instance
		try {
			sqliteConn = new SqliteConn();
			sqliteConn.setDataPath(dbName);
			sqliteConn.init();
			// 1.ne
			nbilog.info("ManagedElementDataTask : ");
			MessageUtil.sendSBIMessage(serial, "ManagedElementDataTask", 0);
			ManagedElementDataTask neTask = new ManagedElementDataTask();
			neTask.CreateTask(service, getJobName(), service.getEmsName(), nbilog);
			neTask.setSqliteConn(sqliteConn);
			Vector<BObject> neList = neTask.excute();

			// 2.rack,shelf,slot,card,port
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
			MessageUtil.sendSBIMessage(serial, "PhysicalDataTask", 10);
			final Vector<BObject> phyVector = new Vector<BObject>();
			TaskPoolExecutor executor = new TaskPoolExecutor(multiThreadPoolSize);
			for (BObject ne : neList) {
				PhysicalDataTask phyTask = new PhysicalDataTask();
				phyTask.logical = logical;
				phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, false);
				phyTask.setSqliteConn(sqliteConn);
				executor.executeTask(phyTask, new TaskResultHandler() {
					@Override
					public void handleResult(DataTask task, Object result) throws Exception {
						phyVector.addAll((Vector) result);
					}
				});
				// CrossConnectionDataTask ccTask = new CrossConnectionDataTask();
				// ccTask.CreateTask(service, getJobName(), ne.getDn(), nbilog);
				//
				// // ccTask.excute();
				// executor.executeTask(ccTask);
			}
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForAllFinish.");
			executor.waitingForAllFinish();
			nbilog.info("PhysicalDataTask CrossConnectionDataTask: waitingForInsertBObject.");
			sqliteConn.waitingForInsertBObject();

			nbilog.info("SectionDataTask: ");
			MessageUtil.sendSBIMessage(serial, "SectionDataTask", 30);
			SectionDataTask sectionTask = new SectionDataTask();
			sectionTask.CreateTask(service, getJobName(), null, nbilog);
			sectionTask.setSqliteConn(sqliteConn);
			Vector<BObject> sectionList = sectionTask.excute();


			if (logical) {
				nbilog.info("FlowDomainFragmentDataTask: ");
				MessageUtil.sendSBIMessage(serial, "FlowDomainFragmentDataTask", 40);
				FlowDomainFragmentDataTask ffdrTask = new FlowDomainFragmentDataTask();
				ffdrTask.CreateTask(service, getJobName(), null, nbilog);
				ffdrTask.setSqliteConn(sqliteConn);
				Vector<BObject> fdfrVector = ffdrTask.excute();

				nbilog.info("TrafficTrunkDataTask: ");
				MessageUtil.sendSBIMessage(serial, "FlowDomainFragmentDataTask", 50);
				// test
				List<String> names = ((U2000Service) service).retrieveAllTrafficTrunkNames();
				nbilog.debug("TrafficTrunkNames: " + names.size());
				// end
				TrafficTrunkDataTask ttTask = new TrafficTrunkDataTask();
				ttTask.CreateTask(service, getJobName(), null, nbilog);
				ttTask.setSqliteConn(sqliteConn);
				Vector<BObject> ttVector = ttTask.excute();

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
		//	fdfrVector.clear();
			phyVector.clear();
			sectionList.clear();
		//	ttVector.clear();
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

		// ftp
		try {
			MessageUtil.sendSBIMessage(serial, "ftpFile", 85);
			// String localfile="2013-09-16-170120-QZ-U2000-1-P-DayMigration.db";
			FtpInfo ftpInfo = FtpUtil.uploadFile("PTN", "HUAWEI", service.getEmsName(), new File(dbName));
			ftpInfo.getAttributes().put("logical",""+logical);
			EDS_PTN eds = geyEDS(dbName);
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
			File file = new File(dbName);
			file.delete();
			MessageUtil.sendSBIMessage(serial, "End", 90);
		} catch (Exception e) {
			nbilog.error("DayMigrationJob.Message Exception:", e);
		}
		sqliteConn.release();
		nbilog.info("End of task : " + serial);
		// message

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

	// private void printTalbe() {
	// try {
	// JPASupport jpaSupport = SqliteService.getInstance().getJpaSupport();
	// jpaSupport.begin();
	// String[] sqls = { "SELECT count(ne.dn)     FROM  ManagedElement ne ",
	// "SELECT count(slot.dn)    FROM  EquipmentHolder slot WHERE slot.holderType='slot' ",
	// "SELECT count(subslot.dn) FROM  EquipmentHolder subslot WHERE subslot.holderType='sub_slot' ",
	// "SELECT count(card.dn)  FROM  Equipment card ", "SELECT count(ptp.dn)   FROM  PTP ptp WHERE dn like '%PTP%' ",
	// "SELECT count(ftp.dn)   FROM  PTP ftp WHERE dn like '%FTP%' ", "SELECT count(section.dn)  FROM  Section section ",
	// "SELECT count(tunnel.dn)     FROM  TrafficTrunk tunnel where tunnel.rate='8011' ",
	// "SELECT count(pw.dn)         FROM  TrafficTrunk pw   where pw.rate='8010' ", "SELECT count(fdfr.dn)       FROM  FlowDomainFragment fdfr ",
	// "SELECT count(route.dn)      FROM  R_TrafficTrunk_CC_Section route where route.type='CC' ",
	// "SELECT count(pg.dn)         FROM  TrailNtwProtection pg " };
	// StringBuilder sb = new StringBuilder();
	// for (String sql : sqls) {
	// List list = JPAUtil.getInstance().queryQL(jpaSupport, sql);
	// sb.append(list.get(0)).append("	");
	// }
	// nbilog.info("\nNE,Slot,subSlot,Equipment,PTP,FTP,Section,Tunnel,PW,PWE3,Route,TunnelPG\n" + sb.toString());
	// jpaSupport.end();
	// jpaSupport.release();
	// } catch (Exception e) {
	// e.printStackTrace();
	// nbilog.error("printTalbe Exception:", e);
	// }
	//
	// }

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

	public static void main(String[] args) {
		// uploadFile("PTN","HW","HZ",new File("d:\\work\\nohup.rar2"));
		// System.out.println("finish = " );
		try {
			FtpUtil.uploadFile("PTN", "HUAWEI", "test", new File("C:\\Users\\X\\Desktop\\cdcp\\alu\\tmf3.5_idl.zip"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
