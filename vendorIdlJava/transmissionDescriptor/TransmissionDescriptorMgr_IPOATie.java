package transmissionDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TransmissionDescriptorMgr_IPOATie
	extends TransmissionDescriptorMgr_IPOA
{
	private TransmissionDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionDescriptorMgr_IPOATie(TransmissionDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		return transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object());
	}
	public transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TransmissionDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionDescriptorMgr_IOperations delegate)
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
	public void getAllTransmissionDescriptorNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptorNames(how_many,nameList,nameIt);
	}

	public void getAllTransmissionDescriptors(int how_many, transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTransmissionDescriptors(how_many,transmissionDescList,transmissionDescIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void deleteTransmissionDescriptor(globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTransmissionDescriptor(transmissionDescriptorName);
	}

	public void getAssociatedTPs(globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedTPs(transmissionDescriptorName,how_many,tpList,tpIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setTMDAssociation(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws globaldefs.ProcessingFailureException
	{
_delegate.setTMDAssociation(tmdName,tPorMFDorFDFr);
	}

	public void createTransmissionDescriptor(transmissionDescriptor.TMDCreateData_T newTMDCreateData, transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws globaldefs.ProcessingFailureException
	{
_delegate.createTransmissionDescriptor(newTMDCreateData,newTransmissionDescriptor);
	}

	public void getTransmissionDescriptor(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionDescriptor(tmdName,tmd);
	}

	public void validateTMDAssignmentToObject(globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, transmissionParameters.LayeredParameterList_THolder transmissionParams, globaldefs.NVSList_THolder additionalTPInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.validateTMDAssignmentToObject(objectName,objectAssignmentState,transmissionParams,additionalTPInfo);
	}

	public void modifyTransmissionDescriptor(globaldefs.NameAndStringValue_T[] tmdName, transmissionDescriptor.TMDModifyData_T tmdModifyData, subnetworkConnection.TPDataList_THolder tpsToModify, transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, globaldefs.NamingAttributesList_THolder failedMEList, globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTransmissionDescriptor(tmdName,tmdModifyData,tpsToModify,modifiedTransmissionDescriptor,failedMEList,failedTPsMFDsList,errorReason);
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
