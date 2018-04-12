package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TrafficConditioningProfileDeassign_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileDeassign_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficConditioningProfileDeassign_T(){}
	public globaldefs.NameAndStringValue_T[] tcpRef;
	public globaldefs.NameAndStringValue_T[] resourceName;
	public terminationPoint.Directionality_T direction;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficConditioningProfileDeassign_T(globaldefs.NameAndStringValue_T[] tcpRef, globaldefs.NameAndStringValue_T[] resourceName, terminationPoint.Directionality_T direction, short layerRate, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tcpRef = tcpRef;
		this.resourceName = resourceName;
		this.direction = direction;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
