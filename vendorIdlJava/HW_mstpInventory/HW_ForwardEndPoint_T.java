package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_ForwardEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ForwardEndPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_ForwardEndPoint_T(){}
	public globaldefs.NameAndStringValue_T[] logicTPName;
	public globaldefs.NameAndStringValue_T[] paraList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ForwardEndPoint_T(globaldefs.NameAndStringValue_T[] logicTPName, globaldefs.NameAndStringValue_T[] paraList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.logicTPName = logicTPName;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
