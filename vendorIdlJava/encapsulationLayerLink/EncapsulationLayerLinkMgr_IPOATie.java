package encapsulationLayerLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class EncapsulationLayerLinkMgr_IPOATie
	extends EncapsulationLayerLinkMgr_IPOA
{
	private EncapsulationLayerLinkMgr_IOperations _delegate;

	private POA _poa;
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EncapsulationLayerLinkMgr_IPOATie(EncapsulationLayerLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this()
	{
		return encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object());
	}
	public encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object(orb));
	}
	public EncapsulationLayerLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EncapsulationLayerLinkMgr_IOperations delegate)
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
	public void getConnectingELL(globaldefs.NameAndStringValue_T[] tpName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException
	{
_delegate.getConnectingELL(tpName,ell);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getTransmissionParams(globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, transmissionParameters.LayeredParameterList_THolder transmissionParams) throws globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionParams(name,filter,transmissionParams);
	}

	public void deleteELLink(globaldefs.NameAndStringValue_T[] ellName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteELLink(ellName);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllELLinksWithMeOrFd(globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, encapsulationLayerLink.ELLinkList_THolder ells, encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinksWithMeOrFd(meOrFdName,how_many,ells,ellIt);
	}

	public void createELLink(encapsulationLayerLink.ELLinkCreateData_T createData, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createELLink(createData,theELL,errorReason);
	}

	public void getAllELLinkNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinkNames(how_many,nameList,nameIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getELLinkWithTP(globaldefs.NameAndStringValue_T[] tpName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithTP(tpName,ell);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void decreaseBandwidthOfELLink(globaldefs.NameAndStringValue_T[] ellName, globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, globaldefs.NameAndStringValue_T[] additionalModificationInfo, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws globaldefs.ProcessingFailureException
	{
_delegate.decreaseBandwidthOfELLink(ellName,sncNames,numberOfSNCs,additionalModificationInfo,newELL);
	}

	public void increaseBandwidthOfELLink(globaldefs.NameAndStringValue_T[] ellName, boolean automatic, subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalModificationInfo, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws globaldefs.ProcessingFailureException
	{
_delegate.increaseBandwidthOfELLink(ellName,automatic,additionalSNCs,numberOfSNCs,transmissionParams,additionalModificationInfo,newELL);
	}

	public void setELLinkLCASState(globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws globaldefs.ProcessingFailureException
	{
_delegate.setELLinkLCASState(ellName,enableState);
	}

	public void activateELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.activateELLink(ellName,theELL,errorReason);
	}

	public void deactivateELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateELLink(ellName,theELL,errorReason);
	}

	public void getAllELLinks(int how_many, encapsulationLayerLink.ELLinkList_THolder ells, encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllELLinks(how_many,ells,ellIt);
	}

	public void getELLinkWithSncOrTl(globaldefs.NameAndStringValue_T[] sncOrTlName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException
	{
_delegate.getELLinkWithSncOrTl(sncOrTlName,ell);
	}

	public void getELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws globaldefs.ProcessingFailureException
	{
_delegate.getELLink(ellName,ell);
	}

	public void getServerSNCsAndTLs(globaldefs.NameAndStringValue_T[] ellName, subnetworkConnection.SubnetworkConnectionList_THolder sncList, topologicalLink.TopologicalLinkList_THolder tlList) throws globaldefs.ProcessingFailureException
	{
_delegate.getServerSNCsAndTLs(ellName,sncList,tlList);
	}

	public void modifyELLink(globaldefs.NameAndStringValue_T[] ellName, encapsulationLayerLink.ELLinkModifyData_T ellModifyData, encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyELLink(ellName,ellModifyData,newELL,errorReason);
	}

}
