package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ProtectionMgr_IPOATie
	extends ProtectionMgr_IPOA
{
	private ProtectionMgr_IOperations _delegate;

	private POA _poa;
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.ProtectionMgr_I _this()
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public ProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionMgr_IOperations delegate)
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
	public void getAllWDMProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.WDMProtectionGroupList_THolder wpgpList, protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllWDMProtectionGroups(meName,how_many,wpgpList,wpgpIt);
	}

	public void getAllProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.ProtectionGroupList_THolder pgList, protection.ProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void HW_getIFProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.HW_IFProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getIFProtectionGroup(pgName,protectionGroup);
	}

	public void HW_getERPSProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getERPSProtectionGroup(pgName,protectionGroup);
	}

	public void retrieveWDMSwitchData(globaldefs.NameAndStringValue_T[] wpgpName, protection.WDMSwitchDataList_THolder wSwitchDataList) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveWDMSwitchData(wpgpName,wSwitchDataList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllPreemptibleTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
	}

	public void performProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void retrieveSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.SwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllProtectionSubnetworks(int how_many, protection.ProtectionSubnetworkList_THolder psnList, protection.ProtectionSubnetworkIterator_IHolder psnIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionSubnetworks(how_many,psnList,psnIt);
	}

	public void HW_getAllERPSProtectionGroups(globaldefs.NameAndStringValue_T[] meName, protection.HW_ERPSProtectionGroupList_THolder pgList) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllERPSProtectionGroups(meName,pgList);
	}

	public void getAllNUTTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
	}

	public void getAllEProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.EProtectionGroupList_THolder epgpList, protection.EProtectionGroupIterator_IHolder epgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
	}

	public void getAllIPProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.IPProtectionGroupList_THolder pgList, protection.IPProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllIPProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void getEProtectionGroup(globaldefs.NameAndStringValue_T[] ePGPname, protection.EProtectionGroup_THolder eProtectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getEProtectionGroup(ePGPname,eProtectionGroup);
	}

	public void getProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getProtectionGroup(pgName,protectionGroup);
	}

	public void getAdjacentTPs(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAdjacentTPs(tpName,tpNameList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void HW_getAllXPICGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.HW_XPICGroupList_THolder xpicList, protection.HW_XPICGroupIterator_IHolder xpicIt) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllXPICGroups(meName,how_many,xpicList,xpicIt);
	}

	public void HW_getXPICGroup(globaldefs.NameAndStringValue_T[] xpicGroupName, protection.HW_XPICGroup_THolder xpicGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getXPICGroup(xpicGroupName,xpicGroup);
	}

	public void setProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, globaldefs.NameAndStringValue_T[] paraList, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.setProtectionGroup(pgName,paraList,protectionGroup);
	}

	public void retrieveIPSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.IPSwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveIPSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void performWDMProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] wpgpName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.WDMSwitchData_THolder wSwitchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performWDMProtectionCommand(protectionCommand,wpgpName,fromTp,toTp,wSwitchData);
	}

	public void retrieveESwitchData(globaldefs.NameAndStringValue_T[] ePGPName, protection.ESwitchDataList_THolder eSwitchDataList) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveESwitchData(ePGPName,eSwitchDataList);
	}

	public void getAllProtectedTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
	}

	public void HW_getAllIFProtectionGroups(globaldefs.NameAndStringValue_T[] meName, protection.HW_IFProtectionGroupList_THolder pgList) throws globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllIFProtectionGroups(meName,pgList);
	}

	public void getIPProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.IPProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getIPProtectionGroup(pgName,protectionGroup);
	}

	public void getWDMProtectionGroup(globaldefs.NameAndStringValue_T[] wpgpName, protection.WDMProtectionGroup_THolder wProtectionGroup) throws globaldefs.ProcessingFailureException
	{
_delegate.getWDMProtectionGroup(wpgpName,wProtectionGroup);
	}

}
