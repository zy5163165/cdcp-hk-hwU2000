package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import globaldefs.NameAndStringValue_T;

import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.CodeTool;

import transmissionParameters.LayeredParameters_T;
import HW_vpnManager.FlowDomainFragment_T;
import HW_vpnManager.StaticMacAddress_T;

public class FlowDomainFragmentMapper extends CommonMapper

{
	private static FlowDomainFragmentMapper instance;

	public static FlowDomainFragmentMapper instance() {
		if (instance == null) {
			instance = new FlowDomainFragmentMapper();
		}
		return instance;
	}

	public FlowDomainFragment convertFlowDomainFragment(FlowDomainFragment_T vendorEntity, NameAndStringValue_T[] parentdn) {
		FlowDomainFragment tt = new FlowDomainFragment();

		tt.setDn(nv2dn(vendorEntity.name));
		tt.setParentDn(nv2dn(parentdn));
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));
		/**
		 * 
		 private String multipointServiceAttr;
		 */
		tt.setNetworkAccessDomain(vendorEntity.networkAccessDomain);
		tt.setFdfrType(vendorEntity.fdfrType);
		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		String bindString = getParentDN(vendorEntity.transmissionParams, ParaName_BindingObject);

		tt.setParentDn(dnStringToDn(bindString));
		tt.setRate(vendorEntity.transmissionParams.layer + "");
		tt.setFlexible(vendorEntity.flexible);
		tt.setMultipointServiceAttrAddInfo(mapperAdditionalInfo(vendorEntity.multipointServiceAttr.additionalInfo));
		tt.setMultipointServiceAttrParaList(mapperAdditionalInfo(vendorEntity.multipointServiceAttr.paraList));
		tt.setMultipointServiceAttrMacList(mapperMacList(vendorEntity.multipointServiceAttr.staticMacList));
		tt.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));
		tt.setFdfrState(mapperActiveState(vendorEntity.fdfrState));
		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			tt.setaEnd(end2String(vendorEntity.aEnd));
			tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
			tt.setaNE(end2ne(vendorEntity.aEnd));
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			tt.setzEnd(end2String(vendorEntity.zEnd));
			tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			tt.setzEndtrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
			tt.setzNE(end2ne(vendorEntity.zEnd));
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;
	}

	private String getParentDN(LayeredParameters_T para, String paraName) {
		StringBuilder buff = new StringBuilder();
		for (NameAndStringValue_T name : para.transmissionParams) {
			if (name.name.trim().startsWith(paraName)) {
				buff.append(";");
				buff.append(name.value.trim());
			}
		}

		return buff.toString().contains(";") ? buff.substring(1) : "";
	}

	private String mapperMacList(StaticMacAddress_T[] staticMacList) {
		StringBuffer sb = new StringBuffer();
		for (StaticMacAddress_T mac : staticMacList) {
			sb.append(mac.macAddress);
			sb.append(Constant.namevalueSplit);
			sb.append(mac.staticMacType);
			sb.append(Constant.namevalueSplit);
			sb.append(mac.ceVID + "");
			sb.append(Constant.namevalueSplit);
			sb.append(mac.peVID + "");
			sb.append(Constant.namevalueSplit);
			sb.append(mapperNameAndStringValue(mac.tpName));
			sb.append(Constant.listSplit);
		}
		return sb.toString();
	}

	// private String mapperEnd(TPData_T[] end) {
	// StringBuffer sb = new StringBuffer();
	// for (TPData_T tp : end) {
	// sb.append(mapperNameAndStringValue(tp.tpName));
	// sb.append(Constant.listSplit);
	// }
	// return sb.toString();
	// }
	//
	// private String mapperEndToPtp(TPData_T[] end) {
	// StringBuffer sb = new StringBuffer();
	// for (TPData_T tp : end) {
	//
	// sb.append(mapperPtpDn(tp.tpName));
	// sb.append(Constant.listSplit);
	// }
	// return sb.toString();
	// }

}
