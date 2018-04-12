package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_RPRSwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_RPRSwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_RPRSwitchData_T(){}
	public globaldefs.NameAndStringValue_T[] nodeName;
	public protection.SwitchReason_T switchReason;
	public HW_mstpProtection.HW_SwitchState_T switchState;
	public HW_mstpProtection.HW_SwitchPosition_T switchPosition;
	public globaldefs.NameAndStringValue_T[] switchParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_RPRSwitchData_T(globaldefs.NameAndStringValue_T[] nodeName, protection.SwitchReason_T switchReason, HW_mstpProtection.HW_SwitchState_T switchState, HW_mstpProtection.HW_SwitchPosition_T switchPosition, globaldefs.NameAndStringValue_T[] switchParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeName = nodeName;
		this.switchReason = switchReason;
		this.switchState = switchState;
		this.switchPosition = switchPosition;
		this.switchParameters = switchParameters;
		this.additionalInfo = additionalInfo;
	}
}
