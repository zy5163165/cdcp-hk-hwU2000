package org.asb.mule.probe.ptn.u2000V16;

import com.alcatelsbell.cdcp.nodefx.CorbaEmsAdapterTemplate;
import com.alcatelsbell.cdcp.nodefx.NodeContext;
import com.alcatelsbell.nms.valueobject.sys.Ems;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.service.CorbaSbiService;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob4SDH;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DeviceJob;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.PerfMigrationJob4SDH;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

/**
 * Author: Ronnie.Chen
 * Date: 2015/4/13
 * Time: 16:51
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class HWU2000EmsAdapter4Perf extends CorbaEmsAdapterTemplate {
    private Logger logger = NodeContext.getNodeContext().getLogger();


    @Override
    public Object doTestEms(NbiService nbiService) {
        return ((U2000Service)nbiService).getCorbaService().isConnectState();
    }

    @Override
    public String getType() {
        return "HWU2000";
    }










    public Object doSyncEms(NbiService nbiService, Ems ems, String _serial) {
        U2000Service u2000Service = (U2000Service)nbiService;
        PerfMigrationJob4SDH job = new PerfMigrationJob4SDH();

        job.setService(u2000Service);
        job.setSerial(_serial);
        job.execute();

        return null;

    }

    @Override
    public Object doSyncDevice(NbiService nbiService, String _serial, String devicedn) {

        DeviceJob job = new DeviceJob(devicedn);
        job.setService(nbiService);
        job.setSerial(_serial);
        job.execute();
        return null;



    }

    @Override
    public CorbaSbiService createCorbaSbiService() {
        return new CorbaService();
    }

    @Override
    public NbiService createNbiService(CorbaSbiService corbaSbiService) {
        U2000Service u2000Service = new U2000Service();
        u2000Service.setCorbaService((CorbaService)corbaSbiService);
        return u2000Service;
    }








}

