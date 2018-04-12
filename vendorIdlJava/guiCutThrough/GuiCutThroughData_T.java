package guiCutThrough;

/**
 *	Generated from IDL definition of struct "GuiCutThroughData_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GuiCutThroughData_T(){}
	public java.lang.String gctScope = "";
	public java.lang.String gctContext = "";
	public java.lang.String gctCommand = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public GuiCutThroughData_T(java.lang.String gctScope, java.lang.String gctContext, java.lang.String gctCommand, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.gctScope = gctScope;
		this.gctContext = gctContext;
		this.gctCommand = gctCommand;
		this.additionalInfo = additionalInfo;
	}
}
