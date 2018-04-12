package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetOAMOperation_T(){}
	public flowDomain.EthernetOAMCommandType_T command;
	public flowDomain.EthernetOAMParamer_T srcPoint;
	public flowDomain.EthernetOAMParamer_T snkPoint;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMOperation_T(flowDomain.EthernetOAMCommandType_T command, flowDomain.EthernetOAMParamer_T srcPoint, flowDomain.EthernetOAMParamer_T snkPoint, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.command = command;
		this.srcPoint = srcPoint;
		this.snkPoint = snkPoint;
		this.additionalInfo = additionalInfo;
	}
}
