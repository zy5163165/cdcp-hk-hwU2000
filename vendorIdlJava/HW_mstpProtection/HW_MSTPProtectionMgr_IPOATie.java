package HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_MSTPProtectionMgr_IPOATie
	extends HW_MSTPProtectionMgr_IPOA
{
	private HW_MSTPProtectionMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPProtectionMgr_IPOATie(HW_MSTPProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpProtection.HW_MSTPProtectionMgr_I _this()
	{
		return HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object());
	}
	public HW_mstpProtection.HW_MSTPProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPProtectionMgr_IOperations delegate)
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
	public void performAtmPGProtectionCommand(globaldefs.NameAndStringValue_T[] atmpgName, protection.ProtectionCommand_T protectionCommand, HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performAtmPGProtectionCommand(atmpgName,protectionCommand,switchAction,switchDirect,switchData);
	}

	public void retrieveAtmPGSwitchData(globaldefs.NameAndStringValue_T[] atmpgName, HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveAtmPGSwitchData(atmpgName,switchData);
	}

	public void modifyRPRLinkPara(globaldefs.NameAndStringValue_T[] nodeName, globaldefs.NameAndStringValue_T[] rprLinkParameters, HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyRPRLinkPara(nodeName,rprLinkParameters,linkInfo);
	}

	public void performRPRProtectionCommand(globaldefs.NameAndStringValue_T[] nodeName, protection.ProtectionCommand_T protectionCommand, HW_mstpProtection.HW_SwitchPosition_T switchPosition, HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.performRPRProtectionCommand(nodeName,protectionCommand,switchPosition,switchData);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getRPRTopoPara(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getRPRTopoPara(nodeName,topoInfo);
	}

	public void getAllAtmProtectGroup(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllAtmProtectGroup(meName,how_many,atmPGList,pgIt);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllRPRNode(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_RPRNodeList_THolder nodeList, HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRNode(meName,how_many,nodeList,nodeIt);
	}

	public void getAtmProtectGroup(globaldefs.NameAndStringValue_T[] atmpgName, HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws globaldefs.ProcessingFailureException
	{
_delegate.getAtmProtectGroup(atmpgName,atmPG);
	}

	public void getRPRNode(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRNode_THolder node) throws globaldefs.ProcessingFailureException
	{
_delegate.getRPRNode(nodeName,node);
	}

	public void retrieveRPRSwitchData(globaldefs.NameAndStringValue_T[] nodeName, HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws globaldefs.ProcessingFailureException
	{
_delegate.retrieveRPRSwitchData(nodeName,switchData);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void modifyAtmProtectGroup(globaldefs.NameAndStringValue_T[] atmPgName, globaldefs.NameAndStringValue_T[] atmPGParameters, HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyAtmProtectGroup(atmPgName,atmPGParameters,atmPG);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllRPRLinkInfo(globaldefs.NameAndStringValue_T[] meName, int how_many, HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllRPRLinkInfo(meName,how_many,linkList,rprLinkIt);
	}

}
