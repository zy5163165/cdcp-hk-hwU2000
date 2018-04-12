package circuitCutMgr;

/**
 *	Generated from IDL interface "CircuitCutMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class CircuitCutMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, circuitCutMgr.CircuitCutMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setPrefabSNC", new java.lang.Integer(0));
		m_opsHash.put ( "getAllIdleServiceTrailAndTS", new java.lang.Integer(1));
		m_opsHash.put ( "calcuPrefabSNCRoute", new java.lang.Integer(2));
		m_opsHash.put ( "getSNCServiceRoute", new java.lang.Integer(3));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(4));
		m_opsHash.put ( "deletePrefabSNCs", new java.lang.Integer(5));
		m_opsHash.put ( "getServiceTrailViewBySNCRate", new java.lang.Integer(6));
		m_opsHash.put ( "getAllIdlePortAndTS", new java.lang.Integer(7));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(8));
		m_opsHash.put ( "getTopoSubnetworkViewInfo", new java.lang.Integer(9));
		m_opsHash.put ( "createPrefabSNCsAndDelCutSNCs", new java.lang.Integer(10));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(11));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(12));
		m_opsHash.put ( "setOwner", new java.lang.Integer(13));
		m_opsHash.put ( "checkPrefabAndCutSNCs", new java.lang.Integer(14));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/circuitCutMgr/CircuitCutMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public circuitCutMgr.CircuitCutMgr_I _this()
	{
		return circuitCutMgr.CircuitCutMgr_IHelper.narrow(_this_object());
	}
	public circuitCutMgr.CircuitCutMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return circuitCutMgr.CircuitCutMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setPrefabSNC
			{
			try
			{
				circuitCutMgr.SNCBasicInfo_T _arg0=circuitCutMgr.SNCBasicInfo_THelper.read(_input);
				circuitCutMgr.SNCServiceRoute_T _arg1=circuitCutMgr.SNCServiceRoute_THelper.read(_input);
				_out = handler.createReply();
				setPrefabSNC(_arg0,_arg1);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllIdleServiceTrailAndTS
			{
			try
			{
				circuitCutMgr.ConnectivityNodePair_T[] _arg0=circuitCutMgr.ConnectivityNodePairList_THelper.read(_input);
				circuitCutMgr.SNCBasicInfo_T[] _arg1=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.SNCRate_T _arg2=circuitCutMgr.SNCRate_THelper.read(_input);
				circuitCutMgr.ServiceTrailList_THolder _arg3= new circuitCutMgr.ServiceTrailList_THolder();
				_out = handler.createReply();
				getAllIdleServiceTrailAndTS(_arg0,_arg1,_arg2,_arg3);
				circuitCutMgr.ServiceTrailList_THelper.write(_out,_arg3.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // calcuPrefabSNCRoute
			{
			try
			{
				circuitCutMgr.PrefabSNCCreateData_T _arg0=circuitCutMgr.PrefabSNCCreateData_THelper.read(_input);
				circuitCutMgr.SNCBasicInfo_T[] _arg1=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				int _arg3=_input.read_ulong();
				boolean _arg4=_input.read_boolean();
				circuitCutMgr.SNCServiceRouteList_THolder _arg5= new circuitCutMgr.SNCServiceRouteList_THolder();
				_arg5._read (_input);
				_out = handler.createReply();
				calcuPrefabSNCRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				circuitCutMgr.SNCServiceRouteList_THelper.write(_out,_arg5.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getSNCServiceRoute
			{
			try
			{
				circuitCutMgr.SNCBasicInfo_T _arg0=circuitCutMgr.SNCBasicInfo_THelper.read(_input);
				circuitCutMgr.SNCServiceRoute_THolder _arg1= new circuitCutMgr.SNCServiceRoute_THolder();
				_out = handler.createReply();
				getSNCServiceRoute(_arg0,_arg1);
				circuitCutMgr.SNCServiceRoute_THelper.write(_out,_arg1.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
			case 5: // deletePrefabSNCs
			{
			try
			{
				circuitCutMgr.SNCBasicInfo_T[] _arg0=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.ErrorReasonList_THolder _arg1= new circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				deletePrefabSNCs(_arg0,_arg1);
				circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg1.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getServiceTrailViewBySNCRate
			{
			try
			{
				int _arg0=_input.read_ulong();
				circuitCutMgr.SNCRate_T _arg1=circuitCutMgr.SNCRate_THelper.read(_input);
				circuitCutMgr.ConnectivityNodePairList_THolder _arg2= new circuitCutMgr.ConnectivityNodePairList_THolder();
				circuitCutMgr.ConnectivityNodePairIterator_IHolder _arg3= new circuitCutMgr.ConnectivityNodePairIterator_IHolder();
				_out = handler.createReply();
				getServiceTrailViewBySNCRate(_arg0,_arg1,_arg2,_arg3);
				circuitCutMgr.ConnectivityNodePairList_THelper.write(_out,_arg2.value);
				circuitCutMgr.ConnectivityNodePairIterator_IHelper.write(_out,_arg3.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllIdlePortAndTS
			{
			try
			{
				circuitCutMgr.SNCTtpInfo_T _arg0=circuitCutMgr.SNCTtpInfo_THelper.read(_input);
				circuitCutMgr.SNCBasicInfo_T[] _arg1=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.IdlePortAndTSList_THolder _arg2= new circuitCutMgr.IdlePortAndTSList_THolder();
				_out = handler.createReply();
				getAllIdlePortAndTS(_arg0,_arg1,_arg2);
				circuitCutMgr.IdlePortAndTSList_THelper.write(_out,_arg2.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getCapabilities
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
			case 9: // getTopoSubnetworkViewInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				circuitCutMgr.NodeList_THolder _arg1= new circuitCutMgr.NodeList_THolder();
				circuitCutMgr.NodeIterator_IHolder _arg2= new circuitCutMgr.NodeIterator_IHolder();
				_out = handler.createReply();
				getTopoSubnetworkViewInfo(_arg0,_arg1,_arg2);
				circuitCutMgr.NodeList_THelper.write(_out,_arg1.value);
				circuitCutMgr.NodeIterator_IHelper.write(_out,_arg2.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // createPrefabSNCsAndDelCutSNCs
			{
			try
			{
				circuitCutMgr.SNCBasicInfo_T[] _arg0=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.SNCBasicInfo_T[] _arg1=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.CutAndPrefabSNCPair_T[] _arg2=circuitCutMgr.CutAndPrefabSNCPairList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg3= new org.omg.CORBA.IntHolder();
				circuitCutMgr.ErrorReasonList_THolder _arg4= new circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				createPrefabSNCsAndDelCutSNCs(_arg0,_arg1,_arg2,_arg3,_arg4);
				_out.write_ulong(_arg3.value);
				circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg4.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setUserLabel
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
			case 12: // setNativeEMSName
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
			case 13: // setOwner
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
			case 14: // checkPrefabAndCutSNCs
			{
			try
			{
				circuitCutMgr.SNCBasicInfo_T[] _arg0=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				circuitCutMgr.SNCBasicInfo_T[] _arg1=circuitCutMgr.SNCBasicInfoList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				circuitCutMgr.ErrorReasonList_THolder _arg3= new circuitCutMgr.ErrorReasonList_THolder();
				_out = handler.createReply();
				checkPrefabAndCutSNCs(_arg0,_arg1,_arg2,_arg3);
				circuitCutMgr.ErrorReasonList_THelper.write(_out,_arg3.value);
			}
			catch(circuitCutMgr.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				circuitCutMgr.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
