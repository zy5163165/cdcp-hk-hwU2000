package org.asb.mule.probe.ptn.u2000V16.sbi;

import java.util.TimerTask;

import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;

public class HeartBeat extends TimerTask {
	private FileLogger sbilog = null;
	private CorbaService corbaService = null;

	public HeartBeat(CorbaService corbaService, FileLogger sbilog) {
		this.corbaService = corbaService;
		this.sbilog = sbilog;
	}

	@Override
	public void run() {
		sbilog.info("emsSession.ping >>>");
		if (corbaService != null && corbaService.getNmsSession() != null) {
			if (!corbaService.getNmsSession().isEmsSessionOK()) {
				sbilog.error(">>>emsSession.ping Failed.");
				synchronized (corbaService) {
					while (!corbaService.reconnect()) {
						try {
							Thread.sleep(60000l);
						} catch (InterruptedException e) {
						}
						sbilog.error(">>>reconnect failed ,try again");
					}
				}

				//corbaService.linkFailure();
				// corbaService.disconnect();
			}
		}
	}

}
