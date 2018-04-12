package performance;

/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getMEPMcapabilities", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "enablePMData", new java.lang.Integer(2));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(3));
		m_opsHash.put ( "selectPMCollectionTask", new java.lang.Integer(4));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(5));
		m_opsHash.put ( "getHoldingTime", new java.lang.Integer(6));
		m_opsHash.put ( "ModifyPMCollectionTask", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "createPMCollectionTask", new java.lang.Integer(9));
		m_opsHash.put ( "getPMState", new java.lang.Integer(10));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(11));
		m_opsHash.put ( "disableTCA", new java.lang.Integer(12));
		m_opsHash.put ( "enableTCA", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "setTCANotifySwitch", new java.lang.Integer(15));
		m_opsHash.put ( "SuspendPMCollectionTask", new java.lang.Integer(16));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(17));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(18));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(19));
		m_opsHash.put ( "ResumePMCollectionTask", new java.lang.Integer(20));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(21));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(22));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(23));
		m_opsHash.put ( "deletePMCollectionTask", new java.lang.Integer(24));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getMEPMcapabilities
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				performance.PMParameterList_THolder _arg2= new performance.PMParameterList_THolder();
				_out = handler.createReply();
				getMEPMcapabilities(_arg0,_arg1,_arg2);
				performance.PMParameterList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setOwner
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
			case 2: // enablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setUserLabel
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
			case 4: // selectPMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				performance.CollectTaskInfoList_THolder _arg2= new performance.CollectTaskInfoList_THolder();
				_out = handler.createReply();
				selectPMCollectionTask(_arg0,_arg1,_arg2);
				performance.CollectTaskInfoList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllCurrentPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				performance.PMDataList_THolder _arg3= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg4= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				performance.PMDataList_THelper.write(_out,_arg3.value);
				performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getHoldingTime
			{
			try
			{
				performance.HoldingTime_THolder _arg0= new performance.HoldingTime_THolder();
				_out = handler.createReply();
				getHoldingTime(_arg0);
				performance.HoldingTime_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // ModifyPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				ModifyPMCollectionTask(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setAdditionalInfo
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
			case 9: // createPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=_input.read_string();
				globaldefs.NameAndStringValue_T[][] _arg5=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				java.lang.String _arg8=_input.read_string();
				boolean _arg9=_input.read_boolean();
				_out = handler.createReply();
				createPMCollectionTask(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getPMState
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				performance.PMStateList_THolder _arg3= new performance.PMStateList_THolder();
				performance.PMStateIterator_IHolder _arg4= new performance.PMStateIterator_IHolder();
				_out = handler.createReply();
				getPMState(_arg0,_arg1,_arg2,_arg3,_arg4);
				performance.PMStateList_THelper.write(_out,_arg3.value);
				performance.PMStateIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getCapabilities
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
			case 12: // disableTCA
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disableTCA(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // enableTCA
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enableTCA(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setNativeEMSName
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
			case 15: // setTCANotifySwitch
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				setTCANotifySwitch(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // SuspendPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				SuspendPMCollectionTask(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				performance.PMTPSelect_T[] _arg3=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				boolean _arg7=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // setTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				performance.TCAParameters_THolder _arg1= new performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // disablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // ResumePMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				ResumePMCollectionTask(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				performance.TCAParameters_THolder _arg3= new performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getTPHistoryPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				performance.PMDataList_THolder _arg5= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg6= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				performance.PMDataList_THelper.write(_out,_arg5.value);
				performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // clearPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // deletePMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				deletePMCollectionTask(_arg0,_arg1);
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
