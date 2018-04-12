package emsSession;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EmsSession_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class EmsSession_IPOATie
	extends EmsSession_IPOA
{
	private EmsSession_IOperations _delegate;

	private POA _poa;
	public EmsSession_IPOATie(EmsSession_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSession_IPOATie(EmsSession_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsSession.EmsSession_I _this()
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object());
	}
	public emsSession.EmsSession_I _this(org.omg.CORBA.ORB orb)
	{
		return emsSession.EmsSession_IHelper.narrow(_this_object(orb));
	}
	public EmsSession_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSession_IOperations delegate)
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
	public session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void ping()
	{
_delegate.ping();
	}

	public void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws globaldefs.ProcessingFailureException
	{
_delegate.getEventChannel(eventChannel);
	}

	public void getManager(java.lang.String managerName, common.Common_IHolder managerInterface) throws globaldefs.ProcessingFailureException
	{
_delegate.getManager(managerName,managerInterface);
	}

	public void getSupportedManagers(emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws globaldefs.ProcessingFailureException
	{
_delegate.getSupportedManagers(supportedManagerList);
	}

	public void endSession()
	{
_delegate.endSession();
	}

}
