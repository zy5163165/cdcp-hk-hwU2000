package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "IPProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class IPProtectionGroupIterator_IPOATie
	extends IPProtectionGroupIterator_IPOA
{
	private IPProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public IPProtectionGroupIterator_IPOATie(IPProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public IPProtectionGroupIterator_IPOATie(IPProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.IPProtectionGroupIterator_I _this()
	{
		return protection.IPProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public protection.IPProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.IPProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public IPProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPProtectionGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, protection.IPProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pgpList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
