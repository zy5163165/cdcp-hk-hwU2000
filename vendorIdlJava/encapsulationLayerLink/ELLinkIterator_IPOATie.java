package encapsulationLayerLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ELLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class ELLinkIterator_IPOATie
	extends ELLinkIterator_IPOA
{
	private ELLinkIterator_IOperations _delegate;

	private POA _poa;
	public ELLinkIterator_IPOATie(ELLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ELLinkIterator_IPOATie(ELLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public encapsulationLayerLink.ELLinkIterator_I _this()
	{
		return encapsulationLayerLink.ELLinkIterator_IHelper.narrow(_this_object());
	}
	public encapsulationLayerLink.ELLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return encapsulationLayerLink.ELLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public ELLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ELLinkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, encapsulationLayerLink.ELLinkList_THolder ellList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,ellList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
