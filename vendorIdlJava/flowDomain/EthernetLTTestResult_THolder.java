package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetLTTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetLTTestResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.EthernetLTTestResult_T value;

	public EthernetLTTestResult_THolder ()
	{
	}
	public EthernetLTTestResult_THolder(final flowDomain.EthernetLTTestResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return flowDomain.EthernetLTTestResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = flowDomain.EthernetLTTestResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		flowDomain.EthernetLTTestResult_THelper.write(_out, value);
	}
}
