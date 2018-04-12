package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.*;

import com.alcatelsbell.nms.util.ObjectUtil;
import org.asb.mule.probe.framework.entity.*;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.valueobject.BObject;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.CTPUtil;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

public class PhysicalDataTask extends CommonDataTask {
	// private Logger logger = ProbeLog.getInstance().getDataLog();
	public boolean logical = true;

	public boolean includeCC = false;
	public Vector<BObject> excute() {
		List<CrossConnect> crossConnects = new ArrayList<CrossConnect>();
		if (includeCC) {
			try {
				List<CrossConnect> ipccList = service.retrieveAllCrossConnects(this.getTask().getObjectName());
				for (CrossConnect ipcc : ipccList) {
					insertToSqliteDB(ipcc);
					crossConnects.add(ipcc);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


		Vector<BObject> neVec = new Vector<BObject>();
		try {
			List<EquipmentHolder> holderList = new ArrayList<EquipmentHolder>();
			List<Equipment> cardList = new ArrayList<Equipment>();
			service.retrieveAllEquipmentAndHolders(getTask().getObjectName(), holderList, cardList);

			List<PTP> ptpList = service.retrieveAllPtps(this.getTask().getObjectName());

			if (holderList != null && holderList.size() > 0) {
				for (EquipmentHolder holder : holderList) {
					insertToSqliteDB(holder);
				}
			}

			if (cardList != null && cardList.size() > 0) {
				for (Equipment card : cardList) {
					insertToSqliteDB(card);
				}
			}


			try {
				String neKey = getTask().getObjectName().substring(getTask().getObjectName().lastIndexOf(":")+1).replaceAll(";","-");
				if (ptpList != null && !ptpList.isEmpty()) {
					ObjectUtil.saveObject(service.getEmsName()+"/PTP-"+neKey,ptpList);
				} else {
					ptpList = (List) ObjectUtil.readObject(service.getEmsName() + "/PTP-" + neKey);
					if (ptpList == null) ptpList = new ArrayList<PTP>();
				}
			} catch (Exception e) {
				nbilog.error(e, e);
			}

			if (ptpList != null && ptpList.size() > 0) {

				for (PTP ptp : ptpList) {
					insertToSqliteDB(ptp);
					if (ptp.getDn().contains("ptn") && ptp.getDn().contains("FTP")) {
						neVec.add(ptp);
					}
				}

				// PTN����Ҫ�ɼ�CTP
				if (option && logical) {
					List<CTP> neCtps = new ArrayList<CTP>();
					boolean sdh = false;
					for (PTP ptp : ptpList) {
						try {

							List<CTP> ctpList = null;
                            if (ptp.getDn().contains("sdh")) {
								sdh = true;
							//	ctpList = ((U2000Service) service).retrieveAllSDHCtps(ptp);

								ctpList = ((U2000Service) service).retrieveContainedCurrentCtps(ptp.getDn());
								if (ctpList != null) {
									neCtps.addAll(ctpList);

								}
							}
                            else {
								ctpList = service.retrieveAllCtps(ptp.getDn());
								if (ctpList != null && ctpList.size() > 0) {
									neCtps.addAll(ctpList);


								}
							}
						} catch (Exception e) {
							nbilog.error("PhysicalDataTask.excute Exception:", e);
						}
					}

					if (sdh)
						processCTP(neCtps, crossConnects);
					for (CTP ctp : neCtps) {
						insertToSqliteDB(ctp);
					}
				}
			}

		} catch (Exception e) {
			nbilog.error("PhysicalDataTask.excute Exception:", e);
		} finally {
			return neVec;
		}

	}

	public static void processCTP(List<CTP> ctps,List<CrossConnect> ccs ) {
		HashMap<String,CTP> ctpMap = new HashMap<String, CTP>();
		List<String> ccEnds = new ArrayList<>();
		
		for (CTP ctp : ctps) {
			ctpMap.put(ctp.getDn(),ctp);
		}
		if (!ccs.isEmpty()) {
			for (CrossConnect cc : ccs) {
				String aends = cc.getaEndNameList();
				if (aends != null) {
					String[] dns = aends.split(Constant.listSplitReg);
					for (String dn : dns) {
						ccEnds.add(dn);
						if (!ctpMap.containsKey(dn)) {
							CTP newCTP = newCTP(dn);

							ctps.add(newCTP);
							ctpMap.put(dn,newCTP);
						}
					}
				}
				
				String zends = cc.getzEndNameList();
				if (zends != null) {
					String[] dns = zends.split(Constant.listSplitReg);
					for (String dn : dns) {
						ccEnds.add(dn);
						if (!ctpMap.containsKey(dn)) {
							CTP newCTP = newCTP(dn);

							ctps.add(newCTP);
							ctpMap.put(dn,newCTP);
						}
					}
				}
				
			}
		}

		HashMap<String,List<CTP>> portCtpMap = new HashMap<String, List<CTP>>();
		for (CTP ctp : ctps) {
			putIntoValueList(portCtpMap,ctp.getPortdn(),ctp);
		}

		ctps.clear();
		Set<String> ports = portCtpMap.keySet();
		for (String port : ports) {
			List<CTP> ctpList = portCtpMap.get(port);
			
			if (port.contains("sdh")) {
				CTPUtil.filterCTPSForHK(port, ctpList, ccEnds);
			} else {
				CTPUtil.filterCTPS(port, ctpList);
			}

			ctps.addAll(ctpList);
		}


	}
	public static void putIntoValueList(HashMap  map,Object key,Object value) {
		List list = (List)map.get(key);
		if (list == null) {
			list = new ArrayList();
			map.put(key,list);
		}
		list.add(value);
	}
	public static  CTP newCTP(String dn) {
		CTP newCTP = new CTP();
		String portDn = extractPortDn(dn);

		newCTP.setDn(dn);
		newCTP.setTag1("NEW-CC");
		newCTP.setPortdn(portDn);
		newCTP.setParentDn(portDn);
		if (CTPUtil.isVC44C(dn))
			newCTP.setNativeEMSName("VC4_4c-"+CTPUtil.getJ(dn));
		else if (CTPUtil.isVC4(dn))
			newCTP.setNativeEMSName("VC4-"+CTPUtil.getJ(dn));
		else if (CTPUtil.isVC12(dn))
			newCTP.setNativeEMSName("VC12-" + (21 * (CTPUtil.getM(dn) - 1) + 3 * (CTPUtil.getL(dn)  -1) + CTPUtil.getK(dn) ));
		else if (CTPUtil.isVC3(dn))
			newCTP.setNativeEMSName("VC3-"+CTPUtil.getK(dn));

		return newCTP;
	}
	public static String extractPortDn(String endDn) {
		if (endDn.contains("@CTP"))
			return endDn.substring(0,endDn.indexOf("@CTP"));
		if (endDn.contains("port=")) {
			int end = endDn.indexOf("/"+endDn.indexOf("port="));
			if (end > -1)
				return endDn.substring(0,end);
		}
		return endDn;
	}
	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		PhysicalDataTask task1 = new PhysicalDataTask();
		List<CrossConnect> ccs = (List<CrossConnect>) ObjectUtil.readObjectByPath("d:\\cache\\result_1431952368947");
		List<CTP> ctps = (List<CTP>)ObjectUtil.readObjectByPath("d:\\cache\\result_1431952312635");

		task1.processCTP(ctps, ccs);

		System.out.println("ctps = " + ctps.size());
		for (CTP ctp : ctps) {
			System.out.println(ctp.getDn());
		}
	}

}
