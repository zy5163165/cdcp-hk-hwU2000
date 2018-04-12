package circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ConnectivityNodePairIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ConnectivityNodePairIterator_IPOATie
	extends ConnectivityNodePairIterator_IPOA
{
	private ConnectivityNodePairIterator_IOperations _delegate;

	private POA _poa;
	public ConnectivityNodePairIterator_IPOATie(ConnectivityNodePairIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ConnectivityNodePairIterator_IPOATie(ConnectivityNodePairIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public circuitCutMgr.ConnectivityNodePairIterator_I _this()
	{
		return circuitCutMgr.ConnectivityNodePairIterator_IHelper.narrow(_this_object());
	}
	public circuitCutMgr.ConnectivityNodePairIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return circuitCutMgr.ConnectivityNodePairIterator_IHelper.narrow(_this_object(orb));
	}
	public ConnectivityNodePairIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ConnectivityNodePairIterator_IOperations delegate)
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
	public boolean next_n(int how_many, circuitCutMgr.ConnectivityNodePairList_THolder meList) throws circuitCutMgr.ProcessingFailureException
	{
		return _delegate.next_n(how_many,meList);
	}

	public int getLength() throws circuitCutMgr.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws circuitCutMgr.ProcessingFailureException
	{
_delegate.destroy();
	}

}
