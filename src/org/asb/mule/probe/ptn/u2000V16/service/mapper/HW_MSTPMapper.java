package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import org.asb.mule.probe.framework.entity.EncapsulationLayerLink;
import org.asb.mule.probe.framework.entity.HW_EthService;
import org.asb.mule.probe.framework.entity.HW_MSTPBindingPath;
import org.asb.mule.probe.framework.entity.HW_VirtualBridge;
import org.asb.mule.probe.framework.entity.HW_VirtualLAN;
import org.asb.mule.probe.framework.service.Constant;

import com.alcatelsbell.nms.common.SysUtil;

import encapsulationLayerLink.EncapsulationLayerLink_T;

import HW_mstpInventory.HW_ForwardEndPoint_T;
import HW_mstpInventory.HW_MSTPBindingPath_T;
import HW_mstpInventory.HW_MSTPEndPoint_T;
import HW_mstpInventory.HW_VirtualBridge_T;
import HW_mstpInventory.HW_VirtualLAN_T;
import HW_mstpService.HW_EthService_T;
import org.asb.mule.probe.framework.util.CodeTool;

public class HW_MSTPMapper extends CommonMapper

{
	private static HW_MSTPMapper instance;

	public static HW_MSTPMapper instance() {
		if (instance == null) {
			instance = new HW_MSTPMapper();
		}
		return instance;
	}

	public HW_MSTPBindingPath convertBindingPath(HW_MSTPBindingPath_T vendorEntity, String parentDn) {
		HW_MSTPBindingPath path = new HW_MSTPBindingPath();
		// path.setDn(parentDn);
		path.setDn(SysUtil.nextDN());
		path.setParentDn(parentDn);
		path.setEmsName(parentDn.substring(0, parentDn.indexOf("@")));
		path.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		path.setAllPathList(nvs2dn(vendorEntity.allPathList));
		path.setDirection(mapperDirection(vendorEntity.direction));
		path.setUsedPathList(nvs2dn(vendorEntity.usedPathList));
		return path;
	}

	public HW_VirtualBridge convertVB(HW_VirtualBridge_T vendorEntity, String parentDn) {
		HW_VirtualBridge vb = new HW_VirtualBridge();
		vb.setName(nv2dn(vendorEntity.name));
		vb.setParentDn(parentDn);
		vb.setEmsName(vendorEntity.name[0].value);
		vb.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		vb.setDn(nv2dn(vendorEntity.name));
		vb.setNativeEMSName(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		vb.setUserLabel(vendorEntity.userLabel);
		vb.setLogicalTPList(mapperLogicalTPList(vendorEntity.logicalTPList));
		return vb;
	}

	public HW_VirtualLAN convertVLAN(HW_VirtualLAN_T vendorEntity, String parentDn) {
		HW_VirtualLAN vlan = new HW_VirtualLAN();
		vlan.setName(nv2dn(vendorEntity.name));
		vlan.setParentDn(parentDn);
		vlan.setEmsName(vendorEntity.name[0].value);
		vlan.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		vlan.setDn(nv2dn(vendorEntity.name));
		vlan.setNativeEMSName(vendorEntity.nativeEMSName);
		vlan.setUserLabel(vendorEntity.userLabel);
		vlan.setForwardTPList(mapperForwardTPList(vendorEntity.forwardTPList));
		vlan.setOwner(vendorEntity.owner);
		vlan.setParaList(nv2dn(vendorEntity.paraList));
		return vlan;
	}

	public HW_EthService convertEthService(HW_EthService_T vendorEntity, String parentDn) {
		HW_EthService eth = new HW_EthService();
		eth.setName(nv2dn(vendorEntity.name));
		eth.setDn(nv2dn(vendorEntity.name));
		eth.setParentDn(parentDn);
		eth.setEmsName(vendorEntity.name[0].value);
		eth.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		eth.setActiveState(vendorEntity.activeState);
		eth.setDirection(mapperConnectionDirection(vendorEntity.direction));
		eth.setName(nv2dn(vendorEntity.name));
		eth.setNativeEMSName(vendorEntity.nativeEMSName);
		eth.setOwner(vendorEntity.owner);
		eth.setServiceType(mapperEthServiceType(vendorEntity.serviceType.value()));
		eth.setUserLabel(vendorEntity.userLabel);
		// eth.setaEndPoint(vendorEntity.aEndPoint);
		// eth.setzEndPoint(vendorEntity.zEndPoint);
		eth.setaEnd(nv2dn(vendorEntity.aEndPoint.name));
		eth.setaAdditionalInfo(mapperAdditionalInfo(vendorEntity.aEndPoint.additionalInfo));
		eth.setaTunnel(vendorEntity.aEndPoint.tunnel);
		eth.setaVC(vendorEntity.aEndPoint.vc);
		eth.setaVlanID(vendorEntity.aEndPoint.vlanID);
		eth.setzEnd(nv2dn(vendorEntity.zEndPoint.name));
		eth.setzAdditionalInfo(mapperAdditionalInfo(vendorEntity.zEndPoint.additionalInfo));
		eth.setzTunnel(vendorEntity.zEndPoint.tunnel);
		eth.setzVC(vendorEntity.zEndPoint.vc);
		eth.setzVlanID(vendorEntity.zEndPoint.vlanID);

		return eth;
	}

	public EncapsulationLayerLink convertEll(EncapsulationLayerLink_T vendorEntity) {
		EncapsulationLayerLink eth = new EncapsulationLayerLink();
		eth.setName(nv2dn(vendorEntity.name));
		eth.setDn(nv2dn(vendorEntity.name));
		eth.setEmsName(vendorEntity.name[0].value);
		eth.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		eth.setEndTPs(nvs2dn(vendorEntity.endTPs));
		eth.setNativeEMSName(vendorEntity.nativeEMSName);
		eth.setNetworkAccessDomain(vendorEntity.networkAccessDomain);
		eth.setOwner(vendorEntity.owner);
		eth.setRate(vendorEntity.rate);
		eth.setRoute(nvs2dn(vendorEntity.route));
		eth.setSegment(vendorEntity.segment);
		eth.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		eth.setType(mapperLinkType(vendorEntity.type.value()));
		eth.setUserLabel(vendorEntity.userLabel);

		return eth;
	}

	private String mapperLinkType(int value) {
		switch (value) {
		case 0: // '\0'
			return "LT_POINT_TO_POINT";
		case 1: // '\001'
			return "LT_POINT_TO_MULTIPOINT";
		case 2: // '\002'
			return "LT_MULTIPOINT";
		}
		return "";
	}

	private String mapperEthServiceType(int value) {
		switch (value) {
		case 0: // '\0'
			return "HW_EST_NA";
		case 1: // '\001'
			return "HW_EST_EPL";
		case 2: // '\002'
			return "HW_EST_EVPL";
		case 3: // '\003'
			return "HW_EST_EPLAN";
		case 4: // '\004'
			return "HW_EST_EVPLAN";
		}
		return "";
	}

	private String mapperLogicalTPList(HW_MSTPEndPoint_T[] logicalTPList) {
		StringBuilder buff = new StringBuilder();
		for (HW_MSTPEndPoint_T tp : logicalTPList) {
			buff.append(Constant.dnSplit).append(nv2dn(tp.name));
		}
		return buff.substring(1);
	}

	private String mapperForwardTPList(HW_ForwardEndPoint_T[] logicalTPList) {
		StringBuilder buff = new StringBuilder();
		for (HW_ForwardEndPoint_T tp : logicalTPList) {
			buff.append(Constant.dnSplit).append(nv2dn(tp.logicTPName));
		}
		return buff.substring(1);
	}

}
