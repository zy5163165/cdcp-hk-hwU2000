package managedElementManager;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(1));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(2));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(3));
		m_opsHash.put ( "getADCInfo", new java.lang.Integer(4));
		m_opsHash.put ( "checkActiveAlarms", new java.lang.Integer(5));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(6));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(7));
		m_opsHash.put ( "getActiveAlarms", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "getAllPTPNames", new java.lang.Integer(10));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(11));
		m_opsHash.put ( "getContainingSubnetworkNames", new java.lang.Integer(12));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(13));
		m_opsHash.put ( "getContainingTPs", new java.lang.Integer(14));
		m_opsHash.put ( "modifyFTPMembers", new java.lang.Integer(15));
		m_opsHash.put ( "getAPRInfo", new java.lang.Integer(16));
		m_opsHash.put ( "setwdmALCInfo", new java.lang.Integer(17));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(18));
		m_opsHash.put ( "createCrossConnections", new java.lang.Integer(19));
		m_opsHash.put ( "setAPEInfo", new java.lang.Integer(20));
		m_opsHash.put ( "setTPData", new java.lang.Integer(21));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(22));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(23));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(24));
		m_opsHash.put ( "deleteCrossConnections", new java.lang.Integer(25));
		m_opsHash.put ( "getTP", new java.lang.Integer(26));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(27));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(28));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(29));
		m_opsHash.put ( "getNEStaticInfo", new java.lang.Integer(30));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(31));
		m_opsHash.put ( "createFTP", new java.lang.Integer(32));
		m_opsHash.put ( "setAPRInfo", new java.lang.Integer(33));
		m_opsHash.put ( "getFTPMembers", new java.lang.Integer(34));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(35));
		m_opsHash.put ( "getAllAlarmsByFTP", new java.lang.Integer(36));
		m_opsHash.put ( "setADCInfo", new java.lang.Integer(37));
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(38));
		m_opsHash.put ( "setotnALCInfo", new java.lang.Integer(39));
		m_opsHash.put ( "deleteFTP", new java.lang.Integer(40));
		m_opsHash.put ( "getContainingTPNames", new java.lang.Integer(41));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 1: // getContainedPotentialTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getContainedCurrentTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getContainedInUseTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getADCInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getADCInfo(_arg0,_arg1);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // checkActiveAlarms
			{
			try
			{
				org.omg.CosNotification.StructuredEvent[] _arg0=notifications.EventList_THelper.read(_input);
				notifications.EventList_THolder _arg1= new notifications.EventList_THolder();
				_out = handler.createReply();
				checkActiveAlarms(_arg0,_arg1);
				notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getManagedElement
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				managedElement.ManagedElement_THolder _arg1= new managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CCIterator_IHolder _arg4= new subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 9: // setAdditionalInfo
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
			case 10: // getAllPTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg4= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg5= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPTPNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // setNativeEMSName
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
			case 12: // getContainingSubnetworkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingSubnetworkNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getCapabilities
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
			case 14: // getContainingTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg1= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getContainingTPs(_arg0,_arg1);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // modifyFTPMembers
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.TPData_T[] _arg2=subnetworkConnection.TPDataList_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				modifyFTPMembers(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAPRInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder _arg1= new managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder();
				_out = handler.createReply();
				getAPRInfo(_arg0,_arg1);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setwdmALCInfo
			{
			try
			{
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setwdmALCInfo(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllManagedElementNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2);
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
			case 19: // createCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // setAPEInfo
			{
			try
			{
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setAPEInfo(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setTPData
			{
			try
			{
				subnetworkConnection.TPData_T _arg0=subnetworkConnection.TPData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getContainedInUseTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllPTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg4= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg5= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg4.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // activateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // deleteCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllActiveAlarms
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg2=notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg3=_input.read_ulong();
				notifications.EventList_THolder _arg4= new notifications.EventList_THolder();
				notifications.EventIterator_IHolder _arg5= new notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 28: // getContainedPotentialTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // setUserLabel
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
			case 30: // getNEStaticInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getNEStaticInfo(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // deactivateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // createFTP
			{
			try
			{
				flowDomain.FTPCreateData_T _arg0=flowDomain.FTPCreateData_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg1= new subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				terminationPoint.TerminationPoint_THolder _arg2= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1,_arg2);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // setAPRInfo
			{
			try
			{
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setAPRInfo(_arg0,_arg1);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getFTPMembers
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg1= new subnetworkConnection.TPDataList_THolder();
				_out = handler.createReply();
				getFTPMembers(_arg0,_arg1);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getAllManagedElements
			{
			try
			{
				int _arg0=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg1= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg2= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2);
				managedElement.ManagedElementList_THelper.write(_out,_arg1.value);
				managedElement.ManagedElementIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getAllAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				globaldefs.NameAndStringValue_T[][] _arg3=globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=notifications.ProbableCauseList_THelper.read(_input);
				notifications.PerceivedSeverity_T[] _arg5=notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				globaldefs.NamingAttributesList_THolder _arg8= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // setADCInfo
			{
			try
			{
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder _arg1= new managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder();
				_out = handler.createReply();
				setADCInfo(_arg0,_arg1);
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getContainedCurrentTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setotnALCInfo
			{
			try
			{
				managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T _arg0=managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_input);
				_out = handler.createReply();
				setotnALCInfo(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // deleteFTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFTP(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getContainingTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainingTPNames(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
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
