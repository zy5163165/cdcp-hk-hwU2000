package emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, emsMgr.EMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "getInventory", new java.lang.Integer(1));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(2));
		m_opsHash.put ( "getAllEMSSystemActiveAlarms", new java.lang.Integer(3));
		m_opsHash.put ( "acknowledgeAlarms", new java.lang.Integer(4));
		m_opsHash.put ( "unacknowledgeAlarms", new java.lang.Integer(5));
		m_opsHash.put ( "getObjectRootAlarms", new java.lang.Integer(6));
		m_opsHash.put ( "getEMS", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "getAllTopLevelSubnetworks", new java.lang.Integer(9));
		m_opsHash.put ( "setEMSTime", new java.lang.Integer(10));
		m_opsHash.put ( "getEMSTime", new java.lang.Integer(11));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", new java.lang.Integer(12));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", new java.lang.Integer(13));
		m_opsHash.put ( "clearAlarms", new java.lang.Integer(14));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", new java.lang.Integer(15));
		m_opsHash.put ( "getAllEMSAndMEActiveAlarms", new java.lang.Integer(16));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(17));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(18));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(19));
		m_opsHash.put ( "getObjectClockSourceStatus", new java.lang.Integer(20));
		m_opsHash.put ( "getTopLevelTopologicalLink", new java.lang.Integer(21));
		m_opsHash.put ( "getEMSHeartbeatInterval", new java.lang.Integer(22));
		m_opsHash.put ( "setEMSHeartbeatInterval", new java.lang.Integer(23));
		m_opsHash.put ( "getAlarmAffectedServiceNames", new java.lang.Integer(24));
		m_opsHash.put ( "getAllSecondlyAlarms", new java.lang.Integer(25));
		m_opsHash.put ( "getTPFaultStatus", new java.lang.Integer(26));
		m_opsHash.put ( "getAllHistoryAlarms", new java.lang.Integer(27));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public emsMgr.EMSMgr_I _this()
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // setOwner
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
			case 1: // getInventory
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				emsMgr.InventoryType_T[] _arg3=emsMgr.InventoryTypeList_THelper.read(_input);
				_out = handler.createReply();
				getInventory(_arg0,_arg1,_arg2,_arg3);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setUserLabel
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
			case 3: // getAllEMSSystemActiveAlarms
			{
			try
			{
				notifications.PerceivedSeverity_T[] _arg0=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				notifications.EventList_THolder _arg2= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg3= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSSystemActiveAlarms(_arg0,_arg1,_arg2,_arg3);
				notifications.EventList_THelper.write(_out,_arg2.value);
				notifications.EventIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // acknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=emsMgr.AlarmSerialNoList_THelper.read(_input);
				emsMgr.AlarmSerialNoList_THolder _arg1= new emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1);
				emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // unacknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=emsMgr.AlarmSerialNoList_THelper.read(_input);
				emsMgr.AlarmSerialNoList_THolder _arg1= new emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1);
				emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getObjectRootAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getObjectRootAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				notifications.EventList_THelper.write(_out,_arg4.value);
				notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getEMS
			{
			try
			{
				emsMgr.EMS_THolder _arg0= new emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				emsMgr.EMS_THelper.write(_out,_arg0.value);
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
			case 9: // getAllTopLevelSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				multiLayerSubnetwork.SubnetworkList_THolder _arg1= new multiLayerSubnetwork.SubnetworkList_THolder();
				multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0,_arg1,_arg2);
				multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setEMSTime
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setEMSTime(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getEMSTime
			{
			try
			{
				globaldefs.NVSList_THolder _arg0= new globaldefs.NVSList_THolder();
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getEMSTime(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg0.value);
				_out.write_string(_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllTopLevelSubnetworkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllTopLevelTopologicalLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				topologicalLink.TopologicalLinkList_THolder _arg1= new topologicalLink.TopologicalLinkList_THolder();
				topologicalLink.TopologicalLinkIterator_IHolder _arg2= new topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0,_arg1,_arg2);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // clearAlarms
			{
			try
			{
				java.lang.String[] _arg0=emsMgr.AlarmSerialNoList_THelper.read(_input);
				emsMgr.AlarmSerialNoList_THolder _arg1= new emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				clearAlarms(_arg0,_arg1);
				emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllEMSAndMEActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg1=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				notifications.EventList_THolder _arg3= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg4= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				notifications.EventList_THelper.write(_out,_arg3.value);
				notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getCapabilities
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
			case 18: // getAllActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg3=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				notifications.EventList_THolder _arg7= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg8= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				notifications.EventList_THelper.write(_out,_arg7.value);
				notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setNativeEMSName
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
			case 20: // getObjectClockSourceStatus
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				emsMgr.ClockSourceStatusList_THolder _arg1= new emsMgr.ClockSourceStatusList_THolder();
				_out = handler.createReply();
				getObjectClockSourceStatus(_arg0,_arg1);
				emsMgr.ClockSourceStatusList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getTopLevelTopologicalLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				topologicalLink.TopologicalLink_THolder _arg1= new topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getEMSHeartbeatInterval
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				getEMSHeartbeatInterval(_arg0,_arg1);
				_out.write_ulong(_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // setEMSHeartbeatInterval
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				setEMSHeartbeatInterval(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAlarmAffectedServiceNames
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				emsMgr.ServiceNameList_THolder _arg1= new emsMgr.ServiceNameList_THolder();
				_out = handler.createReply();
				getAlarmAffectedServiceNames(_arg0,_arg1);
				emsMgr.ServiceNameList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllSecondlyAlarms
			{
			try
			{
				java.lang.String[] _arg0=emsMgr.AlarmSerialNoList_THelper.read(_input);
				notifications.EventList_THolder _arg1= new notifications.EventList_THolder();
				_out = handler.createReply();
				getAllSecondlyAlarms(_arg0,_arg1);
				notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getTPFaultStatus
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				emsMgr.EndTPFaultStatusList_THolder _arg1= new emsMgr.EndTPFaultStatusList_THolder();
				_out = handler.createReply();
				getTPFaultStatus(_arg0,_arg1);
				emsMgr.EndTPFaultStatusList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllHistoryAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg3=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				notifications.EventList_THolder _arg7= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg8= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllHistoryAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				notifications.EventList_THelper.write(_out,_arg7.value);
				notifications.EventIterator_IHelper.write(_out,_arg8.value);
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
