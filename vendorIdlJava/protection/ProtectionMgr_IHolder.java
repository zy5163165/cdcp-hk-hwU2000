package protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ProtectionMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProtectionMgr_I value;
	public ProtectionMgr_IHolder()
	{
	}
	public ProtectionMgr_IHolder (final ProtectionMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProtectionMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProtectionMgr_IHelper.write (_out,value);
	}
}
