package trafficDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TrafficDescriptorMgr_IPOATie
	extends TrafficDescriptorMgr_IPOA
{
	private TrafficDescriptorMgr_IOperations _delegate;

	private POA _poa;
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrafficDescriptorMgr_IPOATie(TrafficDescriptorMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trafficDescriptor.TrafficDescriptorMgr_I _this()
	{
		return trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object());
	}
	public trafficDescriptor.TrafficDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficDescriptor.TrafficDescriptorMgr_IHelper.narrow(_this_object(orb));
	}
	public TrafficDescriptorMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrafficDescriptorMgr_IOperations delegate)
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
	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException
	{
_delegate.getTrafficDescriptor(tdName,td);
	}

	public void getAllTrafficDescriptors(int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptors(how_many,trafficDescList,trafficDescIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void activateTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficDescriptor(tdName,td);
	}

	public void HW_getAllTrafficDescriptorNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptorNames(meName,how_many,nameList,nameIt);
	}

	public void deactivateTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficDescriptor(tdName,td);
	}

	public void HW_getAllTrafficDescriptors(globaldefs.NameAndStringValue_T[] meName, int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllTrafficDescriptors(meName,how_many,trafficDescList,trafficDescIt);
	}

	public void deleteTrafficDescriptor(globaldefs.NameAndStringValue_T[] descriptorName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficDescriptor(descriptorName);
	}

	public void HW_createTrafficDescriptor(globaldefs.NameAndStringValue_T[] meName, trafficDescriptor.TDCreateData_T newTDCreateData, trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_createTrafficDescriptor(meName,newTDCreateData,newTrafficDescriptor);
	}

	public void createTrafficDescriptor(trafficDescriptor.TDCreateData_T newTDCreateData, trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws globaldefs.ProcessingFailureException
	{
_delegate.createTrafficDescriptor(newTDCreateData,newTrafficDescriptor);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAssociatedCTPs(globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAssociatedCTPs(trafficDescriptorName,how_many,tpList,tpIt);
	}

	public void getAllTrafficDescriptorNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficDescriptorNames(how_many,nameList,nameIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
