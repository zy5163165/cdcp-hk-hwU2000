package HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "HW_ForwardEndPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_ForwardEndPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpInventory.HW_ForwardEndPoint_THelper.id(),"HW_ForwardEndPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("logicTPName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("paraList", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.HW_ForwardEndPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpInventory.HW_ForwardEndPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_ForwardEndPoint_T:1.0";
	}
	public static HW_mstpInventory.HW_ForwardEndPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpInventory.HW_ForwardEndPoint_T result = new HW_mstpInventory.HW_ForwardEndPoint_T();
		result.logicTPName = globaldefs.NVSList_THelper.read(in);
		result.paraList = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpInventory.HW_ForwardEndPoint_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.logicTPName);
		globaldefs.NVSList_THelper.write(out,s.paraList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
