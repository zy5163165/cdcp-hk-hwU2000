package transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class TransmissionDescriptorMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, transmissionDescriptor.TransmissionDescriptorMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllTransmissionDescriptorNames", new java.lang.Integer(0));
		m_opsHash.put ( "getAllTransmissionDescriptors", new java.lang.Integer(1));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(2));
		m_opsHash.put ( "deleteTransmissionDescriptor", new java.lang.Integer(3));
		m_opsHash.put ( "getAssociatedTPs", new java.lang.Integer(4));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(5));
		m_opsHash.put ( "setTMDAssociation", new java.lang.Integer(6));
		m_opsHash.put ( "createTransmissionDescriptor", new java.lang.Integer(7));
		m_opsHash.put ( "getTransmissionDescriptor", new java.lang.Integer(8));
		m_opsHash.put ( "validateTMDAssignmentToObject", new java.lang.Integer(9));
		m_opsHash.put ( "modifyTransmissionDescriptor", new java.lang.Integer(10));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(11));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(12));
		m_opsHash.put ( "setOwner", new java.lang.Integer(13));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/transmissionDescriptor/TransmissionDescriptorMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public transmissionDescriptor.TransmissionDescriptorMgr_I _this()
	{
		return transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object());
	}
	public transmissionDescriptor.TransmissionDescriptorMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return transmissionDescriptor.TransmissionDescriptorMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllTransmissionDescriptorNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptorNames(_arg0,_arg1,_arg2);
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
			case 1: // getAllTransmissionDescriptors
			{
			try
			{
				int _arg0=_input.read_ulong();
				transmissionDescriptor.TransmissionDescriptorList_THolder _arg1= new transmissionDescriptor.TransmissionDescriptorList_THolder();
				transmissionDescriptor.TransmissionDescriptorIterator_IHolder _arg2= new transmissionDescriptor.TransmissionDescriptorIterator_IHolder();
				_out = handler.createReply();
				getAllTransmissionDescriptors(_arg0,_arg1,_arg2);
				transmissionDescriptor.TransmissionDescriptorList_THelper.write(_out,_arg1.value);
				transmissionDescriptor.TransmissionDescriptorIterator_IHelper.write(_out,_arg2.value);
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
			case 3: // deleteTransmissionDescriptor
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTransmissionDescriptor(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAssociatedTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg2= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg3= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getAssociatedTPs(_arg0,_arg1,_arg2,_arg3);
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
			case 6: // setTMDAssociation
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				transmissionDescriptor.TPorMFDorFDFr_THolder _arg1= new transmissionDescriptor.TPorMFDorFDFr_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTMDAssociation(_arg0,_arg1);
				transmissionDescriptor.TPorMFDorFDFr_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // createTransmissionDescriptor
			{
			try
			{
				transmissionDescriptor.TMDCreateData_T _arg0=transmissionDescriptor.TMDCreateData_THelper.read(_input);
				transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				createTransmissionDescriptor(_arg0,_arg1);
				transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getTransmissionDescriptor
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				transmissionDescriptor.TransmissionDescriptor_THolder _arg1= new transmissionDescriptor.TransmissionDescriptor_THolder();
				_out = handler.createReply();
				getTransmissionDescriptor(_arg0,_arg1);
				transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // validateTMDAssignmentToObject
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				transmissionParameters.LayeredParameterList_THolder _arg2= new transmissionParameters.LayeredParameterList_THolder();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				validateTMDAssignmentToObject(_arg0,_arg1,_arg2,_arg3);
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
			case 10: // modifyTransmissionDescriptor
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				transmissionDescriptor.TMDModifyData_T _arg1=transmissionDescriptor.TMDModifyData_THelper.read(_input);
				subnetworkConnection.TPDataList_THolder _arg2= new subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				transmissionDescriptor.TransmissionDescriptor_THolder _arg3= new transmissionDescriptor.TransmissionDescriptor_THolder();
				_arg3._read (_input);
				globaldefs.NamingAttributesList_THolder _arg4= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesList_THolder _arg5= new globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg6= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTransmissionDescriptor(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				transmissionDescriptor.TransmissionDescriptor_THelper.write(_out,_arg3.value);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg5.value);
				_out.write_string(_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
