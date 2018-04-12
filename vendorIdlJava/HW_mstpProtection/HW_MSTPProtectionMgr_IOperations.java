package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_MSTPProtectionMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRPRNode(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_RPRNodeList_THolder nodeList, HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws globaldefs.ProcessingFailureException;
	void getRPRNode(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRNode_THolder node) throws globaldefs.ProcessingFailureException;
	void getRPRTopoPara(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws globaldefs.ProcessingFailureException;
	void retrieveRPRSwitchData(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void performRPRProtectionCommand(globaldefs.NameAndStringValue_T[] nodeName, protection.ProtectionCommand_T protectionCommand, HW_mstpProtection.HW_SwitchPosition_T switchPosition, HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void getAllAtmProtectGroup(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws globaldefs.ProcessingFailureException;
	void getAtmProtectGroup(globaldefs.NameAndStringValue_T[] atmpgName, HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws globaldefs.ProcessingFailureException;
	void modifyAtmProtectGroup(globaldefs.NameAndStringValue_T[] atmPgName, globaldefs.NameAndStringValue_T[] atmPGParameters, HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws globaldefs.ProcessingFailureException;
	void retrieveAtmPGSwitchData(globaldefs.NameAndStringValue_T[] atmpgName, HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void performAtmPGProtectionCommand(globaldefs.NameAndStringValue_T[] atmpgName, protection.ProtectionCommand_T protectionCommand, HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException;
	void getAllRPRLinkInfo(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws globaldefs.ProcessingFailureException;
	void modifyRPRLinkPara(globaldefs.NameAndStringValue_T[] nodeName, globaldefs.NameAndStringValue_T[] rprLinkParameters, HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws globaldefs.ProcessingFailureException;
}
