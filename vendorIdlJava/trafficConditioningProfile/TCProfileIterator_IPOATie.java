package trafficConditioningProfile;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TCProfileIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TCProfileIterator_IPOATie
	extends TCProfileIterator_IPOA
{
	private TCProfileIterator_IOperations _delegate;

	private POA _poa;
	public TCProfileIterator_IPOATie(TCProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCProfileIterator_IPOATie(TCProfileIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trafficConditioningProfile.TCProfileIterator_I _this()
	{
		return trafficConditioningProfile.TCProfileIterator_IHelper.narrow(_this_object());
	}
	public trafficConditioningProfile.TCProfileIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficConditioningProfile.TCProfileIterator_IHelper.narrow(_this_object(orb));
	}
	public TCProfileIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCProfileIterator_IOperations delegate)
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

	public boolean next_n(int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tcProfileList);
	}

}
