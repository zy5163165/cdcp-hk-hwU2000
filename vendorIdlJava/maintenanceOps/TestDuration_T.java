package maintenanceOps;

/**
 *	Generated from IDL definition of struct "TestDuration_T"
 *	@author JacORB IDL compiler 
 */

public final class TestDuration_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TestDuration_T(){}
	public int value;
	public java.lang.String unit = "";
	public TestDuration_T(int value, java.lang.String unit)
	{
		this.value = value;
		this.unit = unit;
	}
}
