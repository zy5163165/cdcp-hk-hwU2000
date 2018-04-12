package maintenanceOps;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MaintenanceDomainIterator_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public class HW_MaintenanceDomainIterator_IPOATie
	extends HW_MaintenanceDomainIterator_IPOA
{
	private HW_MaintenanceDomainIterator_IOperations _delegate;

	private POA _poa;
	public HW_MaintenanceDomainIterator_IPOATie(HW_MaintenanceDomainIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MaintenanceDomainIterator_IPOATie(HW_MaintenanceDomainIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public maintenanceOps.HW_MaintenanceDomainIterator_I _this()
	{
		return maintenanceOps.HW_MaintenanceDomainIterator_IHelper.narrow(_this_object());
	}
	public maintenanceOps.HW_MaintenanceDomainIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return maintenanceOps.HW_MaintenanceDomainIterator_IHelper.narrow(_this_object(orb));
	}
	public HW_MaintenanceDomainIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MaintenanceDomainIterator_IOperations delegate)
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
	public boolean next_n(int how_many, maintenanceOps.HW_MaintenanceDomainList_THolder mdList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mdList);
	}

	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
