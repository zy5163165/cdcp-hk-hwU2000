package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import java.util.Vector;

import HW_mstpInventory.HW_MSTPEndPointType_T;
import encapsulationLayerLink.ELLinkIterator_IHolder;
import encapsulationLayerLink.ELLinkList_THolder;
import encapsulationLayerLink.EncapsulationLayerLinkMgr_I;
import encapsulationLayerLink.EncapsulationLayerLink_T;
import globaldefs.ProcessingFailureException;

/**
 * Handler class for using ManagedElementMgr_I object.
 */
public class EncapsulationLayerLinkMgrHandler {

	private static EncapsulationLayerLinkMgrHandler instance;

	public static EncapsulationLayerLinkMgrHandler instance() {

		if (null == instance)
			instance = new EncapsulationLayerLinkMgrHandler();
		return instance;
	}

	public EncapsulationLayerLink_T[] retrieveAllELLinks(EncapsulationLayerLinkMgr_I mgr) throws ProcessingFailureException, ProcessingFailureException {

		int how_many = 500;
		Vector<EncapsulationLayerLink_T> mstps = new Vector<EncapsulationLayerLink_T>();
		ELLinkList_THolder endPointList = new ELLinkList_THolder();
		ELLinkIterator_IHolder endPointIt = new ELLinkIterator_IHolder();

		mgr.getAllELLinks(how_many, endPointList, endPointIt);

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

		EncapsulationLayerLink_T result[] = new EncapsulationLayerLink_T[mstps.size()];
		mstps.copyInto(result);

		return result;
	}

}
