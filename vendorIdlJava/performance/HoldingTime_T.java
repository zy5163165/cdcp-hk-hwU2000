package performance;

/**
 *	Generated from IDL definition of struct "HoldingTime_T"
 *	@author JacORB IDL compiler 
 */

public final class HoldingTime_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HoldingTime_T(){}
	public short storeTime24hr;
	public short storeTime15min;
	public HoldingTime_T(short storeTime24hr, short storeTime15min)
	{
		this.storeTime24hr = storeTime24hr;
		this.storeTime15min = storeTime15min;
	}
}
