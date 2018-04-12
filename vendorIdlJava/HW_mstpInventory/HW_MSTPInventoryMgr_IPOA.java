package HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class HW_MSTPInventoryMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, HW_mstpInventory.HW_MSTPInventoryMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setOwner", new java.lang.Integer(0));
		m_opsHash.put ( "getMstpEndPointShapingQueue", new java.lang.Integer(1));
		m_opsHash.put ( "setSTBridgeParam", new java.lang.Integer(2));
		m_opsHash.put ( "setMstpEndPoint", new java.lang.Integer(3));
		m_opsHash.put ( "setMstpEndPointShapingQueue", new java.lang.Integer(4));
		m_opsHash.put ( "setFlow", new java.lang.Integer(5));
		m_opsHash.put ( "modifyLinkAggregationGroup", new java.lang.Integer(6));
		m_opsHash.put ( "getAllVLANs", new java.lang.Integer(7));
		m_opsHash.put ( "delBindingPath", new java.lang.Integer(8));
		m_opsHash.put ( "getAllFlows", new java.lang.Integer(9));
		m_opsHash.put ( "createLinkAggregationGroup", new java.lang.Integer(10));
		m_opsHash.put ( "deleteQosRule", new java.lang.Integer(11));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(12));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(13));
		m_opsHash.put ( "getVLAN", new java.lang.Integer(14));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(15));
		m_opsHash.put ( "getSpanningTree", new java.lang.Integer(16));
		m_opsHash.put ( "setQosRule", new java.lang.Integer(17));
		m_opsHash.put ( "addBindingPath", new java.lang.Integer(18));
		m_opsHash.put ( "setVLANData", new java.lang.Integer(19));
		m_opsHash.put ( "deleteFlow", new java.lang.Integer(20));
		m_opsHash.put ( "getQosRule", new java.lang.Integer(21));
		m_opsHash.put ( "getAllSpanningTrees", new java.lang.Integer(22));
		m_opsHash.put ( "getAllQosRuleNames", new java.lang.Integer(23));
		m_opsHash.put ( "getVirtualBridge", new java.lang.Integer(24));
		m_opsHash.put ( "getAllVBs", new java.lang.Integer(25));
		m_opsHash.put ( "getBindingPath", new java.lang.Integer(26));
		m_opsHash.put ( "getAllSpanningTreeNames", new java.lang.Integer(27));
		m_opsHash.put ( "deleteVLAN", new java.lang.Integer(28));
		m_opsHash.put ( "createVLAN", new java.lang.Integer(29));
		m_opsHash.put ( "getAllLinkAggregationGroups", new java.lang.Integer(30));
		m_opsHash.put ( "getAllContainedInUseTPNames", new java.lang.Integer(31));
		m_opsHash.put ( "getAllVBNames", new java.lang.Integer(32));
		m_opsHash.put ( "createQosRule", new java.lang.Integer(33));
		m_opsHash.put ( "createVirtualBridge", new java.lang.Integer(34));
		m_opsHash.put ( "getLCASState", new java.lang.Integer(35));
		m_opsHash.put ( "getFlow", new java.lang.Integer(36));
		m_opsHash.put ( "getAllFlowNames", new java.lang.Integer(37));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(38));
		m_opsHash.put ( "createFlow", new java.lang.Integer(39));
		m_opsHash.put ( "getAvailablePortNames", new java.lang.Integer(40));
		m_opsHash.put ( "delVLANForwardPort", new java.lang.Integer(41));
		m_opsHash.put ( "addVLANForwardPort", new java.lang.Integer(42));
		m_opsHash.put ( "setSTPortParam", new java.lang.Integer(43));
		m_opsHash.put ( "deleteLinkAggregationGroup", new java.lang.Integer(44));
		m_opsHash.put ( "getAllContainedCurrentTPNames", new java.lang.Integer(45));
		m_opsHash.put ( "setSTProtocolParam", new java.lang.Integer(46));
		m_opsHash.put ( "setLCASState", new java.lang.Integer(47));
		m_opsHash.put ( "getAllQosRules", new java.lang.Integer(48));
		m_opsHash.put ( "getMstpEndPoint", new java.lang.Integer(49));
		m_opsHash.put ( "getAllLinkAggregationGroupNames", new java.lang.Integer(50));
		m_opsHash.put ( "getAllMstpEndPoints", new java.lang.Integer(51));
		m_opsHash.put ( "getAllVLANNames", new java.lang.Integer(52));
		m_opsHash.put ( "deleteVirtualBridge", new java.lang.Integer(53));
		m_opsHash.put ( "getLinkAggregationGroup", new java.lang.Integer(54));
		m_opsHash.put ( "getAllMstpEndPointNames", new java.lang.Integer(55));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public HW_mstpInventory.HW_MSTPInventoryMgr_I _this()
	{
		return HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object());
	}
	public HW_mstpInventory.HW_MSTPInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object(orb));
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
			case 1: // getMstpEndPointShapingQueue
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.ShapingQueueList_THolder _arg1= new HW_mstpInventory.ShapingQueueList_THolder();
				_out = handler.createReply();
				getMstpEndPointShapingQueue(_arg0,_arg1);
				HW_mstpInventory.ShapingQueueList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setSTBridgeParam
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTBridgeParam(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setMstpEndPoint
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				transmissionParameters.LayeredParameters_T[] _arg1=transmissionParameters.LayeredParameterList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPEndPoint_THolder _arg2= new HW_mstpInventory.HW_MSTPEndPoint_THolder();
				_out = handler.createReply();
				setMstpEndPoint(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_MSTPEndPoint_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setMstpEndPointShapingQueue
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.ShapingQueueList_THolder _arg1= new HW_mstpInventory.ShapingQueueList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setMstpEndPointShapingQueue(_arg0,_arg1);
				HW_mstpInventory.ShapingQueueList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setFlow
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_Flow_THolder _arg2= new HW_mstpInventory.HW_Flow_THolder();
				_out = handler.createReply();
				setFlow(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_Flow_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // modifyLinkAggregationGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg2=globaldefs.NamingAttributesList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg3=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_LinkAggregationGroup_THolder _arg4= new HW_mstpInventory.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				modifyLinkAggregationGroup(_arg0,_arg1,_arg2,_arg3,_arg4);
				HW_mstpInventory.HW_LinkAggregationGroup_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllVLANs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_VirtualLANList_THolder _arg2= new HW_mstpInventory.HW_VirtualLANList_THolder();
				HW_mstpInventory.HW_VirtualLANIterator_IHolder _arg3= new HW_mstpInventory.HW_VirtualLANIterator_IHolder();
				_out = handler.createReply();
				getAllVLANs(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_VirtualLANList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_VirtualLANIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // delBindingPath
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.Directionality_T _arg1=terminationPoint.Directionality_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg2=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPBindingPathList_THolder _arg3= new HW_mstpInventory.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				delBindingPath(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_MSTPBindingPathList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllFlows
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_FlowList_THolder _arg2= new HW_mstpInventory.HW_FlowList_THolder();
				HW_mstpInventory.HW_FlowIterator_IHolder _arg3= new HW_mstpInventory.HW_FlowIterator_IHolder();
				_out = handler.createReply();
				getAllFlows(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_FlowList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_FlowIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // createLinkAggregationGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg3=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_LinkAggregationGroup_THolder _arg4= new HW_mstpInventory.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				createLinkAggregationGroup(_arg0,_arg1,_arg2,_arg3,_arg4);
				HW_mstpInventory.HW_LinkAggregationGroup_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // deleteQosRule
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteQosRule(_arg0);
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
			case 13: // setNativeEMSName
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
			case 14: // getVLAN
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualLAN_THolder _arg1= new HW_mstpInventory.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				getVLAN(_arg0,_arg1);
				HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_arg1.value);
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
			case 16: // getSpanningTree
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_SpanningTree_THolder _arg1= new HW_mstpInventory.HW_SpanningTree_THolder();
				_out = handler.createReply();
				getSpanningTree(_arg0,_arg1);
				HW_mstpInventory.HW_SpanningTree_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setQosRule
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_QosRule_THolder _arg2= new HW_mstpInventory.HW_QosRule_THolder();
				_out = handler.createReply();
				setQosRule(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_QosRule_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // addBindingPath
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.Directionality_T _arg1=terminationPoint.Directionality_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg2=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPBindingPathList_THolder _arg3= new HW_mstpInventory.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				addBindingPath(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_MSTPBindingPathList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setVLANData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualLAN_THolder _arg2= new HW_mstpInventory.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				setVLANData(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteFlow
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteFlow(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getQosRule
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_QosRule_THolder _arg1= new HW_mstpInventory.HW_QosRule_THolder();
				_out = handler.createReply();
				getQosRule(_arg0,_arg1);
				HW_mstpInventory.HW_QosRule_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllSpanningTrees
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_SpanningTreeList_THolder _arg2= new HW_mstpInventory.HW_SpanningTreeList_THolder();
				HW_mstpInventory.HW_SpanningTreeIterator_IHolder _arg3= new HW_mstpInventory.HW_SpanningTreeIterator_IHolder();
				_out = handler.createReply();
				getAllSpanningTrees(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_SpanningTreeList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_SpanningTreeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllQosRuleNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllQosRuleNames(_arg0,_arg1,_arg2,_arg3);
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
			case 24: // getVirtualBridge
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualBridge_THolder _arg1= new HW_mstpInventory.HW_VirtualBridge_THolder();
				_out = handler.createReply();
				getVirtualBridge(_arg0,_arg1);
				HW_mstpInventory.HW_VirtualBridge_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllVBs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_VirtualBridgeList_THolder _arg2= new HW_mstpInventory.HW_VirtualBridgeList_THolder();
				HW_mstpInventory.HW_VirtualBridgeIterator_IHolder _arg3= new HW_mstpInventory.HW_VirtualBridgeIterator_IHolder();
				_out = handler.createReply();
				getAllVBs(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_VirtualBridgeList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_VirtualBridgeIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getBindingPath
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPBindingPathList_THolder _arg1= new HW_mstpInventory.HW_MSTPBindingPathList_THolder();
				_out = handler.createReply();
				getBindingPath(_arg0,_arg1);
				HW_mstpInventory.HW_MSTPBindingPathList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllSpanningTreeNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllSpanningTreeNames(_arg0,_arg1,_arg2,_arg3);
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
			case 28: // deleteVLAN
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVLAN(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // createVLAN
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_ushort();
				globaldefs.NameAndStringValue_T[][] _arg2=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualLAN_THolder _arg3= new HW_mstpInventory.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				createVLAN(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllLinkAggregationGroups
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_LinkAggregationGroupList_THolder _arg2= new HW_mstpInventory.HW_LinkAggregationGroupList_THolder();
				HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder _arg3= new HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder();
				_out = handler.createReply();
				getAllLinkAggregationGroups(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_LinkAggregationGroupList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_LinkAggregationGroupIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getAllContainedInUseTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllContainedInUseTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 32: // getAllVBNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllVBNames(_arg0,_arg1,_arg2,_arg3);
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
			case 33: // createQosRule
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_QosType_T _arg1=HW_mstpInventory.HW_QosType_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_QosRule_THolder _arg3= new HW_mstpInventory.HW_QosRule_THolder();
				_out = handler.createReply();
				createQosRule(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_QosRule_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // createVirtualBridge
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_ushort();
				java.lang.String _arg2=_input.read_string();
				HW_mstpInventory.HW_VirtualBridge_THolder _arg3= new HW_mstpInventory.HW_VirtualBridge_THolder();
				_out = handler.createReply();
				createVirtualBridge(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_VirtualBridge_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getLCASState
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.BooleanHolder _arg1= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				getLCASState(_arg0,_arg1);
				_out.write_boolean(_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getFlow
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_Flow_THolder _arg1= new HW_mstpInventory.HW_Flow_THolder();
				_out = handler.createReply();
				getFlow(_arg0,_arg1);
				HW_mstpInventory.HW_Flow_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getAllFlowNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFlowNames(_arg0,_arg1,_arg2,_arg3);
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
			case 38: // setUserLabel
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
			case 39: // createFlow
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_Flow_THolder _arg2= new HW_mstpInventory.HW_Flow_THolder();
				_out = handler.createReply();
				createFlow(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_Flow_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getAvailablePortNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAvailablePortNames(_arg0,_arg1,_arg2,_arg3);
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
			case 41: // delVLANForwardPort
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualLAN_THolder _arg2= new HW_mstpInventory.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				delVLANForwardPort(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // addVLANForwardPort
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[][] _arg1=globaldefs.NamingAttributesList_THelper.read(_input);
				HW_mstpInventory.HW_VirtualLAN_THolder _arg2= new HW_mstpInventory.HW_VirtualLAN_THolder();
				_out = handler.createReply();
				addVLANForwardPort(_arg0,_arg1,_arg2);
				HW_mstpInventory.HW_VirtualLAN_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // setSTPortParam
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg2=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTPortParam(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // deleteLinkAggregationGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteLinkAggregationGroup(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllContainedCurrentTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllContainedCurrentTPNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
			case 46: // setSTProtocolParam
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setSTProtocolParam(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // setLCASState
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				_out = handler.createReply();
				setLCASState(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getAllQosRules
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				HW_mstpInventory.HW_QosRuleList_THolder _arg2= new HW_mstpInventory.HW_QosRuleList_THolder();
				HW_mstpInventory.HW_QosRuleIterator_IHolder _arg3= new HW_mstpInventory.HW_QosRuleIterator_IHolder();
				_out = handler.createReply();
				getAllQosRules(_arg0,_arg1,_arg2,_arg3);
				HW_mstpInventory.HW_QosRuleList_THelper.write(_out,_arg2.value);
				HW_mstpInventory.HW_QosRuleIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // getMstpEndPoint
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPEndPoint_THolder _arg1= new HW_mstpInventory.HW_MSTPEndPoint_THolder();
				_out = handler.createReply();
				getMstpEndPoint(_arg0,_arg1);
				HW_mstpInventory.HW_MSTPEndPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 50: // getAllLinkAggregationGroupNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllLinkAggregationGroupNames(_arg0,_arg1,_arg2,_arg3);
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
			case 51: // getAllMstpEndPoints
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPEndPointType_T[] _arg1=HW_mstpInventory.HW_MSTPEndPointTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				HW_mstpInventory.HW_MSTPEndPointList_THolder _arg3= new HW_mstpInventory.HW_MSTPEndPointList_THolder();
				HW_mstpInventory.HW_MSTPEndPointIterator_IHolder _arg4= new HW_mstpInventory.HW_MSTPEndPointIterator_IHolder();
				_out = handler.createReply();
				getAllMstpEndPoints(_arg0,_arg1,_arg2,_arg3,_arg4);
				HW_mstpInventory.HW_MSTPEndPointList_THelper.write(_out,_arg3.value);
				HW_mstpInventory.HW_MSTPEndPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 52: // getAllVLANNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllVLANNames(_arg0,_arg1,_arg2,_arg3);
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
			case 53: // deleteVirtualBridge
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVirtualBridge(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 54: // getLinkAggregationGroup
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_LinkAggregationGroup_THolder _arg1= new HW_mstpInventory.HW_LinkAggregationGroup_THolder();
				_out = handler.createReply();
				getLinkAggregationGroup(_arg0,_arg1);
				HW_mstpInventory.HW_LinkAggregationGroup_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 55: // getAllMstpEndPointNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				HW_mstpInventory.HW_MSTPEndPointType_T[] _arg1=HW_mstpInventory.HW_MSTPEndPointTypeList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg3= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg4= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMstpEndPointNames(_arg0,_arg1,_arg2,_arg3,_arg4);
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
