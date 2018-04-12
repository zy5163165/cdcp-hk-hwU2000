package multiLayerSubnetwork;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface MultiLayerSubnetworkMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllManagedElements(globaldefs.NameAndStringValue_T[] subnetName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException;
	void getAllManagedElementNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException;
	void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void getAllTopologicalLinkNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllInternalTopologicalLinks(globaldefs.NameAndStringValue_T[] meName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;
	void getAllInternalTopologicalLinkNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;
	void getAllEdgePoints(globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllEdgePointNames(globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAssociatedTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;
	void getTPGroupingRelationships(globaldefs.NameAndStringValue_T[] tpName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;
	void getAllSubnetworkConnectionNames(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllSubnetworkConnectionsWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;
	void getAllSubnetworkConnectionNamesWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;
	void getRoutes(globaldefs.NameAndStringValue_T[][] sncNameList, boolean includeHigherOrderCCs, subnetworkConnection.RouteInfoList_THolder routeInfoList) throws globaldefs.ProcessingFailureException;
	void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException;
	void getSNCs(globaldefs.NameAndStringValue_T[][] sncNameList, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	void getSNCsByEndObjectName(globaldefs.NameAndStringValue_T[] aEndObjectName, globaldefs.NameAndStringValue_T[] zEndObjectName, short[] connectionRateList, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	void getSNCsByNativeEmsName(java.lang.String nativeEmsName, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;
	void getSNCsByUserLabel(java.lang.String userLabel, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void deleteSNC(globaldefs.NameAndStringValue_T[] sncName, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws globaldefs.ProcessingFailureException;
	void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void checkValidSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws globaldefs.ProcessingFailureException;
	void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void getAllTPPoolNames(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getRouteAndTopologicalLinks(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.Route_THolder route, topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws globaldefs.ProcessingFailureException;
	void setConjunctionSNC(globaldefs.NameAndStringValue_T[] sncName1, globaldefs.NameAndStringValue_T[] sncName2, boolean operate) throws globaldefs.ProcessingFailureException;
	void swapSNC(globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getWaveLengthStatusByEndObject(globaldefs.NameAndStringValue_T[] aEndName, globaldefs.NameAndStringValue_T[][] inclusionNameList, globaldefs.NameAndStringValue_T[][] exclusionNameList, globaldefs.NameAndStringValue_T[] zEndName, globaldefs.ConnectionDirection_T direction, subnetworkConnection.WaveLengthStatusList_THolder waveLengthStatusList) throws globaldefs.ProcessingFailureException;
	void getOrginalRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;
	void getPresetRoute(globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, subnetworkConnection.PresetRoute_THolder route) throws globaldefs.ProcessingFailureException;
	void deletePresetRoute(globaldefs.NameAndStringValue_T[] sncName, int presetRouteID) throws globaldefs.ProcessingFailureException;
	void createPresetRoute(subnetworkConnection.CreatePresetRouteData_T createData, subnetworkConnection.PresetRoute_THolder route) throws globaldefs.ProcessingFailureException;
	void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;
	void getSNCNamesByRouteModificationTime(java.lang.String utcBeginTime, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllSNCNamesWithHigherOrderSNC(globaldefs.NameAndStringValue_T[] name, short[] connectivityRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException;
}
