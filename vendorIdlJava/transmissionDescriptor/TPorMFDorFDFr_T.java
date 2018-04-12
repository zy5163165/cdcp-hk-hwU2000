package transmissionDescriptor;

/**
 *	Generated from IDL definition of union "TPorMFDorFDFr_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator;
	private terminationPoint.TerminationPoint_T tp;
	private flowDomain.MatrixFlowDomain_T mfd;
	private flowDomainFragment.FlowDomainFragment_T fdfr;

	public TPorMFDorFDFr_T ()
	{
	}

	public transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator ()
	{
		return discriminator;
	}

	public terminationPoint.TerminationPoint_T tp ()
	{
		if (discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tp;
	}

	public void tp (terminationPoint.TerminationPoint_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP;
		tp = _x;
	}

	public flowDomain.MatrixFlowDomain_T mfd ()
	{
		if (discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD)
			throw new org.omg.CORBA.BAD_OPERATION();
		return mfd;
	}

	public void mfd (flowDomain.MatrixFlowDomain_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD;
		mfd = _x;
	}

	public flowDomainFragment.FlowDomainFragment_T fdfr ()
	{
		if (discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr)
			throw new org.omg.CORBA.BAD_OPERATION();
		return fdfr;
	}

	public void fdfr (flowDomainFragment.FlowDomainFragment_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr;
		fdfr = _x;
	}

}
