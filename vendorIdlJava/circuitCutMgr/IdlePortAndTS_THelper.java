package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "IdlePortAndTS_T"
 *	@author JacORB IDL compiler 
 */

public final class IdlePortAndTS_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.IdlePortAndTS_THelper.id(),"IdlePortAndTS_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("slotID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("portID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("slotNo", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("SlotInfoList", circuitCutMgr.TimeSlotInfoList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.IdlePortAndTS_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.IdlePortAndTS_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/IdlePortAndTS_T:1.0";
	}
	public static circuitCutMgr.IdlePortAndTS_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.IdlePortAndTS_T result = new circuitCutMgr.IdlePortAndTS_T();
		result.slotID=in.read_ulong();
		result.portID=in.read_ulong();
		result.slotNo=in.read_ulong();
		result.SlotInfoList = circuitCutMgr.TimeSlotInfoList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.IdlePortAndTS_T s)
	{
		out.write_ulong(s.slotID);
		out.write_ulong(s.portID);
		out.write_ulong(s.slotNo);
		circuitCutMgr.TimeSlotInfoList_THelper.write(out,s.SlotInfoList);
	}
}
