package org.asb.mule.probe.ptn.u2000V16;

import TopoManagementManager.NodeIterator_IHolder;
import TopoManagementManager.NodeList_THolder;
import TopoManagementManager.Node_T;
import TopoManagementManager.TopoMgr_I;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPASupportFactory;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;
import multiLayerSubnetwork.MultiLayerSubnetwork_T;
import multiLayerSubnetwork.SubnetworkIterator_IHolder;
import multiLayerSubnetwork.SubnetworkList_THolder;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;
//import org.asb.mule.probe.ptn.u2000V16.nbi.task.TrafficTrunkAndSectionDataTask;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.util.U2000Util;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import protection.ProtectionSubnetwork_T;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 * Author: Ronnie.Chen
 * Date: 13-6-19
 * Time: 上午10:17
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class HuaweiTest {
    private CorbaService corbaService;
    private U2000Service u2000service;
    private void init() {
        corbaService = new CorbaService();
        corbaService.setEmsName("HZ-U2000-2-P");
        corbaService.setNamingServiceDns("off");
        corbaService.setNamingServiceIp("10.212.51.80");
        corbaService.setCorbaUrl("corbaloc:iiop:HZ-U2000-2-P:12001/NameService");
        corbaService.setCorbaTree("TMF_MTNM.Class/HUAWEI.Vendor/HZ-U2000-2-P.EmsInstance/2\\.0.Version/HZ-U2000-2-P.EmsSessionFactory_I");
        corbaService.setCorbaUserName("corba3");
        corbaService.setCorbaPassword("Corba3$zj123");
        corbaService.init();

        u2000service = new U2000Service();
        u2000service.setCorbaService(corbaService);
        u2000service.setKey("2000");

    }

    public void testsn() throws ProcessingFailureException {
        List<FlowDomainFragment> flowDomainFragments = u2000service.retrieveAllFdrs();
        //ObjectUtil.saveObject("allfdfrs",flowDomainFragments);
        System.out.println("flowDomainFragments = " + flowDomainFragments.size());

        SubnetworkList_THolder subnetworkList_tHolder = new SubnetworkList_THolder();
        corbaService.getNmsSession().getEmsMgr().getAllTopLevelSubnetworks(1000, subnetworkList_tHolder,new SubnetworkIterator_IHolder());

        System.out.println("subnetworkList_tHolder = " + subnetworkList_tHolder.value.length);
        for (int i = 0; i < subnetworkList_tHolder.value.length; i++) {
            MultiLayerSubnetwork_T multiLayerSubnetwork_t = subnetworkList_tHolder.value[i];
            String nativeEMSName = multiLayerSubnetwork_t.nativeEMSName;
            System.out.println("nativeEMSName = " + nativeEMSName);
        }

        TopoMgr_I topoMgr = corbaService.getNmsSession().getTopoMgr();
        NodeList_THolder nodeList_tHolder = new NodeList_THolder();
        NodeIterator_IHolder nodeIterator_iHolder = new NodeIterator_IHolder();
        topoMgr.getTopoSubnetworkViewInfo(1000, nodeList_tHolder, nodeIterator_iHolder);
        Node_T[] value = nodeList_tHolder.value;
        System.out.println("value = " + value.length);
        for (int i = 0; i < value.length; i++) {
            Node_T node_t = value[i];
            String nativeEMSName = node_t.nativeEMSName;
            System.out.println("nativeEMSName = " + nativeEMSName);
            NameAndStringValue_T[] parent = node_t.parent;
            System.out.println("parent = "+ U2000Util.toString(parent));
            System.out.println("name = "+ U2000Util.toString(node_t.name));

        }
    }
    private HashMap getSectionByTp(List<BObject> sectionList) {
        HashMap map = new HashMap<String, Section>();
        for (BObject section : sectionList) {
            if (section instanceof Section) {
                map.put(((Section) section).getaEndTP(), section);
                map.put(((Section) section).getzEndTP(), section);
            }
        }
        return map;
    }

    private volatile int count = 0;
    public void migrateTrafficRoute(String dbFileName) throws Exception {
        JPASupport jpaSupport = JPASupportFactory.createSqliteJPASupport(dbFileName);
        List<TrafficTrunk> allObjects = JPAUtil.getInstance().findAllObjects(jpaSupport, TrafficTrunk.class);
        System.out.println("TrafficTrunk size = " + allObjects.size());
        List<BObject> sections = JPAUtil.getInstance().findAllObjects(jpaSupport, Section.class);
        TaskPoolExecutor taskPoolExecutor = new TaskPoolExecutor(20);
        HashMap tpSectionMap = getSectionByTp(sections);
        count = 0;
        final int size = allObjects.size();
        for (BObject trafficTrunk : allObjects) {
//            if (trafficTrunk != null && trafficTrunk instanceof TrafficTrunk
//                    && trafficTrunk.getDn().indexOf("TUNNELTRAIL") != -1) {
//                TrafficTrunkAndSectionDataTask task = new TrafficTrunkAndSectionDataTask();
//                task.CreateTask(u2000service, "jobname", trafficTrunk.getDn());
//                task.setTpSectionMap(tpSectionMap);
//                taskPoolExecutor.executeTask(task,new TaskResultHandler() {
//                    @Override
//                    public void handleResult(DataTask task, Object result) throws Exception {
//                        System.out.println(new Date()+" Finish "+(++count)+"/"+size);
//                    }
//                });
//
//            }

        }
    }
    public static void main(String[] args) throws ProcessingFailureException {
        Vector<ProtectionSubnetwork_T> subnetworkProtection =(Vector) ObjectUtil.readObject("SubnetworkProtection");
        for (ProtectionSubnetwork_T t1 : subnetworkProtection) {
            t1.nativeEMSName = CodeTool.isoToGbk(t1.nativeEMSName);
        }

        System.out.println("subnetworkProtection = " + subnetworkProtection);

       // System.out.println("nativeEMSName = " + nativeEMSName);
//        for (int i = 0; i < o.size(); i++) {
//            FlowDomainFragment flowDomainFragment = o.get(i);
//            if (flowDomainFragment.getDn().contains("VPLS")) {
//                System.out.println("flowDomainFragment = " + flowDomainFragment.getDn());
//                System.out.println("flowDomainFragment.getaEnd() = " + flowDomainFragment.getaEnd());
//                System.out.println("flowDomainFragment.getzEnd() = " + flowDomainFragment.getzEnd());
//            }
//        }

        HuaweiTest test = new HuaweiTest();
        test.init();
        test.testsn();

    }
}
