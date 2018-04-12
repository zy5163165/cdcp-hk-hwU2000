package HW_controlPlane;

/**
 *	Generated from IDL definition of struct "HW_Capacity_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_Capacity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_Capacity_T(){}
	public short unit;
	public int Bandwidth;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_Capacity_T(short unit, int Bandwidth, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.unit = unit;
		this.Bandwidth = Bandwidth;
		this.additionalInfo = additionalInfo;
	}
}
