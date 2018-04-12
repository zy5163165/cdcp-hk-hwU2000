package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import java.util.TimerTask;

import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;

public class EventHeartBeat extends TimerTask {
	private FileLogger sbilog = null;
	private EventCorbaService corbaService = null;

	public EventHeartBeat(EventCorbaService corbaService, FileLogger sbilog) {
		this.corbaService = corbaService;
		this.sbilog = sbilog;
	}

	@Override
	public void run() {
		sbilog.info("emsSession.ping >>>");
		if (corbaService != null && corbaService.getNmsSession() != null) {
			if (!corbaService.getNmsSession().isEmsSessionOK()) {
				sbilog.error(">>>emsSession.ping Failed.");
				try {
					Thread.sleep(60000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				corbaService.reconnect();
				sbilog.error(">>>emsSession.ping Failed...reconnect.");
				//
				// corbaService.linkFailure();
			}
		}
	}

}
