package circuitCutMgr;

/**
 *	Generated from IDL definition of struct "CutAndPrefabSNCPair_T"
 *	@author JacORB IDL compiler 
 */

public final class CutAndPrefabSNCPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CutAndPrefabSNCPair_T(){}
	public circuitCutMgr.SNCBasicInfo_T cutSNC;
	public circuitCutMgr.SNCBasicInfo_T prefabSNC;
	public CutAndPrefabSNCPair_T(circuitCutMgr.SNCBasicInfo_T cutSNC, circuitCutMgr.SNCBasicInfo_T prefabSNC)
	{
		this.cutSNC = cutSNC;
		this.prefabSNC = prefabSNC;
	}
}
