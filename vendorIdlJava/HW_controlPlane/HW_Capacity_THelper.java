package HW_controlPlane;


/**
 *	Generated from IDL definition of struct "HW_Capacity_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_Capacity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_controlPlane.HW_Capacity_THelper.id(),"HW_Capacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("unit", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("Bandwidth", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_controlPlane.HW_Capacity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_controlPlane.HW_Capacity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_controlPlane/HW_Capacity_T:1.0";
	}
	public static HW_controlPlane.HW_Capacity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_controlPlane.HW_Capacity_T result = new HW_controlPlane.HW_Capacity_T();
		result.unit=in.read_short();
		result.Bandwidth=in.read_ulong();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_controlPlane.HW_Capacity_T s)
	{
		out.write_short(s.unit);
		out.write_ulong(s.Bandwidth);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
