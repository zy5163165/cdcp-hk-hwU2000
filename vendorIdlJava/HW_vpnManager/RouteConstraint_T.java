package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "RouteConstraint_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteConstraint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteConstraint_T(){}
	public java.lang.String ipAddress = "";
	public java.lang.String routingStytle = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteConstraint_T(java.lang.String ipAddress, java.lang.String routingStytle, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.ipAddress = ipAddress;
		this.routingStytle = routingStytle;
		this.additionalInfo = additionalInfo;
	}
}
