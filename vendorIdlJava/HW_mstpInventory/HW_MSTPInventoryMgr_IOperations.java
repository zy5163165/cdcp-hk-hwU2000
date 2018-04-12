package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_MSTPInventoryMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllMstpEndPoints(globaldefs.NameAndStringValue_T[] meName, HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList, HW_mstpInventory.HW_MSTPEndPointIterator_IHolder endPointIt) throws globaldefs.ProcessingFailureException;
	void getAllMstpEndPointNames(globaldefs.NameAndStringValue_T[] meName, HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getMstpEndPoint(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws globaldefs.ProcessingFailureException;
	void setMstpEndPoint(globaldefs.NameAndStringValue_T[] endPointName, transmissionParameters.LayeredParameters_T[] paraList, HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws globaldefs.ProcessingFailureException;
	void getAllVBs(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_VirtualBridgeList_THolder vbList, HW_mstpInventory.HW_VirtualBridgeIterator_IHolder vbIt) throws globaldefs.ProcessingFailureException;
	void getAllVBNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getVirtualBridge(globaldefs.NameAndStringValue_T[] vbName, HW_mstpInventory.HW_VirtualBridge_THolder vb) throws globaldefs.ProcessingFailureException;
	void createVirtualBridge(globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, HW_mstpInventory.HW_VirtualBridge_THolder vb) throws globaldefs.ProcessingFailureException;
	void deleteVirtualBridge(globaldefs.NameAndStringValue_T[] vbName) throws globaldefs.ProcessingFailureException;
	void createVLAN(globaldefs.NameAndStringValue_T[] vbName, short vlanId, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void deleteVLAN(globaldefs.NameAndStringValue_T[] vlanName) throws globaldefs.ProcessingFailureException;
	void getAllVLANs(globaldefs.NameAndStringValue_T[] vbName, int how_many, HW_mstpInventory.HW_VirtualLANList_THolder vlanList, HW_mstpInventory.HW_VirtualLANIterator_IHolder vlanIt) throws globaldefs.ProcessingFailureException;
	void getAllVLANNames(globaldefs.NameAndStringValue_T[] vbName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getVLAN(globaldefs.NameAndStringValue_T[] vlanName, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void addVLANForwardPort(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void delVLANForwardPort(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[][] forwardTPList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void setVLANData(globaldefs.NameAndStringValue_T[] vlanName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws globaldefs.ProcessingFailureException;
	void getBindingPath(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException;
	void addBindingPath(globaldefs.NameAndStringValue_T[] endPointName, terminationPoint.Directionality_T bindingDirect, globaldefs.NameAndStringValue_T[][] pathList, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException;
	void delBindingPath(globaldefs.NameAndStringValue_T[] endPointName, terminationPoint.Directionality_T bindingDirect, globaldefs.NameAndStringValue_T[][] pathList, HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws globaldefs.ProcessingFailureException;
	void getLCASState(globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws globaldefs.ProcessingFailureException;
	void setLCASState(globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws globaldefs.ProcessingFailureException;
	void getAllContainedCurrentTPNames(globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllContainedInUseTPNames(globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void createQosRule(globaldefs.NameAndStringValue_T[] equipmentName, HW_mstpInventory.HW_QosType_T qosType, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException;
	void setQosRule(globaldefs.NameAndStringValue_T[] qosRuleName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException;
	void createFlow(globaldefs.NameAndStringValue_T[] equipmentName, globaldefs.NameAndStringValue_T[] paraList, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException;
	void getAllQosRules(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_QosRuleList_THolder qosRuleList, HW_mstpInventory.HW_QosRuleIterator_IHolder qosRuleIt) throws globaldefs.ProcessingFailureException;
	void getAllQosRuleNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getQosRule(globaldefs.NameAndStringValue_T[] qosRuleName, HW_mstpInventory.HW_QosRule_THolder qosRule) throws globaldefs.ProcessingFailureException;
	void deleteQosRule(globaldefs.NameAndStringValue_T[] qosRuleName) throws globaldefs.ProcessingFailureException;
	void getAllFlows(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_FlowList_THolder flowList, HW_mstpInventory.HW_FlowIterator_IHolder flowIt) throws globaldefs.ProcessingFailureException;
	void getAllFlowNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getFlow(globaldefs.NameAndStringValue_T[] flowName, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException;
	void setFlow(globaldefs.NameAndStringValue_T[] flowName, globaldefs.NameAndStringValue_T[][] qosRuleNames, HW_mstpInventory.HW_Flow_THolder flow) throws globaldefs.ProcessingFailureException;
	void deleteFlow(globaldefs.NameAndStringValue_T[] flowName) throws globaldefs.ProcessingFailureException;
	void createLinkAggregationGroup(globaldefs.NameAndStringValue_T[] meName, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] mainPortName, globaldefs.NameAndStringValue_T[][] branchPortNameList, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException;
	void getAllLinkAggregationGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList, HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder lagIt) throws globaldefs.ProcessingFailureException;
	void getAllLinkAggregationGroupNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException;
	void getAvailablePortNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void modifyLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws globaldefs.ProcessingFailureException;
	void deleteLinkAggregationGroup(globaldefs.NameAndStringValue_T[] lagName) throws globaldefs.ProcessingFailureException;
	void setMstpEndPointShapingQueue(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws globaldefs.ProcessingFailureException;
	void getMstpEndPointShapingQueue(globaldefs.NameAndStringValue_T[] endPointName, HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws globaldefs.ProcessingFailureException;
	void getAllSpanningTrees(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, HW_mstpInventory.HW_SpanningTreeList_THolder spanningTreeList, HW_mstpInventory.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws globaldefs.ProcessingFailureException;
	void getAllSpanningTreeNames(globaldefs.NameAndStringValue_T[] equipmentName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getSpanningTree(globaldefs.NameAndStringValue_T[] spanningTreeName, HW_mstpInventory.HW_SpanningTree_THolder spanningTree) throws globaldefs.ProcessingFailureException;
	void setSTProtocolParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException;
	void setSTBridgeParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException;
	void setSTPortParam(globaldefs.NameAndStringValue_T[] spanningTreeName, globaldefs.NameAndStringValue_T[] portName, globaldefs.NameAndStringValue_T[] paraList) throws globaldefs.ProcessingFailureException;
}
