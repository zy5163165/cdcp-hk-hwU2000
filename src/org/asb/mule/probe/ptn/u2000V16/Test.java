package org.asb.mule.probe.ptn.u2000V16;

import com.alcatelsbell.cdcp.nodefx.FtpInfo;
import com.alcatelsbell.cdcp.nodefx.FtpUtil;
import com.alcatelsbell.nms.common.SysUtil;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPASupportFactory;
import com.alcatelsbell.nms.util.ObjectUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.HW_EthService;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.service.SqliteConn;

import java.io.File;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 14-8-26
 * Time: 下午10:54
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class Test {
    private Log logger = LogFactory.getLog(getClass());

    public static void main(String[] args) throws InterruptedException {
        List<HW_EthService> l = (List) ObjectUtil.readObjectByPath("D:\\newsvn\\xpon-dev\\NETHERE\\releases\\binary\\result_1476758436018");
        for (HW_EthService hw_ethService : l) {
            System.out.println("type="+ hw_ethService.getServiceType()+" "+hw_ethService.getaEnd()+" -- "+hw_ethService.getzEnd());
        }
        System.out.println("l = " + l.size());

    }
}
