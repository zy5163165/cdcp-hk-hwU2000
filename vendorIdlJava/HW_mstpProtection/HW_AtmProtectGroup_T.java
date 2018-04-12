package HW_mstpProtection;

/**
 *	Generated from IDL definition of struct "HW_AtmProtectGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_AtmProtectGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_AtmProtectGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public HW_mstpProtection.HW_AtmProtectType_T protectType;
	public HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect;
	public HW_mstpProtection.HW_AtmPGUseState_T useState;
	public HW_mstpProtection.HW_AtmPGSingEndPara_T srcEndPara;
	public HW_mstpProtection.HW_AtmPGSingEndPara_T snkEndPara;
	public HW_mstpProtection.HW_AtmServiceProtectPair_T[] ppList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_AtmProtectGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, HW_mstpProtection.HW_AtmProtectType_T protectType, HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, HW_mstpProtection.HW_AtmPGUseState_T useState, HW_mstpProtection.HW_AtmPGSingEndPara_T srcEndPara, HW_mstpProtection.HW_AtmPGSingEndPara_T snkEndPara, HW_mstpProtection.HW_AtmServiceProtectPair_T[] ppList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectType = protectType;
		this.switchDirect = switchDirect;
		this.useState = useState;
		this.srcEndPara = srcEndPara;
		this.snkEndPara = snkEndPara;
		this.ppList = ppList;
		this.additionalInfo = additionalInfo;
	}
}
