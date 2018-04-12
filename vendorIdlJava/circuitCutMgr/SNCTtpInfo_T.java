package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCTtpInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCTtpInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCTtpInfo_T(){}
	public int NEID;
	public circuitCutMgr.TtpDirection tpDirection;
	public circuitCutMgr.SNCRate_T rate;
	public SNCTtpInfo_T(int NEID, circuitCutMgr.TtpDirection tpDirection, circuitCutMgr.SNCRate_T rate)
	{
		this.NEID = NEID;
		this.tpDirection = tpDirection;
		this.rate = rate;
	}
}
