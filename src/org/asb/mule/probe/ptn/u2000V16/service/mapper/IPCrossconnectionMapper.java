package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import globaldefs.NameAndStringValue_T;

import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.CodeTool;

import subnetworkConnection.CrossConnect_T;
import HW_vpnManager.IPCrossConnection_T;

public class IPCrossconnectionMapper extends CommonMapper

{
	private static IPCrossconnectionMapper instance;

	public static IPCrossconnectionMapper instance() {
		if (instance == null) {
			instance = new IPCrossconnectionMapper();
		}
		return instance;
	}

	public IPCrossconnection convertIPCrossConnection(IPCrossConnection_T vendorEntity, String parentDn) {
		IPCrossconnection cc = new IPCrossconnection();
		cc.setDn(nv2dn(vendorEntity.name));
		// cc.setParentDn(mapperParentDnNameAndStringValue(vendorEntity.name));
		cc.setParentDn(parentDn);
		cc.setEmsName(vendorEntity.name[0].value);

		cc.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		cc.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));

		cc.setDirection(mapperConnectionDirection(vendorEntity.direction));
		cc.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		cc.setRate(vendorEntity.transmissionParams.layer + "");
		cc.setCcType(mapperCcType(vendorEntity.ccType));
		cc.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));
		cc.setActiveState(mapperActiveState(vendorEntity.activeState));

		if (vendorEntity.aEndList.length >= 1) {
			// cc.setaEnd(mapperCommonNameAndStringValue(vendorEntity.aEndList[0].tpName));
			cc.setaEndTrans(mapperTransmissionParas(vendorEntity.aEndList[0].transmissionParams));
			// cc.setaPtp(mapperPtpDn(vendorEntity.aEndList[0].tpName));
			cc.setaEnd(end2String(vendorEntity.aEndList));
			cc.setaPtp(end2Ptp(vendorEntity.aEndList));
		}

		if (vendorEntity.zEndList.length >= 1) {
			// cc.setzEnd(mapperCommonNameAndStringValue(vendorEntity.zEndList[0].tpName));
			cc.setzEndtrans(mapperTransmissionParas(vendorEntity.zEndList[0].transmissionParams));
			// cc.setzPtp(mapperPtpDn(vendorEntity.zEndList[0].tpName));
			cc.setzEnd(end2String(vendorEntity.zEndList));
			cc.setzPtp(end2Ptp(vendorEntity.zEndList));
		}

		cc.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return cc;
	}

	public CrossConnect convertCrossConnection(CrossConnect_T vendorEntity, String neDn) {
		CrossConnect cc = new CrossConnect();

		// cc.setDn(SysUtil.nextDN());
		cc.setDn(getCCdn(vendorEntity.aEndNameList, vendorEntity.zEndNameList));
		cc.setParentDn(neDn);
		String[] emsName = neDn.split(Constant.dnSplit);
		cc.setEmsName(emsName[0]);
		cc.setActive(vendorEntity.active);
		cc.setDirection(mapperConnectionDirection(vendorEntity.direction));
		cc.setCcType(mapperCcType(vendorEntity.ccType));
		cc.setaEndNameList(nvs2dn(vendorEntity.aEndNameList));
		cc.setzEndNameList(nvs2dn(vendorEntity.zEndNameList));
		cc.setaEndTP(end2tp(vendorEntity.aEndNameList));
		cc.setzEndTP(end2tp(vendorEntity.zEndNameList));
		cc.setAdditionalInfo(CodeTool.IsoToUtf8(mapperAdditionalInfo(vendorEntity.additionalInfo)));

		return cc;
	}

	private String getCCdn(NameAndStringValue_T[][] aEnds, NameAndStringValue_T[][] zEnds) {
		StringBuilder buffer = new StringBuilder();
		for (NameAndStringValue_T[] end : aEnds) {
			buffer.append(getTPRdn(end));
		}
		buffer.append("<>");
		for (NameAndStringValue_T[] end : zEnds) {
			buffer.append(getTPRdn(end));
		}

		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		dn[0] = new NameAndStringValue_T();
		dn[1] = new NameAndStringValue_T();
		dn[2] = new NameAndStringValue_T();
		dn[0].name = "EMS";
		dn[1].name = "ManagedElement";
		dn[2].name = "CrossConnect";
		dn[0].value = aEnds[0][0].value;
		dn[1].value = aEnds[0][1].value;
		dn[2].value = buffer.toString();

		return nv2dn(dn);
	}

	private String getTPRdn(NameAndStringValue_T[] tpName) {
		StringBuilder tpRdn = new StringBuilder();
		for (int i = 2; i < tpName.length; i++)
			tpRdn.append(tpName[i].value);
		return tpRdn.toString();
	}
}
