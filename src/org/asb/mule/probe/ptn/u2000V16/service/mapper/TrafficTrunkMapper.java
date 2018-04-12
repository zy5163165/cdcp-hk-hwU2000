package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import globaldefs.NameAndStringValue_T;

import org.asb.mule.probe.framework.entity.MatrixFlowDomainFragment;
import org.asb.mule.probe.framework.entity.PWTrail;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.CodeTool;

import subnetworkConnection.TPData_T;
import transmissionParameters.LayeredParameters_T;

import HW_vpnManager.MatrixFlowDomainFragment_T;
import HW_vpnManager.TrafficTrunk_T;

public class TrafficTrunkMapper extends CommonMapper

{
	private static TrafficTrunkMapper instance;

	public static TrafficTrunkMapper instance() {
		if (instance == null) {
			instance = new TrafficTrunkMapper();
		}
		return instance;
	}

	// protected Logger sbilog = ProbeLog.getInstance().getSbiLog();

	public String convertTrafficTrunkName(NameAndStringValue_T[] name) {
		return nv2dn(name);
	}

	public TrafficTrunk convertTrafficTrunk(TrafficTrunk_T vendorEntity, NameAndStringValue_T[] parentDN)

	{
		TrafficTrunk tt = new TrafficTrunk();

		tt.setDn(nv2dn(vendorEntity.name));
		// String info="trafficTrunk name is :"+tt.getDn()+"\n";
		// for (NameAndStringValue_T t:vendorEntity.name) {
		// info+=t.name+" : "+t.value+"\n";
		//
		// }
		// sbilog.info(info);

		tt.setParentDn(nv2dn(parentDN));
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setRate(String.valueOf(vendorEntity.transmissionParams.layer));
		tt.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));

		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		tt.setRerouteAllowed(mapperRerouteAllowed(vendorEntity.rerouteAllowed));
		tt.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));
		tt.setActiveState(mapperActiveState(vendorEntity.activeState));

		String bindString = getParaValue(vendorEntity.transmissionParams, ParaName_BindingObject);

		tt.setParentDn(dnStringToDn(bindString));
		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			// tt.setaEnd(mapperCommonNameAndStringValue(vendorEntity.aEnd[0].tpName));
			// tt.setaPtp(mapperPtpDn(vendorEntity.aEnd[0].tpName));
			tt.setaEnd(end2String(vendorEntity.aEnd));
			tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
			tt.setaNE(end2ne(vendorEntity.aEnd));
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			// tt.setzEnd(mapperCommonNameAndStringValue(vendorEntity.zEnd[0].tpName));
			// tt.setzPtp(mapperPtpDn(vendorEntity.zEnd[0].tpName));
			tt.setzEnd(end2String(vendorEntity.zEnd));
			tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			tt.setzEndtrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
			tt.setzNE(end2ne(vendorEntity.zEnd));
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;

	}

	public PWTrail convertPWTrail(TrafficTrunk_T vendorEntity, NameAndStringValue_T[] parentDN) {
		PWTrail tt = new PWTrail();

		tt.setDn(nv2dn(vendorEntity.name));
		tt.setParentDn(nv2dn(parentDN));
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setRate(String.valueOf(vendorEntity.transmissionParams.layer));
		tt.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));

		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		tt.setRerouteAllowed(mapperRerouteAllowed(vendorEntity.rerouteAllowed));
		tt.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));
		tt.setActiveState(mapperActiveState(vendorEntity.activeState));

		String bindString = getParaValue(vendorEntity.transmissionParams, ParaName_BindingObject);

		tt.setParentDn(dnStringToDn(bindString));
		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			tt.setaEnd(end2String(vendorEntity.aEnd));
			tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
			tt.setaNE(end2ne(vendorEntity.aEnd));
			for (NameAndStringValue_T trans : vendorEntity.aEnd[0].transmissionParams[0].transmissionParams) {
				if (trans.name.trim().equals("PWID")) {
					tt.setApwid(trans.value);
				} else if (trans.name.trim().equals("WorkingMode")) {
					tt.setaWorkingMode(trans.value);
				}
			}
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			tt.setzEnd(end2String(vendorEntity.zEnd));
			tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			tt.setzEndtrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
			tt.setzNE(end2ne(vendorEntity.zEnd));
			for (NameAndStringValue_T trans : vendorEntity.zEnd[0].transmissionParams[0].transmissionParams) {
				if (trans.name.trim().equals("PWID")) {
					tt.setZpwid(trans.value);
				} else if (trans.name.trim().equals("WorkingMode")) {
					tt.setzWorkingMode(trans.value);
				}
			}
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;

	}

	public MatrixFlowDomainFragment convertFDFrRoute(MatrixFlowDomainFragment_T vendorEntity, String parentDN) {
		MatrixFlowDomainFragment tt = new MatrixFlowDomainFragment();

		tt.setDn(nv2dn(vendorEntity.name));
		tt.setParentDn(parentDN);
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));
		// tt.setMultipointServiceAttr(vendorEntity.multipointServiceAttr);
		tt.setMfdfrType(vendorEntity.mfdfrType);
		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		tt.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));

		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			tt.setaEnd(end2String(vendorEntity.aEnd));
			// tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			tt.setzEnd(routeEnd2String(vendorEntity.zEnd));
			// tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			StringBuilder ztrans = new StringBuilder();
			for (TPData_T tp : vendorEntity.zEnd) {
				ztrans.append("||");
				ztrans.append(mapperTransmissionParas(tp.transmissionParams));
			}
			tt.setzEndtrans(ztrans.toString().contains("||") ? ztrans.substring(2) : null);
			StringBuilder pwid = new StringBuilder();
			for (TPData_T tp : vendorEntity.zEnd) {
				for (NameAndStringValue_T trans : tp.transmissionParams[0].transmissionParams) {
					if (trans.name.trim().equals("PWID")) {
						pwid.append("||");
						pwid.append(trans.value);
						break;
					}
				}
			}
			tt.setZpwid(pwid.toString().contains("||") ? pwid.substring(2) : null);
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;

	}

	private String routeEnd2String(TPData_T[] end) {
		if (end != null && end.length > 0) {
			StringBuilder sb = new StringBuilder();
			for (TPData_T tp : end) {
				sb.append("#");
				sb.append(nv2dn(tp.tpName));
			}
			return sb.substring(1);
		}
		return "";
	}
}
