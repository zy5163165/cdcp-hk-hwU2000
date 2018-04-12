package protection;


/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class ProtectionMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final protection.ProtectionMgr_I s)
	{
			any.insert_Object(s);
	}
	public static protection.ProtectionMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0", "ProtectionMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0";
	}
	public static ProtectionMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final protection.ProtectionMgr_I s)
	{
		_out.write_Object(s);
	}
	public static protection.ProtectionMgr_I narrow(final java.lang.Object obj)
	{
		if (obj instanceof protection.ProtectionMgr_I)
		{
			return (protection.ProtectionMgr_I)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static protection.ProtectionMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (protection.ProtectionMgr_I)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0"))
			{
				protection._ProtectionMgr_IStub stub;
				stub = new protection._ProtectionMgr_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static protection.ProtectionMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (protection.ProtectionMgr_I)obj;
		}
		catch (ClassCastException c)
		{
				protection._ProtectionMgr_IStub stub;
				stub = new protection._ProtectionMgr_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
