package circuitCutMgr;

/**
 *	Generated from IDL definition of alias "CutAndPrefabSNCPairList_T"
 *	@author JacORB IDL compiler 
 */

public final class CutAndPrefabSNCPairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public circuitCutMgr.CutAndPrefabSNCPair_T[] value;

	public CutAndPrefabSNCPairList_THolder ()
	{
	}
	public CutAndPrefabSNCPairList_THolder (final circuitCutMgr.CutAndPrefabSNCPair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CutAndPrefabSNCPairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CutAndPrefabSNCPairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CutAndPrefabSNCPairList_THelper.write (out,value);
	}
}
