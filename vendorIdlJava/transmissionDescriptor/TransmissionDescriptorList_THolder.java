package transmissionDescriptor;

/**
 *	Generated from IDL definition of alias "TransmissionDescriptorList_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptorList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public transmissionDescriptor.TransmissionDescriptor_T[] value;

	public TransmissionDescriptorList_THolder ()
	{
	}
	public TransmissionDescriptorList_THolder (final transmissionDescriptor.TransmissionDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionDescriptorList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionDescriptorList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransmissionDescriptorList_THelper.write (out,value);
	}
}
