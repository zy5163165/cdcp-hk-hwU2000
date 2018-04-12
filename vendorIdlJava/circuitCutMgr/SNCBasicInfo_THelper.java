package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "SNCBasicInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCBasicInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.SNCBasicInfo_THelper.id(),"SNCBasicInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rate", circuitCutMgr.SNCRate_THelper.type(), null),new org.omg.CORBA.StructMember("aEnd", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", circuitCutMgr.TPInfo_THelper.type(), null),new org.omg.CORBA.StructMember("SNCType", circuitCutMgr.SNCTypeQualifier_THelper.type(), null),new org.omg.CORBA.StructMember("direction", circuitCutMgr.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", circuitCutMgr.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.SNCBasicInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.SNCBasicInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCBasicInfo_T:1.0";
	}
	public static circuitCutMgr.SNCBasicInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.SNCBasicInfo_T result = new circuitCutMgr.SNCBasicInfo_T();
		result.nativeEMSName=in.read_string();
		result.rate=circuitCutMgr.SNCRate_THelper.read(in);
		result.aEnd=circuitCutMgr.TPInfo_THelper.read(in);
		result.zEnd=circuitCutMgr.TPInfo_THelper.read(in);
		result.SNCType=circuitCutMgr.SNCTypeQualifier_THelper.read(in);
		result.direction=circuitCutMgr.ConnectionDirection_THelper.read(in);
		result.additionalInfo = circuitCutMgr.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.SNCBasicInfo_T s)
	{
		out.write_string(s.nativeEMSName);
		circuitCutMgr.SNCRate_THelper.write(out,s.rate);
		circuitCutMgr.TPInfo_THelper.write(out,s.aEnd);
		circuitCutMgr.TPInfo_THelper.write(out,s.zEnd);
		circuitCutMgr.SNCTypeQualifier_THelper.write(out,s.SNCType);
		circuitCutMgr.ConnectionDirection_THelper.write(out,s.direction);
		circuitCutMgr.NVSList_THelper.write(out,s.additionalInfo);
	}
}
