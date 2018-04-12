package trafficDescriptor;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrafficDescriptorIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TrafficDescriptorIterator_IPOATie
	extends TrafficDescriptorIterator_IPOA
{
	private TrafficDescriptorIterator_IOperations _delegate;

	private POA _poa;
	public TrafficDescriptorIterator_IPOATie(TrafficDescriptorIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrafficDescriptorIterator_IPOATie(TrafficDescriptorIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trafficDescriptor.TrafficDescriptorIterator_I _this()
	{
		return trafficDescriptor.TrafficDescriptorIterator_IHelper.narrow(_this_object());
	}
	public trafficDescriptor.TrafficDescriptorIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return trafficDescriptor.TrafficDescriptorIterator_IHelper.narrow(_this_object(orb));
	}
	public TrafficDescriptorIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrafficDescriptorIterator_IOperations delegate)
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

	public boolean next_n(int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,trafficDescList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
