package guiCutThrough;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class GuiCutThroughMgr_IPOATie
	extends GuiCutThroughMgr_IPOA
{
	private GuiCutThroughMgr_IOperations _delegate;

	private POA _poa;
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GuiCutThroughMgr_IPOATie(GuiCutThroughMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public guiCutThrough.GuiCutThroughMgr_I _this()
	{
		return guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object());
	}
	public guiCutThrough.GuiCutThroughMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return guiCutThrough.GuiCutThroughMgr_IHelper.narrow(_this_object(orb));
	}
	public GuiCutThroughMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GuiCutThroughMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void launchGCT(globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, globaldefs.NVSList_THolder additionalOutputInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.launchGCT(objectName,gctContext,userInfo,displayAddress,additionalInputInfo,closingEnabled,additionalOutputInfo);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void destroyGCT(java.lang.String displayAddress) throws globaldefs.ProcessingFailureException
	{
_delegate.destroyGCT(displayAddress);
	}

	public void getGCTProfileInfo(guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getGCTProfileInfo(gctProfileInfo);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
