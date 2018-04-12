package HW_mstpService;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_AtmServiceIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_AtmServiceIterator_IPOATie
	extends HW_AtmServiceIterator_IPOA
{
	private HW_AtmServiceIterator_IOperations _delegate;

	private POA _poa;
	public HW_AtmServiceIterator_IPOATie(HW_AtmServiceIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_AtmServiceIterator_IPOATie(HW_AtmServiceIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpService.HW_AtmServiceIterator_I _this()
	{
		return HW_mstpService.HW_AtmServiceIterator_IHelper.narrow(_this_object());
	}
	public HW_mstpService.HW_AtmServiceIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpService.HW_AtmServiceIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_AtmServiceIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_AtmServiceIterator_IOperations delegate)
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

	public boolean next_n(int how_many, HW_mstpService.HW_AtmServiceList_THolder serviceList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,serviceList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
