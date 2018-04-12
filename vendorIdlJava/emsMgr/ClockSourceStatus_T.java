package emsMgr;

/**
 *	Generated from IDL definition of struct "ClockSourceStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockSourceStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ClockSourceStatus_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String status = "";
	public java.lang.String timingMode = "";
	public java.lang.String quality = "";
	public java.lang.String workingMode = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ClockSourceStatus_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String status, java.lang.String timingMode, java.lang.String quality, java.lang.String workingMode, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.status = status;
		this.timingMode = timingMode;
		this.quality = quality;
		this.workingMode = workingMode;
		this.additionalInfo = additionalInfo;
	}
}
