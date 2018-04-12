package HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "ShapingQueue"
 *	@author JacORB IDL compiler 
 */

public final class ShapingQueueHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpInventory.ShapingQueueHelper.id(),"ShapingQueue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("queueID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("bEnable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("CIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("CBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.ShapingQueue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpInventory.ShapingQueue extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/ShapingQueue:1.0";
	}
	public static HW_mstpInventory.ShapingQueue read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpInventory.ShapingQueue result = new HW_mstpInventory.ShapingQueue();
		result.queueID=in.read_ulong();
		result.bEnable=in.read_boolean();
		result.CIR=in.read_long();
		result.CBS=in.read_long();
		result.EIR=in.read_long();
		result.EBS=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpInventory.ShapingQueue s)
	{
		out.write_ulong(s.queueID);
		out.write_boolean(s.bEnable);
		out.write_long(s.CIR);
		out.write_long(s.CBS);
		out.write_long(s.EIR);
		out.write_long(s.EBS);
	}
}
