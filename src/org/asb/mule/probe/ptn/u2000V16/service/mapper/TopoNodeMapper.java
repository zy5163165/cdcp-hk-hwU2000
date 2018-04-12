package org.asb.mule.probe.ptn.u2000V16.service.mapper;

import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.util.CodeTool;

import com.alcatelsbell.nms.common.SysUtil;

import TopoManagementManager.Node_T;

public class TopoNodeMapper extends CommonMapper {
	private static TopoNodeMapper instance;

	public static TopoNodeMapper instance() {
		if (instance == null) {
			instance = new TopoNodeMapper();
		}
		return instance;
	}

	public TopoNode convertTopoNode(Node_T vendorEntity) {
		TopoNode node = new TopoNode();
		node.setDn(SysUtil.nextDN());
		node.setName(nv2dn(vendorEntity.name));
		if (vendorEntity.parent != null && vendorEntity.parent.length > 0)
			node.setParent(nv2dn(vendorEntity.parent));
		node.setNativeemsname(CodeTool.IsoToUtf8(vendorEntity.nativeEMSName));
		node.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		node.setPosition("X=" + vendorEntity.position.xPos + ",Y=" + vendorEntity.position.yPos);
		return node;
	}
}
