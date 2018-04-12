package HW_mstpService;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_EthServiceIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_EthServiceIterator_IPOATie
	extends HW_EthServiceIterator_IPOA
{
	private HW_EthServiceIterator_IOperations _delegate;

	private POA _poa;
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_EthServiceIterator_IPOATie(HW_EthServiceIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpService.HW_EthServiceIterator_I _this()
	{
		return HW_mstpService.HW_EthServiceIterator_IHelper.narrow(_this_object());
	}
	public HW_mstpService.HW_EthServiceIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpService.HW_EthServiceIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_EthServiceIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_EthServiceIterator_IOperations delegate)
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

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, HW_mstpService.HW_EthServiceList_THolder serviceList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,serviceList);
	}

}
