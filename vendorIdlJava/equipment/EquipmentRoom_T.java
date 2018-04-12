package equipment;

/**
 *	Generated from IDL definition of struct "EquipmentRoom_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentRoom_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentRoom_T(){}
	public java.lang.String name = "";
	public java.lang.String containedCabinet = "";
	public java.lang.String containedNMManager = "";
	public java.lang.String country = "";
	public java.lang.String province = "";
	public java.lang.String city = "";
	public java.lang.String site = "";
	public java.lang.String location = "";
	public java.lang.String cableArrange = "";
	public java.lang.String defendStaticFloor = "";
	public short floorHeight;
	public java.lang.String memo = "";
	public EquipmentRoom_T(java.lang.String name, java.lang.String containedCabinet, java.lang.String containedNMManager, java.lang.String country, java.lang.String province, java.lang.String city, java.lang.String site, java.lang.String location, java.lang.String cableArrange, java.lang.String defendStaticFloor, short floorHeight, java.lang.String memo)
	{
		this.name = name;
		this.containedCabinet = containedCabinet;
		this.containedNMManager = containedNMManager;
		this.country = country;
		this.province = province;
		this.city = city;
		this.site = site;
		this.location = location;
		this.cableArrange = cableArrange;
		this.defendStaticFloor = defendStaticFloor;
		this.floorHeight = floorHeight;
		this.memo = memo;
	}
}
