package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProtectionSubnetworkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ProtectionSubnetworkIterator_IPOATie
	extends ProtectionSubnetworkIterator_IPOA
{
	private ProtectionSubnetworkIterator_IOperations _delegate;

	private POA _poa;
	public ProtectionSubnetworkIterator_IPOATie(ProtectionSubnetworkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionSubnetworkIterator_IPOATie(ProtectionSubnetworkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.ProtectionSubnetworkIterator_I _this()
	{
		return protection.ProtectionSubnetworkIterator_IHelper.narrow(_this_object());
	}
	public protection.ProtectionSubnetworkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.ProtectionSubnetworkIterator_IHelper.narrow(_this_object(orb));
	}
	public ProtectionSubnetworkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionSubnetworkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, protection.ProtectionSubnetworkList_THolder PGPList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,PGPList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
