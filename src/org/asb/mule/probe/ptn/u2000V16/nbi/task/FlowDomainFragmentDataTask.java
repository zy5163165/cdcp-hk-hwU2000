package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class FlowDomainFragmentDataTask extends CommonDataTask {

	public FlowDomainFragmentDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub

		Vector<BObject> neVec = new Vector<BObject>();
		try {
			List<FlowDomainFragment> fdrsList = service.retrieveAllFdrs();
			nbilog.info("FlowDomainFragment : " + fdrsList.size());
			if (fdrsList != null && fdrsList.size() > 0) {
				for (FlowDomainFragment fdrs : fdrsList) {
					insertToSqliteDB(fdrs);
					if (fdrs.getDn().contains("VPLS")) {
						neVec.add(fdrs);
					}
				}
			}
		} catch (Exception e) {
			nbilog.error("FlowDomainFragmentDataTask excute Exception:", e);
		}
		return neVec;
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
