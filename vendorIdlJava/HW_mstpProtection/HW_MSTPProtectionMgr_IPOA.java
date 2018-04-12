package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class HW_MSTPProtectionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, HW_mstpProtection.HW_MSTPProtectionMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "performAtmPGProtectionCommand", new java.lang.Integer(0));
		m_opsHash.put ( "retrieveAtmPGSwitchData", new java.lang.Integer(1));
		m_opsHash.put ( "modifyRPRLinkPara", new java.lang.Integer(2));
		m_opsHash.put ( "performRPRProtectionCommand", new java.lang.Integer(3));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(4));
		m_opsHash.put ( "getRPRTopoPara", new java.lang.Integer(5));
		m_opsHash.put ( "getAllAtmProtectGroup", new java.lang.Integer(6));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(7));
		m_opsHash.put ( "getAllRPRNode", new java.lang.Integer(8));
		m_opsHash.put ( "getAtmProtectGroup", new java.lang.Integer(9));
		m_opsHash.put ( "getRPRNode", new java.lang.Integer(10));
		m_opsHash.put ( "retrieveRPRSwitchData", new java.lang.Integer(11));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
		m_opsHash.put ( "modifyAtmProtectGroup", new java.lang.Integer(14));
		m_opsHash.put ( "setOwner", new java.lang.Integer(15));
		m_opsHash.put ( "getAllRPRLinkInfo", new java.lang.Integer(16));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpProtection/HW_MSTPProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public HW_mstpProtection.HW_MSTPProtectionMgr_I _this()
	{
		return HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object());
	}
	public HW_mstpProtection.HW_MSTPProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpProtection.HW_MSTPProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // performAtmPGProtectionCommand
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				protection.ProtectionCommand_T _arg1=protection.ProtectionCommand_THelper.read(_input);
				HW_mstpProtection.HW_AtmPGSwitchAction_T _arg2=HW_mstpProtection.HW_AtmPGSwitchAction_THelper.read(_input);
				HW_mstpProtection.HW_AtmPGSwitchDirect_T _arg3=HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.read(_input);
				HW_mstpProtection.HW_AtmPGSwitchData_THolder _arg4= new HW_mstpProtection.HW_AtmPGSwitchData_THolder();
				_out = handler.createReply();
				performAtmPGProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4);
				HW_mstpProtection.HW_AtmPGSwitchData_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // retrieveAtmPGSwitchData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_AtmPGSwitchData_THolder _arg1= new HW_mstpProtection.HW_AtmPGSwitchData_THolder();
				_out = handler.createReply();
				retrieveAtmPGSwitchData(_arg0,_arg1);
				HW_mstpProtection.HW_AtmPGSwitchData_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // modifyRPRLinkPara
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_RPRLinkInfo_THolder _arg2= new HW_mstpProtection.HW_RPRLinkInfo_THolder();
				_out = handler.createReply();
				modifyRPRLinkPara(_arg0,_arg1,_arg2);
				HW_mstpProtection.HW_RPRLinkInfo_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // performRPRProtectionCommand
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				protection.ProtectionCommand_T _arg1=protection.ProtectionCommand_THelper.read(_input);
				HW_mstpProtection.HW_SwitchPosition_T _arg2=HW_mstpProtection.HW_SwitchPosition_THelper.read(_input);
				HW_mstpProtection.HW_RPRSwitchData_THolder _arg3= new HW_mstpProtection.HW_RPRSwitchData_THolder();
				_out = handler.createReply();
				performRPRProtectionCommand(_arg0,_arg1,_arg2,_arg3);
				HW_mstpProtection.HW_RPRSwitchData_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setAdditionalInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getRPRTopoPara
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_RPRTopoInfo_THolder _arg1= new HW_mstpProtection.HW_RPRTopoInfo_THolder();
				_out = handler.createReply();
				getRPRTopoPara(_arg0,_arg1);
				HW_mstpProtection.HW_RPRTopoInfo_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllAtmProtectGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpProtection.HW_AtmProtectGroupList_THolder _arg2= new HW_mstpProtection.HW_AtmProtectGroupList_THolder();
				HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder _arg3= new HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder();
				_out = handler.createReply();
				getAllAtmProtectGroup(_arg0,_arg1,_arg2,_arg3);
				HW_mstpProtection.HW_AtmProtectGroupList_THelper.write(_out,_arg2.value);
				HW_mstpProtection.HW_AtmProtectGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getCapabilities
			{
			try
			{
				common.CapabilityList_THolder _arg0= new common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllRPRNode
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpProtection.HW_RPRNodeList_THolder _arg2= new HW_mstpProtection.HW_RPRNodeList_THolder();
				HW_mstpProtection.HW_RPRNodeIterator_IHolder _arg3= new HW_mstpProtection.HW_RPRNodeIterator_IHolder();
				_out = handler.createReply();
				getAllRPRNode(_arg0,_arg1,_arg2,_arg3);
				HW_mstpProtection.HW_RPRNodeList_THelper.write(_out,_arg2.value);
				HW_mstpProtection.HW_RPRNodeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAtmProtectGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_AtmProtectGroup_THolder _arg1= new HW_mstpProtection.HW_AtmProtectGroup_THolder();
				_out = handler.createReply();
				getAtmProtectGroup(_arg0,_arg1);
				HW_mstpProtection.HW_AtmProtectGroup_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getRPRNode
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_RPRNode_THolder _arg1= new HW_mstpProtection.HW_RPRNode_THolder();
				_out = handler.createReply();
				getRPRNode(_arg0,_arg1);
				HW_mstpProtection.HW_RPRNode_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // retrieveRPRSwitchData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_RPRSwitchData_THolder _arg1= new HW_mstpProtection.HW_RPRSwitchData_THolder();
				_out = handler.createReply();
				retrieveRPRSwitchData(_arg0,_arg1);
				HW_mstpProtection.HW_RPRSwitchData_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setUserLabel
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setNativeEMSName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // modifyAtmProtectGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				HW_mstpProtection.HW_AtmProtectGroup_THolder _arg2= new HW_mstpProtection.HW_AtmProtectGroup_THolder();
				_out = handler.createReply();
				modifyAtmProtectGroup(_arg0,_arg1,_arg2);
				HW_mstpProtection.HW_AtmProtectGroup_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setOwner
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllRPRLinkInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpProtection.HW_RPRLinkInfoList_THolder _arg2= new HW_mstpProtection.HW_RPRLinkInfoList_THolder();
				HW_mstpProtection.HW_RPRLinkIterator_IHolder _arg3= new HW_mstpProtection.HW_RPRLinkIterator_IHolder();
				_out = handler.createReply();
				getAllRPRLinkInfo(_arg0,_arg1,_arg2,_arg3);
				HW_mstpProtection.HW_RPRLinkInfoList_THelper.write(_out,_arg2.value);
				HW_mstpProtection.HW_RPRLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
