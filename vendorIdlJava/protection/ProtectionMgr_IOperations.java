package protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface ProtectionMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.ProtectionGroupList_THolder pgList, protection.ProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException;
	void getProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
	void setProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, globaldefs.NameAndStringValue_T[] paraList, protection.ProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
	void getAllNUTTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllPreemptibleTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getAllProtectedTPNames(globaldefs.NameAndStringValue_T[] pgName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void retrieveSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.SwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException;
	void performProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.SwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void getAdjacentTPs(globaldefs.NameAndStringValue_T[] tpName, globaldefs.NamingAttributesList_THolder tpNameList) throws globaldefs.ProcessingFailureException;
	void getAllEProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.EProtectionGroupList_THolder epgpList, protection.EProtectionGroupIterator_IHolder epgpIt) throws globaldefs.ProcessingFailureException;
	void getEProtectionGroup(globaldefs.NameAndStringValue_T[] ePGPname, protection.EProtectionGroup_THolder eProtectionGroup) throws globaldefs.ProcessingFailureException;
	void retrieveESwitchData(globaldefs.NameAndStringValue_T[] ePGPName, protection.ESwitchDataList_THolder eSwitchDataList) throws globaldefs.ProcessingFailureException;
	void getAllProtectionSubnetworks(int how_many, protection.ProtectionSubnetworkList_THolder psnList, protection.ProtectionSubnetworkIterator_IHolder psnIt) throws globaldefs.ProcessingFailureException;
	void getAllWDMProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.WDMProtectionGroupList_THolder wpgpList, protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws globaldefs.ProcessingFailureException;
	void getWDMProtectionGroup(globaldefs.NameAndStringValue_T[] wpgpName, protection.WDMProtectionGroup_THolder wProtectionGroup) throws globaldefs.ProcessingFailureException;
	void retrieveWDMSwitchData(globaldefs.NameAndStringValue_T[] wpgpName, protection.WDMSwitchDataList_THolder wSwitchDataList) throws globaldefs.ProcessingFailureException;
	void performWDMProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] wpgpName, globaldefs.NameAndStringValue_T[] fromTp, globaldefs.NameAndStringValue_T[] toTp, protection.WDMSwitchData_THolder wSwitchData) throws globaldefs.ProcessingFailureException;
	void getIPProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.IPProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
	void getAllIPProtectionGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.IPProtectionGroupList_THolder pgList, protection.IPProtectionGroupIterator_IHolder pgpIt) throws globaldefs.ProcessingFailureException;
	void retrieveIPSwitchData(globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, protection.IPSwitchDataList_THolder switchData) throws globaldefs.ProcessingFailureException;
	void HW_getAllXPICGroups(globaldefs.NameAndStringValue_T[] meName, int how_many, protection.HW_XPICGroupList_THolder xpicList, protection.HW_XPICGroupIterator_IHolder xpicIt) throws globaldefs.ProcessingFailureException;
	void HW_getXPICGroup(globaldefs.NameAndStringValue_T[] xpicGroupName, protection.HW_XPICGroup_THolder xpicGroup) throws globaldefs.ProcessingFailureException;
	void HW_getAllERPSProtectionGroups(globaldefs.NameAndStringValue_T[] meName, protection.HW_ERPSProtectionGroupList_THolder pgList) throws globaldefs.ProcessingFailureException;
	void HW_getERPSProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
	void HW_getAllIFProtectionGroups(globaldefs.NameAndStringValue_T[] meName, protection.HW_IFProtectionGroupList_THolder pgList) throws globaldefs.ProcessingFailureException;
	void HW_getIFProtectionGroup(globaldefs.NameAndStringValue_T[] pgName, protection.HW_IFProtectionGroup_THolder protectionGroup) throws globaldefs.ProcessingFailureException;
}
