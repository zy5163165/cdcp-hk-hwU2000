package HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "ShapingQueue"
 *	@author JacORB IDL compiler 
 */

public final class ShapingQueue
	implements org.omg.CORBA.portable.IDLEntity
{
	public ShapingQueue(){}
	public int queueID;
	public boolean bEnable;
	public int CIR;
	public int CBS;
	public int EIR;
	public int EBS;
	public ShapingQueue(int queueID, boolean bEnable, int CIR, int CBS, int EIR, int EBS)
	{
		this.queueID = queueID;
		this.bEnable = bEnable;
		this.CIR = CIR;
		this.CBS = CBS;
		this.EIR = EIR;
		this.EBS = EBS;
	}
}
