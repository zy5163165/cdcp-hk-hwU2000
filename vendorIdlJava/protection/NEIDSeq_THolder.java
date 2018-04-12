package protection;

/**
 *	Generated from IDL definition of alias "NEIDSeq_T"
 *	@author JacORB IDL compiler 
 */

public final class NEIDSeq_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public int[] value;

	public NEIDSeq_THolder ()
	{
	}
	public NEIDSeq_THolder (final int[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NEIDSeq_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NEIDSeq_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NEIDSeq_THelper.write (out,value);
	}
}
