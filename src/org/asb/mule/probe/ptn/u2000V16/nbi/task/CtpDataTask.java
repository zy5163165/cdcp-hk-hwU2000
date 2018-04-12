package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.CTP;

import org.asb.mule.probe.framework.nbi.task.CommonDataTask;


import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class CtpDataTask extends CommonDataTask {

	public CtpDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		// if (ptpList != null && ptpList.size() > 0) {
		List<CTP> totalCtpList = new ArrayList<CTP>();

		List<CTP> ctpList = service.retrieveAllCtps(this.getTask().getObjectName());
		if (ctpList == null)
			ctpList = new ArrayList<CTP>();
		totalCtpList.addAll(ctpList);
		Vector<BObject> neVec = new Vector<BObject>();
		try {

			JPASupport sqliteJPASupport = getSqliteConn().getJpaSupport();
			sqliteJPASupport.begin();
			if (totalCtpList != null && totalCtpList.size() > 0) {

				for (CTP ctp : totalCtpList) {
					JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, ctp);
					neVec.add(ctp);
				}
			}

			getSqliteConn().getJpaSupport().end();
			getSqliteConn().getJpaSupport().release();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			getSqliteConn().getJpaSupport().release();
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
