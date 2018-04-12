package maintenanceOps;


/**
 *	Generated from IDL definition of struct "PRBSTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestResult_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(maintenanceOps.PRBSTestResult_THelper.id(),"PRBSTestResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("testPara", maintenanceOps.PRBSTestParameter_THelper.type(), null),new org.omg.CORBA.StructMember("startTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("sampleResultList", maintenanceOps.SampleResultList_THelper.type(), null),new org.omg.CORBA.StructMember("totalBitError", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("realDuration", maintenanceOps.TestDuration_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final maintenanceOps.PRBSTestResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static maintenanceOps.PRBSTestResult_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/PRBSTestResult_T:1.0";
	}
	public static maintenanceOps.PRBSTestResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		maintenanceOps.PRBSTestResult_T result = new maintenanceOps.PRBSTestResult_T();
		result.testPara=maintenanceOps.PRBSTestParameter_THelper.read(in);
		result.startTime=in.read_string();
		result.sampleResultList = maintenanceOps.SampleResultList_THelper.read(in);
		result.totalBitError=in.read_ulong();
		result.realDuration=maintenanceOps.TestDuration_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final maintenanceOps.PRBSTestResult_T s)
	{
		maintenanceOps.PRBSTestParameter_THelper.write(out,s.testPara);
		out.write_string(s.startTime);
		maintenanceOps.SampleResultList_THelper.write(out,s.sampleResultList);
		out.write_ulong(s.totalBitError);
		maintenanceOps.TestDuration_THelper.write(out,s.realDuration);
	}
}
