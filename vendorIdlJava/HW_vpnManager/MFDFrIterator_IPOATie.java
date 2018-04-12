package HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class MFDFrIterator_IPOATie
	extends MFDFrIterator_IPOA
{
	private MFDFrIterator_IOperations _delegate;

	private POA _poa;
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public HW_vpnManager.MFDFrIterator_I _this()
	{
		return HW_vpnManager.MFDFrIterator_IHelper.narrow(_this_object());
	}
	public HW_vpnManager.MFDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return HW_vpnManager.MFDFrIterator_IHelper.narrow(_this_object(orb));
	}
	public MFDFrIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MFDFrIterator_IOperations delegate)
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

	public boolean next_n(int how_many, HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdfrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
