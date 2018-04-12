package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_STCurrentPort_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_STCurrentPort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_STCurrentPort_T(){}
	public globaldefs.NameAndStringValue_T[] portName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_STCurrentPort_T(globaldefs.NameAndStringValue_T[] portName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.portName = portName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.additionalInfo = additionalInfo;
	}
}
