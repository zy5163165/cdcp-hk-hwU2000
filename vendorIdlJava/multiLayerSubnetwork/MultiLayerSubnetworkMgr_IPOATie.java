package multiLayerSubnetwork;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class MultiLayerSubnetworkMgr_IPOATie
	extends MultiLayerSubnetworkMgr_IPOA
{
	private MultiLayerSubnetworkMgr_IOperations _delegate;

	private POA _poa;
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MultiLayerSubnetworkMgr_IPOATie(MultiLayerSubnetworkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
	}
	public MultiLayerSubnetworkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MultiLayerSubnetworkMgr_IOperations delegate)
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
	public void createAndActivateSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllManagedElementNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
	}

	public void getRouteAndTopologicalLinks(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.Route_THolder route, topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws globaldefs.ProcessingFailureException
	{
_delegate.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
	}

	public void deletePresetRoute(globaldefs.NameAndStringValue_T[] sncName, int presetRouteID) throws globaldefs.ProcessingFailureException
	{
_delegate.deletePresetRoute(sncName,presetRouteID);
	}

	public void deleteSNC(globaldefs.NameAndStringValue_T[] sncName, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteSNC(sncName,emsFreedomLevel);
	}

	public void getSNCsByEndObjectName(globaldefs.NameAndStringValue_T[] aEndObjectName, globaldefs.NameAndStringValue_T[] zEndObjectName, short[] connectionRateList, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByEndObjectName(aEndObjectName,zEndObjectName,connectionRateList,sncList);
	}

	public void getAllEdgePoints(globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void setConjunctionSNC(globaldefs.NameAndStringValue_T[] sncName1, globaldefs.NameAndStringValue_T[] sncName2, boolean operate) throws globaldefs.ProcessingFailureException
	{
_delegate.setConjunctionSNC(sncName1,sncName2,operate);
	}

	public void getAllInternalTopologicalLinks(globaldefs.NameAndStringValue_T[] meName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinks(meName,how_many,topoList,topoIt);
	}

	public void deactivateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getRoutes(globaldefs.NameAndStringValue_T[][] sncNameList, boolean includeHigherOrderCCs, subnetworkConnection.RouteInfoList_THolder routeInfoList) throws globaldefs.ProcessingFailureException
	{
_delegate.getRoutes(sncNameList,includeHigherOrderCCs,routeInfoList);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllSubnetworkConnectionNames(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNC(sncName,snc);
	}

	public void getAllSubnetworkConnectionsWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getPresetRoute(globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, subnetworkConnection.PresetRoute_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getPresetRoute(sncName,presetRouteID,route);
	}

	public void getOrginalRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getOrginalRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getAllSubnetworkConnectionNamesWithTP(globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
	}

	public void getTopologicalLink(globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalLink(topoLinkName,topoLink);
	}

	public void deactivateAndDeleteSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getAllTPPoolNames(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
	}

	public void getAllSubnetworkConnections(globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
	}

	public void getRoute(globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.getRoute(sncName,includeHigherOrderCCs,route);
	}

	public void getSNCsByNativeEmsName(java.lang.String nativeEmsName, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByNativeEmsName(nativeEmsName,how_many,sncList,sncIt);
	}

	public void createSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
	}

	public void getTPGroupingRelationships(globaldefs.NameAndStringValue_T[] tpName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
	}

	public void getAllTopologicalLinkNames(globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
	}

	public void checkValidSNC(subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws globaldefs.ProcessingFailureException
	{
_delegate.checkValidSNC(createData,tpsToModify,considerResources,valid);
	}

	public void getSNCNamesByRouteModificationTime(java.lang.String utcBeginTime, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCNamesByRouteModificationTime(utcBeginTime,how_many,nameList,nameIt);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void activateSNC(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
	}

	public void getSNCsByUserLabel(java.lang.String userLabel, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCsByUserLabel(userLabel,sncList);
	}

	public void modifySNC(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
	}

	public void swapSNC(globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
	}

	public void switchRoute(globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
	}

	public void getAllTPPools(globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
	}

	public void getAllInternalTopologicalLinkNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllInternalTopologicalLinkNames(meName,how_many,nameList,nameIt);
	}

	public void createPresetRoute(subnetworkConnection.CreatePresetRouteData_T createData, subnetworkConnection.PresetRoute_THolder route) throws globaldefs.ProcessingFailureException
	{
_delegate.createPresetRoute(createData,route);
	}

	public void getAssociatedTP(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTP(tpName,tpList);
	}

	public void getWaveLengthStatusByEndObject(globaldefs.NameAndStringValue_T[] aEndName, globaldefs.NameAndStringValue_T[][] inclusionNameList, globaldefs.NameAndStringValue_T[][] exclusionNameList, globaldefs.NameAndStringValue_T[] zEndName, globaldefs.ConnectionDirection_T direction, subnetworkConnection.WaveLengthStatusList_THolder waveLengthStatusList) throws globaldefs.ProcessingFailureException
	{
_delegate.getWaveLengthStatusByEndObject(aEndName,inclusionNameList,exclusionNameList,zEndName,direction,waveLengthStatusList);
	}

	public void getAllSNCNamesWithHigherOrderSNC(globaldefs.NameAndStringValue_T[] name, short[] connectivityRateList, globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSNCNamesWithHigherOrderSNC(name,connectivityRateList,nameList);
	}

	public void getAllManagedElements(globaldefs.NameAndStringValue_T[] subnetName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(subnetName,how_many,meList,meIt);
	}

	public void getAllTopologicalLinks(globaldefs.NameAndStringValue_T[] subnetName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
	}

	public void getMultiLayerSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException
	{
_delegate.getMultiLayerSubnetwork(subnetName,subnetwork);
	}

	public void getAllEdgePointNames(globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void getSNCs(globaldefs.NameAndStringValue_T[][] sncNameList, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSNCs(sncNameList,sncList);
	}

}
