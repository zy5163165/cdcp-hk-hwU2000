package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteInfo_T(){}
	public globaldefs.NameAndStringValue_T[] sncName;
	public subnetworkConnection.CrossConnect_T[] route;
	public RouteInfo_T(globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.CrossConnect_T[] route)
	{
		this.sncName = sncName;
		this.route = route;
	}
}
