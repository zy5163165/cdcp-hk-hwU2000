package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.entity.IPRoute;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class IPRouteDataTask extends CommonDataTask {

	public IPRouteDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		Vector<BObject> neVec = new Vector<BObject>();

		List<IPRoute> totalIpRouteList = new ArrayList<IPRoute>();

		List<IPCrossconnection> ipccList = service.retrieveRoute(this.getTask().getObjectName());
		int ipccList_size = ipccList.size();
		for (int j = 0; j < ipccList_size; j++) {
			IPCrossconnection ipcc = ipccList.get(j);
			if (ipcc != null) {
				IPRoute ipr = new IPRoute();
				ipr.setTrafficTrunkDn(this.getTask().getObjectName());
				ipr.setIpCrossconnectionDn(ipcc.getDn());
				totalIpRouteList.add(ipr);
			}
		}
		try {
			// JPASupport sqliteJPASupport = getSqliteConn().getJpaSupport();
			// sqliteJPASupport.begin();
			if (totalIpRouteList != null && totalIpRouteList.size() > 0) {
				for (IPRoute ipr : totalIpRouteList) {
					getSqliteConn().insertBObject(ipr);
					// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, ipr);
					neVec.add(ipr);
				}
			}
			// getSqliteConn().getJpaSupport().end();
			// getSqliteConn().getJpaSupport().release();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// getSqliteConn().getJpaSupport().release();
			return neVec;
		}
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
