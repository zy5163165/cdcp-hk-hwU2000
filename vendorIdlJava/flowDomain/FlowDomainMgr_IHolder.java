package flowDomain;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class FlowDomainMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FlowDomainMgr_I value;
	public FlowDomainMgr_IHolder()
	{
	}
	public FlowDomainMgr_IHolder (final FlowDomainMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FlowDomainMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FlowDomainMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FlowDomainMgr_IHelper.write (_out,value);
	}
}
