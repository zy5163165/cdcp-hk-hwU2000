package trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_TCProfileIterator_IPOATie
	extends HW_TCProfileIterator_IPOA
{
	private HW_TCProfileIterator_IOperations _delegate;

	private POA _poa;
	public HW_TCProfileIterator_IPOATie(HW_TCProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_TCProfileIterator_IPOATie(HW_TCProfileIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trafficConditioningProfile.HW_TCProfileIterator_I _this()
	{
		return trafficConditioningProfile.HW_TCProfileIterator_IHelper.narrow(_this_object());
	}
	public trafficConditioningProfile.HW_TCProfileIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficConditioningProfile.HW_TCProfileIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_TCProfileIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_TCProfileIterator_IOperations delegate)
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

	public boolean next_n(int how_many, trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tcProfileList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
