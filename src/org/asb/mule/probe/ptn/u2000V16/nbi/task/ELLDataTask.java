package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.EncapsulationLayerLink;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.valueobject.BObject;

public class ELLDataTask extends CommonDataTask {

	public ELLDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		try {
			List<EncapsulationLayerLink> ells = ((U2000Service) service).retrieveAllELLinks();
			if (ells != null && ells.size() > 0) {
				nbilog.info("ELL : " + ells.size());
				for (EncapsulationLayerLink ell : ells) {
					insertToSqliteDB(ell);
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
