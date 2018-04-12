package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "SplitHorizonGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class SplitHorizonGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SplitHorizonGroup_T(){}
	public int shgID;
	public globaldefs.NameAndStringValue_T[][] shgMemberNameList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public SplitHorizonGroup_T(int shgID, globaldefs.NameAndStringValue_T[][] shgMemberNameList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.shgID = shgID;
		this.shgMemberNameList = shgMemberNameList;
		this.additionalInfo = additionalInfo;
	}
}
