package HW_vpnManager;


/**
 *	Generated from IDL definition of struct "MultipointServiceAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class MultipointServiceAttr_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(HW_vpnManager.MultipointServiceAttr_THelper.id(),"MultipointServiceAttr_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("paraList", globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("staticMacList", HW_vpnManager.StaticMacAddressList_THelper.type(), null),new org.omg.CORBA.StructMember("shgList", HW_vpnManager.SplitHorizonGroupAttrList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final HW_vpnManager.MultipointServiceAttr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static HW_vpnManager.MultipointServiceAttr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/MultipointServiceAttr_T:1.0";
	}
	public static HW_vpnManager.MultipointServiceAttr_T read (final org.omg.CORBA.portable.InputStream in)
	{
		HW_vpnManager.MultipointServiceAttr_T result = new HW_vpnManager.MultipointServiceAttr_T();
		result.paraList = globaldefs.NVSList_THelper.read(in);
		result.staticMacList = HW_vpnManager.StaticMacAddressList_THelper.read(in);
		result.shgList = HW_vpnManager.SplitHorizonGroupAttrList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_vpnManager.MultipointServiceAttr_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.paraList);
		HW_vpnManager.StaticMacAddressList_THelper.write(out,s.staticMacList);
		HW_vpnManager.SplitHorizonGroupAttrList_THelper.write(out,s.shgList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
