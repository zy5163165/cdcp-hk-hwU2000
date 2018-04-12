package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "PortInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class PortInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("slotID", circuitCutMgr.ObjectIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.PortInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.PortInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/PortInfo_T:1.0";
	}
	public static circuitCutMgr.PortInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.PortInfo_T result = new circuitCutMgr.PortInfo_T();
		result.portID=in.read_ulong();
		result.slotID=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.PortInfo_T s)
	{
		out.write_ulong(s.portID);
		out.write_ulong(s.slotID);
	}
}
