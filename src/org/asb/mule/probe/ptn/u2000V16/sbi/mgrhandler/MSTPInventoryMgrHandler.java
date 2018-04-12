package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.util.Vector;

import HW_mstpInventory.HW_MSTPBindingPath_T;
import HW_mstpInventory.HW_MSTPEndPointIterator_IHolder;
import HW_mstpInventory.HW_MSTPEndPointList_THolder;
import HW_mstpInventory.HW_MSTPEndPointType_T;
import HW_mstpInventory.HW_MSTPEndPoint_T;
import HW_mstpInventory.HW_MSTPInventoryMgr_I;
import HW_mstpInventory.HW_VirtualBridgeIterator_IHolder;
import HW_mstpInventory.HW_VirtualBridgeList_THolder;
import HW_mstpInventory.HW_VirtualBridge_T;
import HW_mstpInventory.HW_VirtualLANIterator_IHolder;
import HW_mstpInventory.HW_VirtualLANList_THolder;
import HW_mstpInventory.HW_VirtualLAN_T;

/**
 * Handler class for using ManagedElementMgr_I object.
 */
public class MSTPInventoryMgrHandler {

	private static MSTPInventoryMgrHandler instance;

	final static String head = "MSTPInventoryMgrHandler: ";

	public static MSTPInventoryMgrHandler instance() {

		if (null == instance)
			instance = new MSTPInventoryMgrHandler();
		return instance;
	}

	/**
	 * Retrieve all mstp end points using the given mgr.
	 * 
	 * @param mgr
	 * @return HW_MSTPEndPoint_T[]
	 * @throws ProcessingFailureException
	 */
	public HW_MSTPEndPoint_T[] retrieveAllMstpEndPoints(HW_MSTPInventoryMgr_I mgr, globaldefs.NameAndStringValue_T[] managedElementName,
			HW_MSTPEndPointType_T[] typeList) throws ProcessingFailureException, ProcessingFailureException {

		int how_many = 500;
		Vector<HW_MSTPEndPoint_T> mstps = new Vector<HW_MSTPEndPoint_T>();
		HW_MSTPEndPointList_THolder endPointList = new HW_MSTPEndPointList_THolder();
		HW_MSTPEndPointIterator_IHolder endPointIt = new HW_MSTPEndPointIterator_IHolder();

		// typeList = new HW_MSTPEndPointType_T[0];
		mgr.getAllMstpEndPoints(managedElementName, typeList, how_many, endPointList, endPointIt);

		for (int i = 0; i < endPointList.value.length; i++) {
			mstps.addElement(endPointList.value[i]);
		}

		if (endPointIt.value != null) {
			boolean hasMore;
			do {
				hasMore = endPointIt.value.next_n(how_many, endPointList);

				for (int i = 0; i < endPointList.value.length; i++) {
					mstps.addElement(endPointList.value[i]);
				}
			} while (hasMore);

			try {
				endPointIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		HW_MSTPEndPoint_T result[] = new HW_MSTPEndPoint_T[mstps.size()];
		mstps.copyInto(result);

		return result;
	}

	/**
	 * this method for get bindingpathlist from mstp endPointname
	 * 
	 * @param mgr
	 * @param endPointName
	 * @return
	 * @throws ProcessingFailureException
	 */
	public HW_mstpInventory.HW_MSTPBindingPath_T[] retrieveBindingPath(HW_MSTPInventoryMgr_I mgr, NameAndStringValue_T[] endPointName)
			throws ProcessingFailureException {

		HW_mstpInventory.HW_MSTPBindingPathList_THolder bpList = new HW_mstpInventory.HW_MSTPBindingPathList_THolder();
		mgr.getBindingPath(endPointName, bpList);

		return bpList.value;
	}

	public HW_VirtualBridge_T[] retrieveAllVBs(HW_MSTPInventoryMgr_I mgr, NameAndStringValue_T[] managedElementName) throws ProcessingFailureException {

		int how_many = 500;
		Vector<HW_VirtualBridge_T> vbs = new Vector<HW_VirtualBridge_T>();
		HW_VirtualBridgeList_THolder vbList = new HW_VirtualBridgeList_THolder();
		HW_VirtualBridgeIterator_IHolder vbIt = new HW_VirtualBridgeIterator_IHolder();

		mgr.getAllVBs(managedElementName, how_many, vbList, vbIt);

		for (int i = 0; i < vbList.value.length; i++) {
			vbs.addElement(vbList.value[i]);
		}

		if (vbIt.value != null) {
			boolean hasMore;
			do {
				hasMore = vbIt.value.next_n(how_many, vbList);

				for (int i = 0; i < vbList.value.length; i++) {
					vbs.addElement(vbList.value[i]);
				}
			} while (hasMore);

			try {
				vbIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		HW_VirtualBridge_T result[] = new HW_VirtualBridge_T[vbs.size()];
		vbs.copyInto(result);

		return result;
	}

	public HW_VirtualLAN_T[] retrieveAllVLANsbyVB(HW_MSTPInventoryMgr_I mgr, NameAndStringValue_T[] vendorVBName) throws ProcessingFailureException {

		int how_many = 500;
		Vector<HW_VirtualLAN_T> vlans = new Vector<HW_VirtualLAN_T>();
		HW_VirtualLANList_THolder vlanList = new HW_VirtualLANList_THolder();
		HW_VirtualLANIterator_IHolder vlanIt = new HW_VirtualLANIterator_IHolder();

		mgr.getAllVLANs(vendorVBName, how_many, vlanList, vlanIt);

		for (int i = 0; i < vlanList.value.length; i++) {
			vlans.addElement(vlanList.value[i]);
		}

		if (vlanIt.value != null) {
			boolean hasMore;
			do {
				hasMore = vlanIt.value.next_n(how_many, vlanList);

				for (int i = 0; i < vlanList.value.length; i++) {
					vlans.addElement(vlanList.value[i]);
				}
			} while (hasMore);

			try {
				vlanIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		HW_VirtualLAN_T result[] = new HW_VirtualLAN_T[vlans.size()];
		vlans.copyInto(result);

		return result;
	}

}
