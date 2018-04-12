package TopoManagementManager;

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
	public TopoManagementManager.NodeIterator_I _this()
	{
		return TopoManagementManager.NodeIterator_IHelper.narrow(_this_object());
	}
	public TopoManagementManager.NodeIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return TopoManagementManager.NodeIterator_IHelper.narrow(_this_object(orb));
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
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, TopoManagementManager.NodeList_THolder nodeList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,nodeList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
