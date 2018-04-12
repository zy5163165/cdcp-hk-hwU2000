package equipment;

/**
 *	Generated from IDL definition of struct "Severity_T"
 *	@author JacORB IDL compiler 
 */

public final class Severity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Severity_T(){}
	public java.lang.String probableCause = "";
	public notifications.PerceivedSeverity_T currentSeverity;
	public int alarmID;
	public int eqtType;
	public Severity_T(java.lang.String probableCause, notifications.PerceivedSeverity_T currentSeverity, int alarmID, int eqtType)
	{
		this.probableCause = probableCause;
		this.currentSeverity = currentSeverity;
		this.alarmID = alarmID;
		this.eqtType = eqtType;
	}
}
