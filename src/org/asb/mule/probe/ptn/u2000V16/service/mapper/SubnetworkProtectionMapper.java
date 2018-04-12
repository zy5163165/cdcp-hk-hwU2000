package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import com.alcatelsbell.nms.common.SysUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.ProtectionSubnetwork;
import org.asb.mule.probe.framework.entity.ProtectionSubnetworkLink;
import org.asb.mule.probe.framework.util.CodeTool;
import protection.ProtectionSubnetworkLink_T;
import protection.ProtectionSubnetwork_T;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 14-7-15
 * Time: 上午11:19
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class SubnetworkProtectionMapper extends CommonMapper {
    private static SubnetworkProtectionMapper instance;

    public static SubnetworkProtectionMapper instance() {
        if (instance == null) {
            instance = new SubnetworkProtectionMapper();
        }
        return instance;
    }

    public ProtectionSubnetwork convertManagedElement(ProtectionSubnetwork_T vendorEntity) {
        vendorEntity.nativeEMSName = CodeTool.IsoToUtf8(vendorEntity.nativeEMSName);
        ProtectionSubnetwork psn = new ProtectionSubnetwork();
        psn.setDn(nv2dn(vendorEntity.name));
        psn.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
        psn.setName(vendorEntity.nativeEMSName);
        psn.setNativeEmsName(vendorEntity.nativeEMSName);
        psn.setLayerRate(vendorEntity.layerRate+"");
        psn.setNeIds(toString(vendorEntity.neIDList));
      //  psn.setPsnLinks(toString(vendorEntity.psnLinks));
        psn.setPsnType(vendorEntity.psnType.toString());
        psn.setUserObject(toList(psn.getDn(),vendorEntity.psnLinks));
        return psn;

    }

    private List toList(String protectionSubnetworkDn,ProtectionSubnetworkLink_T[][] psnLinks) {
        List list = new ArrayList();
        if (psnLinks != null) {
            for (ProtectionSubnetworkLink_T[] psnLink : psnLinks) {
                if (psnLink != null) {
                    for (ProtectionSubnetworkLink_T link_t : psnLink) {
                        ProtectionSubnetworkLink link = new ProtectionSubnetworkLink();
                        link.setProtectionSubnetworkDn(protectionSubnetworkDn);
                        link.setSinkTp(nv2dn(link_t.snkTP));
                        link.setSrcTp(nv2dn(link_t.srcTP));
                        link.setVc4List(toString(link_t.vc4List));
                        link.setDn(SysUtil.nextDN());
                        list.add(link);
                    }
                }
            }
        }
        return list;
    }

    private String toString(int[] ids) {
        StringBuffer sb = new StringBuffer();
        if (ids != null) {
            for (int id : ids) {
                sb.append(id+"||");
            }
        }
        return sb.toString();
    }
    private String toString(short[] ids) {
        StringBuffer sb = new StringBuffer();
        if (ids != null) {
            for (int id : ids) {
                sb.append(id+"||");
            }
        }
        return sb.toString();
    }

}
