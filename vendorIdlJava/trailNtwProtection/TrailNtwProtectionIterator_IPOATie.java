package trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrailNtwProtectionIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class TrailNtwProtectionIterator_IPOATie
	extends TrailNtwProtectionIterator_IPOA
{
	private TrailNtwProtectionIterator_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtectionIterator_IPOATie(TrailNtwProtectionIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public trailNtwProtection.TrailNtwProtectionIterator_I _this()
	{
		return trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(_this_object());
	}
	public trailNtwProtection.TrailNtwProtectionIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return trailNtwProtection.TrailNtwProtectionIterator_IHelper.narrow(_this_object(orb));
	}
	public TrailNtwProtectionIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtectionIterator_IOperations delegate)
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

	public boolean next_n(int how_many, trailNtwProtection.TrailNtwProtectionList_THolder tnpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tnpList);
	}

}
