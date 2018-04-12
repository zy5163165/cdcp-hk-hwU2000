package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.util.U2000Util;

import TopoManagementManager.Node_T;

import com.alcatelsbell.nms.common.SysUtil;
import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.util.log.LogUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class ManagedElementDataTask extends CommonDataTask {

	public Vector<BObject> excute() {

		try {
			List<TopoNode> node_ts = ((U2000Service) service).retrieveAllTopoNodes();
			if (node_ts.size() > 0) {
				// JPASupport sqliteJPASupport = SqliteService.getInstance().getJpaSupport();
				// sqliteJPASupport.begin();
				for (TopoNode node : node_ts) {
					// for (int i = 0; i < node_ts.size(); i++) {
					// Node_T node_t = node_ts.get(i);
					// TopoNode node = new TopoNode();
					// node.setDn(SysUtil.nextDN());
					// node.setName(U2000Util.toString(node_t.name));
					// node.setParent(U2000Util.toString(node_t.parent));
					// node.setNativeemsname(CodeTool.isoToGbk(node_t.nativeEMSName));
					// node.setAdditionalInfo(U2000Util.toString(node_t.additionalInfo));
					// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, node);
                    insertToSqliteDB(node);
				}
				// sqliteJPASupport.end();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 1.1sync neData from ems via corba interface;
		List<ManagedElement> neList = service.retrieveAllManagedElements();

		Vector<BObject> neVec = new Vector<BObject>();

		// 1.2 get data from local db
		// String sql = "select c from "+ManagedElement.class.getSimpleName()+
		// " as c where c.parentDn = '"+service.getEmsName()+"'";

		// 2.1 generate insertData

		try {
			if (neList != null && neList.size() > 0) {
				nbilog.info("ManagedElement(ManagedElementDataTask) : " + neList.size());
				// JPASupport sqliteJPASupport = SqliteService.getInstance().getJpaSupport();
				// sqliteJPASupport.begin();
				for (ManagedElement ne : neList) {
					// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, ne);
                    insertToSqliteDB(ne);
					neVec.add(ne);
				}

				// List<IPRoute> totalIpRouteList=new ArrayList<IPRoute>();
				// int debugCount=50;

				// if (sectionList!=null && sectionList.size()>0) {
				// for (Section section:sectionList) {
				// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1,
				// section);
				// neVec.add(section);
				// }
				// }

				// if (trafficTrunkList!=null && trafficTrunkList.size()>0) {
				// for (TrafficTrunk trafficTrunk:trafficTrunkList) {
				// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1,
				// trafficTrunk);
				// neVec.add(trafficTrunk);
				// }
				// }

				// if (fdrsList!=null && fdrsList.size()>0) {
				// for (FlowDomainFragment fdrs:fdrsList) {
				// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, fdrs);
				// neVec.add(fdrs);
				// }
				// }

				// SqliteService.getInstance().getJpaSupport().end();
				// SqliteService.getInstance().getJpaSupport().release();
			}
		} catch (Exception e) {
			e.printStackTrace();
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
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
