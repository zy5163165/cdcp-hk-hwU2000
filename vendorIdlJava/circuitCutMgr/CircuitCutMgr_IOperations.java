package circuitCutMgr;

/**
 *	Generated from IDL interface "CircuitCutMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface CircuitCutMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createPrefabSNCsAndDelCutSNCs(circuitCutMgr.SNCBasicInfo_T[] prefabSNCList, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.CutAndPrefabSNCPair_T[] cutAndPrefabSNCList, org.omg.CORBA.IntHolder result, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException;
	void checkPrefabAndCutSNCs(circuitCutMgr.SNCBasicInfo_T[] checkPrefabSNCList, circuitCutMgr.SNCBasicInfo_T[] checkCutSNCList, boolean isAccordCheck, circuitCutMgr.ErrorReasonList_THolder errorReasons) throws circuitCutMgr.ProcessingFailureException;
	void calcuPrefabSNCRoute(circuitCutMgr.PrefabSNCCreateData_T createPrefabSNC, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, int srcSncpNEID, int snkSncpNEID, boolean isCalcSNCP, circuitCutMgr.SNCServiceRouteList_THolder normalOrSncpRoute) throws circuitCutMgr.ProcessingFailureException;
	void getAllIdleServiceTrailAndTS(circuitCutMgr.ConnectivityNodePair_T[] serviceTrailEndPointList, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ServiceTrailList_THolder idleSNCServiceTrailList) throws circuitCutMgr.ProcessingFailureException;
	void setPrefabSNC(circuitCutMgr.SNCBasicInfo_T prefabSNCInfo, circuitCutMgr.SNCServiceRoute_T prefabSNCServiceRoute) throws circuitCutMgr.ProcessingFailureException;
	void getSNCServiceRoute(circuitCutMgr.SNCBasicInfo_T sncBasicInfo, circuitCutMgr.SNCServiceRoute_THolder sncServiceRoute) throws circuitCutMgr.ProcessingFailureException;
	void deletePrefabSNCs(circuitCutMgr.SNCBasicInfo_T[] delPrefabSNCInfoList, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException;
	void getAllIdlePortAndTS(circuitCutMgr.SNCTtpInfo_T sncTtPInfo, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.IdlePortAndTSList_THolder idleportAndTSList) throws circuitCutMgr.ProcessingFailureException;
	void getServiceTrailViewBySNCRate(int how_many, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ConnectivityNodePairList_THolder connectivityNodePairList, circuitCutMgr.ConnectivityNodePairIterator_IHolder ConnectivityNodePairListIt) throws circuitCutMgr.ProcessingFailureException;
	void getTopoSubnetworkViewInfo(int how_many, circuitCutMgr.NodeList_THolder nodeList, circuitCutMgr.NodeIterator_IHolder NodeIt) throws circuitCutMgr.ProcessingFailureException;
}
