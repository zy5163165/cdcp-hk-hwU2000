package circuitCutMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "NodeIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class NodeIterator_IPOATie
	extends NodeIterator_IPOA
{
	private NodeIterator_IOperations _delegate;

	private POA _poa;
	public NodeIterator_IPOATie(NodeIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public NodeIterator_IPOATie(NodeIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public circuitCutMgr.NodeIterator_I _this()
	{
		return circuitCutMgr.NodeIterator_IHelper.narrow(_this_object());
	}
	public circuitCutMgr.NodeIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return circuitCutMgr.NodeIterator_IHelper.narrow(_this_object(orb));
	}
	public NodeIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NodeIterator_IOperations delegate)
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
	public int getLength() throws circuitCutMgr.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws circuitCutMgr.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, circuitCutMgr.NodeList_THolder nodeList) throws circuitCutMgr.ProcessingFailureException
	{
		return _delegate.next_n(how_many,nodeList);
	}

}
