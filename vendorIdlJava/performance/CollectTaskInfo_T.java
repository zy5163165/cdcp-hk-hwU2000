package performance;

/**
 *	Generated from IDL definition of struct "CollectTaskInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class CollectTaskInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CollectTaskInfo_T(){}
	public java.lang.String m_TaskName = "";
	public globaldefs.NameAndStringValue_T[][] m_listPMTPSelect;
	public java.lang.String m_Period = "";
	public java.lang.String m_StartTime = "";
	public java.lang.String m_EndTime = "";
	public java.lang.String m_UserEMSName = "";
	public java.lang.String m_FTPName = "";
	public java.lang.String m_FTPPassWord = "";
	public java.lang.String m_FTPAddress = "";
	public boolean forceUpload;
	public CollectTaskInfo_T(java.lang.String m_TaskName, globaldefs.NameAndStringValue_T[][] m_listPMTPSelect, java.lang.String m_Period, java.lang.String m_StartTime, java.lang.String m_EndTime, java.lang.String m_UserEMSName, java.lang.String m_FTPName, java.lang.String m_FTPPassWord, java.lang.String m_FTPAddress, boolean forceUpload)
	{
		this.m_TaskName = m_TaskName;
		this.m_listPMTPSelect = m_listPMTPSelect;
		this.m_Period = m_Period;
		this.m_StartTime = m_StartTime;
		this.m_EndTime = m_EndTime;
		this.m_UserEMSName = m_UserEMSName;
		this.m_FTPName = m_FTPName;
		this.m_FTPPassWord = m_FTPPassWord;
		this.m_FTPAddress = m_FTPAddress;
		this.forceUpload = forceUpload;
	}
}
