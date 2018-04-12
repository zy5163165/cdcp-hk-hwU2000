

/**
 * Author: Ronnie.Chen
 * Date: 14-8-19
 * Time: 下午3:30
 *  支持多EMS节点
 * rongrong.chen@alcatel-sbell.com.cn
 */
package org.asb.mule.probe.ptn.u2000V16;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

import com.alcatelsbell.cdcp.nodefx.*;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.entity.DeviceInfo;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.service.CorbaSbiService;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DayMigrationJob4SDH;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.DeviceJob;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.valueobject.sys.Ems;

/**
 * Author: Ronnie.Chen
 * Date: 13-9-10
 * Time: 下午8:59
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class HWU2000EmsAdapterV2 extends CorbaEmsAdapterTemplate {
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
        boolean logical = true;
        if (ems.getUserObject() != null && ems.getUserObject() instanceof Map) {
            String l = (String) ((Map) ems.getUserObject()).get("logical");
            if (l != null && l.equalsIgnoreCase("false"))
                logical = false;
        }
//        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
//            logical = true;

        if (ems.getTag1() == null) ems.setTag1("PTN");
                if (ems.getTag1().equals("SDH") || ems.getTag1().equals("OTN") || ems.getTag1().equals("DWDM")) {
                    DayMigrationJob4SDH job = new DayMigrationJob4SDH();

                    job.logical = logical;

                    job.setService(u2000Service);
                    job.setSerial(_serial);
                    job.execute();
                }
                else {
                    DayMigrationJob job = new DayMigrationJob();
                    job.logical = logical;
                    job.setService(u2000Service);
                    job.setSerial(_serial);
                    job.execute();
                }

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


//    @Override
//    public List<DeviceInfo> listDevices(Ems ems) throws NodeException {
//       return (List<DeviceInfo>) execute(ems,new EmsExecutable() {
//            @Override
//            public Object execute(U2000Service u2000Service) {
//                List<ManagedElement> nes = u2000Service.retrieveAllManagedElements();
//                List<DeviceInfo> deviceInfos = new ArrayList<DeviceInfo>();
//                for (ManagedElement ne : nes) {
//                    DeviceInfo deviceInfo = new DeviceInfo();
//                    deviceInfo.setDn(ne.getDn());
//                    deviceInfo.setDeviceDn(ne.getDn());
//                    deviceInfo.setDeviceName(ne.getNativeEMSName());
//                    deviceInfo.setProductNme(ne.getProductName());
//                    deviceInfo.setCreateDate(new Date());
//                    deviceInfo.setEmsName(u2000Service.getCorbaService().getEmsDn());
//
//                    deviceInfos.add(deviceInfo);
//                }
//                return deviceInfos;
//            }
//        });
//
//
//    }
//
//    private U2000Service initCorbaService(Ems ems) {
//        CorbaEms corbaEms = new CorbaEms(ems);
//        CorbaService corbaService = new CorbaService();
//        corbaService.setEmsName(corbaEms.getEmsName());
//        corbaService.setNamingServiceDns("off");
//        corbaService.setNamingServiceIp(corbaEms.getNamingServiceHost());
//        corbaService.setCorbaUrl(corbaEms.getCorbaUrl());
//        corbaService.setCorbaTree(corbaEms.getCorbaTree());
//        corbaService.setCorbaUserName(corbaEms.getCorbaUserName());
//        corbaService.setCorbaPassword(corbaEms.getCorbaPassword());
//        corbaService.init();
//
//        U2000Service nbiservice = new U2000Service();
//        nbiservice.setCorbaService(corbaService);
//        nbiservice.setKey("2000");
//        return nbiservice;
//    }






}
