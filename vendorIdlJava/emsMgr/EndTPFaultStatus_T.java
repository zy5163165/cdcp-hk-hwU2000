package emsMgr;

/**
 *	Generated from IDL definition of struct "EndTPFaultStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class EndTPFaultStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EndTPFaultStatus_T(){}
	public globaldefs.NameAndStringValue_T[] endTP;
	public java.lang.String status = "";
	public java.lang.String position = "";
	public EndTPFaultStatus_T(globaldefs.NameAndStringValue_T[] endTP, java.lang.String status, java.lang.String position)
	{
		this.endTP = endTP;
		this.status = status;
		this.position = position;
	}
}
