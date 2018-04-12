package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "ServiceLimit_T"
 *	@author JacORB IDL compiler 
 */

public final class ServiceLimit_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServiceLimit_T(){}
	public int speciSeriveTrailID;
	public int[] speciTS;
	public int aNe;
	public ServiceLimit_T(int speciSeriveTrailID, int[] speciTS, int aNe)
	{
		this.speciSeriveTrailID = speciSeriveTrailID;
		this.speciTS = speciTS;
		this.aNe = aNe;
	}
}
