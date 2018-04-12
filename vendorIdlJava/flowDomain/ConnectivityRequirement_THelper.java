package flowDomain;
/**
 *	Generated from IDL definition of enum "ConnectivityRequirement_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectivityRequirement_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(flowDomain.ConnectivityRequirement_THelper.id(),"ConnectivityRequirement_T",new String[]{"CR_IGNORE","CR_REJECT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final flowDomain.ConnectivityRequirement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static flowDomain.ConnectivityRequirement_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/ConnectivityRequirement_T:1.0";
	}
	public static ConnectivityRequirement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ConnectivityRequirement_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ConnectivityRequirement_T s)
	{
		out.write_long(s.value());
	}
}
