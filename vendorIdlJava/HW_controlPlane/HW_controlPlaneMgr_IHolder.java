package HW_controlPlane;

/**
 *	Generated from IDL interface "HW_controlPlaneMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class HW_controlPlaneMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_controlPlaneMgr_I value;
	public HW_controlPlaneMgr_IHolder()
	{
	}
	public HW_controlPlaneMgr_IHolder (final HW_controlPlaneMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_controlPlaneMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_controlPlaneMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_controlPlaneMgr_IHelper.write (_out,value);
	}
}
