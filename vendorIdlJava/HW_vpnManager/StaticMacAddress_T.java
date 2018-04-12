package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "StaticMacAddress_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticMacAddress_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public StaticMacAddress_T(){}
	public java.lang.String staticMacType = "";
	public java.lang.String macAddress = "";
	public int peVID;
	public int ceVID;
	public globaldefs.NameAndStringValue_T[] tpName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public StaticMacAddress_T(java.lang.String staticMacType, java.lang.String macAddress, int peVID, int ceVID, globaldefs.NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.staticMacType = staticMacType;
		this.macAddress = macAddress;
		this.peVID = peVID;
		this.ceVID = ceVID;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
