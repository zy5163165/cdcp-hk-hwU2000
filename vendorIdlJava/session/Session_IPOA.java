package session;

/**
 *	Generated from IDL interface "Session_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public abstract class Session_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, session.Session_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_associatedSession", new java.lang.Integer(0));
		m_opsHash.put ( "ping", new java.lang.Integer(1));
		m_opsHash.put ( "endSession", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/session/Session_I:1.0"};
	public session.Session_I _this()
	{
		return session.Session_IHelper.narrow(_this_object());
	}
	public session.Session_I _this(org.omg.CORBA.ORB orb)
	{
		return session.Session_IHelper.narrow(_this_object(orb));
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
			case 2: // endSession
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
