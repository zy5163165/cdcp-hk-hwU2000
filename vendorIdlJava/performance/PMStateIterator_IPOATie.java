package performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "PMStateIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class PMStateIterator_IPOATie
	extends PMStateIterator_IPOA
{
	private PMStateIterator_IOperations _delegate;

	private POA _poa;
	public PMStateIterator_IPOATie(PMStateIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public PMStateIterator_IPOATie(PMStateIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public performance.PMStateIterator_I _this()
	{
		return performance.PMStateIterator_IHelper.narrow(_this_object());
	}
	public performance.PMStateIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PMStateIterator_IHelper.narrow(_this_object(orb));
	}
	public PMStateIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PMStateIterator_IOperations delegate)
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

	public boolean next_n(int how_many, performance.PMStateList_THolder pmStateList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pmStateList);
	}

}
