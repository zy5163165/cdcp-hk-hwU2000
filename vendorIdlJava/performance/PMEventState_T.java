package performance;

/**
 *	Generated from IDL definition of struct "PMEventState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMEventState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMEventState_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public boolean bEnableMonitor;
	public boolean bAutoReport;
	public PMEventState_T(java.lang.String pmParameterName, java.lang.String pmLocation, boolean bEnableMonitor, boolean bAutoReport)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.bEnableMonitor = bEnableMonitor;
		this.bAutoReport = bAutoReport;
	}
}
