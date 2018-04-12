package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.util.CodeTool;

import protection.IPProtectionGroup_T;
import protection.ProtectionGroupType_T;
import protection.ProtectionSchemeState_T;
import protection.ReversionMode_T;
import trailNtwProtection.TrailNtwProtection_T;

public class IPProtectionGroupMapper extends CommonMapper

{
	private static IPProtectionGroupMapper instance;

	public static IPProtectionGroupMapper instance() {
		if (instance == null) {
			instance = new IPProtectionGroupMapper();
		}
		return instance;
	}

	public ProtectionGroup convertIPProtectionGroup(IPProtectionGroup_T vendorEntity, String parentDn) {
		ProtectionGroup pg = new ProtectionGroup();

		pg.setDn(nv2dn(vendorEntity.name));
		pg.setParentDn(parentDn);
		pg.setEmsName(vendorEntity.name[0].value);

		pg.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		pg.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));
		pg.setPgpParameters(mapperAdditionalInfo(vendorEntity.pgpParameters));
		// pg.setProtectedList(mapperNameAndStringValues(vendorEntity.protectedList));
		// pg.setProtectingList(mapperNameAndStringValues(vendorEntity.protectingList));
		pg.setProtectedList(nvs2dn(vendorEntity.protectedList));
		pg.setProtectingList(nvs2dn(vendorEntity.protectingList));
		pg.setProtectionGroupType(vendorEntity.protectionGroupType);
		pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		pg.setProtectionSchemeState(mapperState(vendorEntity.protectionSchemeState));
		// pg.setRate(vendorEntity.rate + "");
		pg.setRate(String.valueOf(vendorEntity.rate));

		return pg;
	}

	public TrailNtwProtection convert(TrailNtwProtection_T vendorEntity) {
		TrailNtwProtection pg = new TrailNtwProtection();

		pg.setDn(nv2dn(vendorEntity.name));
		pg.setEmsName(vendorEntity.name[0].value);
		pg.setOwner(vendorEntity.owner);
		pg.setProtectionSchemeState(mapperState(vendorEntity.protectionSchemeState));
		pg.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		pg.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));
		pg.setProtectionGroupType(mapperType(vendorEntity.protectionGroupType));
		pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		pg.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		pg.setApsFunction(vendorEntity.apsFunction);
		pg.setNetworkAccessDomain(vendorEntity.networkAccessDomain);
		pg.setPgATPList(nvs2dn(vendorEntity.pgATPList));
		pg.setPgZTPList(nvs2dn(vendorEntity.pgATPList));
		pg.setProtectionGroupAName(nv2dn(vendorEntity.protectionGroupAName));
		pg.setProtectionGroupZName(nv2dn(vendorEntity.protectionGroupAName));
		pg.setProtectionTrail(nvs2dn(vendorEntity.protectionTrail));
		pg.setWorkerTrailList(nvss2dn(vendorEntity.workerTrailList));
		pg.setRate(String.valueOf(vendorEntity.rate));
		pg.setTnpParameters(nv2dn(vendorEntity.tnpParameters));
		pg.setTrailNtwProtectionType(vendorEntity.trailNtwProtectionType);
		
		return pg;

	}

	private String mapperState(ProtectionSchemeState_T state) {
		String pmode = "";
		switch (state.value()) {
		case ProtectionSchemeState_T._PSS_AUTOMATIC:
			pmode = "PSS_AUTOMATIC";
			break;
		case ProtectionSchemeState_T._PSS_FORCED_OR_LOCKED_OUT:
			pmode = "PSS_FORCED_OR_LOCKED_OUT";
			break;
		case ProtectionSchemeState_T._PSS_UNKNOWN:
			pmode = "PSS_UNKNOWN";
			break;

		}
		return pmode;
	}

	private String mapperType(ProtectionGroupType_T type) {
		String pmode = "";
		switch (type.value()) {
		case ProtectionGroupType_T._PGT_2_FIBER_BLSR:
			pmode = "PGT_2_FIBER_BLSR";
			break;
		case ProtectionGroupType_T._PGT_4_FIBER_BLSR:
			pmode = "PGT_4_FIBER_BLSR";
			break;
		case ProtectionGroupType_T._PGT_MSP_1_FOR_N:
			pmode = "PGT_MSP_1_FOR_N";
			break;
		case ProtectionGroupType_T._PGT_MSP_1_PLUS_1:
			pmode = "PGT_MSP_1_PLUS_1";
			break;

		}
		return pmode;
	}

	private String mapperMode(ReversionMode_T reversionMode) {
		String pmode = "";
		switch (reversionMode.value()) {
		case ReversionMode_T._RM_UNKNOWN:
			pmode = "RM_UNKNOWN";
			break;
		case ReversionMode_T._RM_REVERTIVE:
			pmode = "RM_REVERTIVE";
			break;
		case ReversionMode_T._RM_NON_REVERTIVE:
			pmode = "RM_NON_REVERTIVE";
			break;

		}
		return pmode;
	}

}
