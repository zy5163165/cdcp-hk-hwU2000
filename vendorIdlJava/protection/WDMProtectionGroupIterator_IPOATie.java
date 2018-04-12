package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "WDMProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class WDMProtectionGroupIterator_IPOATie
	extends WDMProtectionGroupIterator_IPOA
{
	private WDMProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public WDMProtectionGroupIterator_IPOATie(WDMProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public WDMProtectionGroupIterator_IPOATie(WDMProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.WDMProtectionGroupIterator_I _this()
	{
		return protection.WDMProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public protection.WDMProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.WDMProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public WDMProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(WDMProtectionGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, protection.WDMProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pgpList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
