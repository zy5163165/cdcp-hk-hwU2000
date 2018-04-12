package topologicalLink;

import java.util.Arrays;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalLink_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public short rate;
	public globaldefs.NameAndStringValue_T[] aEndTP;
	public globaldefs.NameAndStringValue_T[] zEndTP;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, short rate, globaldefs.NameAndStringValue_T[] aEndTP, globaldefs.NameAndStringValue_T[] zEndTP, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TopologicalLink_T [aEndTP=" + Arrays.toString(aEndTP)
				+ ", additionalInfo=" + Arrays.toString(additionalInfo)
				+ ", direction=" + direction + ", name="
				+ Arrays.toString(name) + ", nativeEMSName=" + nativeEMSName
				+ ", owner=" + owner + ", rate=" + rate + ", userLabel="
				+ userLabel + ", zEndTP=" + Arrays.toString(zEndTP) + "]";
	}
}
