package org.asb.mule.probe.ptn.u2000V16;

import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 13-7-18
 * Time: 下午5:53
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class HuaweiStat  implements CommandBean{
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

        try {
            u2000Service.testPerformance();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
