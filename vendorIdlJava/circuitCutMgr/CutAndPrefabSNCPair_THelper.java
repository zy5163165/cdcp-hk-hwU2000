package circuitCutMgr;


/**
 *	Generated from IDL definition of struct "CutAndPrefabSNCPair_T"
 *	@author JacORB IDL compiler 
 */

public final class CutAndPrefabSNCPair_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(circuitCutMgr.CutAndPrefabSNCPair_THelper.id(),"CutAndPrefabSNCPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("cutSNC", circuitCutMgr.SNCBasicInfo_THelper.type(), null),new org.omg.CORBA.StructMember("prefabSNC", circuitCutMgr.SNCBasicInfo_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final circuitCutMgr.CutAndPrefabSNCPair_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static circuitCutMgr.CutAndPrefabSNCPair_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/CutAndPrefabSNCPair_T:1.0";
	}
	public static circuitCutMgr.CutAndPrefabSNCPair_T read (final org.omg.CORBA.portable.InputStream in)
	{
		circuitCutMgr.CutAndPrefabSNCPair_T result = new circuitCutMgr.CutAndPrefabSNCPair_T();
		result.cutSNC=circuitCutMgr.SNCBasicInfo_THelper.read(in);
		result.prefabSNC=circuitCutMgr.SNCBasicInfo_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final circuitCutMgr.CutAndPrefabSNCPair_T s)
	{
		circuitCutMgr.SNCBasicInfo_THelper.write(out,s.cutSNC);
		circuitCutMgr.SNCBasicInfo_THelper.write(out,s.prefabSNC);
	}
}
