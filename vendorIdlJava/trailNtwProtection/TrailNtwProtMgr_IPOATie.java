package trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrailNtwProtMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TrailNtwProtMgr_IPOATie
	extends TrailNtwProtMgr_IPOA
{
	private TrailNtwProtMgr_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trailNtwProtection.TrailNtwProtMgr_I _this()
	{
		return trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object());
	}
	public trailNtwProtection.TrailNtwProtMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object(orb));
	}
	public TrailNtwProtMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtMgr_IOperations delegate)
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
	public void deleteTrailNtwProtection(globaldefs.NameAndStringValue_T[] tnpName, boolean keepPGs, globaldefs.NameAndStringValue_T[] swapTPname, globaldefs.NVSList_THolder additionalInfo, protection.ProtectionGroupList_THolder deletedPGList, trailNtwProtection.TrailNtwProtection_THolder deletedTNP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteTrailNtwProtection(tnpName,keepPGs,swapTPname,additionalInfo,deletedPGList,deletedTNP,errorReason);
	}

	public void createTrailNtwProtection(trailNtwProtection.TrailNtwProtCreateData_T tnpCreateData, trailNtwProtection.TrailNtwProtection_THolder theTNP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.createTrailNtwProtection(tnpCreateData,theTNP,errorReason);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void modifyTrailNtwProtection(globaldefs.NameAndStringValue_T[] tnpName, trailNtwProtection.TrailNtwProtModifyData_T tnpModifyData, trailNtwProtection.TrailNtwProtection_THolder modifiedTNP, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyTrailNtwProtection(tnpName,tnpModifyData,modifiedTNP,errorReason);
	}

	public void performTrailNtwProtectionCommand(protection.ProtectionCommand_T protectionCommand, globaldefs.NameAndStringValue_T[] tnpName, globaldefs.NameAndStringValue_T[] protectionGroupAName, globaldefs.NameAndStringValue_T[] protectionGroupZName, globaldefs.NameAndStringValue_T[][][] workerTrailList, globaldefs.NameAndStringValue_T[][] protectionTrail) throws globaldefs.ProcessingFailureException
	{
_delegate.performTrailNtwProtectionCommand(protectionCommand,tnpName,protectionGroupAName,protectionGroupZName,workerTrailList,protectionTrail);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getTrailNtwProtection(globaldefs.NameAndStringValue_T[] tnpName, trailNtwProtection.TrailNtwProtection_THolder trailNtwProtection) throws globaldefs.ProcessingFailureException
	{
_delegate.getTrailNtwProtection(tnpName,trailNtwProtection);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllTrailNtwProtections(globaldefs.NameAndStringValue_T[] resourceName, int how_many, trailNtwProtection.TrailNtwProtectionList_THolder tnpList, trailNtwProtection.TrailNtwProtectionIterator_IHolder tnpIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTrailNtwProtections(resourceName,how_many,tnpList,tnpIt);
	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

}
