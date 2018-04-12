package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import java.util.Vector;

import equipment.EquipmentHolder_T;
import equipment.EquipmentInventoryMgr_I;
import equipment.EquipmentOrHolderIterator_IHolder;
import equipment.EquipmentOrHolderList_THolder;
import equipment.EquipmentOrHolder_T;
import equipment.Equipment_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

public class EquipmentInventoryMgrHandler {
	private static EquipmentInventoryMgrHandler instance;

	public static EquipmentInventoryMgrHandler instance() {
		if (null == instance) {
			instance = new EquipmentInventoryMgrHandler();
		}
		return instance;
	}

	public EquipmentOrHolder_T[] retrieveAllEquipmentAndHolders(EquipmentInventoryMgr_I equipmentInventoryMgr, NameAndStringValue_T[] containerName)
			throws ProcessingFailureException {
		int how_many = 500;
		EquipmentOrHolderList_THolder emseqList = new EquipmentOrHolderList_THolder();
		EquipmentOrHolderIterator_IHolder emseqIt = new EquipmentOrHolderIterator_IHolder();

		equipmentInventoryMgr.getAllEquipment(containerName, how_many, emseqList, emseqIt);

		Vector<EquipmentOrHolder_T> emseqVector = new Vector<EquipmentOrHolder_T>();

		for (EquipmentOrHolder_T eqt : emseqList.value) {
			emseqVector.addElement(eqt);
		}

		if (null != emseqIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = emseqIt.value.next_n(how_many, emseqList);
				for (EquipmentOrHolder_T eqt : emseqList.value) {
					emseqVector.addElement(eqt);
				}

			}
			try {
				emseqIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		EquipmentOrHolder_T[] equipments = new EquipmentOrHolder_T[emseqVector.size()];
		emseqVector.copyInto(equipments);

		return equipments;

	}

	public Equipment_T[] retrieveAllEquipments(EquipmentInventoryMgr_I equipmentInventoryMgr, NameAndStringValue_T[] containerName)
			throws ProcessingFailureException {
		EquipmentOrHolderList_THolder emseqList = new EquipmentOrHolderList_THolder();
		EquipmentOrHolderIterator_IHolder emseqIt = new EquipmentOrHolderIterator_IHolder();

		equipmentInventoryMgr.getAllEquipment(containerName, 50, emseqList, emseqIt);

		java.util.Vector emseqVector = new java.util.Vector();

		for (int i = 0; i < emseqList.value.length; i++) {
			if (emseqList.value[i].discriminator().equals(equipment.EquipmentTypeQualifier_T.EQT))
				emseqVector.addElement(emseqList.value[i].equip());
		}

		if (null != emseqIt.value) {

			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = emseqIt.value.next_n(50, emseqList);

				for (int i = 0; i < emseqList.value.length; i++) {
					if (emseqList.value[i].discriminator().equals(equipment.EquipmentTypeQualifier_T.EQT))
						emseqVector.addElement(emseqList.value[i].equip());
				}

			}
			try {
				emseqIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		Equipment_T[] equipments = new Equipment_T[emseqVector.size()];
		emseqVector.copyInto(equipments);

		return equipments;

	}

	public EquipmentHolder_T[] retrieveAllEquipmentHolders(EquipmentInventoryMgr_I equipmentInventoryMgr, NameAndStringValue_T[] containerName)
			throws ProcessingFailureException {
		EquipmentOrHolderList_THolder emseqList = new EquipmentOrHolderList_THolder();
		EquipmentOrHolderIterator_IHolder emseqIt = new EquipmentOrHolderIterator_IHolder();

		equipmentInventoryMgr.getAllEquipment(containerName, 50, emseqList, emseqIt);

		java.util.Vector emseqVector = new java.util.Vector();

		for (int i = 0; i < emseqList.value.length; i++) {
			if (emseqList.value[i].discriminator().equals(equipment.EquipmentTypeQualifier_T.EQT_HOLDER))
				emseqVector.addElement(emseqList.value[i].holder());
		}

		if (null != emseqIt.value) {

			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = emseqIt.value.next_n(50, emseqList);

				for (int i = 0; i < emseqList.value.length; i++) {
					if (emseqList.value[i].discriminator().equals(equipment.EquipmentTypeQualifier_T.EQT_HOLDER))
						emseqVector.addElement(emseqList.value[i].holder());
				}

			}
			try {
				emseqIt.value.destroy();
			} catch (Throwable ex) {

			}
		}

		EquipmentHolder_T[] equipmentHolders = new EquipmentHolder_T[emseqVector.size()];
		emseqVector.copyInto(equipmentHolders);

		return equipmentHolders;

	}

	public EquipmentOrHolder_T[] retrieveContainedEquipments(EquipmentInventoryMgr_I equipmentInventoryMgr, NameAndStringValue_T[] containerName)
			throws ProcessingFailureException {
		EquipmentOrHolderList_THolder emseqList = new EquipmentOrHolderList_THolder();

		equipmentInventoryMgr.getContainedEquipment(containerName, emseqList);

		return emseqList.value;

	}

	private EquipmentInventoryMgrHandler() {
	}
}
