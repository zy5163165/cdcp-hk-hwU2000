package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EProtectionGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class EProtectionGroupIterator_IPOATie
	extends EProtectionGroupIterator_IPOA
{
	private EProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public EProtectionGroupIterator_IPOATie(EProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EProtectionGroupIterator_IPOATie(EProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.EProtectionGroupIterator_I _this()
	{
		return protection.EProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public protection.EProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.EProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public EProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EProtectionGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, protection.EProtectionGroupList_THolder ePGPList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ePGPList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
