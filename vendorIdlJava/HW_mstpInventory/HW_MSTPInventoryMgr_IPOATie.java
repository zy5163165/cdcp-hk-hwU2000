package HW_mstpInventory;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_MSTPInventoryMgr_IPOATie
	extends HW_MSTPInventoryMgr_IPOA
{
	private HW_MSTPInventoryMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpInventory.HW_MSTPInventoryMgr_I _this()
	{
		return HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object());
	}
	public HW_mstpInventory.HW_MSTPInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getMstpEndPointShapingQueue(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void setSTBridgeParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException
	{
_delegate.setSTBridgeParam(spanningTreeName,paraList);
	}

	public void setMstpEndPoint(globaldefs.NameAndStringValue_T[] endPointName, transmissionParameters.LayeredParameters_T[] paraList, HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPoint(endPointName,paraList,endPoint);
	}

	public void setMstpEndPointShapingQueue(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void setFlow(globaldefs.NameAndStringValue_T[] flowName, globaldefs.NameAndStringValue_T[][] qosRuleNames, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException
	{
_delegate.setFlow(flowName,qosRuleNames,flow);
	}

	public void modifyLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyLinkAggregationGroup(lagName,paraList,addedBranchPortNameList,deletedBranchPortNameList,lag);
	}

	public void getAllVLANs(globaldefs.NameAndStringValue_T[] vbName, int how_many, HW_mstpInventory.HW_VirtualLANList_THolder vlanList, HW_mstpInventory.HW_VirtualLANIterator_IHolder vlanIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANs(vbName,how_many,vlanList,vlanIt);
	}

	public void delBindingPath(globaldefs.NameAndStringValue_T[] endPointName, terminationPoint.Directionality_T bindingDirect, globaldefs.NameAndStringValue_T[][] pathList, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException
	{
_delegate.delBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void getAllFlows(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_FlowList_THolder flowList, HW_mstpInventory.HW_FlowIterator_IHolder flowIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFlows(meName,how_many,flowList,flowIt);
	}

	public void createLinkAggregationGroup(globaldefs.NameAndStringValue_T[] meName, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] mainPortName, globaldefs.NameAndStringValue_T[][] branchPortNameList, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException
	{
_delegate.createLinkAggregationGroup(meName,paraList,mainPortName,branchPortNameList,lag);
	}

	public void deleteQosRule(globaldefs.NameAndStringValue_T[] qosRuleName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteQosRule(qosRuleName);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getVLAN(globaldefs.NameAndStringValue_T[] vlanName, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.getVLAN(vlanName,vlan);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getSpanningTree(globaldefs.NameAndStringValue_T[] spanningTreeName, HW_mstpInventory.HW_SpanningTree_THolder spanningTree) throws globaldefs.ProcessingFailureException
	{
_delegate.getSpanningTree(spanningTreeName,spanningTree);
	}

	public void setQosRule(globaldefs.NameAndStringValue_T[] qosRuleName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException
	{
_delegate.setQosRule(qosRuleName,paraList,qosRule);
	}

	public void addBindingPath(globaldefs.NameAndStringValue_T[] endPointName, terminationPoint.Directionality_T bindingDirect, globaldefs.NameAndStringValue_T[][] pathList, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException
	{
_delegate.addBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void setVLANData(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.setVLANData(vlanName,paraList,vlan);
	}

	public void deleteFlow(globaldefs.NameAndStringValue_T[] flowName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteFlow(flowName);
	}

	public void getQosRule(globaldefs.NameAndStringValue_T[] qosRuleName, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException
	{
_delegate.getQosRule(qosRuleName,qosRule);
	}

	public void getAllSpanningTrees(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, HW_mstpInventory.HW_SpanningTreeList_THolder spanningTreeList, HW_mstpInventory.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTrees(equipmentName,how_many,spanningTreeList,spanningTreeIt);
	}

	public void getAllQosRuleNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRuleNames(meName,how_many,nameList,nameIt);
	}

	public void getVirtualBridge(globaldefs.NameAndStringValue_T[] vbName, HW_mstpInventory.HW_VirtualBridge_THolder vb) throws globaldefs.ProcessingFailureException
	{
_delegate.getVirtualBridge(vbName,vb);
	}

	public void getAllVBs(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_VirtualBridgeList_THolder vbList, HW_mstpInventory.HW_VirtualBridgeIterator_IHolder vbIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVBs(meName,how_many,vbList,vbIt);
	}

	public void getBindingPath(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException
	{
_delegate.getBindingPath(endPointName,bindingPathList);
	}

	public void getAllSpanningTreeNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTreeNames(equipmentName,how_many,nameList,nameIt);
	}

	public void deleteVLAN(globaldefs.NameAndStringValue_T[] vlanName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteVLAN(vlanName);
	}

	public void createVLAN(globaldefs.NameAndStringValue_T[] vbName, short vlanId, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.createVLAN(vbName,vlanId,forwardTPList,vlan);
	}

	public void getAllLinkAggregationGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList, HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder lagIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroups(meName,how_many,lagList,lagIt);
	}

	public void getAllContainedInUseTPNames(globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedInUseTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void getAllVBNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVBNames(meName,how_many,nameList,nameIt);
	}

	public void createQosRule(globaldefs.NameAndStringValue_T[] equipmentName, HW_mstpInventory.HW_QosType_T qosType, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException
	{
_delegate.createQosRule(equipmentName,qosType,paraList,qosRule);
	}

	public void createVirtualBridge(globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, HW_mstpInventory.HW_VirtualBridge_THolder vb) throws globaldefs.ProcessingFailureException
	{
_delegate.createVirtualBridge(equipmentName,vbId,vbName,vb);
	}

	public void getLCASState(globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws globaldefs.ProcessingFailureException
	{
_delegate.getLCASState(endPointName,enableState);
	}

	public void getFlow(globaldefs.NameAndStringValue_T[] flowName, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException
	{
_delegate.getFlow(flowName,flow);
	}

	public void getAllFlowNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowNames(meName,how_many,nameList,nameIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void createFlow(globaldefs.NameAndStringValue_T[] equipmentName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException
	{
_delegate.createFlow(equipmentName,paraList,flow);
	}

	public void getAvailablePortNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAvailablePortNames(equipmentName,how_many,nameList,nameIt);
	}

	public void delVLANForwardPort(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.delVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void addVLANForwardPort(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.addVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void setSTPortParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] portName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException
	{
_delegate.setSTPortParam(spanningTreeName,portName,paraList);
	}

	public void deleteLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteLinkAggregationGroup(lagName);
	}

	public void getAllContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedCurrentTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void setSTProtocolParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException
	{
_delegate.setSTProtocolParam(spanningTreeName,paraList);
	}

	public void setLCASState(globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws globaldefs.ProcessingFailureException
	{
_delegate.setLCASState(endPointName,enableState);
	}

	public void getAllQosRules(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_QosRuleList_THolder qosRuleList, HW_mstpInventory.HW_QosRuleIterator_IHolder qosRuleIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRules(meName,how_many,qosRuleList,qosRuleIt);
	}

	public void getMstpEndPoint(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPoint(endPointName,endPoint);
	}

	public void getAllLinkAggregationGroupNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroupNames(meName,how_many,nameList,nameIt);
	}

	public void getAllMstpEndPoints(globaldefs.NameAndStringValue_T[] meName, HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList, HW_mstpInventory.HW_MSTPEndPointIterator_IHolder endPointIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPoints(meName,typeList,how_many,endPointList,endPointIt);
	}

	public void getAllVLANNames(globaldefs.NameAndStringValue_T[] vbName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANNames(vbName,how_many,nameList,nameIt);
	}

	public void deleteVirtualBridge(globaldefs.NameAndStringValue_T[] vbName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteVirtualBridge(vbName);
	}

	public void getLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException
	{
_delegate.getLinkAggregationGroup(lagName,lag);
	}

	public void getAllMstpEndPointNames(globaldefs.NameAndStringValue_T[] meName, HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPointNames(meName,typeList,how_many,nameList,nameIt);
	}

}
