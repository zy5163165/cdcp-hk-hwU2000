package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "PortInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PortInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PortInfo_T(){}
	public int portID;
	public int slotID;
	public PortInfo_T(int portID, int slotID)
	{
		this.portID = portID;
		this.slotID = slotID;
	}
}
