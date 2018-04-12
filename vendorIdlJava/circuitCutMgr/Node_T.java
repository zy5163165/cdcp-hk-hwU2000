package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Node_T(){}
	public int nodeID;
	public java.lang.String nativeEMSName = "";
	public circuitCutMgr.NodeType_T nodeType;
	public circuitCutMgr.Position_T position;
	public int parent;
	public circuitCutMgr.NameAndStringValue_T[] additionalInfo;
	public Node_T(int nodeID, java.lang.String nativeEMSName, circuitCutMgr.NodeType_T nodeType, circuitCutMgr.Position_T position, int parent, circuitCutMgr.NameAndStringValue_T[] additionalInfo)
	{
		this.nodeID = nodeID;
		this.nativeEMSName = nativeEMSName;
		this.nodeType = nodeType;
		this.position = position;
		this.parent = parent;
		this.additionalInfo = additionalInfo;
	}
}
