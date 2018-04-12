package trailNtwProtection;

/**
 *	Generated from IDL interface "TrailNtwProtMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class TrailNtwProtMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, trailNtwProtection.TrailNtwProtMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "deleteTrailNtwProtection", new java.lang.Integer(0));
		m_opsHash.put ( "createTrailNtwProtection", new java.lang.Integer(1));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(2));
		m_opsHash.put ( "modifyTrailNtwProtection", new java.lang.Integer(3));
		m_opsHash.put ( "performTrailNtwProtectionCommand", new java.lang.Integer(4));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(5));
		m_opsHash.put ( "getTrailNtwProtection", new java.lang.Integer(6));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(7));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(8));
		m_opsHash.put ( "getAllTrailNtwProtections", new java.lang.Integer(9));
		m_opsHash.put ( "setOwner", new java.lang.Integer(10));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/trailNtwProtection/TrailNtwProtMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public trailNtwProtection.TrailNtwProtMgr_I _this()
	{
		return trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object());
	}
	public trailNtwProtection.TrailNtwProtMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // deleteTrailNtwProtection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_arg3._read (_input);
				protection.ProtectionGroupList_THolder _arg4= new protection.ProtectionGroupList_THolder();
				trailNtwProtection.TrailNtwProtection_THolder _arg5= new trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deleteTrailNtwProtection(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
				protection.ProtectionGroupList_THelper.write(_out,_arg4.value);
				trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // createTrailNtwProtection
			{
			try
			{
				trailNtwProtection.TrailNtwProtCreateData_T _arg0=trailNtwProtection.TrailNtwProtCreateData_THelper.read(_input);
				trailNtwProtection.TrailNtwProtection_THolder _arg1= new trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createTrailNtwProtection(_arg0,_arg1,_arg2);
				trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setAdditionalInfo
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
			case 3: // modifyTrailNtwProtection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				trailNtwProtection.TrailNtwProtModifyData_T _arg1=trailNtwProtection.TrailNtwProtModifyData_THelper.read(_input);
				trailNtwProtection.TrailNtwProtection_THolder _arg2= new trailNtwProtection.TrailNtwProtection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTrailNtwProtection(_arg0,_arg1,_arg2,_arg3);
				trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // performTrailNtwProtectionCommand
			{
			try
			{
				protection.ProtectionCommand_T _arg0=protection.ProtectionCommand_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][][] _arg4=globaldefs.NamingAttributesMultipleList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg5=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				performTrailNtwProtectionCommand(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getCapabilities
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
			case 6: // getTrailNtwProtection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				trailNtwProtection.TrailNtwProtection_THolder _arg1= new trailNtwProtection.TrailNtwProtection_THolder();
				_out = handler.createReply();
				getTrailNtwProtection(_arg0,_arg1);
				trailNtwProtection.TrailNtwProtection_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setUserLabel
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
			case 8: // setNativeEMSName
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
			case 9: // getAllTrailNtwProtections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				trailNtwProtection.TrailNtwProtectionList_THolder _arg2= new trailNtwProtection.TrailNtwProtectionList_THolder();
				trailNtwProtection.TrailNtwProtectionIterator_IHolder _arg3= new trailNtwProtection.TrailNtwProtectionIterator_IHolder();
				_out = handler.createReply();
				getAllTrailNtwProtections(_arg0,_arg1,_arg2,_arg3);
				trailNtwProtection.TrailNtwProtectionList_THelper.write(_out,_arg2.value);
				trailNtwProtection.TrailNtwProtectionIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setOwner
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
