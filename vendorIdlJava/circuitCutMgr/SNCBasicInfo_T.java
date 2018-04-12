package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "SNCBasicInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCBasicInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCBasicInfo_T(){}
	public java.lang.String nativeEMSName = "";
	public circuitCutMgr.SNCRate_T rate;
	public circuitCutMgr.TPInfo_T aEnd;
	public circuitCutMgr.TPInfo_T zEnd;
	public circuitCutMgr.SNCTypeQualifier_T SNCType;
	public circuitCutMgr.ConnectionDirection_T direction;
	public circuitCutMgr.NameAndStringValue_T[] additionalInfo;
	public SNCBasicInfo_T(java.lang.String nativeEMSName, circuitCutMgr.SNCRate_T rate, circuitCutMgr.TPInfo_T aEnd, circuitCutMgr.TPInfo_T zEnd, circuitCutMgr.SNCTypeQualifier_T SNCType, circuitCutMgr.ConnectionDirection_T direction, circuitCutMgr.NameAndStringValue_T[] additionalInfo)
	{
		this.nativeEMSName = nativeEMSName;
		this.rate = rate;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.SNCType = SNCType;
		this.direction = direction;
		this.additionalInfo = additionalInfo;
	}
}
