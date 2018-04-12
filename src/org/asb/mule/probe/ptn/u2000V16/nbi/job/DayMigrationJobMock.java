package org.asb.mule.probe.ptn.u2000V16.nbi.job;

/**
 * Author: Ronnie.Chen
 * Date: 13-9-3
 * Time: 下午4:09
 * rongrong.chen@alcatel-sbell.com.cn
 */


import java.io.File;
import java.util.HashMap;
import java.util.Vector;

import com.alcatelsbell.nms.util.FileUtil;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.CrossConnectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.CtpDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.FTPAndPTPDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.FlowDomainFragmentDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.IPRouteDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.ManagedElementDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.PhysicalDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.ProtectionGroupDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.SectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.TrafficTrunkAndCrossConnectionAndSectionDataTask;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.TrafficTrunkDataTask;
import org.quartz.JobExecutionContext;
import com.alcatelsbell.nms.valueobject.BObject;

public class DayMigrationJobMock extends MigrateCommonJob implements CommandBean {

    private String name = "";


    @Override
    public void execute(JobExecutionContext arg0) {
        boolean retrieveTrunckRoute = true;
        boolean retrieveFtpPtp = true;

        //nbilog.info("Start to migrate all data from ems.");
        name = "";// set empty to create new db instance

            // 0. set new db for new task.
            String fileName = (getJobName() + ".db");
        FileUtil.copyFile(new File("d:\\work\\20130703221001-HZ-U2000-2-P-DayMigration.db"),new File(fileName));
        //  nbilog.info("End to migrate all data from ems. file = "+fileName);

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

            name = CodeTool.getDatetimeStr() + "-" + service.getEmsName()
                    + "-DayMigration";
        }
        return name;
    }

    @Override
    public void execute() {
        execute(null);
    }
}
