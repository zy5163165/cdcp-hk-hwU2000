package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmPGSingEndPara_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmPGSingEndPara_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmPGSingEndPara_T(){}
	public HW_mstpProtection.HW_AtmPGSwitchType_T switchType;
	public protection.ReversionMode_T reversionMode;
	public int holdOffTime;
	public int wtrTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmPGSingEndPara_T(HW_mstpProtection.HW_AtmPGSwitchType_T switchType, protection.ReversionMode_T reversionMode, int holdOffTime, int wtrTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.switchType = switchType;
		this.reversionMode = reversionMode;
		this.holdOffTime = holdOffTime;
		this.wtrTime = wtrTime;
		this.additionalInfo = additionalInfo;
	}
}
