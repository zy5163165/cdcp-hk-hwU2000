package HW_mstpProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_AtmProtectGroupIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_AtmProtectGroupIterator_IPOATie
	extends HW_AtmProtectGroupIterator_IPOA
{
	private HW_AtmProtectGroupIterator_IOperations _delegate;

	private POA _poa;
	public HW_AtmProtectGroupIterator_IPOATie(HW_AtmProtectGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_AtmProtectGroupIterator_IPOATie(HW_AtmProtectGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_mstpProtection.HW_AtmProtectGroupIterator_I _this()
	{
		return HW_mstpProtection.HW_AtmProtectGroupIterator_IHelper.narrow(_this_object());
	}
	public HW_mstpProtection.HW_AtmProtectGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_mstpProtection.HW_AtmProtectGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_AtmProtectGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_AtmProtectGroupIterator_IOperations delegate)
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

	public boolean next_n(int how_many, HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,atmPGList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
