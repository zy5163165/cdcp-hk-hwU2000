package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import globaldefs.ProcessingFailureException;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.*;
import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.framework.nbi.task.DataTask;
import org.asb.mule.probe.framework.nbi.task.TaskPoolExecutor;
import org.asb.mule.probe.framework.nbi.task.TaskResultHandler;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.nbi.task.PhysicalDataTask;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.quartz.JobExecutionContext;

import com.alcatelsbell.cdcp.nodefx.NEWrapper;
import com.alcatelsbell.cdcp.nodefx.NodeContext;

public class DeviceJob extends MigrateCommonJob implements CommandBean {

	private String devicedn = null;

	public DeviceJob(String devicedn) {
		this.devicedn = devicedn;
	}
	boolean sdh = false;
	boolean section = false;
	@Override
	public void execute(JobExecutionContext arg0) {
		FileLogger nbilog = ((U2000Service) service).getCorbaService().getNbilog();
		// TODO Auto-generated method stub
		NEWrapper neWrapper = new NEWrapper();
		nbilog.info("migrate device - "+devicedn);
		ManagedElement me = service.retrieveManagedElement(devicedn);
		List<EquipmentHolder> holderList = new ArrayList<EquipmentHolder>();
		List<Equipment> cardList = new ArrayList<Equipment>();
		service.retrieveAllEquipmentAndHolders(devicedn, holderList, cardList);
		List<PTP> ptpList = service.retrieveAllPtps(devicedn);
		if (ptpList == null) ptpList = new ArrayList<PTP>();
		if (service instanceof U2000Service) {
			List mstpList = null;
			try {
				mstpList = ((U2000Service) service).retrieveAllMSTPPtps(devicedn);
			} catch (ProcessingFailureException e) {
				e.printStackTrace();
			}
			if (mstpList != null)
				ptpList.addAll(mstpList);
		}

		try {
			String neKey = devicedn.substring(devicedn.lastIndexOf(":")+1).replaceAll(";","-");
			if (ptpList != null && !ptpList.isEmpty()) {
				ObjectUtil.saveObject(service.getEmsName()+"/PTP-"+neKey,ptpList);
			} else {
				ptpList = (List) ObjectUtil.readObject(service.getEmsName() + "/PTP-" + neKey);
				if (ptpList == null) ptpList = new ArrayList<PTP>();
			}
		} catch (Exception e) {
			nbilog.error(e, e);
		}

		neWrapper.setMe(me);
		neWrapper.setEquipmentHolders(holderList);
		neWrapper.setEquipments(cardList);
		neWrapper.setPtps(ptpList);

		List<CrossConnect> ccs = service.retrieveAllCrossConnects(devicedn);




		if (ptpList != null) {
			TaskPoolExecutor executor = new TaskPoolExecutor(5);
			final Vector ctps = new Vector();
			for (PTP ptp : ptpList) {
				if (ptp.getDn().contains("sdh"))
					sdh = true;
				final PTP _ptp = ptp;
				executor.executeTask(new DataTask() {
					@Override
					public Vector<BObject> excute() {
						List<CTP> ctps = null;
						if (sdh) {
							ctps = ((U2000Service) service).retrieveContainedCurrentCtps(_ptp.getDn());
							CTPUtil.filterCTPS(_ptp.getDn(),ctps);
						}
						else
							ctps = service.retrieveAllCtps(_ptp.getDn());
						return new Vector<BObject>(ctps);
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

					@Override
					public void saveTask(C_TASK task) {

					}
				}, new TaskResultHandler() {
					@Override
					public void handleResult(DataTask task, Object result) throws Exception {
						if (result != null && result instanceof Collection)
							ctps.addAll((Collection) result);
					}
				});
			}

			executor.waitingForAllFinish();
			ArrayList<CTP> ctpList = new ArrayList<CTP>(ctps);
			if (sdh)
				PhysicalDataTask.processCTP(ctps,ccs);

			nbilog.info("ctp size = "+ctpList.size());

			neWrapper.setCtps(ctpList);
		}

		NodeContext.getNodeContext().deliverEmsJobObject(serial, neWrapper);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		execute(null);
	}

}
