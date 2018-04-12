package org.asb.mule.probe.ptn.u2000V16;

import com.alcatelsbell.cdcp.nodefx.EmsExecutable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.FlowDomain;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.service.NbiService;

import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 2014/11/26
 * Time: 16:26
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class NexTest implements EmsExecutable {


    @Override
    public Object execute(NbiService u2000Service) {
        List<FlowDomain> flowDomains = u2000Service.retrieveAllFlowDomain();
        StringBuffer sb = new StringBuffer();
        if (flowDomains != null) {
            sb.append("flowdomain:"+"\n");
            for (FlowDomain flowDomain : flowDomains) {
                sb.append(flowDomain.getDn()+"\n");
            }
        } else {
            sb.append("flowdomain=null");
        }

        List<ManagedElement> managedElements = u2000Service.retrieveAllManagedElements();
        for (ManagedElement managedElement : managedElements) {
            sb.append(managedElement.getDn()+"-"+managedElement.getNativeEMSName()+"\n");
        }



        return sb.toString();
    }
}
