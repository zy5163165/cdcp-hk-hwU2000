package transmissionParameters;

/**
 *	Generated from IDL definition of struct "LayeredParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredParameters_T(){}
	public short layer;
	public globaldefs.NameAndStringValue_T[] transmissionParams;
	public LayeredParameters_T(short layer, globaldefs.NameAndStringValue_T[] transmissionParams)
	{
		this.layer = layer;
		this.transmissionParams = transmissionParams;
	}
}
