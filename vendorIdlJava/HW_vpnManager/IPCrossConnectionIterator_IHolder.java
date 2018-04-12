package HW_vpnManager;

/**
 *	Generated from IDL interface "IPCrossConnectionIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class IPCrossConnectionIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public IPCrossConnectionIterator_I value;
	public IPCrossConnectionIterator_IHolder()
	{
	}
	public IPCrossConnectionIterator_IHolder (final IPCrossConnectionIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IPCrossConnectionIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPCrossConnectionIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IPCrossConnectionIterator_IHelper.write (_out,value);
	}
}
