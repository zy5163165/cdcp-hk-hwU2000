package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class TrafficTrunkDataTask extends CommonDataTask {

	public TrafficTrunkDataTask() {
		// TODO Auto-generated constructor stub
	}

	protected void removeDuplicateDN(List bos) {
		int count = 0;
		HashMap map = new HashMap();
		String name = null;
		for (int i = 0; i < bos.size(); i++) {
			BObject bObject = (BObject) bos.get(i);
			name = bObject.getClass().getName();
			if (map.get(bObject.getDn()) != null)
				count++;
			map.put(bObject.getDn(), bObject);
		}
		bos.clear();
		bos.addAll(map.values());
//        if (count > 0)
//        getLogger().error("DuplicateDN "+name+" count = " + count);
	}
	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Vector<BObject> neVec = new Vector<BObject>();
		try {
			if (getTask().getObjectName() == null) {
				// single
				List<TrafficTrunk> trafficTrunkList = service.retrieveAllTrafficTrunk();
				if (trafficTrunkList != null && trafficTrunkList.size() > 0) {
					removeDuplicateDN(trafficTrunkList);
					nbilog.info("TrafficTrunk : " + trafficTrunkList.size());
					// JPASupport sqliteJPASupport = SqliteService.getInstance().getJpaSupport();
					// sqliteJPASupport.begin();
					for (TrafficTrunk trafficTrunk : trafficTrunkList) {
						insertToSqliteDB(trafficTrunk);
						// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, trafficTrunk);
						neVec.add(trafficTrunk);
					}
					// SqliteService.getInstance().getJpaSupport().end();
					// SqliteService.getInstance().getJpaSupport().release();
				}
			}
			// else {
			// // Multithread
			// TrafficTrunk trafficTrunk = ((U2000Service) service).retrieveTrafficTrunk(getTask().getObjectName());
			// if (trafficTrunk != null) {
			// SqliteService.getInstance().insertBObject(trafficTrunk);
			// neVec.add(trafficTrunk);
			// }
			// }
		} catch (Exception e) {
			nbilog.error("FlowDomainFragmentDataTask excute Exception:", e);
			// e.printStackTrace();
		} finally {
			// SqliteService.getInstance().getJpaSupport().release();
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
