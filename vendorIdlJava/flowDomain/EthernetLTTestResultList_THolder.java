package flowDomain;

/**
 *	Generated from IDL definition of alias "EthernetLTTestResultList_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetLTTestResultList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public flowDomain.EthernetLTTestResult_T[] value;

	public EthernetLTTestResultList_THolder ()
	{
	}
	public EthernetLTTestResultList_THolder (final flowDomain.EthernetLTTestResult_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EthernetLTTestResultList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EthernetLTTestResultList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EthernetLTTestResultList_THelper.write (out,value);
	}
}
