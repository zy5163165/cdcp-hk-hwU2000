package maintenanceOps;

/**
 *	Generated from IDL definition of alias "CurrentMaintenanceOperationList_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperationList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, maintenanceOps.CurrentMaintenanceOperation_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static maintenanceOps.CurrentMaintenanceOperation_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(maintenanceOps.CurrentMaintenanceOperationList_THelper.id(), "CurrentMaintenanceOperationList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, maintenanceOps.CurrentMaintenanceOperation_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/CurrentMaintenanceOperationList_T:1.0";
	}
	public static maintenanceOps.CurrentMaintenanceOperation_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		maintenanceOps.CurrentMaintenanceOperation_T[] _result;
		int _l_result81 = _in.read_long();
		_result = new maintenanceOps.CurrentMaintenanceOperation_T[_l_result81];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=maintenanceOps.CurrentMaintenanceOperation_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, maintenanceOps.CurrentMaintenanceOperation_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			maintenanceOps.CurrentMaintenanceOperation_THelper.write(_out,_s[i]);
		}

	}
}
