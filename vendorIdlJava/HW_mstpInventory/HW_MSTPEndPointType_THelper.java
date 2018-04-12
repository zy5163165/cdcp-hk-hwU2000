package HW_mstpInventory;
/**
 *	Generated from IDL definition of enum "HW_MSTPEndPointType_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPEndPointType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(HW_mstpInventory.HW_MSTPEndPointType_THelper.id(),"HW_MSTPEndPointType_T",new String[]{"HW_MEPT_NA","HW_MEPT_ATM","HW_MEPT_ATMTRUNK","HW_MEPT_ETH","HW_MEPT_ETHTRUNK","HW_MEPT_LP","HW_MEPT_RPR"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.HW_MSTPEndPointType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpInventory.HW_MSTPEndPointType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPEndPointType_T:1.0";
	}
	public static HW_MSTPEndPointType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_MSTPEndPointType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_MSTPEndPointType_T s)
	{
		out.write_long(s.value());
	}
}
