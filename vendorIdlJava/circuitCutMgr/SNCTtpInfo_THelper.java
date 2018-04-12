package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "SNCTtpInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCTtpInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.SNCTtpInfo_THelper.id(),"SNCTtpInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", circuitCutMgr.ObjectIDHelper.type(), null),new org.omg.CORBA.StructMember("tpDirection", circuitCutMgr.TtpDirectionHelper.type(), null),new org.omg.CORBA.StructMember("rate", circuitCutMgr.SNCRate_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.SNCTtpInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.SNCTtpInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCTtpInfo_T:1.0";
	}
	public static circuitCutMgr.SNCTtpInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.SNCTtpInfo_T result = new circuitCutMgr.SNCTtpInfo_T();
		result.NEID=in.read_ulong();
		result.tpDirection=circuitCutMgr.TtpDirectionHelper.read(in);
		result.rate=circuitCutMgr.SNCRate_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.SNCTtpInfo_T s)
	{
		out.write_ulong(s.NEID);
		circuitCutMgr.TtpDirectionHelper.write(out,s.tpDirection);
		circuitCutMgr.SNCRate_THelper.write(out,s.rate);
	}
}
