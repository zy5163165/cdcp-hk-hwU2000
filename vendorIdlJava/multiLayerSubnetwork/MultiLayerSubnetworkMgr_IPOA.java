package multiLayerSubnetwork;

/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class MultiLayerSubnetworkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "createAndActivateSNC", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(2));
		m_opsHash.put ( "getRouteAndTopologicalLinks", new java.lang.Integer(3));
		m_opsHash.put ( "deletePresetRoute", new java.lang.Integer(4));
		m_opsHash.put ( "deleteSNC", new java.lang.Integer(5));
		m_opsHash.put ( "getSNCsByEndObjectName", new java.lang.Integer(6));
		m_opsHash.put ( "getAllEdgePoints", new java.lang.Integer(7));
		m_opsHash.put ( "setConjunctionSNC", new java.lang.Integer(8));
		m_opsHash.put ( "getAllInternalTopologicalLinks", new java.lang.Integer(9));
		m_opsHash.put ( "deactivateSNC", new java.lang.Integer(10));
		m_opsHash.put ( "getRoutes", new java.lang.Integer(11));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(12));
		m_opsHash.put ( "getAllSubnetworkConnectionNames", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(15));
		m_opsHash.put ( "getSNC", new java.lang.Integer(16));
		m_opsHash.put ( "getAllSubnetworkConnectionsWithTP", new java.lang.Integer(17));
		m_opsHash.put ( "getPresetRoute", new java.lang.Integer(18));
		m_opsHash.put ( "getOrginalRoute", new java.lang.Integer(19));
		m_opsHash.put ( "getAllSubnetworkConnectionNamesWithTP", new java.lang.Integer(20));
		m_opsHash.put ( "getTopologicalLink", new java.lang.Integer(21));
		m_opsHash.put ( "deactivateAndDeleteSNC", new java.lang.Integer(22));
		m_opsHash.put ( "getAllTPPoolNames", new java.lang.Integer(23));
		m_opsHash.put ( "getAllSubnetworkConnections", new java.lang.Integer(24));
		m_opsHash.put ( "getRoute", new java.lang.Integer(25));
		m_opsHash.put ( "getSNCsByNativeEmsName", new java.lang.Integer(26));
		m_opsHash.put ( "createSNC", new java.lang.Integer(27));
		m_opsHash.put ( "getTPGroupingRelationships", new java.lang.Integer(28));
		m_opsHash.put ( "getAllTopologicalLinkNames", new java.lang.Integer(29));
		m_opsHash.put ( "checkValidSNC", new java.lang.Integer(30));
		m_opsHash.put ( "getSNCNamesByRouteModificationTime", new java.lang.Integer(31));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(32));
		m_opsHash.put ( "activateSNC", new java.lang.Integer(33));
		m_opsHash.put ( "getSNCsByUserLabel", new java.lang.Integer(34));
		m_opsHash.put ( "modifySNC", new java.lang.Integer(35));
		m_opsHash.put ( "swapSNC", new java.lang.Integer(36));
		m_opsHash.put ( "switchRoute", new java.lang.Integer(37));
		m_opsHash.put ( "getAllTPPools", new java.lang.Integer(38));
		m_opsHash.put ( "getAllInternalTopologicalLinkNames", new java.lang.Integer(39));
		m_opsHash.put ( "createPresetRoute", new java.lang.Integer(40));
		m_opsHash.put ( "getAssociatedTP", new java.lang.Integer(41));
		m_opsHash.put ( "getWaveLengthStatusByEndObject", new java.lang.Integer(42));
		m_opsHash.put ( "getAllSNCNamesWithHigherOrderSNC", new java.lang.Integer(43));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(44));
		m_opsHash.put ( "getAllTopologicalLinks", new java.lang.Integer(45));
		m_opsHash.put ( "getMultiLayerSubnetwork", new java.lang.Integer(46));
		m_opsHash.put ( "getAllEdgePointNames", new java.lang.Integer(47));
		m_opsHash.put ( "getSNCs", new java.lang.Integer(48));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this()
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object());
	}
	public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // createAndActivateSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createAndActivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
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
			case 2: // getAllManagedElementNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0,_arg1,_arg2,_arg3);
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
			case 3: // getRouteAndTopologicalLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.Route_THolder _arg1= new subnetworkConnection.Route_THolder();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getRouteAndTopologicalLinks(_arg0,_arg1,_arg2);
				subnetworkConnection.Route_THelper.write(_out,_arg1.value);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // deletePresetRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				deletePresetRoute(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // deleteSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg1=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				_out = handler.createReply();
				deleteSNC(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getSNCsByEndObjectName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByEndObjectName(_arg0,_arg1,_arg2,_arg3);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllEdgePoints
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
				getAllEdgePoints(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 8: // setConjunctionSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setConjunctionSNC(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllInternalTopologicalLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				topologicalLink.TopologicalLinkIterator_IHolder _arg3= new topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // deactivateSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getRoutes
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				subnetworkConnection.RouteInfoList_THolder _arg2= new subnetworkConnection.RouteInfoList_THolder();
				_out = handler.createReply();
				getRoutes(_arg0,_arg1,_arg2);
				subnetworkConnection.RouteInfoList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setAdditionalInfo
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
			case 13: // getAllSubnetworkConnectionNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 15: // getCapabilities
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
			case 16: // getSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg1= new subnetworkConnection.SubnetworkConnection_THolder();
				_out = handler.createReply();
				getSNC(_arg0,_arg1);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllSubnetworkConnectionsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getPresetRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				subnetworkConnection.PresetRoute_THolder _arg2= new subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				getPresetRoute(_arg0,_arg1,_arg2);
				subnetworkConnection.PresetRoute_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getOrginalRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				subnetworkConnection.Route_THolder _arg2= new subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getOrginalRoute(_arg0,_arg1,_arg2);
				subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAllSubnetworkConnectionNamesWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnectionNamesWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 21: // getTopologicalLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				topologicalLink.TopologicalLink_THolder _arg1= new topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopologicalLink(_arg0,_arg1);
				topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // deactivateAndDeleteSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateAndDeleteSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllTPPoolNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTPPoolNames(_arg0,_arg1,_arg2,_arg3);
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
			case 24: // getAllSubnetworkConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg3= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg4= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getAllSubnetworkConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				subnetworkConnection.Route_THolder _arg2= new subnetworkConnection.Route_THolder();
				_out = handler.createReply();
				getRoute(_arg0,_arg1,_arg2);
				subnetworkConnection.Route_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getSNCsByNativeEmsName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg2= new subnetworkConnection.SubnetworkConnectionList_THolder();
				subnetworkConnection.SNCIterator_IHolder _arg3= new subnetworkConnection.SNCIterator_IHolder();
				_out = handler.createReply();
				getSNCsByNativeEmsName(_arg0,_arg1,_arg2,_arg3);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg2.value);
				subnetworkConnection.SNCIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // createSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg3= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createSNC(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getTPGroupingRelationships
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getTPGroupingRelationships(_arg0,_arg1,_arg2,_arg3);
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
			case 29: // getAllTopologicalLinkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 30: // checkValidSNC
			{
			try
			{
				subnetworkConnection.SNCCreateData_T _arg0=subnetworkConnection.SNCCreateData_THelper.read(_input);
				subnetworkConnection.TPData_T[] _arg1=subnetworkConnection.TPDataList_THelper.read(_input);
				boolean _arg2=_input.read_boolean();
				org.omg.CORBA.BooleanHolder _arg3= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				checkValidSNC(_arg0,_arg1,_arg2,_arg3);
				_out.write_boolean(_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getSNCNamesByRouteModificationTime
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getSNCNamesByRouteModificationTime(_arg0,_arg1,_arg2,_arg3);
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
			case 32: // setUserLabel
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
			case 33: // activateSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg1=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg3= new subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg4= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getSNCsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCsByUserLabel(_arg0,_arg1);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // modifySNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.SNCModifyData_T _arg2=subnetworkConnection.SNCModifyData_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				subnetworkConnection.ProtectionEffort_T _arg4=subnetworkConnection.ProtectionEffort_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg5=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg6= new subnetworkConnection.TPDataList_THolder();
				_arg6._read (_input);
				subnetworkConnection.SubnetworkConnection_THolder _arg7= new subnetworkConnection.SubnetworkConnection_THolder();
				org.omg.CORBA.StringHolder _arg8= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifySNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg6.value);
				subnetworkConnection.SubnetworkConnection_THelper.write(_out,_arg7.value);
				_out.write_string(_arg8.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // swapSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg2=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				subnetworkConnection.SNCState_THolder _arg5= new subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				swapSNC(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				subnetworkConnection.SNCState_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // switchRoute
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				subnetworkConnection.GradesOfImpact_T _arg2=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				multiLayerSubnetwork.EMSFreedomLevel_T _arg3=multiLayerSubnetwork.EMSFreedomLevel_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				globaldefs.NVSList_THolder _arg5= new globaldefs.NVSList_THolder();
				_arg5._read (_input);
				subnetworkConnection.SNCState_THolder _arg6= new subnetworkConnection.SNCState_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				switchRoute(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				globaldefs.NVSList_THelper.write(_out,_arg5.value);
				subnetworkConnection.SNCState_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getAllTPPools
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllTPPools(_arg0,_arg1,_arg2,_arg3);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg2.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getAllInternalTopologicalLinkNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllInternalTopologicalLinkNames(_arg0,_arg1,_arg2,_arg3);
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
			case 40: // createPresetRoute
			{
			try
			{
				subnetworkConnection.CreatePresetRouteData_T _arg0=subnetworkConnection.CreatePresetRouteData_THelper.read(_input);
				subnetworkConnection.PresetRoute_THolder _arg1= new subnetworkConnection.PresetRoute_THolder();
				_out = handler.createReply();
				createPresetRoute(_arg0,_arg1);
				subnetworkConnection.PresetRoute_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getAssociatedTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg1= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAssociatedTP(_arg0,_arg1);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getWaveLengthStatusByEndObject
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg2=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NVSList_THelper.read(_input);
				globaldefs.ConnectionDirection_T _arg4=globaldefs.ConnectionDirection_THelper.read(_input);
				subnetworkConnection.WaveLengthStatusList_THolder _arg5= new subnetworkConnection.WaveLengthStatusList_THolder();
				_out = handler.createReply();
				getWaveLengthStatusByEndObject(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.WaveLengthStatusList_THelper.write(_out,_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // getAllSNCNamesWithHigherOrderSNC
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllSNCNamesWithHigherOrderSNC(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getAllManagedElements
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				managedElement.ManagedElementList_THolder _arg2= new managedElement.ManagedElementList_THolder();
				managedElement.ManagedElementIterator_IHolder _arg3= new managedElement.ManagedElementIterator_IHolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0,_arg1,_arg2,_arg3);
				managedElement.ManagedElementList_THelper.write(_out,_arg2.value);
				managedElement.ManagedElementIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllTopologicalLinks
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				topologicalLink.TopologicalLinkIterator_IHolder _arg3= new topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopologicalLinks(_arg0,_arg1,_arg2,_arg3);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
				topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getMultiLayerSubnetwork
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				multiLayerSubnetwork.MultiLayerSubnetwork_THolder _arg1= new multiLayerSubnetwork.MultiLayerSubnetwork_THolder();
				_out = handler.createReply();
				getMultiLayerSubnetwork(_arg0,_arg1);
				multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getAllEdgePointNames
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
				getAllEdgePointNames(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
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
			case 48: // getSNCs
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new subnetworkConnection.SubnetworkConnectionList_THolder();
				_out = handler.createReply();
				getSNCs(_arg0,_arg1);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
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
