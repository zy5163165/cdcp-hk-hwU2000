package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;

import com.alcatelsbell.nms.common.Detect;
import com.alcatelsbell.nms.valueobject.BObject;

public class IPCrossConnectionDataTask extends CommonDataTask {

	public IPCrossConnectionDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		try {
			List<IPCrossconnection> ccList = this.service.retrieveAllCrossconnections(this.getTask().getObjectName());
//			nbilog.info("IPCrossconnection : " + ccList.size());
			if (Detect.notEmpty(ccList)) {
				for (IPCrossconnection ipc : ccList) {
					getSqliteConn().insertBObject(ipc);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
