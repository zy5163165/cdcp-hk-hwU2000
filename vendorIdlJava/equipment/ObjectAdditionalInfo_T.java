package equipment;

/**
 *	Generated from IDL definition of struct "ObjectAdditionalInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAdditionalInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ObjectAdditionalInfo_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ObjectAdditionalInfo_T(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.additionalInfo = additionalInfo;
	}
}
