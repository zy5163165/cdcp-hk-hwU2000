package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "IdlePortAndTS_T"
 *	@author JacORB IDL compiler 
 */

public final class IdlePortAndTS_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public IdlePortAndTS_T(){}
	public int slotID;
	public int portID;
	public int slotNo;
	public circuitCutMgr.TimeSlotInfo_T[] SlotInfoList;
	public IdlePortAndTS_T(int slotID, int portID, int slotNo, circuitCutMgr.TimeSlotInfo_T[] SlotInfoList)
	{
		this.slotID = slotID;
		this.portID = portID;
		this.slotNo = slotNo;
		this.SlotInfoList = SlotInfoList;
	}
}
