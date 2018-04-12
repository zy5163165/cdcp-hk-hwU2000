package emsSession;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class EmsSession_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, emsSession.EmsSession_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_associatedSession", new java.lang.Integer(0));
		m_opsHash.put ( "ping", new java.lang.Integer(1));
		m_opsHash.put ( "getEventChannel", new java.lang.Integer(2));
		m_opsHash.put ( "getManager", new java.lang.Integer(3));
		m_opsHash.put ( "getSupportedManagers", new java.lang.Integer(4));
		m_opsHash.put ( "endSession", new java.lang.Integer(5));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSession/EmsSession_I:1.0","IDL:mtnm.tmforum.org/session/Session_I:1.0"};
	public emsSession.EmsSession_I _this()
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object());
	}
	public emsSession.EmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object(orb));
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
			case 0: // _get_associatedSession
			{
			_out = handler.createReply();
			session.Session_IHelper.write(_out,associatedSession());
				break;
			}
			case 1: // ping
			{
				_out = handler.createReply();
				ping();
				break;
			}
			case 2: // getEventChannel
			{
			try
			{
				org.omg.CosNotifyChannelAdmin.EventChannelHolder _arg0= new org.omg.CosNotifyChannelAdmin.EventChannelHolder();
				_out = handler.createReply();
				getEventChannel(_arg0);
				org.omg.CosNotifyChannelAdmin.EventChannelHelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getManager
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				common.Common_IHolder _arg1= new common.Common_IHolder();
				_out = handler.createReply();
				getManager(_arg0,_arg1);
				common.Common_IHelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getSupportedManagers
			{
			try
			{
				emsSession.EmsSession_IPackage.managerNames_THolder _arg0= new emsSession.EmsSession_IPackage.managerNames_THolder();
				_out = handler.createReply();
				getSupportedManagers(_arg0);
				emsSession.EmsSession_IPackage.managerNames_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // endSession
			{
				_out = handler.createReply();
				endSession();
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
