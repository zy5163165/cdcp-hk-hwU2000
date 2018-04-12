package HW_mstpService;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_MSTPServiceMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_MSTPServiceMgr_I value;
	public HW_MSTPServiceMgr_IHolder()
	{
	}
	public HW_MSTPServiceMgr_IHolder (final HW_MSTPServiceMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_MSTPServiceMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_MSTPServiceMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_MSTPServiceMgr_IHelper.write (_out,value);
	}
}
