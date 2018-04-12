package guiCutThrough;

/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public guiCutThrough.GCTProfileInfo_T value;

	public GCTProfileInfo_THolder ()
	{
	}
	public GCTProfileInfo_THolder(final guiCutThrough.GCTProfileInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return guiCutThrough.GCTProfileInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = guiCutThrough.GCTProfileInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		guiCutThrough.GCTProfileInfo_THelper.write(_out, value);
	}
}
