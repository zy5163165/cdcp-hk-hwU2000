package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ErrorReason_T"
 *	@author JacORB IDL compiler 
 */

public final class ErrorReason_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ErrorReason_T(){}
	public java.lang.String strObjName = "";
	public int errorReason;
	public java.lang.String strOperDesc = "";
	public ErrorReason_T(java.lang.String strObjName, int errorReason, java.lang.String strOperDesc)
	{
		this.strObjName = strObjName;
		this.errorReason = errorReason;
		this.strOperDesc = strOperDesc;
	}
}
