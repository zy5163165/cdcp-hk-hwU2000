package maintenanceOps;

/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class MaintenanceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, maintenanceOps.MaintenanceMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "setServiceAlarmReportingOn", new java.lang.Integer(1));
		m_opsHash.put ( "performMaintenanceOperationEx", new java.lang.Integer(2));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(3));
		m_opsHash.put ( "getAllMaintenancePoints", new java.lang.Integer(4));
		m_opsHash.put ( "createMaintenanceDomain", new java.lang.Integer(5));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(6));
		m_opsHash.put ( "getOAMParameters", new java.lang.Integer(7));
		m_opsHash.put ( "setServiceAlarmReportingOff", new java.lang.Integer(8));
		m_opsHash.put ( "getAllMaintenanceAssociations", new java.lang.Integer(9));
		m_opsHash.put ( "getAllMaintenanceDomains", new java.lang.Integer(10));
		m_opsHash.put ( "enablePRBSTest", new java.lang.Integer(11));
		m_opsHash.put ( "getPRBSTestResult", new java.lang.Integer(12));
		m_opsHash.put ( "deleteMaintenancePoint", new java.lang.Integer(13));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(14));
		m_opsHash.put ( "performMaintenanceOperation", new java.lang.Integer(15));
		m_opsHash.put ( "disablePRBSTest", new java.lang.Integer(16));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(17));
		m_opsHash.put ( "createMaintenancePoints", new java.lang.Integer(18));
		m_opsHash.put ( "setOAMParameters", new java.lang.Integer(19));
		m_opsHash.put ( "createATMMaintenanceEntity", new java.lang.Integer(20));
		m_opsHash.put ( "createMaintenanceAssociation", new java.lang.Integer(21));
		m_opsHash.put ( "deleteMaintenanceDomain", new java.lang.Integer(22));
		m_opsHash.put ( "deleteMaintenanceAssociation", new java.lang.Integer(23));
		m_opsHash.put ( "getActiveMaintenanceOperations", new java.lang.Integer(24));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public maintenanceOps.MaintenanceMgr_I _this()
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object());
	}
	public maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.MaintenanceMgr_IHelper.narrow(_this_object(orb));
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
			case 1: // setServiceAlarmReportingOn
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=maintenanceOps.AlarmEventList_THelper.read(_input);
				_out = handler.createReply();
				setServiceAlarmReportingOn(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // performMaintenanceOperationEx
			{
			try
			{
				maintenanceOps.CurrentMaintenanceOperation_T _arg0=maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				maintenanceOps.MaintenanceOperationMode_T _arg1=maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				performMaintenanceOperationEx(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
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
			case 4: // getAllMaintenancePoints
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				maintenanceOps.HW_MaintenancePointList_THolder _arg2= new maintenanceOps.HW_MaintenancePointList_THolder();
				maintenanceOps.HW_MaintenancePointIterator_IHolder _arg3= new maintenanceOps.HW_MaintenancePointIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenancePoints(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.HW_MaintenancePointList_THelper.write(_out,_arg2.value);
				maintenanceOps.HW_MaintenancePointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createMaintenanceDomain
			{
			try
			{
				maintenanceOps.HW_MaintenanceDomain_T _arg0=maintenanceOps.HW_MaintenanceDomain_THelper.read(_input);
				maintenanceOps.HW_MaintenanceDomain_THolder _arg1= new maintenanceOps.HW_MaintenanceDomain_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenanceDomain(_arg0,_arg1,_arg2);
				maintenanceOps.HW_MaintenanceDomain_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setAdditionalInfo
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
			case 7: // getOAMParameters
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				transmissionParameters.LayeredParameterList_THolder _arg1= new transmissionParameters.LayeredParameterList_THolder();
				_out = handler.createReply();
				getOAMParameters(_arg0,_arg1);
				transmissionParameters.LayeredParameterList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setServiceAlarmReportingOff
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=maintenanceOps.AlarmEventList_THelper.read(_input);
				_out = handler.createReply();
				setServiceAlarmReportingOff(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllMaintenanceAssociations
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				maintenanceOps.HW_MaintenanceAssociationList_THolder _arg2= new maintenanceOps.HW_MaintenanceAssociationList_THolder();
				maintenanceOps.HW_MaintenanceAssociationIterator_IHolder _arg3= new maintenanceOps.HW_MaintenanceAssociationIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenanceAssociations(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.HW_MaintenanceAssociationList_THelper.write(_out,_arg2.value);
				maintenanceOps.HW_MaintenanceAssociationIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllMaintenanceDomains
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				maintenanceOps.HW_MaintenanceDomainList_THolder _arg2= new maintenanceOps.HW_MaintenanceDomainList_THolder();
				maintenanceOps.HW_MaintenanceDomainIterator_IHolder _arg3= new maintenanceOps.HW_MaintenanceDomainIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenanceDomains(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.HW_MaintenanceDomainList_THelper.write(_out,_arg2.value);
				maintenanceOps.HW_MaintenanceDomainIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // enablePRBSTest
			{
			try
			{
				maintenanceOps.PRBSTestParameter_T[] _arg0=maintenanceOps.PRBSTestParameterList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				enablePRBSTest(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getPRBSTestResult
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				maintenanceOps.PRBSTestResultList_THolder _arg1= new maintenanceOps.PRBSTestResultList_THolder();
				_out = handler.createReply();
				getPRBSTestResult(_arg0,_arg1);
				maintenanceOps.PRBSTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // deleteMaintenancePoint
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenancePoint(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getCapabilities
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
			case 15: // performMaintenanceOperation
			{
			try
			{
				maintenanceOps.CurrentMaintenanceOperation_T _arg0=maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				maintenanceOps.MaintenanceOperationMode_T _arg1=maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				_out = handler.createReply();
				performMaintenanceOperation(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // disablePRBSTest
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				disablePRBSTest(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setNativeEMSName
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
			case 18: // createMaintenancePoints
			{
			try
			{
				maintenanceOps.HW_MaintenancePointCreateData_T _arg0=maintenanceOps.HW_MaintenancePointCreateData_THelper.read(_input);
				maintenanceOps.HW_MaintenancePoint_THolder _arg1= new maintenanceOps.HW_MaintenancePoint_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenancePoints(_arg0,_arg1,_arg2);
				maintenanceOps.HW_MaintenancePoint_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setOAMParameters
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				transmissionParameters.LayeredParameters_T[] _arg2=transmissionParameters.LayeredParameterList_THelper.read(_input);
				maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder _arg3= new maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder();
				_out = handler.createReply();
				setOAMParameters(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createATMMaintenanceEntity
			{
			try
			{
				maintenanceOps.HW_ATMMaintenanceEntityAttr_T _arg0=maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createATMMaintenanceEntity(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // createMaintenanceAssociation
			{
			try
			{
				maintenanceOps.HW_MaintenanceAssociation_T _arg0=maintenanceOps.HW_MaintenanceAssociation_THelper.read(_input);
				maintenanceOps.HW_MaintenanceAssociation_THolder _arg1= new maintenanceOps.HW_MaintenanceAssociation_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenanceAssociation(_arg0,_arg1,_arg2);
				maintenanceOps.HW_MaintenanceAssociation_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // deleteMaintenanceDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenanceDomain(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // deleteMaintenanceAssociation
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenanceAssociation(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getActiveMaintenanceOperations
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				maintenanceOps.CurrentMaintenanceOperationList_THolder _arg2= new maintenanceOps.CurrentMaintenanceOperationList_THolder();
				maintenanceOps.CurrentMaintenanceOperationIterator_IHolder _arg3= new maintenanceOps.CurrentMaintenanceOperationIterator_IHolder();
				_out = handler.createReply();
				getActiveMaintenanceOperations(_arg0,_arg1,_arg2,_arg3);
				maintenanceOps.CurrentMaintenanceOperationList_THelper.write(_out,_arg2.value);
				maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.write(_out,_arg3.value);
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
