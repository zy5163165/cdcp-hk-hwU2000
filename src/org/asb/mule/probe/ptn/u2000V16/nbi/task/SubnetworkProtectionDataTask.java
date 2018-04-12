package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import globaldefs.ProcessingFailureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.ProtectionSubnetwork;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.SubnetworkProtectionMapper;
import protection.ProtectionSubnetworkIterator_IHolder;
import protection.ProtectionSubnetworkList_THolder;
import protection.ProtectionSubnetwork_T;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Author: Ronnie.Chen
 * Date: 14-7-15
 * Time: 上午9:47
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class SubnetworkProtectionDataTask extends CommonDataTask {
    private Log logger = LogFactory.getLog(getClass());

    @Override
    public Vector<BObject> excute() {
        int howMany = 500;
        java.util.Vector result = new java.util.Vector();
        ProtectionSubnetworkList_THolder list = new ProtectionSubnetworkList_THolder();
        ProtectionSubnetworkIterator_IHolder iter = new ProtectionSubnetworkIterator_IHolder();
        try {
            ((U2000Service)service).getCorbaService().getNmsSession().getProtectionMgr().
                    getAllProtectionSubnetworks(howMany, list, iter);
            result.addAll(Arrays.asList(list.value));
            if (iter.value != null) {
                boolean hasMore;
                do {
                    hasMore = iter.value.next_n(howMany, list);
                    result.addAll(Arrays.asList(list.value));

                } while (hasMore);

                try {
                    iter.value.destroy();
                } catch (Throwable ex) {

                }
            }
        } catch (ProcessingFailureException e) {
            logger.error(e, e);
        }


        for (ProtectionSubnetwork_T t1 : (Vector<ProtectionSubnetwork_T>)result) {
            ProtectionSubnetwork protectionSubnetwork = SubnetworkProtectionMapper.instance().convertManagedElement(t1);
            insertToSqliteDB(protectionSubnetwork);
            List links = (List)protectionSubnetwork.getUserObject()  ;
            if (links != null) {
                for (Object link : links) {
                    insertToSqliteDB((BObject) link);
                }
            }

        }
      //  ObjectUtil.saveObject("SubnetworkProtection",result);
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
}
