package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "WaveLengthStatusList_T"
 *	@author JacORB IDL compiler 
 */

public final class WaveLengthStatusList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.WaveLengthStatus_T[] value;

	public WaveLengthStatusList_THolder ()
	{
	}
	public WaveLengthStatusList_THolder (final subnetworkConnection.WaveLengthStatus_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return WaveLengthStatusList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = WaveLengthStatusList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		WaveLengthStatusList_THelper.write (out,value);
	}
}
