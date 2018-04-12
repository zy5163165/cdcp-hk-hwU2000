package HW_mstpInventory;


/**
 *	Generated from IDL definition of struct "HW_LAGBranchPort_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_LAGBranchPort_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_mstpInventory.HW_LAGBranchPort_THelper.id(),"HW_LAGBranchPort_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("branchPortName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("branchPortParaList", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_mstpInventory.HW_LAGBranchPort_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_mstpInventory.HW_LAGBranchPort_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_LAGBranchPort_T:1.0";
	}
	public static HW_mstpInventory.HW_LAGBranchPort_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_mstpInventory.HW_LAGBranchPort_T result = new HW_mstpInventory.HW_LAGBranchPort_T();
		result.branchPortName = globaldefs.NVSList_THelper.read(in);
		result.branchPortParaList = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_mstpInventory.HW_LAGBranchPort_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.branchPortName);
		globaldefs.NVSList_THelper.write(out,s.branchPortParaList);
	}
}
