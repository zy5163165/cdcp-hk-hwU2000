package TopoManagementManager;

/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Node_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public TopoManagementManager.NodeType_T nodeType;
	public TopoManagementManager.Position_T position;
	public globaldefs.NameAndStringValue_T[] parent;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public Node_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, TopoManagementManager.NodeType_T nodeType, TopoManagementManager.Position_T position, globaldefs.NameAndStringValue_T[] parent, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.nodeType = nodeType;
		this.position = position;
		this.parent = parent;
		this.additionalInfo = additionalInfo;
	}
}
