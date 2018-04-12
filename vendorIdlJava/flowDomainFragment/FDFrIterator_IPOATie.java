package flowDomainFragment;

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
	public flowDomainFragment.FDFrIterator_I _this()
	{
		return flowDomainFragment.FDFrIterator_IHelper.narrow(_this_object());
	}
	public flowDomainFragment.FDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomainFragment.FDFrIterator_IHelper.narrow(_this_object(orb));
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

	public boolean next_n(int how_many, flowDomainFragment.FDFrList_THolder fdfrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,fdfrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
