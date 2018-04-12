package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCBasicInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCBasicInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.SNCBasicInfo_T value;

	public SNCBasicInfo_THolder ()
	{
	}
	public SNCBasicInfo_THolder(final circuitCutMgr.SNCBasicInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.SNCBasicInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.SNCBasicInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.SNCBasicInfo_THelper.write(_out, value);
	}
}
