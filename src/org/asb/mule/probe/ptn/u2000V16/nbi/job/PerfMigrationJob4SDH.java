package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

import com.alcatelsbell.cdcp.domain.SummaryUtil;
import com.alcatelsbell.cdcp.nodefx.*;
import com.alcatelsbell.nms.common.CommonUtil;
import com.alcatelsbell.nms.pfms.PFMDataWarehouse;
import com.alcatelsbell.nms.pfms.PFMDataWarehouseSqliteImpl;
import com.alcatelsbell.nms.pfms.SqlitesManager;
import com.alcatelsbell.nms.valueobject.pfms.PFMData;
import com.alcatelsbell.nms.valueobject.pfms.PFMEntity;
import globaldefs.ProcessingFailureException;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.*;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;

import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.*;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.util.U2000Translator;
import org.quartz.*;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import org.quartz.impl.StdSchedulerFactory;
import performance.PMData_T;

public class PerfMigrationJob4SDH extends MigrateCommonJob implements CommandBean {

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
    private static PFMDataWarehouse pfmDataWarehouse = new PFMDataWarehouseSqliteImpl();
    NodeDB nodeDB = new NodeDBSqliteImpl();
    private BObject copy(BObject o) {
        return (BObject)CommonUtil.getInstance().deserializeObject(CommonUtil.getInstance().serializeObject(o));
    }
    @Override
    public void execute(JobExecutionContext arg0) {
        System.out.println("Execute job!");
        nbilog = ((U2000Service) service).getCorbaService().getNbilog();
        this.setSerial(getService().getEmsName()+"_PERF_"+new SimpleDateFormat("yyyy-MM-dd-HH-mm").format(new Date()));
        nbilog.info("PerfMigrationJob4SDH : start :" + getSerial());

        if (nodeDB instanceof NodeDBSqliteImpl) {
            ((NodeDBSqliteImpl) nodeDB).addCacheEntities(new Class[]{ManagedElement.class,PTP.class});
        }
        Date startTime = new Date();
        // nbilog = new FileLogger(service.getEmsName() + "/nbi.log");
        nbilog = ((U2000Service) service).getCorbaService().getNbilog();
        //
        if (!service.getConnectState()) {
            nbilog.error(">>>EMS is disconnect.");
            return;
        }


        nbilog.info("Using"+getClass());
        nbilog.info("Start for task : " + serial);
        nbilog.info("Start to migrate all data from ems: " + service.getEmsName());
        if (!new File("db").exists())
            new File("db").mkdir();
        if (!new File("db/"+service.getEmsName()).exists())
            new File("db/"+service.getEmsName()).mkdir();
        String dbName = "db/"+service.getEmsName()+"/"+this.getSerial() + ".db";
        nbilog.info("db: " + dbName);
        // name = "";// set empty to create new db instance
        try {
            // 0. set new db for new task.
            sqliteConn = new SqliteConn();
            sqliteConn.setDataPath(dbName);
            sqliteConn.init();



            // 1.ne
            nbilog.info("ManagedElementDataTask : ");

            List<ManagedElement> neList = ((U2000Service) service).retrieveAllManagedElements();

            for (ManagedElement bObject : neList) {
                sqliteConn.insertBObject(copy(bObject));
         //       BObject e = nodeDB.storeObjectByDn(bObject);
        //        newNEList.add(e);

            }



            // 2.rack,shelf,slot,card,port
            nbilog.info("PhysicalDataTask CrossConnectionDataTask: ");
            final Vector<BObject> phyVector = new Vector<BObject>();
            TaskPoolExecutor executor = new TaskPoolExecutor(5);
            nbilog.info("ne size = "+neList.size());
            final int total = neList.size();
            final int batch = total / 20;
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            for (BObject ne : neList) {
//                PhysicalDataTask phyTask = new PhysicalDataTask();
//                phyTask.setSqliteConn(sqliteConn);
//                phyTask.CreateTask(service, getJobName(), ne.getDn(), nbilog, true);
//
//                executor.executeTask(phyTask, new TaskResultHandler() {
//                    @Override
//                    public void handleResult(DataTask task, Object result) throws Exception {
//                        phyVector.addAll((Vector) result);
//                    }
//                });

                final BObject _ne = ne;
                executor.executeTask(new CommonDataTask() {
                    @Override
                    public Vector<BObject> excute() {
                        this.nbilog = PerfMigrationJob4SDH.this.nbilog;
                        this.service = PerfMigrationJob4SDH.this.service;
                        setSqliteConn(PerfMigrationJob4SDH.this.sqliteConn);
                        List<PMData_T> pmDataTList = null;
                        try {
                            pmDataTList = ((U2000Service) service).retrievePerformance((ManagedElement) _ne);
                        } catch (ProcessingFailureException e) {
                            nbilog.error(e,e);
                        }
                        if (pmDataTList != null) {
                            for (PMData_T pmData_t : pmDataTList) {
                                Date date = U2000Translator.convertTime(pmData_t.retrievalTime);
                                if (date == null) date = new Date();
                                Calendar cal = Calendar.getInstance();
                                cal.setTime(date);
                                int year = cal.get(Calendar.YEAR);
                                String entityDn = U2000Translator.nv2dn(pmData_t.tpName);
                                PFMEntity entity = new PFMEntity();
                                entity.setDn(entityDn);
                                entity.setDeviceDn(_ne.getDn());
                                //entity.setDeviceId(ne.getId());
                                sqliteConn.insertBObject(copy(entity));
                                //        entity = (PFMEntity)nodeDB.storeObjectByDn(entity);

                                List<PFMData> pfmDatas = U2000Translator.transPFMData(_ne.getDn(), entity.getDn(), -1, pmData_t);
                                for (PFMData pfmData : pfmDatas) {
                                    sqliteConn.insertBObject(copy(pfmData));
                                }
                                //       pfmDataWarehouse.addPmDatas(year + "", ne.getId(), pfmDatas);





                            }
                        }
                        int i = atomicInteger.incrementAndGet();
                        if (i % batch == 0 || i == total)
                            nbilog.info(i +"/"+total+" NE finsihed !");
                        return null;
                    }

                    @Override
                    public void insertDate(Vector<BObject> dataList) {
                    }
                    @Override
                    public void updateDate(Vector<BObject> dataList) {
                    }
                    @Override
                    public void deleteDate(Vector<BObject> dataList) {
                    }
                });

//                List<PMData_T> pmDataTList = ((U2000Service) service).retrievePerformance((ManagedElement) ne);
//                if (pmDataTList != null) {
//                    for (PMData_T pmData_t : pmDataTList) {
//                        Date date = U2000Translator.convertTime(pmData_t.retrievalTime);
//                        if (date == null) date = new Date();
//                        Calendar cal = Calendar.getInstance();
//                        cal.setTime(date);
//                        int year = cal.get(Calendar.YEAR);
//                        String entityDn = U2000Translator.nv2dn(pmData_t.tpName);
//                        PFMEntity entity = new PFMEntity();
//                        entity.setDn(entityDn);
//                        entity.setDeviceDn(ne.getDn());
//                        //entity.setDeviceId(ne.getId());
//                        sqliteConn.insertBObject(copy(entity));
//                //        entity = (PFMEntity)nodeDB.storeObjectByDn(entity);
//
//                        List<PFMData> pfmDatas = U2000Translator.transPFMData(ne.getDn(), entity.getDn(), -1, pmData_t);
//                        for (PFMData pfmData : pfmDatas) {
//                            sqliteConn.insertBObject(copy(pfmData));
//                        }
//                 //       pfmDataWarehouse.addPmDatas(year + "", ne.getId(), pfmDatas);
//
//
//                    }
//                }

            }

            executor.waitingForAllFinish();

            sqliteConn.waitingForInsertBObject();
            sqliteConn.release();

            // printTalbe();
            nbilog.info("End to migrate all data from ems.");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            nbilog.error("DayMigrationJob.execute Exception:", e);
//            try {
//                MessageUtil.sendSBIFailedMessage("SBI ERROR.", serial);
//            } catch (Exception e1) {
//                nbilog.error("DayMigrationJob.Message Exception:", e);
//            }
        }





        FtpInfo ftpInfo = null;
        // ftp
        try {
            MessageUtil.sendSBIMessage(serial, "ftpFile", 85);
            // String localfile="2013-09-16-170120-QZ-U2000-1-P-DayMigration.db";
            nbilog.info("Try to upload db :"+dbName);
            ftpInfo = FtpUtil.uploadFile(emstype, "HUAWEI", service.getEmsName(), new File(dbName));
            nbilog.info("db file uploaded : "+ftpInfo);

            EDS_PTN eds = new EDS_PTN();
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


//        System.out.println("execute");
//        try {
//            Scheduler m_scheduler = StdSchedulerFactory.getDefaultScheduler();
//            m_scheduler.start();
//            Trigger trigger = TriggerUtils.makeSecondlyTrigger(15 * 60);
//            trigger.setName("Trigger:"+this.getClass().getName()+":"+15 * 60);
//            //     trigger.setGroup(Scheduler.DEFAULT_GROUP);
//
//            trigger.setStartTime(new Date(new Date().getTime() + 5 * 1000));
//
//            m_scheduler.scheduleJob( new JobDetail(this.getClass().getName(),Scheduler.DEFAULT_GROUP, this.getClass()), trigger );
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//        System.out.println("schedule success !");
        while (true) {
            this.execute(null);
            try {
                Thread.sleep(15 * 60 * 1000l);
            } catch (InterruptedException e) {

            }
        }
    }


}
