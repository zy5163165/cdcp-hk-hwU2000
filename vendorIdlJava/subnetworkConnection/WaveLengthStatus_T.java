package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "WaveLengthStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class WaveLengthStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public WaveLengthStatus_T(){}
	public java.lang.String frequency = "";
	public short used;
	public short unused;
	public globaldefs.NameAndStringValue_T[] addtionalInfo;
	public WaveLengthStatus_T(java.lang.String frequency, short used, short unused, globaldefs.NameAndStringValue_T[] addtionalInfo)
	{
		this.frequency = frequency;
		this.used = used;
		this.unused = unused;
		this.addtionalInfo = addtionalInfo;
	}
}
