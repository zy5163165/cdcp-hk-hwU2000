package flowDomain;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class FlowDomainMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, flowDomain.FlowDomainMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "deleteMFD", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "getAssignableCPTPs", new java.lang.Integer(2));
		m_opsHash.put ( "getAllMFDs", new java.lang.Integer(3));
		m_opsHash.put ( "getAllFlowDomainNames", new java.lang.Integer(4));
		m_opsHash.put ( "validateTMDAssignmentToMFD", new java.lang.Integer(5));
		m_opsHash.put ( "getAllFDFrNames", new java.lang.Integer(6));
		m_opsHash.put ( "createMFD", new java.lang.Integer(7));
		m_opsHash.put ( "deleteFDFr", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(10));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(11));
		m_opsHash.put ( "removeFPsFromFDFr", new java.lang.Integer(12));
		m_opsHash.put ( "getAssigningMFD", new java.lang.Integer(13));
		m_opsHash.put ( "getAllFlowDomains", new java.lang.Integer(14));
		m_opsHash.put ( "getAllCPTPs", new java.lang.Integer(15));
		m_opsHash.put ( "getFDfromMFD", new java.lang.Integer(16));
		m_opsHash.put ( "createFTP", new java.lang.Integer(17));
		m_opsHash.put ( "getAllFDFrs", new java.lang.Integer(18));
		m_opsHash.put ( "getFDFrsWithTP", new java.lang.Integer(19));
		m_opsHash.put ( "createFlowDomain", new java.lang.Integer(20));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(21));
		m_opsHash.put ( "modifyFDFr", new java.lang.Integer(22));
		m_opsHash.put ( "getFDFrServerTrail", new java.lang.Integer(23));
		m_opsHash.put ( "getMFD", new java.lang.Integer(24));
		m_opsHash.put ( "assignCPTPsToMFD", new java.lang.Integer(25));
		m_opsHash.put ( "modifyMFD", new java.lang.Integer(26));
		m_opsHash.put ( "getAllMFDNames", new java.lang.Integer(27));
		m_opsHash.put ( "getFDFrsByUserLabel", new java.lang.Integer(28));
		m_opsHash.put ( "performEthernetOAMCommand", new java.lang.Integer(29));
		m_opsHash.put ( "getTransmissionParams", new java.lang.Integer(30));
		m_opsHash.put ( "associateMFDsWithFlowDomain", new java.lang.Integer(31));
		m_opsHash.put ( "deAssociateMFDsFromFlowDomain", new java.lang.Integer(32));
		m_opsHash.put ( "getFDFr", new java.lang.Integer(33));
		m_opsHash.put ( "createFDFr", new java.lang.Integer(34));
		m_opsHash.put ( "addFPsToFDFr", new java.lang.Integer(35));
		m_opsHash.put ( "deactivateFDFr", new java.lang.Integer(36));
		m_opsHash.put ( "associateCPTPsWithFlowDomain", new java.lang.Integer(37));
		m_opsHash.put ( "getFlowDomainsByUserLabel", new java.lang.Integer(38));
		m_opsHash.put ( "activateFDFr", new java.lang.Integer(39));
		m_opsHash.put ( "deleteFTP", new java.lang.Integer(40));
		m_opsHash.put ( "deleteFlowDomain", new java.lang.Integer(41));
		m_opsHash.put ( "unassignCPTPsFromMFD", new java.lang.Integer(42));
		m_opsHash.put ( "deAssociateCPTPsFromFlowDomain", new java.lang.Integer(43));
		m_opsHash.put ( "modifyFlowDomain", new java.lang.Integer(44));
		m_opsHash.put ( "getAllEthernetOAMPoint", new java.lang.Integer(45));
		m_opsHash.put ( "getFlowDomain", new java.lang.Integer(46));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public flowDomain.FlowDomainMgr_I _this()
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object());
	}
	public flowDomain.FlowDomainMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomain.FlowDomainMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // deleteMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMFD(_arg0);
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
			case 2: // getAssignableCPTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssignableCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 3: // getAllMFDs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				flowDomain.MFDList_THolder _arg2= new flowDomain.MFDList_THolder();
				flowDomain.MFDIterator_IHolder _arg3= new flowDomain.MFDIterator_IHolder();
				_out = handler.createReply();
				getAllMFDs(_arg0,_arg1,_arg2,_arg3);
				flowDomain.MFDList_THelper.write(_out,_arg2.value);
				flowDomain.MFDIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllFlowDomainNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomainNames(_arg0,_arg1,_arg2);
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
			case 5: // validateTMDAssignmentToMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				transmissionParameters.LayeredParameterList_THolder _arg2= new transmissionParameters.LayeredParameterList_THolder();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToMFD(_arg0,_arg1,_arg2,_arg3);
				_out.write_string(_arg1.value);
				transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllFDFrNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 7: // createMFD
			{
			try
			{
				flowDomain.MFDCreateData_T _arg0=flowDomain.MFDCreateData_THelper.read(_input);
				flowDomain.MatrixFlowDomain_THolder _arg1= new flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				createMFD(_arg0,_arg1);
				flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // deleteFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg1= new subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteFDFr(_arg0,_arg1);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
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
			case 10: // setNativeEMSName
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
			case 12: // removeFPsFromFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				removeFPsFromFDFr(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAssigningMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.MatrixFlowDomain_THolder _arg1= new flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getAssigningMFD(_arg0,_arg1);
				flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllFlowDomains
			{
			try
			{
				int _arg0=_input.read_ulong();
				flowDomain.FDList_THolder _arg1= new flowDomain.FDList_THolder();
				flowDomain.FDIterator_IHolder _arg2= new flowDomain.FDIterator_IHolder();
				_out = handler.createReply();
				getAllFlowDomains(_arg0,_arg1,_arg2);
				flowDomain.FDList_THelper.write(_out,_arg1.value);
				flowDomain.FDIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getAllCPTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAllCPTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 16: // getFDfromMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.FlowDomain_THolder _arg1= new flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFDfromMFD(_arg0,_arg1);
				flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // createFTP
			{
			try
			{
				flowDomain.FTPCreateData_T _arg0=flowDomain.FTPCreateData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				createFTP(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getAllFDFrs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				flowDomainFragment.FDFrList_THolder _arg3= new flowDomainFragment.FDFrList_THolder();
				flowDomainFragment.FDFrIterator_IHolder _arg4= new flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg3.value);
				flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getFDFrsWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				flowDomainFragment.FDFrList_THolder _arg2= new flowDomainFragment.FDFrList_THolder();
				flowDomainFragment.FDFrIterator_IHolder _arg3= new flowDomainFragment.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg2.value);
				flowDomainFragment.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createFlowDomain
			{
			try
			{
				flowDomain.FDCreateData_T _arg0=flowDomain.FDCreateData_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_arg1._read (_input);
				flowDomain.FlowDomain_THolder _arg2= new flowDomain.FlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFlowDomain(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setUserLabel
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
			case 22: // modifyFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomainFragment.FDFrModifyData_T _arg1=flowDomainFragment.FDFrModifyData_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg2= new subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				subnetworkConnection.GradesOfImpact_T _arg3=subnetworkConnection.GradesOfImpact_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg4= new flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getFDFrServerTrail
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getFDFrServerTrail(_arg0,_arg1);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.MatrixFlowDomain_THolder _arg1= new flowDomain.MatrixFlowDomain_THolder();
				_out = handler.createReply();
				getMFD(_arg0,_arg1);
				flowDomain.MatrixFlowDomain_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // assignCPTPsToMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				assignCPTPsToMFD(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // modifyMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.MFDModifyData_T _arg1=flowDomain.MFDModifyData_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				transmissionParameters.LayeredParameterList_THolder _arg3= new transmissionParameters.LayeredParameterList_THolder();
				_arg3._read (_input);
				globaldefs.NVSList_THolder _arg4= new globaldefs.NVSList_THolder();
				_arg4._read (_input);
				flowDomain.MatrixFlowDomain_THolder _arg5= new flowDomain.MatrixFlowDomain_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFD(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				transmissionParameters.LayeredParameterList_THelper.write(_out,_arg3.value);
				globaldefs.NVSList_THelper.write(_out,_arg4.value);
				flowDomain.MatrixFlowDomain_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllMFDNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMFDNames(_arg0,_arg1,_arg2,_arg3);
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
			case 28: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				flowDomainFragment.FDFrList_THolder _arg1= new flowDomainFragment.FDFrList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				flowDomainFragment.FDFrList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // performEthernetOAMCommand
			{
			try
			{
				flowDomain.EthernetOAMOperation_T _arg0=flowDomain.EthernetOAMOperation_THelper.read(_input);
				flowDomain.EthernetLTTestResultList_THolder _arg1= new flowDomain.EthernetLTTestResultList_THolder();
				_out = handler.createReply();
				performEthernetOAMCommand(_arg0,_arg1);
				flowDomain.EthernetLTTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getTransmissionParams
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=flowDomain.ParameterGroupsList_THelper.read(_input);
				transmissionParameters.LayeredParameterList_THolder _arg2= new transmissionParameters.LayeredParameterList_THolder();
				_out = handler.createReply();
				getTransmissionParams(_arg0,_arg1,_arg2);
				transmissionParameters.LayeredParameterList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // associateMFDsWithFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateMFDsWithFlowDomain(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // deAssociateMFDsFromFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateMFDsFromFlowDomain(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg1= new flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // createFDFr
			{
			try
			{
				flowDomainFragment.FDFrCreateData_T _arg0=flowDomainFragment.FDFrCreateData_THelper.read(_input);
				flowDomain.ConnectivityRequirement_T _arg1=flowDomain.ConnectivityRequirement_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				flowDomainFragment.MatrixFlowDomainFragmentList_THolder _arg4= new flowDomainFragment.MatrixFlowDomainFragmentList_THolder();
				_arg4._read (_input);
				subnetworkConnection.TPDataList_THolder _arg5= new subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg6= new flowDomainFragment.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write(_out,_arg4.value);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // addFPsToFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.ConnectivityRequirement_T _arg1=flowDomain.ConnectivityRequirement_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_arg2._read (_input);
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				_arg3._read (_input);
				subnetworkConnection.TPDataList_THolder _arg4= new subnetworkConnection.TPDataList_THolder();
				_arg4._read (_input);
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				addFPsToFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // deactivateFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg1= new flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // associateCPTPsWithFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				associateCPTPsWithFlowDomain(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // getFlowDomainsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				flowDomain.FDList_THolder _arg1= new flowDomain.FDList_THolder();
				_out = handler.createReply();
				getFlowDomainsByUserLabel(_arg0,_arg1);
				flowDomain.FDList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // activateFDFr
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomainFragment.FlowDomainFragment_THolder _arg1= new flowDomainFragment.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				flowDomainFragment.FlowDomainFragment_THelper.write(_out,_arg1.value);
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
			case 41: // deleteFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFlowDomain(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // unassignCPTPsFromMFD
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				unassignCPTPsFromMFD(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // deAssociateCPTPsFromFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				_out = handler.createReply();
				deAssociateCPTPsFromFlowDomain(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // modifyFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.FDModifyData_T _arg1=flowDomain.FDModifyData_THelper.read(_input);
				flowDomain.FlowDomain_THolder _arg2= new flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				modifyFlowDomain(_arg0,_arg1,_arg2);
				flowDomain.FlowDomain_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllEthernetOAMPoint
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.EthernetOAMPointList_THolder _arg1= new flowDomain.EthernetOAMPointList_THolder();
				_out = handler.createReply();
				getAllEthernetOAMPoint(_arg0,_arg1);
				flowDomain.EthernetOAMPointList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getFlowDomain
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				flowDomain.FlowDomain_THolder _arg1= new flowDomain.FlowDomain_THolder();
				_out = handler.createReply();
				getFlowDomain(_arg0,_arg1);
				flowDomain.FlowDomain_THelper.write(_out,_arg1.value);
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
