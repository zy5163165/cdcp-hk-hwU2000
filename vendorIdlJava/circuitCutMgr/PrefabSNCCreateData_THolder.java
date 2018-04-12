package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "PrefabSNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class PrefabSNCCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.PrefabSNCCreateData_T value;

	public PrefabSNCCreateData_THolder ()
	{
	}
	public PrefabSNCCreateData_THolder(final circuitCutMgr.PrefabSNCCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return circuitCutMgr.PrefabSNCCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = circuitCutMgr.PrefabSNCCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		circuitCutMgr.PrefabSNCCreateData_THelper.write(_out, value);
	}
}
