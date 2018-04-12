package guiCutThrough;

/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GCTProfileInfo_T(){}
	public guiCutThrough.ServerLaunchCapability_T serverLaunchCapability;
	public java.lang.String gctHostname = "";
	public java.lang.String emsGctPlatform = "";
	public guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList;
	public GCTProfileInfo_T(guiCutThrough.ServerLaunchCapability_T serverLaunchCapability, java.lang.String gctHostname, java.lang.String emsGctPlatform, guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList)
	{
		this.serverLaunchCapability = serverLaunchCapability;
		this.gctHostname = gctHostname;
		this.emsGctPlatform = emsGctPlatform;
		this.guiCutThroughDataList = guiCutThroughDataList;
	}
}
