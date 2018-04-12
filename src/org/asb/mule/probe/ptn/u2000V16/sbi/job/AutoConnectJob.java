package org.asb.mule.probe.ptn.u2000V16.sbi.job;



import org.asb.mule.probe.framework.nbi.job.MigrateCommonJob;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.quartz.JobExecutionContext;


public class AutoConnectJob extends MigrateCommonJob{
	
	
	private String name = "";

	@Override
	public void execute(JobExecutionContext arg0)  {
		//nbilog.info("Start to auto connect ems.");
		try {
			if(!getService().getConnectState())
			{
				getService().disconnect();
				getService().connect();
				//sbilog.info("AutoConnectJob:recoonect is "+getService().getConnectState());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




}
