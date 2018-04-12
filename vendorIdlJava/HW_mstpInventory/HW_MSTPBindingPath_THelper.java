package HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "HW_MSTPBindingPath_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MSTPBindingPath_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpInventory.HW_MSTPBindingPath_THelper.id(),"HW_MSTPBindingPath_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("allPathList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("usedPathList", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.HW_MSTPBindingPath_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpInventory.HW_MSTPBindingPath_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPBindingPath_T:1.0";
	}
	public static HW_mstpInventory.HW_MSTPBindingPath_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpInventory.HW_MSTPBindingPath_T result = new HW_mstpInventory.HW_MSTPBindingPath_T();
		result.direction=terminationPoint.Directionality_THelper.read(in);
		result.allPathList = globaldefs.NamingAttributesList_THelper.read(in);
		result.usedPathList = globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpInventory.HW_MSTPBindingPath_T s)
	{
		terminationPoint.Directionality_THelper.write(out,s.direction);
		globaldefs.NamingAttributesList_THelper.write(out,s.allPathList);
		globaldefs.NamingAttributesList_THelper.write(out,s.usedPathList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
