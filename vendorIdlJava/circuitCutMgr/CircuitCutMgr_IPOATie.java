package circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CircuitCutMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class CircuitCutMgr_IPOATie
	extends CircuitCutMgr_IPOA
{
	private CircuitCutMgr_IOperations _delegate;

	private POA _poa;
	public CircuitCutMgr_IPOATie(CircuitCutMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CircuitCutMgr_IPOATie(CircuitCutMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public circuitCutMgr.CircuitCutMgr_I _this()
	{
		return circuitCutMgr.CircuitCutMgr_IHelper.narrow(_this_object());
	}
	public circuitCutMgr.CircuitCutMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return circuitCutMgr.CircuitCutMgr_IHelper.narrow(_this_object(orb));
	}
	public CircuitCutMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CircuitCutMgr_IOperations delegate)
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
	public void setPrefabSNC(circuitCutMgr.SNCBasicInfo_T prefabSNCInfo, circuitCutMgr.SNCServiceRoute_T prefabSNCServiceRoute) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.setPrefabSNC(prefabSNCInfo,prefabSNCServiceRoute);
	}

	public void getAllIdleServiceTrailAndTS(circuitCutMgr.ConnectivityNodePair_T[] serviceTrailEndPointList, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ServiceTrailList_THolder idleSNCServiceTrailList) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.getAllIdleServiceTrailAndTS(serviceTrailEndPointList,deleteCutSNCList,rate,idleSNCServiceTrailList);
	}

	public void calcuPrefabSNCRoute(circuitCutMgr.PrefabSNCCreateData_T createPrefabSNC, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, int srcSncpNEID, int snkSncpNEID, boolean isCalcSNCP, circuitCutMgr.SNCServiceRouteList_THolder normalOrSncpRoute) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.calcuPrefabSNCRoute(createPrefabSNC,deleteCutSNCList,srcSncpNEID,snkSncpNEID,isCalcSNCP,normalOrSncpRoute);
	}

	public void getSNCServiceRoute(circuitCutMgr.SNCBasicInfo_T sncBasicInfo, circuitCutMgr.SNCServiceRoute_THolder sncServiceRoute) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.getSNCServiceRoute(sncBasicInfo,sncServiceRoute);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void deletePrefabSNCs(circuitCutMgr.SNCBasicInfo_T[] delPrefabSNCInfoList, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.deletePrefabSNCs(delPrefabSNCInfoList,errorReasonList);
	}

	public void getServiceTrailViewBySNCRate(int how_many, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ConnectivityNodePairList_THolder connectivityNodePairList, circuitCutMgr.ConnectivityNodePairIterator_IHolder ConnectivityNodePairListIt) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.getServiceTrailViewBySNCRate(how_many,rate,connectivityNodePairList,ConnectivityNodePairListIt);
	}

	public void getAllIdlePortAndTS(circuitCutMgr.SNCTtpInfo_T sncTtPInfo, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.IdlePortAndTSList_THolder idleportAndTSList) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.getAllIdlePortAndTS(sncTtPInfo,cutSNCList,idleportAndTSList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getTopoSubnetworkViewInfo(int how_many, circuitCutMgr.NodeList_THolder nodeList, circuitCutMgr.NodeIterator_IHolder NodeIt) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void createPrefabSNCsAndDelCutSNCs(circuitCutMgr.SNCBasicInfo_T[] prefabSNCList, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.CutAndPrefabSNCPair_T[] cutAndPrefabSNCList, org.omg.CORBA.IntHolder result, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.createPrefabSNCsAndDelCutSNCs(prefabSNCList,cutSNCList,cutAndPrefabSNCList,result,errorReasonList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void checkPrefabAndCutSNCs(circuitCutMgr.SNCBasicInfo_T[] checkPrefabSNCList, circuitCutMgr.SNCBasicInfo_T[] checkCutSNCList, boolean isAccordCheck, circuitCutMgr.ErrorReasonList_THolder errorReasons) throws circuitCutMgr.ProcessingFailureException
	{
_delegate.checkPrefabAndCutSNCs(checkPrefabSNCList,checkCutSNCList,isAccordCheck,errorReasons);
	}

}
