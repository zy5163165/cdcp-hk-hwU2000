package HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MSTPProtectionMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MSTPProtectionMgr_I value;
	public HW_MSTPProtectionMgr_IHolder()
	{
	}
	public HW_MSTPProtectionMgr_IHolder (final HW_MSTPProtectionMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MSTPProtectionMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPProtectionMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MSTPProtectionMgr_IHelper.write (_out,value);
	}
}
