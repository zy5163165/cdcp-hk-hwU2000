package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "MultipointServiceAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class MultipointServiceAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultipointServiceAttr_T(){}
	public globaldefs.NameAndStringValue_T[] paraList;
	public HW_vpnManager.StaticMacAddress_T[] staticMacList;
	public HW_vpnManager.SplitHorizonGroup_T[] shgList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultipointServiceAttr_T(globaldefs.NameAndStringValue_T[] paraList, HW_vpnManager.StaticMacAddress_T[] staticMacList, HW_vpnManager.SplitHorizonGroup_T[] shgList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.paraList = paraList;
		this.staticMacList = staticMacList;
		this.shgList = shgList;
		this.additionalInfo = additionalInfo;
	}
}
