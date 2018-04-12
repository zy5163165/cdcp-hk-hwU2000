package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.util.CodeTool;

import terminationPoint.TPProtectionAssociation_T;
import terminationPoint.TerminationMode_T;
import terminationPoint.TerminationPoint_T;

public class CtpMapper extends CommonMapper

{
	private static CtpMapper instance;

	public static CtpMapper instance() {
		if (instance == null) {
			instance = new CtpMapper();
		}
		return instance;
	}

	public CTP convertCtp(TerminationPoint_T vendorEntity, String ptpDn) {

		CTP ctp = new CTP();
		ctp.setDn(nv2dn(vendorEntity.name));
		ctp.setParentDn(ptpDn);
		ctp.setPortdn(ptpDn);
		ctp.setRate(mapperRates(vendorEntity.transmissionParams));
		ctp.setEmsName(vendorEntity.name[0].value);
		ctp.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		ctp.setUserLabel(CodeTool.IsoToUtf8(vendorEntity.userLabel));
		ctp.setConnectionState(mapperConnectionState(vendorEntity.connectionState));
		ctp.setDirection(mapperDirection(vendorEntity.direction));
		ctp.setEdgePoint(vendorEntity.edgePoint);
		ctp.setTpMappingMode(mapperTpMappingMode(vendorEntity.tpMappingMode));
		ctp.setTpProtectionAssociation(mapperProtectionAssiciation(vendorEntity.tpProtectionAssociation));
		ctp.setTransmissionParams(mapperTransmissionParas(vendorEntity.transmissionParams));
		ctp.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		return ctp;
	}

	private String mapperProtectionAssiciation(TPProtectionAssociation_T tpProtectionAssociation) {
        if (tpProtectionAssociation == null) return null;
		String pmode = "";
		switch (tpProtectionAssociation.value()) {
		case terminationPoint.TPProtectionAssociation_T._TPPA_NA:
			pmode = "TPPA_NA";
			break;
		case terminationPoint.TPProtectionAssociation_T._TPPA_PSR_RELATED:
			pmode = "TPPA_PSR_RELATED";
			break;

		}
		return pmode;
	}

	private String mapperTpMappingMode(TerminationMode_T tpMappingMode) {
        if (tpMappingMode == null) return null;
        String mode = "";
		switch (tpMappingMode.value()) {
		case terminationPoint.TerminationMode_T._TM_NA:
			mode = "D_NA";
			break;
		case terminationPoint.TerminationMode_T._TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING:
			mode = "TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING";
			break;
		case terminationPoint.TerminationMode_T._TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING:
			mode = "TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING";
			break;

		}
		return mode;
	}

}
