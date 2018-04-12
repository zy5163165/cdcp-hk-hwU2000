package performance;

/**
 *	Generated from IDL definition of struct "PMMeasurement_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMeasurement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMMeasurement_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public float value;
	public java.lang.String unit = "";
	public java.lang.String intervalStatus = "";
	public PMMeasurement_T(java.lang.String pmParameterName, java.lang.String pmLocation, float value, java.lang.String unit, java.lang.String intervalStatus)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.value = value;
		this.unit = unit;
		this.intervalStatus = intervalStatus;
	}
}
