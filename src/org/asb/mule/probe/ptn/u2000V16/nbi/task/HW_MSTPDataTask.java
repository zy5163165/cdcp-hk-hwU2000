package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.HW_EthService;
import org.asb.mule.probe.framework.entity.HW_MSTPBindingPath;
import org.asb.mule.probe.framework.entity.HW_VirtualBridge;
import org.asb.mule.probe.framework.entity.HW_VirtualLAN;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.valueobject.BObject;

public class HW_MSTPDataTask extends CommonDataTask {
	// private Logger logger = ProbeLog.getInstance().getDataLog();

	public Vector<BObject> excute() {
		try {
			List<PTP> ptpList = ((U2000Service) service).retrieveAllMSTPPtps(getTask().getObjectName());
			if (ptpList != null && ptpList.size() > 0) {
				for (PTP ptp : ptpList) {
					insertToSqliteDB(ptp);
				}

				for (PTP ptp : ptpList) {
					try {
						String ptpdn = ptp.getDn();
						if (ptpdn.contains("type=mp")) {
							List<HW_MSTPBindingPath> bpList = ((U2000Service) service).getBindingPath(ptpdn);
							if (bpList != null && bpList.size() > 0) {
								for (HW_MSTPBindingPath bp : bpList) {
									insertToSqliteDB(bp);
								}
							}
						}
					} catch (Exception e) {
						nbilog.error("HW_MSTPDataTask.excute Exception:", e);
					}
				}
			}

			List<HW_EthService> ethList = ((U2000Service) service).retrieveAllEthServices(getTask().getObjectName());
			for (HW_EthService eth : ethList) {
				insertToSqliteDB(eth);
			}

			List<HW_VirtualBridge> vbList = ((U2000Service) service).retrieveAllVBs(getTask().getObjectName());
			for (HW_VirtualBridge vb : vbList) {
				insertToSqliteDB(vb);
			}
			for (HW_VirtualBridge vb : vbList) {
				try {
					List<HW_VirtualLAN> vlanList = ((U2000Service) service).retrieveAllVLANsbyVB(vb.getDn());
					for (HW_VirtualLAN vlan : vlanList) {
						insertToSqliteDB(vlan);
					}
				} catch (Exception e) {
					nbilog.error("HW_MSTPDataTask.excute Exception:", e);
				}
			}

		} catch (Exception e) {
			nbilog.error("HW_MSTPDataTask.excute Exception:", e);
		}
		return null;
	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
