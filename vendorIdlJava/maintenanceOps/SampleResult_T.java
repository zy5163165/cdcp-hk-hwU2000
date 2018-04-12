package maintenanceOps;

/**
 *	Generated from IDL definition of struct "SampleResult_T"
 *	@author JacORB IDL compiler 
 */

public final class SampleResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SampleResult_T(){}
	public java.lang.String sampleTime;
	public int value;
	public SampleResult_T(java.lang.String sampleTime, int value)
	{
		this.sampleTime = sampleTime;
		this.value = value;
	}
}
