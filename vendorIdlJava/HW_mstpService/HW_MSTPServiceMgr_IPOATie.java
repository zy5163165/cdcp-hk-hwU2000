package HW_mstpService;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_MSTPServiceMgr_IPOATie
	extends HW_MSTPServiceMgr_IPOA
{
	private HW_MSTPServiceMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPServiceMgr_IPOATie(HW_MSTPServiceMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpService.HW_MSTPServiceMgr_I _this()
	{
		return HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object());
	}
	public HW_mstpService.HW_MSTPServiceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpService.HW_MSTPServiceMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPServiceMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPServiceMgr_IOperations delegate)
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

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createAtmService(HW_mstpService.HW_AtmServiceCreateData_T createData, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException
	{
_delegate.createAtmService(createData,atmService);
	}

	public void deleteEthService(globaldefs.NameAndStringValue_T[] serviceName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteEthService(serviceName);
	}

	public void createEthService(HW_mstpService.HW_EthServiceCreateData_T createData, HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws globaldefs.ProcessingFailureException
	{
_delegate.createEthService(createData,ethServiceList);
	}

	public void getAllEthService(globaldefs.NameAndStringValue_T[] meName, HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, HW_mstpService.HW_EthServiceList_THolder serviceList, HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEthService(meName,typeList,how_many,serviceList,serviceIt);
	}

	public void getAllAtmService(globaldefs.NameAndStringValue_T[] meName, HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, HW_mstpService.HW_AtmServiceList_THolder serviceList, HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmService(meName,typeList,how_many,serviceList,serviceIt);
	}

	public void deleteAtmService(globaldefs.NameAndStringValue_T[] serviceName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteAtmService(serviceName);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void deactivateAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException
	{
_delegate.deactivateAtmService(serviceName,atmService);
	}

	public void activateAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException
	{
_delegate.activateAtmService(serviceName,atmService);
	}

	public void getAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException
	{
_delegate.getAtmService(serviceName,atmService);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getEthService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_EthService_THolder ethService) throws globaldefs.ProcessingFailureException
	{
_delegate.getEthService(serviceName,ethService);
	}

}
