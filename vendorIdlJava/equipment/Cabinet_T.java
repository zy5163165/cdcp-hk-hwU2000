package equipment;

/**
 *	Generated from IDL definition of struct "Cabinet_T"
 *	@author JacORB IDL compiler 
 */

public final class Cabinet_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Cabinet_T(){}
	public java.lang.String name = "";
	public java.lang.String equipmentRoomName = "";
	public java.lang.String containedShelfList = "";
	public java.lang.String type = "";
	public short height;
	public short width;
	public short depth;
	public int voltage;
	public java.lang.String powerBoxType = "";
	public java.lang.String memo = "";
	public Cabinet_T(java.lang.String name, java.lang.String equipmentRoomName, java.lang.String containedShelfList, java.lang.String type, short height, short width, short depth, int voltage, java.lang.String powerBoxType, java.lang.String memo)
	{
		this.name = name;
		this.equipmentRoomName = equipmentRoomName;
		this.containedShelfList = containedShelfList;
		this.type = type;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.voltage = voltage;
		this.powerBoxType = powerBoxType;
		this.memo = memo;
	}
}
