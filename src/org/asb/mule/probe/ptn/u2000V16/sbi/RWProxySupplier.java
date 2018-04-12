package org.asb.mule.probe.ptn.u2000V16.sbi;


import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.util.ProbeLog;
import org.asb.mule.probe.framework.util.corba.CorbaMgr;
import org.omg.CosNotifyChannelAdmin.*;



import java.io.*;


	
	
/*
*	When connect the pushSupplier, write the connected pushSuppiler in file.
*	So if the pushSuppler is disconnected abnormally, at the time to reconnect it,
*	the old pushSupplier will be read out, and disconnect function will be run to  do remedy.
*/
public class RWProxySupplier
{
	protected Logger sbilog = ProbeLog.getInstance().getSbiLog();
	private  static final String head1 = "RWProxySupplier::";

	private NmsSession nmsSession = null;
	//private ORB orb = null;
	private String iorFilePath = null;

	public RWProxySupplier()
	{
	}

	public RWProxySupplier(NmsSession nmsSession,String iorFilePath)
	{
		this.nmsSession = nmsSession;
		//this.orb = orb;
		this.iorFilePath = iorFilePath;
	}

	public void RWFile()
	{
		StructuredProxyPushSupplier oldPS,newPS;
		String head2 = "RWFile: ";

		org.omg.CORBA.ORB orb = CorbaMgr.instance().ORB();

		String oldIor = readIOR(iorFilePath);
		if (oldIor != null){
			try{
				sbilog.info("RWProxySupplier::RWFile>>	" + head2 + "oldIor != null " );
				
				org.omg.CORBA.Object obj = orb.string_to_object(oldIor);
				
				oldPS = StructuredProxyPushSupplierHelper.narrow ( obj );
				
				oldPS.disconnect_structured_push_supplier();
				sbilog.info("RWProxySupplier::RWFile>>	" + head2 + " disconnect over.");
			}catch(Throwable e){
				sbilog.error("RWProxySupplier::RWFile>>	Exception: RWFile: " + e.getMessage());
				e.printStackTrace();
			}
		}

		try{
			File iorFile = new File(iorFilePath);
			iorFile.delete();
			sbilog.info("RWProxySupplier::RWFile>>	" + head2 + " delete file..");
		}catch(Throwable e)
		{
			sbilog.error("RWProxySupplier::RWFile>>	Exception: Delete " + iorFilePath + " failed, may be it does not exist.");
			e.printStackTrace();
		}
		
		newPS = nmsSession.getProxySupplier();
		String spIOR = orb.object_to_string(newPS);
		writeIOR(iorFilePath, spIOR);

	}
	
		
	private String readIOR(String filePath)
	{
			
		String ior = null;
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(filePath));
			ior = in.readLine();			
			sbilog.info("RWProxySupplier::readIOR>>	Read from file success! IOR is : " + ior);
		}
		catch(Throwable ex)
		{
			sbilog.error("RWProxySupplier::readIOR>>	Exception: Read from file fail! IOR is : " + ior);
			//ex.printStackTrace();
		}
		return ior;		
	}

		
	private boolean writeIOR(String filePath, String ior)
	{
		try
		{
			FileOutputStream iorStream = new FileOutputStream(filePath);
			PrintWriter iorfile = new PrintWriter(iorStream);
			iorfile.println(ior);
			iorfile.flush();
			
			sbilog.info("RWProxySupplier::writeIOR>>	Write ior to file success!");
			return true;
		}
		catch(Throwable ex)
		{
			sbilog.error("RWProxySupplier::writeIOR>>	Exception: Write  ior to file failed!");
			ex.printStackTrace();
			return false;
		}
	}

	

}
