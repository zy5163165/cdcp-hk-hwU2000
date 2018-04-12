package circuitCutMgr;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureException
	extends org.omg.CORBA.UserException
{
	public ProcessingFailureException()
	{
		super(circuitCutMgr.ProcessingFailureExceptionHelper.id());
	}

	public circuitCutMgr.ExceptionType_T exceptionType;
	public java.lang.String errorReason = "";
	public ProcessingFailureException(java.lang.String _reason,circuitCutMgr.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(circuitCutMgr.ProcessingFailureExceptionHelper.id()+ " " + _reason);
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
	public ProcessingFailureException(circuitCutMgr.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(circuitCutMgr.ProcessingFailureExceptionHelper.id());
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
}
