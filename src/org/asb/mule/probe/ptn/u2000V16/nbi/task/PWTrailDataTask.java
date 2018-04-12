package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.Vector;

import org.asb.mule.probe.framework.entity.PWTrail;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.valueobject.BObject;

public class PWTrailDataTask extends CommonDataTask {

	public PWTrailDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		try {
			PWTrail pwTrail = ((U2000Service) service).retrieveTrafficTrunk(getTask().getObjectName());
				if (pwTrail != null) {
					getSqliteConn().insertBObject(pwTrail);
				}
		} catch (Exception e) {
			nbilog.error("FlowDomainFragmentDataTask excute Exception:", e);
			// e.printStackTrace();
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
