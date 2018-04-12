package maintenanceOps;

/**
 *	Generated from IDL definition of alias "HW_MaintenanceAssociationList_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenanceAssociationList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, maintenanceOps.HW_MaintenanceAssociation_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static maintenanceOps.HW_MaintenanceAssociation_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(maintenanceOps.HW_MaintenanceAssociationList_THelper.id(), "HW_MaintenanceAssociationList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, maintenanceOps.HW_MaintenanceAssociation_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/HW_MaintenanceAssociationList_T:1.0";
	}
	public static maintenanceOps.HW_MaintenanceAssociation_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		maintenanceOps.HW_MaintenanceAssociation_T[] _result;
		int _l_result86 = _in.read_long();
		_result = new maintenanceOps.HW_MaintenanceAssociation_T[_l_result86];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=maintenanceOps.HW_MaintenanceAssociation_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, maintenanceOps.HW_MaintenanceAssociation_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			maintenanceOps.HW_MaintenanceAssociation_THelper.write(_out,_s[i]);
		}

	}
}
