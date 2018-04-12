package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "CutAndPrefabSNCPair_T"
 *	@author JacORB IDL compiler 
 */

public final class CutAndPrefabSNCPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.CutAndPrefabSNCPair_T value;

	public CutAndPrefabSNCPair_THolder ()
	{
	}
	public CutAndPrefabSNCPair_THolder(final circuitCutMgr.CutAndPrefabSNCPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.CutAndPrefabSNCPair_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.CutAndPrefabSNCPair_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.CutAndPrefabSNCPair_THelper.write(_out, value);
	}
}
