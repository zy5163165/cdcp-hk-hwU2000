package encapsulationLayerLink;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class EncapsulationLayerLinkMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, encapsulationLayerLink.EncapsulationLayerLinkMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getConnectingELL", new java.lang.Integer(0));
		m_opsHash.put ( "setOwner", new java.lang.Integer(1));
		m_opsHash.put ( "getTransmissionParams", new java.lang.Integer(2));
		m_opsHash.put ( "deleteELLink", new java.lang.Integer(3));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "getAllELLinksWithMeOrFd", new java.lang.Integer(6));
		m_opsHash.put ( "createELLink", new java.lang.Integer(7));
		m_opsHash.put ( "getAllELLinkNames", new java.lang.Integer(8));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(9));
		m_opsHash.put ( "getELLinkWithTP", new java.lang.Integer(10));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(11));
		m_opsHash.put ( "decreaseBandwidthOfELLink", new java.lang.Integer(12));
		m_opsHash.put ( "increaseBandwidthOfELLink", new java.lang.Integer(13));
		m_opsHash.put ( "setELLinkLCASState", new java.lang.Integer(14));
		m_opsHash.put ( "activateELLink", new java.lang.Integer(15));
		m_opsHash.put ( "deactivateELLink", new java.lang.Integer(16));
		m_opsHash.put ( "getAllELLinks", new java.lang.Integer(17));
		m_opsHash.put ( "getELLinkWithSncOrTl", new java.lang.Integer(18));
		m_opsHash.put ( "getELLink", new java.lang.Integer(19));
		m_opsHash.put ( "getServerSNCsAndTLs", new java.lang.Integer(20));
		m_opsHash.put ( "modifyELLink", new java.lang.Integer(21));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/encapsulationLayerLink/EncapsulationLayerLinkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this()
	{
		return encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object());
	}
	public encapsulationLayerLink.EncapsulationLayerLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return encapsulationLayerLink.EncapsulationLayerLinkMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getConnectingELL
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getConnectingELL(_arg0,_arg1);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
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
			case 2: // getTransmissionParams
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
			case 3: // deleteELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteELLink(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setUserLabel
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
			case 5: // setAdditionalInfo
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
			case 6: // getAllELLinksWithMeOrFd
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				encapsulationLayerLink.ELLinkList_THolder _arg2= new encapsulationLayerLink.ELLinkList_THolder();
				encapsulationLayerLink.ELLinkIterator_IHolder _arg3= new encapsulationLayerLink.ELLinkIterator_IHolder();
				_out = handler.createReply();
				getAllELLinksWithMeOrFd(_arg0,_arg1,_arg2,_arg3);
				encapsulationLayerLink.ELLinkList_THelper.write(_out,_arg2.value);
				encapsulationLayerLink.ELLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // createELLink
			{
			try
			{
				encapsulationLayerLink.ELLinkCreateData_T _arg0=encapsulationLayerLink.ELLinkCreateData_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createELLink(_arg0,_arg1,_arg2);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllELLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllELLinkNames(_arg0,_arg1,_arg2);
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
			case 9: // getCapabilities
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
			case 10: // getELLinkWithTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLinkWithTP(_arg0,_arg1);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
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
			case 12: // decreaseBandwidthOfELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				short _arg2=_input.read_short();
				globaldefs.NameAndStringValue_T[] _arg3=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg4= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				decreaseBandwidthOfELLink(_arg0,_arg1,_arg2,_arg3,_arg4);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // increaseBandwidthOfELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				subnetworkConnection.SNCCreateData_T[] _arg2=subnetworkConnection.SNCCreateDataList_THelper.read(_input);
				short _arg3=_input.read_short();
				transmissionParameters.LayeredParameters_T[] _arg4=transmissionParameters.LayeredParameterList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg5=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg6= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				increaseBandwidthOfELLink(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setELLinkLCASState
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				setELLinkLCASState(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // activateELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateELLink(_arg0,_arg1,_arg2);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // deactivateELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateELLink(_arg0,_arg1,_arg2);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllELLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				encapsulationLayerLink.ELLinkList_THolder _arg1= new encapsulationLayerLink.ELLinkList_THolder();
				encapsulationLayerLink.ELLinkIterator_IHolder _arg2= new encapsulationLayerLink.ELLinkIterator_IHolder();
				_out = handler.createReply();
				getAllELLinks(_arg0,_arg1,_arg2);
				encapsulationLayerLink.ELLinkList_THelper.write(_out,_arg1.value);
				encapsulationLayerLink.ELLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getELLinkWithSncOrTl
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLinkWithSncOrTl(_arg0,_arg1);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg1= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				_out = handler.createReply();
				getELLink(_arg0,_arg1);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getServerSNCsAndTLs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.SubnetworkConnectionList_THolder _arg1= new subnetworkConnection.SubnetworkConnectionList_THolder();
				topologicalLink.TopologicalLinkList_THolder _arg2= new topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getServerSNCsAndTLs(_arg0,_arg1,_arg2);
				subnetworkConnection.SubnetworkConnectionList_THelper.write(_out,_arg1.value);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // modifyELLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				encapsulationLayerLink.ELLinkModifyData_T _arg1=encapsulationLayerLink.ELLinkModifyData_THelper.read(_input);
				encapsulationLayerLink.EncapsulationLayerLink_THolder _arg2= new encapsulationLayerLink.EncapsulationLayerLink_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyELLink(_arg0,_arg1,_arg2,_arg3);
				encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
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
