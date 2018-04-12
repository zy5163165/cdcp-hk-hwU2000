package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "PrefabSNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class PrefabSNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PrefabSNCCreateData_T(){}
	public circuitCutMgr.ConnectionDirection_T direction;
	public circuitCutMgr.SNCRate_T rate;
	public circuitCutMgr.ServiceLimit_T[] serviceTrailInclusions;
	public int[] neInclusions;
	public int[] neExclusions;
	public circuitCutMgr.TPInfo_T[] aEndList;
	public circuitCutMgr.TPInfo_T[] zEndList;
	public PrefabSNCCreateData_T(circuitCutMgr.ConnectionDirection_T direction, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ServiceLimit_T[] serviceTrailInclusions, int[] neInclusions, int[] neExclusions, circuitCutMgr.TPInfo_T[] aEndList, circuitCutMgr.TPInfo_T[] zEndList)
	{
		this.direction = direction;
		this.rate = rate;
		this.serviceTrailInclusions = serviceTrailInclusions;
		this.neInclusions = neInclusions;
		this.neExclusions = neExclusions;
		this.aEndList = aEndList;
		this.zEndList = zEndList;
	}
}
