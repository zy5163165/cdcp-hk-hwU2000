package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import org.asb.mule.probe.framework.entity.SubnetworkConnection;
import org.asb.mule.probe.framework.util.CodeTool;

import subnetworkConnection.NetworkRouted_T;
import subnetworkConnection.SNCState_T;
import subnetworkConnection.StaticProtectionLevel_T;
import subnetworkConnection.SubnetworkConnection_T;

public class SubnetworkConnectionMapper extends CommonMapper

{
	private static SubnetworkConnectionMapper instance;

	public static SubnetworkConnectionMapper instance() {
		if (instance == null) {
			instance = new SubnetworkConnectionMapper();
		}
		return instance;
	}

	public SubnetworkConnection convertSNC(SubnetworkConnection_T vendorEntity)

	{
		SubnetworkConnection tt = new SubnetworkConnection();
		tt.setDn(nv2dn(vendorEntity.name));
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));

		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setRerouteAllowed(mapperRerouteAllowed(vendorEntity.rerouteAllowed));
		tt.setNetworkRouted(mapperNetworkRouted(vendorEntity.networkRouted));
		tt.setRate(String.valueOf(vendorEntity.rate));
		tt.setSncState(mapperSNCState(vendorEntity.sncState));
		tt.setSncType(mapperCcType(vendorEntity.sncType));
		tt.setStaticProtectionLevel(mapperStaticProtectionLevel(vendorEntity.staticProtectionLevel));

		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			tt.setaEnd(end2String(vendorEntity.aEnd));
			tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			tt.setzEnd(end2String(vendorEntity.zEnd));
			tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			tt.setzEndTrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;

	}

	private String mapperSNCState(SNCState_T state) {
		switch (state.value()) {
		case SNCState_T._SNCS_NONEXISTENT: // '\0'
			return "SNCS_NONEXISTENT";
		case SNCState_T._SNCS_PENDING: // '\001'
			return "SNCS_PENDING";
		case SNCState_T._SNCS_ACTIVE: // '\002'
			return "SNCS_ACTIVE";
		case SNCState_T._SNCS_PARTIAL: // '\003'
			return "SNCS_PARTIAL";
		}
		return "";
	}

	public String mapperNetworkRouted(NetworkRouted_T routed) {
		switch (routed.value()) {
		case NetworkRouted_T._NR_NA: // '\0'
			return "NR_NA";
		case NetworkRouted_T._NR_NO: // '\001'
			return "NR_NO";
		case NetworkRouted_T._NR_YES: // '\002'
			return "NR_YES";
		}
		return "";
	}

	public String mapperStaticProtectionLevel(StaticProtectionLevel_T level) {
		switch (level.value()) {
		case StaticProtectionLevel_T._PREEMPTIBLE: // '\0'
			return "PREEMPTIBLE";
		case StaticProtectionLevel_T._UNPROTECTED: // '\001'
			return "UNPROTECTED";
		case StaticProtectionLevel_T._PARTIALLY_PROTECTED: // '\002'
			return "PARTIALLY_PROTECTED";
		case StaticProtectionLevel_T._FULLY_PROTECTED: // '\003'
			return "FULLY_PROTECTED";
		case StaticProtectionLevel_T._HIGHLY_PROTECTED: // '\004'
			return "HIGHLY_PROTECTED";
		}
		return "";
	}

}
