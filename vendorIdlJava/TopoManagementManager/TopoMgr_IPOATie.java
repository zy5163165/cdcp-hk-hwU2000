package TopoManagementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TopoMgr_IPOATie
	extends TopoMgr_IPOA
{
	private TopoMgr_IOperations _delegate;

	private POA _poa;
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public TopoManagementManager.TopoMgr_I _this()
	{
		return TopoManagementManager.TopoMgr_IHelper.narrow(_this_object());
	}
	public TopoManagementManager.TopoMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return TopoManagementManager.TopoMgr_IHelper.narrow(_this_object(orb));
	}
	public TopoMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopoMgr_IOperations delegate)
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
	public void getClockSourceSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getClockSourceSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getProtectSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getProtectSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void getAllClockSourceViewlTopologicalLinks(int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllClockSourceViewlTopologicalLinks(how_many,topoList,topoIt);
	}

	public void getTopoSubnetworkViewInfo(int how_many, TopoManagementManager.NodeList_THolder nodeList, TopoManagementManager.NodeIterator_IHolder NodeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
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

}
