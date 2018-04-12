package maintenanceOps;

/**
 *	Generated from IDL definition of struct "PRBSTestParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestParameter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PRBSTestParameter_T(){}
	public globaldefs.NameAndStringValue_T[] tpName;
	public maintenanceOps.TestDuration_T testDuration;
	public java.lang.String sampleGranularity;
	public java.lang.String testType;
	public boolean accumulatingIndicator;
	public PRBSTestParameter_T(globaldefs.NameAndStringValue_T[] tpName, maintenanceOps.TestDuration_T testDuration, java.lang.String sampleGranularity, java.lang.String testType, boolean accumulatingIndicator)
	{
		this.tpName = tpName;
		this.testDuration = testDuration;
		this.sampleGranularity = sampleGranularity;
		this.testType = testType;
		this.accumulatingIndicator = accumulatingIndicator;
	}
}
