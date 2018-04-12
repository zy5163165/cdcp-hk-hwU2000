package circuitCutMgr;


/**
 *	Generated from IDL interface "CircuitCutMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class _CircuitCutMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements circuitCutMgr.CircuitCutMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/circuitCutMgr/CircuitCutMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = circuitCutMgr.CircuitCutMgr_IOperations.class;
	public void setPrefabSNC(circuitCutMgr.SNCBasicInfo_T prefabSNCInfo, circuitCutMgr.SNCServiceRoute_T prefabSNCServiceRoute) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setPrefabSNC", true);
				circuitCutMgr.SNCBasicInfo_THelper.write(_os,prefabSNCInfo);
				circuitCutMgr.SNCServiceRoute_THelper.write(_os,prefabSNCServiceRoute);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setPrefabSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.setPrefabSNC(prefabSNCInfo,prefabSNCServiceRoute);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllIdleServiceTrailAndTS(circuitCutMgr.ConnectivityNodePair_T[] serviceTrailEndPointList, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ServiceTrailList_THolder idleSNCServiceTrailList) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllIdleServiceTrailAndTS", true);
				circuitCutMgr.ConnectivityNodePairList_THelper.write(_os,serviceTrailEndPointList);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,deleteCutSNCList);
				circuitCutMgr.SNCRate_THelper.write(_os,rate);
				_is = _invoke(_os);
				idleSNCServiceTrailList.value = circuitCutMgr.ServiceTrailList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllIdleServiceTrailAndTS", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllIdleServiceTrailAndTS(serviceTrailEndPointList,deleteCutSNCList,rate,idleSNCServiceTrailList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void calcuPrefabSNCRoute(circuitCutMgr.PrefabSNCCreateData_T createPrefabSNC, circuitCutMgr.SNCBasicInfo_T[] deleteCutSNCList, int srcSncpNEID, int snkSncpNEID, boolean isCalcSNCP, circuitCutMgr.SNCServiceRouteList_THolder normalOrSncpRoute) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "calcuPrefabSNCRoute", true);
				circuitCutMgr.PrefabSNCCreateData_THelper.write(_os,createPrefabSNC);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,deleteCutSNCList);
				_os.write_ulong(srcSncpNEID);
				_os.write_ulong(snkSncpNEID);
				_os.write_boolean(isCalcSNCP);
				circuitCutMgr.SNCServiceRouteList_THelper.write(_os,normalOrSncpRoute.value);
				_is = _invoke(_os);
				normalOrSncpRoute.value = circuitCutMgr.SNCServiceRouteList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "calcuPrefabSNCRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.calcuPrefabSNCRoute(createPrefabSNC,deleteCutSNCList,srcSncpNEID,snkSncpNEID,isCalcSNCP,normalOrSncpRoute);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCServiceRoute(circuitCutMgr.SNCBasicInfo_T sncBasicInfo, circuitCutMgr.SNCServiceRoute_THolder sncServiceRoute) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCServiceRoute", true);
				circuitCutMgr.SNCBasicInfo_THelper.write(_os,sncBasicInfo);
				_is = _invoke(_os);
				sncServiceRoute.value = circuitCutMgr.SNCServiceRoute_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCServiceRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCServiceRoute(sncBasicInfo,sncServiceRoute);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deletePrefabSNCs(circuitCutMgr.SNCBasicInfo_T[] delPrefabSNCInfoList, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deletePrefabSNCs", true);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,delPrefabSNCInfoList);
				_is = _invoke(_os);
				errorReasonList.value = circuitCutMgr.ErrorReasonList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deletePrefabSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.deletePrefabSNCs(delPrefabSNCInfoList,errorReasonList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getServiceTrailViewBySNCRate(int how_many, circuitCutMgr.SNCRate_T rate, circuitCutMgr.ConnectivityNodePairList_THolder connectivityNodePairList, circuitCutMgr.ConnectivityNodePairIterator_IHolder ConnectivityNodePairListIt) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getServiceTrailViewBySNCRate", true);
				_os.write_ulong(how_many);
				circuitCutMgr.SNCRate_THelper.write(_os,rate);
				_is = _invoke(_os);
				connectivityNodePairList.value = circuitCutMgr.ConnectivityNodePairList_THelper.read(_is);
				ConnectivityNodePairListIt.value = circuitCutMgr.ConnectivityNodePairIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getServiceTrailViewBySNCRate", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getServiceTrailViewBySNCRate(how_many,rate,connectivityNodePairList,ConnectivityNodePairListIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllIdlePortAndTS(circuitCutMgr.SNCTtpInfo_T sncTtPInfo, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.IdlePortAndTSList_THolder idleportAndTSList) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllIdlePortAndTS", true);
				circuitCutMgr.SNCTtpInfo_THelper.write(_os,sncTtPInfo);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,cutSNCList);
				_is = _invoke(_os);
				idleportAndTSList.value = circuitCutMgr.IdlePortAndTSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllIdlePortAndTS", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllIdlePortAndTS(sncTtPInfo,cutSNCList,idleportAndTSList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopoSubnetworkViewInfo(int how_many, circuitCutMgr.NodeList_THolder nodeList, circuitCutMgr.NodeIterator_IHolder NodeIt) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopoSubnetworkViewInfo", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nodeList.value = circuitCutMgr.NodeList_THelper.read(_is);
				NodeIt.value = circuitCutMgr.NodeIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopoSubnetworkViewInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createPrefabSNCsAndDelCutSNCs(circuitCutMgr.SNCBasicInfo_T[] prefabSNCList, circuitCutMgr.SNCBasicInfo_T[] cutSNCList, circuitCutMgr.CutAndPrefabSNCPair_T[] cutAndPrefabSNCList, org.omg.CORBA.IntHolder result, circuitCutMgr.ErrorReasonList_THolder errorReasonList) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createPrefabSNCsAndDelCutSNCs", true);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,prefabSNCList);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,cutSNCList);
				circuitCutMgr.CutAndPrefabSNCPairList_THelper.write(_os,cutAndPrefabSNCList);
				_is = _invoke(_os);
				result.value = _is.read_ulong();
				errorReasonList.value = circuitCutMgr.ErrorReasonList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createPrefabSNCsAndDelCutSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.createPrefabSNCsAndDelCutSNCs(prefabSNCList,cutSNCList,cutAndPrefabSNCList,result,errorReasonList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void checkPrefabAndCutSNCs(circuitCutMgr.SNCBasicInfo_T[] checkPrefabSNCList, circuitCutMgr.SNCBasicInfo_T[] checkCutSNCList, boolean isAccordCheck, circuitCutMgr.ErrorReasonList_THolder errorReasons) throws circuitCutMgr.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "checkPrefabAndCutSNCs", true);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,checkPrefabSNCList);
				circuitCutMgr.SNCBasicInfoList_THelper.write(_os,checkCutSNCList);
				_os.write_boolean(isAccordCheck);
				_is = _invoke(_os);
				errorReasons.value = circuitCutMgr.ErrorReasonList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/circuitCutMgr/ProcessingFailureException:1.0"))
				{
					throw circuitCutMgr.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "checkPrefabAndCutSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CircuitCutMgr_IOperations _localServant = (CircuitCutMgr_IOperations)_so.servant;
			try
			{
			_localServant.checkPrefabAndCutSNCs(checkPrefabSNCList,checkCutSNCList,isAccordCheck,errorReasons);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
