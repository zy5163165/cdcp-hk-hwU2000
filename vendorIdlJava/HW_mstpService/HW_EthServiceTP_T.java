package HW_mstpService;

/**
 *	Generated from IDL definition of struct "HW_EthServiceTP_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_EthServiceTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_EthServiceTP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public short vlanID;
	public int tunnel;
	public int vc;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_EthServiceTP_T(globaldefs.NameAndStringValue_T[] name, short vlanID, int tunnel, int vc, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.vlanID = vlanID;
		this.tunnel = tunnel;
		this.vc = vc;
		this.additionalInfo = additionalInfo;
	}
}
