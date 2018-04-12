package flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetLTTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetLTTestResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetLTTestResult_T(){}
	public java.lang.String oamPointName = "";
	public int hopNumber;
	public boolean result;
	public EthernetLTTestResult_T(java.lang.String oamPointName, int hopNumber, boolean result)
	{
		this.oamPointName = oamPointName;
		this.hopNumber = hopNumber;
		this.result = result;
	}
}
