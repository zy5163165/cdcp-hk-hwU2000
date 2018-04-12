package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetOAMPoint_T(){}
	public java.lang.String Name = "";
	public flowDomain.EthernetOAMPointType_T type;
	public flowDomain.EthernetOAMPointDirection_T direction;
	public int level;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMPoint_T(java.lang.String Name, flowDomain.EthernetOAMPointType_T type, flowDomain.EthernetOAMPointDirection_T direction, int level, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.Name = Name;
		this.type = type;
		this.direction = direction;
		this.level = level;
		this.additionalInfo = additionalInfo;
	}
}
