package emsMgr;
/**
 *	Generated from IDL definition of enum "InventoryType_T"
 *	@author JacORB IDL compiler 
 */

public final class InventoryType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TYPE_EMS = 0;
	public static final InventoryType_T TYPE_EMS = new InventoryType_T(_TYPE_EMS);
	public static final int _TYPE_MANAGEDELEMENT = 1;
	public static final InventoryType_T TYPE_MANAGEDELEMENT = new InventoryType_T(_TYPE_MANAGEDELEMENT);
	public static final int _TYPE_RACK = 2;
	public static final InventoryType_T TYPE_RACK = new InventoryType_T(_TYPE_RACK);
	public static final int _TYPE_SHELF = 3;
	public static final InventoryType_T TYPE_SHELF = new InventoryType_T(_TYPE_SHELF);
	public static final int _TYPE_SLOT = 4;
	public static final InventoryType_T TYPE_SLOT = new InventoryType_T(_TYPE_SLOT);
	public static final int _TYPE_EQUIPMENT = 5;
	public static final InventoryType_T TYPE_EQUIPMENT = new InventoryType_T(_TYPE_EQUIPMENT);
	public static final int _TYPE_PTP = 6;
	public static final InventoryType_T TYPE_PTP = new InventoryType_T(_TYPE_PTP);
	public static final int _TYPE_IPCROSSCONNECTION = 7;
	public static final InventoryType_T TYPE_IPCROSSCONNECTION = new InventoryType_T(_TYPE_IPCROSSCONNECTION);
	public static final int _TYPE_TOPOLOGICALLINK = 8;
	public static final InventoryType_T TYPE_TOPOLOGICALLINK = new InventoryType_T(_TYPE_TOPOLOGICALLINK);
	public static final int _TYPE_MFDFR = 9;
	public static final InventoryType_T TYPE_MFDFR = new InventoryType_T(_TYPE_MFDFR);
	public static final int _TYPE_TCPROFILE = 10;
	public static final InventoryType_T TYPE_TCPROFILE = new InventoryType_T(_TYPE_TCPROFILE);
	public static final int _TYPE_IPPROTECTIONGROUP = 11;
	public static final InventoryType_T TYPE_IPPROTECTIONGROUP = new InventoryType_T(_TYPE_IPPROTECTIONGROUP);
	public static final int _TYPE_EPROTECTION = 12;
	public static final InventoryType_T TYPE_EPROTECTION = new InventoryType_T(_TYPE_EPROTECTION);
	public static final int _TYPE_TOPOSUBNETWORKVIEW = 13;
	public static final InventoryType_T TYPE_TOPOSUBNETWORKVIEW = new InventoryType_T(_TYPE_TOPOSUBNETWORKVIEW);
	public static final int _TYPE_TRAFFICTRUNK = 14;
	public static final InventoryType_T TYPE_TRAFFICTRUNK = new InventoryType_T(_TYPE_TRAFFICTRUNK);
	public static final int _TYPE_FDFR = 15;
	public static final InventoryType_T TYPE_FDFR = new InventoryType_T(_TYPE_FDFR);
	public static final int _TYPE_TRAILNETWORKPROTECTION = 16;
	public static final InventoryType_T TYPE_TRAILNETWORKPROTECTION = new InventoryType_T(_TYPE_TRAILNETWORKPROTECTION);
	public int value()
	{
		return value;
	}
	public static InventoryType_T from_int(int value)
	{
		switch (value) {
			case _TYPE_EMS: return TYPE_EMS;
			case _TYPE_MANAGEDELEMENT: return TYPE_MANAGEDELEMENT;
			case _TYPE_RACK: return TYPE_RACK;
			case _TYPE_SHELF: return TYPE_SHELF;
			case _TYPE_SLOT: return TYPE_SLOT;
			case _TYPE_EQUIPMENT: return TYPE_EQUIPMENT;
			case _TYPE_PTP: return TYPE_PTP;
			case _TYPE_IPCROSSCONNECTION: return TYPE_IPCROSSCONNECTION;
			case _TYPE_TOPOLOGICALLINK: return TYPE_TOPOLOGICALLINK;
			case _TYPE_MFDFR: return TYPE_MFDFR;
			case _TYPE_TCPROFILE: return TYPE_TCPROFILE;
			case _TYPE_IPPROTECTIONGROUP: return TYPE_IPPROTECTIONGROUP;
			case _TYPE_EPROTECTION: return TYPE_EPROTECTION;
			case _TYPE_TOPOSUBNETWORKVIEW: return TYPE_TOPOSUBNETWORKVIEW;
			case _TYPE_TRAFFICTRUNK: return TYPE_TRAFFICTRUNK;
			case _TYPE_FDFR: return TYPE_FDFR;
			case _TYPE_TRAILNETWORKPROTECTION: return TYPE_TRAILNETWORKPROTECTION;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected InventoryType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
