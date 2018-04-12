package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import java.util.Vector;

import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import HW_mstpService.HW_AtmServiceIterator_IHolder;
import HW_mstpService.HW_AtmServiceList_THolder;
import HW_mstpService.HW_AtmServiceType_T;
import HW_mstpService.HW_AtmService_T;
import HW_mstpService.HW_EthServiceIterator_IHolder;
import HW_mstpService.HW_EthServiceList_THolder;
import HW_mstpService.HW_EthServiceType_T;
import HW_mstpService.HW_EthService_T;
import HW_mstpService.HW_MSTPServiceMgr_I;

/**
 * Handler class for using ManagedElementMgr_I object.
 */
public class MSTPServiceMgrHandler {
	private static MSTPServiceMgrHandler instance;

	public static MSTPServiceMgrHandler instance() {
		if (null == instance)
			instance = new MSTPServiceMgrHandler();
		return instance;
	}

	/**
	 * Retrieve all Atm Service using the given mgr.
	 * 
	 * @param mgr
	 * @return HW_MSTPEndPoint_T[]
	 */
	public HW_AtmService_T[] retrieveAllAtmServices(HW_MSTPServiceMgr_I mgr, globaldefs.NameAndStringValue_T[] managedElementName,
			HW_AtmServiceType_T[] vtypeList) throws ProcessingFailureException {

		int how_many = 500;

		Vector<HW_AtmService_T> atmServices = new Vector<HW_AtmService_T>();
		HW_AtmServiceList_THolder atmServiceList = new HW_AtmServiceList_THolder();
		HW_AtmServiceIterator_IHolder atmServiceIt = new HW_AtmServiceIterator_IHolder();
		vtypeList = new HW_mstpService.HW_AtmServiceType_T[0];

		mgr.getAllAtmService(managedElementName, vtypeList, how_many, atmServiceList, atmServiceIt);
		for (int i = 0; i < atmServiceList.value.length; i++) {
			atmServices.addElement(atmServiceList.value[i]);
		}

		if (atmServiceIt.value != null) {
			boolean hasMore;
			do {
				hasMore = atmServiceIt.value.next_n(how_many, atmServiceList);

				for (int i = 0; i < atmServiceList.value.length; i++) {
					atmServices.addElement(atmServiceList.value[i]);
				}
			} while (hasMore);

			try {
				atmServiceIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		HW_AtmService_T result[] = new HW_AtmService_T[atmServices.size()];
		atmServices.copyInto(result);

		return result;
	}

	public HW_EthService_T[] retrieveAllEthServices(HW_MSTPServiceMgr_I mgr, NameAndStringValue_T[] managedElementName, HW_EthServiceType_T[] vtypeList)
			throws ProcessingFailureException {
		int how_many = 500;

		Vector<HW_EthService_T> ethServices = new Vector<HW_EthService_T>();
		HW_EthServiceList_THolder ethServiceList = new HW_EthServiceList_THolder();
		HW_EthServiceIterator_IHolder ethServiceIt = new HW_EthServiceIterator_IHolder();

		mgr.getAllEthService(managedElementName, vtypeList, how_many, ethServiceList, ethServiceIt);

		for (int i = 0; i < ethServiceList.value.length; i++) {
			ethServices.addElement(ethServiceList.value[i]);
		}

		if (ethServiceIt.value != null) {
			boolean hasMore;
			do {
				hasMore = ethServiceIt.value.next_n(how_many, ethServiceList);

				for (int i = 0; i < ethServiceList.value.length; i++) {
					ethServices.addElement(ethServiceList.value[i]);
				}
			} while (hasMore);

			try {
				ethServiceIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		HW_EthService_T result[] = new HW_EthService_T[ethServices.size()];
		ethServices.copyInto(result);

		return result;
	}

}
