package performance;

/**
 *	Generated from IDL definition of struct "PMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThresholdValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMThresholdValue_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThresholdValue_T(java.lang.String pmParameterName, java.lang.String pmLocation, performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
