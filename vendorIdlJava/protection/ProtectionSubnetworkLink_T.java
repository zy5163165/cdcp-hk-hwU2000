package protection;

/**
 *	Generated from IDL definition of struct "ProtectionSubnetworkLink_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionSubnetworkLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProtectionSubnetworkLink_T(){}
	public globaldefs.NameAndStringValue_T[] srcTP;
	public globaldefs.NameAndStringValue_T[] snkTP;
	public short[] vc4List;
	public ProtectionSubnetworkLink_T(globaldefs.NameAndStringValue_T[] srcTP, globaldefs.NameAndStringValue_T[] snkTP, short[] vc4List)
	{
		this.srcTP = srcTP;
		this.snkTP = snkTP;
		this.vc4List = vc4List;
	}
}
