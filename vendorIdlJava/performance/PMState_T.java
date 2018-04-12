package performance;

/**
 *	Generated from IDL definition of struct "PMState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMState_T(){}
	public globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity;
	public performance.PMEventState_T[] pmEventStateList;
	public PMState_T(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, performance.PMEventState_T[] pmEventStateList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.pmEventStateList = pmEventStateList;
	}
}
