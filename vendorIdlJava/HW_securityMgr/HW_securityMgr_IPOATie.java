package HW_securityMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_securityMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_securityMgr_IPOATie
	extends HW_securityMgr_IPOA
{
	private HW_securityMgr_IOperations _delegate;

	private POA _poa;
	public HW_securityMgr_IPOATie(HW_securityMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_securityMgr_IPOATie(HW_securityMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_securityMgr.HW_securityMgr_I _this()
	{
		return HW_securityMgr.HW_securityMgr_IHelper.narrow(_this_object());
	}
	public HW_securityMgr.HW_securityMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_securityMgr.HW_securityMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_securityMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_securityMgr_IOperations delegate)
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
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void modifyPassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyPassword(userName,oldPassword,newPassword);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
