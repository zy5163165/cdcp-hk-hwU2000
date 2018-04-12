package HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class FDFrIterator_IPOATie
	extends FDFrIterator_IPOA
{
	private FDFrIterator_IOperations _delegate;

	private POA _poa;
	public FDFrIterator_IPOATie(FDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FDFrIterator_IPOATie(FDFrIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_vpnManager.FDFrIterator_I _this()
	{
		return HW_vpnManager.FDFrIterator_IHelper.narrow(_this_object());
	}
	public HW_vpnManager.FDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_vpnManager.FDFrIterator_IHelper.narrow(_this_object(orb));
	}
	public FDFrIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FDFrIterator_IOperations delegate)
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

	public boolean next_n(int how_many, HW_vpnManager.FlowDomainFragmentList_THolder fdfrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,fdfrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
