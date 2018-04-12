package org.asb.mule.probe.ptn.u2000V16;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 2014/11/11
 * Time: 15:16
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class GetDeviceData implements CommandBean {
    private U2000Service u2000Service;

    private void info(String info) {
        System.out.println(info);
    }

    public U2000Service getU2000Service() {
        return u2000Service;
    }

    public void setU2000Service(U2000Service u2000Service) {
        this.u2000Service = u2000Service;
    }

    @Override
    public void execute() {
        System.out.println("Please input ne dn:");
        InputStream in = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String neDn = null;
        try {
            neDn = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        List<EquipmentHolder> equipmentHolders = u2000Service.retrieveAllEquipmentHolders(neDn);
        System.out.println("--------------------retrieveAllEquipmentHolders-------------------------" );
        System.out.println("equipmentHolders = " + equipmentHolders.size());
        for (EquipmentHolder equipmentHolder : equipmentHolders) {
            System.out.println(equipmentHolder.getDn());
        }

        System.out.println("--------------------retrieveAllEquipments-------------------------") ;
        List<Equipment> equipments = u2000Service.retrieveAllEquipments(neDn);
        System.out.println("equipments = " + equipments.size());
        for (Equipment equipment : equipments) {
            System.out.println(equipment.getDn());
        }
        System.out.println("--------------------ptps-------------------------");
        List<PTP> ptps = u2000Service.retrieveAllPtps(neDn);
        System.out.println("ptps = " + ptps.size());
        for (PTP ptp : ptps) {
            System.out.println(ptp.getDn());
        }
        System.out.println("--------------------crossConnects-------------------------");
        List<CrossConnect> crossConnects = u2000Service.retrieveAllCrossConnects(neDn);
        System.out.println("crossConnects = " + crossConnects.size());
        for (CrossConnect crossConnect : crossConnects) {
            System.out.println(crossConnect.getDn());
        }
//        try {
//            u2000Service.testPerformance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        List<ManagedElement> managedElements = null;
//        List<FlowDomainFragment> flowDomainFragments = null;
//        List<Section> sections = null;
//        List<TrafficTrunk> trafficTrunks = null;
//        try {
//            managedElements = u2000Service.retrieveAllManagedElements();
//            flowDomainFragments = u2000Service.retrieveAllFdrs();
//            sections = u2000Service.retrieveAllSections();
//            trafficTrunks = u2000Service.retrieveAllTrafficTrunk();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        info("okokok");
//        info("trafficTrunks size = "+trafficTrunks.size());
//        info("managedElements size = "+managedElements.size());
//        info("sections size = "+sections.size());
//        info("flowDomainFragments size = "+flowDomainFragments.size());
    }
}
