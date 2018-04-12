package HW_controlPlane;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_SnppLinkIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_SnppLinkIterator_IPOATie
	extends HW_SnppLinkIterator_IPOA
{
	private HW_SnppLinkIterator_IOperations _delegate;

	private POA _poa;
	public HW_SnppLinkIterator_IPOATie(HW_SnppLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_SnppLinkIterator_IPOATie(HW_SnppLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_controlPlane.HW_SnppLinkIterator_I _this()
	{
		return HW_controlPlane.HW_SnppLinkIterator_IHelper.narrow(_this_object());
	}
	public HW_controlPlane.HW_SnppLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_controlPlane.HW_SnppLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_SnppLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_SnppLinkIterator_IOperations delegate)
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

	public boolean next_n(int how_many, HW_controlPlane.HW_SnppLinkList_THolder snppLinkList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,snppLinkList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
