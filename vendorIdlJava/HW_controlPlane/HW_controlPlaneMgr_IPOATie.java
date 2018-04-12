package HW_controlPlane;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_controlPlaneMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_controlPlaneMgr_IPOATie
	extends HW_controlPlaneMgr_IPOA
{
	private HW_controlPlaneMgr_IOperations _delegate;

	private POA _poa;
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_controlPlane.HW_controlPlaneMgr_I _this()
	{
		return HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(_this_object());
	}
	public HW_controlPlane.HW_controlPlaneMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_controlPlaneMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_controlPlaneMgr_IOperations delegate)
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
	public void getNodeIDByMEName(globaldefs.NameAndStringValue_T[] meOrHolderName, HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws globaldefs.ProcessingFailureException
	{
_delegate.getNodeIDByMEName(meOrHolderName,nodeID);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getMENameByNodeID(java.lang.String nodeID, globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getMENameByNodeID(nodeID,meOrHolderNameList);
	}

	public void setSRLG(int srlgID, boolean addOrRemove, globaldefs.NamingAttributesList_THolder snppLinkNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.setSRLG(srlgID,addOrRemove,snppLinkNameList);
	}

	public void getAllSnppNames(globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppNames(routingNodeName,how_many,nameList,nameIt);
	}

	public void getAllRoutingNodeNames(globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, globaldefs.NamingAttributesList_THolder nodeNameList, globaldefs.NamingAttributesIterator_IHolder nodeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingNodeNames(routingAreaName,how_many,nodeNameList,nodeIt);
	}

	public void getAllContainedSnpNames(globaldefs.NameAndStringValue_T[] snppName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedSnpNames(snppName,how_many,nameList,nameIt);
	}

	public void getAllSnppLinks(globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppLinks(routingAreaName,how_many,snppLinkList,snppLinkIt);
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

	public void getAllRoutingAreaNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingAreaNames(nameList);
	}

}
