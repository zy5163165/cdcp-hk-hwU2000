package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMParamer_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMParamer_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetOAMParamer_T(){}
	public java.lang.String oamPointName = "";
	public int period;
	public EthernetOAMParamer_T(java.lang.String oamPointName, int period)
	{
		this.oamPointName = oamPointName;
		this.period = period;
	}
}
