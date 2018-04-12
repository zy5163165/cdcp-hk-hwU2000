package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import globaldefs.*;
import performance.*;
import transmissionParameters.*;
import terminationPoint.*;

/**
 * Handler class for using ManagedElementMgr_I object.
 */
public class PerformanceMgrHandler {
	private static PerformanceMgrHandler instance;

	public static PerformanceMgrHandler instance() {
		if (null == instance)
			instance = new PerformanceMgrHandler();
		return instance;
	}

	/**
	 * Retrieve all current performance data using the given mgr.
	 * 
	 * @param mgr
	 * @return PMData_T[]
	 */
	public PMData_T[] retrieveAllCurrentPMDatas(PerformanceManagementMgr_I mgr, PMTPSelect_T[] selectList, String[] pmParameters)
			throws globaldefs.ProcessingFailureException {
		int how_many = 50;
		java.util.Vector datas = new java.util.Vector();
		PMDataList_THolder dataList = new PMDataList_THolder();
		PMDataIterator_IHolder dataIt = new PMDataIterator_IHolder();

		mgr.getAllCurrentPMData(selectList, pmParameters, how_many, dataList, dataIt);
		for (int i = 0; i < dataList.value.length; i++) {
			datas.addElement(dataList.value[i]);
		}

		if (dataIt.value != null) {
			boolean hasMore;
			do {
				hasMore = dataIt.value.next_n(how_many, dataList);
				for (int i = 0; i < dataList.value.length; i++) {
					datas.addElement(dataList.value[i]);
				}
			} while (hasMore);

			try {
				dataIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		PMData_T result[] = new PMData_T[datas.size()];
		datas.copyInto(result);

		return result;
	}
}
