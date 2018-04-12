package emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class EMSMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EMSMgr_I value;
	public EMSMgr_IHolder()
	{
	}
	public EMSMgr_IHolder (final EMSMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EMSMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EMSMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EMSMgr_IHelper.write (_out,value);
	}
}
