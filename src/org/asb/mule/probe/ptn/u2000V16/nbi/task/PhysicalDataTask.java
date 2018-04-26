package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.SubnetworkConnection;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.CTPUtil;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;

import com.alcatelsbell.nms.common.Detect;
import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class PhysicalDataTask extends CommonDataTask {
	// private Logger logger = ProbeLog.getInstance().getDataLog();
	public boolean logical = true;

	public boolean includeCC = false;
	public Vector<BObject> excute() {
		List<CrossConnect> crossConnects = new ArrayList<CrossConnect>();
		List<SubnetworkConnection> sncs = new ArrayList<SubnetworkConnection>();
		if (includeCC) {
			try {
				List<CrossConnect> ipccList = service.retrieveAllCrossConnects(this.getTask().getObjectName());
				for (CrossConnect ipcc : ipccList) {
					crossConnects.add(ipcc);
				}
				
				List<SubnetworkConnection> sncList = service.retrieveAllSNCs();
				for (SubnetworkConnection snc : sncList) {
					sncs.add(snc);
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
						processCTP(neCtps, crossConnects, sncs);
					for (CTP ctp : neCtps) {
						insertToSqliteDB(ctp);
					}
				}
			}

			for (CrossConnect crossConnect : crossConnects) {
				insertToSqliteDB(crossConnect);
			}
			
		} catch (Exception e) {
			nbilog.error("PhysicalDataTask.excute Exception:", e);
		} finally {
			return neVec;
		}

	}

	public static void processCTP(List<CTP> ctps,List<CrossConnect> ccs,List<SubnetworkConnection> sncs ) {
		HashMap<String,CTP> ctpMap = new HashMap<String, CTP>();
		List<String> ccEnds = new ArrayList<>();
		List<String> sncEnds = new ArrayList<>();
		HashMap<String,List<String>> vc4DnMap = new HashMap<String, List<String>>();
		HashMap<String,List<CrossConnect>> vc4ccMap = new HashMap<String, List<CrossConnect>>();
		List<CTP> newSncCtps = new ArrayList<>();
		
		for (CTP ctp : ctps) {
			ctpMap.put(ctp.getDn(),ctp);
		}
		
		// 补充snc中丢失的ctp (已屏蔽)
		if (!sncs.isEmpty()) {
			for (SubnetworkConnection snc : sncs) {
				String aends = snc.getaEnd();
				if (aends != null) {
					String[] dns = aends.split(Constant.listSplitReg);
					for (String dn : dns) {
//						ccEnds.add(dn);
						if (!ctpMap.containsKey(dn)) {
							sncEnds.add(dn);

//							CTP newCTP = newCTP(dn);
//							ctps.add(newCTP);
//							ctpMap.put(dn,newCTP);
						}
					}
				}
				
				String zends = snc.getzEnd();
				if (zends != null) {
					String[] dns = zends.split(Constant.listSplitReg);
					for (String dn : dns) {
//						ccEnds.add(dn);
						if (!ctpMap.containsKey(dn)) {
							sncEnds.add(dn);

//							CTP newCTP = newCTP(dn);
//							ctps.add(newCTP);
//							ctpMap.put(dn,newCTP);
						}
					}
				}
			}
		}
		// 把snc中丢失的vc12，取上层的vc4 (无需屏蔽)
		if (Detect.notEmpty(sncEnds)) {
			for (String sncEnd : sncEnds) {
				if (CTPUtil.isVC12(sncEnd)) { // vc12
					String vc4dn = StringUtils.substringBefore(sncEnd, "/vt2_tu12");
					if (vc4DnMap.containsKey(vc4dn)) {
						List<String> vc12dns = vc4DnMap.get(vc4dn);
						vc12dns.add(sncEnd);
					} else {
						List<String> vc12dns = new ArrayList<String>();
						vc4DnMap.put(vc4dn, vc12dns);
						vc12dns.add(sncEnd);
					}
					
					if (!vc4ccMap.containsKey(vc4dn)) {
						List<CrossConnect> vc4cc = new ArrayList<CrossConnect>();
						vc4ccMap.put(vc4dn, vc4cc);
					}
				}
				
				if (CTPUtil.isVC3(sncEnd)) { // vc3
					String vc4dn = StringUtils.substringBefore(sncEnd, "/tu3_vc3-k");
					if (vc4DnMap.containsKey(vc4dn)) {
						List<String> vc12dns = vc4DnMap.get(vc4dn);
						vc12dns.add(sncEnd);
					} else {
						List<String> vc12dns = new ArrayList<String>();
						vc4DnMap.put(vc4dn, vc12dns);
						vc12dns.add(sncEnd);
					}
					
					if (!vc4ccMap.containsKey(vc4dn)) {
						List<CrossConnect> vc4cc = new ArrayList<CrossConnect>();
						vc4ccMap.put(vc4dn, vc4cc);
					}
				}
			}
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
						
						if (vc4ccMap.containsKey(dn)) { // 把snc中丢失的vc12上层的vc4的交叉拿出来
							cc.setTag3("remove"); //上标记，不做入库处理
							List<CrossConnect> vc4cc = vc4ccMap.get(dn);
							vc4cc.add(cc);
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
						
						if (vc4ccMap.containsKey(dn)) { // 把snc中丢失的vc12上层的vc4的交叉拿出来
							cc.setTag3("remove"); //上标记，不做入库处理
							List<CrossConnect> vc4cc = vc4ccMap.get(dn);
							vc4cc.add(cc);
						}
					}
				}
			}
		}
		
		// 拼装出vc4层交叉的对端vc3/vc12层ctp (已屏蔽)
//		if (Detect.notEmpty(vc4ccMap)) {
//			Set<String> vc4dns = vc4ccMap.keySet();
//			for (String vc4dn : vc4dns) {
//				List<CrossConnect> vc4ccs = vc4ccMap.get(vc4dn);
//				if (Detect.notEmpty(vc4ccs)) {
//					for(CrossConnect vc4cc : vc4ccs) {
//						vc4cc.setTag3("remove"); //上标记，不做入库处理
//						String otherEnd = "";
//						if (vc4cc.getaEndNameList().contains(vc4dn)) {
//							otherEnd = vc4cc.getzEndNameList();
//						} else if (vc4cc.getzEndNameList().contains(vc4dn)) {
//							otherEnd = vc4cc.getaEndNameList();
//						}
//						otherEnd = StringUtils.substringBefore(otherEnd, "||");
//						
//						List<String> vc12dns = vc4DnMap.get(vc4dn);
//						for (String vc12dn : vc12dns) {
//							if (CTPUtil.isVC3(vc12dn)) {
//								String newdn = otherEnd + "/tu3_vc3-k" + StringUtils.substringAfter(vc12dn, "/tu3_vc3-k");
//								CTP newCTP = newCTP(newdn);
//								ctps.add(newCTP);
//								ctpMap.put(newdn,newCTP);
//								
//							}
//							if (CTPUtil.isVC12(vc12dn)) {
//								String newdn = otherEnd + "/vt2_tu12" + StringUtils.substringAfter(vc12dn, "/vt2_tu12");
//								CTP newCTP = newCTP(newdn);
//								ctps.add(newCTP);
//								ctpMap.put(newdn,newCTP);
//							}
//						}
//					}
//				}
//			}
//		}

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
		
		
		// 单独补充snc缺失的ctp，不走交叉的补充逻辑：暂定是用下面的循环来，判断vc3和vc12，然后vc12走l和m的循环，补充两端ctp，建立新交叉。
		if (Detect.notEmpty(vc4DnMap)) {
			Set<String> vc4dns = vc4DnMap.keySet();
			if (Detect.isPositive(vc4dns.size())) {
				for (String vc4dn : vc4dns) {
					// 判断vc4下面的是vc3还是vc12
					List<String> vc12dns = vc4DnMap.get(vc4dn);
					int[] vc3k = new int[]{};
					for (String vc12dn : vc12dns) {
						if (CTPUtil.isVC3(vc12dn)) {
							vc3k = ArrayUtils.add(vc3k, CTPUtil.getK(vc12dn));
						}
					}

					// 获取对端的vc4，用于拼装对端的vc3/vc12
					List<CrossConnect> vc4ccs = vc4ccMap.get(vc4dn);
					String otherEnd = "";
					if (Detect.notEmpty(vc4ccs)) {
						for(CrossConnect vc4cc : vc4ccs) {
							if (vc4cc.getaEndNameList().contains(vc4dn)) {
								otherEnd = vc4cc.getzEndNameList();
							} else if (vc4cc.getzEndNameList().contains(vc4dn)) {
								otherEnd = vc4cc.getaEndNameList();
							}
							otherEnd = StringUtils.substringBefore(otherEnd, "||");
						}
					}
					
					for (int k=1;k<4;k++) {
						// vc3的补充逻辑：补充两端vc3，再补一个交叉
						if (ArrayUtils.contains(vc3k, k)) {
							String onedn = vc4dn + "/tu3_vc3-k=" + k;
							CTP oneCTP = newCTP(onedn);
							ctps.add(oneCTP);
							
							if (Detect.notEmpty(otherEnd)) { // vc层存在交叉才有补充对端ctp和交叉的意义
								String otherdn = otherEnd + "/tu3_vc3-k=" + k;
								CTP otherCTP = newCTP(otherdn);
								ctps.add(otherCTP);
								
								CrossConnect newCC = newCC(onedn, otherdn);
								ccs.add(newCC);
							}
						}
						
						// vc12的补充逻辑：补充两端vc12，再补3*7个交叉
						for (int l=1;l<8;l++) {
							for (int m=1;m<4;m++) {
								String onedn = vc4dn + "/vt2_tu12-k="+k+"-l="+l+"-m="+m;
								CTP oneCTP = newCTP(onedn);
								ctps.add(oneCTP);
								
								if (Detect.notEmpty(otherEnd)) { // vc层存在交叉才有补充对端ctp和交叉的意义
									String otherdn = otherEnd + "/vt2_tu12-k="+k+"-l="+l+"-m="+m;
									CTP otherCTP = newCTP(otherdn);
									ctps.add(otherCTP);
									
									CrossConnect newCC = newCC(onedn, otherdn);
									ccs.add(newCC);
								}
							}
						}
					}
				}
			}
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
	public static  CrossConnect newCC(String oneDn, String otherDn) {
		CrossConnect newCC = new CrossConnect();
		String dn = oneDn + "<>" + StringUtils.substringAfter(otherDn, "@PTP:");
		dn = StringUtils.replace(dn, "@CTP:", "");
		dn = StringUtils.replace(dn, "PTP", "CrossConnect");
				
		newCC.setDn(dn);
		newCC.setTag1("NEW-SNC");
		
		newCC.setaEndNameList(oneDn);
		newCC.setzEndNameList(otherDn);
		newCC.setaEndTP(extractPortDn(oneDn));
		newCC.setzEndTP(extractPortDn(otherDn));
        newCC.setCcType("ST_SIMPLE");
        newCC.setDirection("CD_UNI");
        newCC.setEmsName(StringUtils.substringBefore(oneDn, "@ManagedElement:"));
        newCC.setParentDn(StringUtils.substringBefore(oneDn, "@PTP:"));
        newCC.setAdditionalInfo("Label:||");
        
        
		return newCC;
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
		
		String oneDn = "EMS:Huawei/U2000@ManagedElement:3145731@PTP:/rack=1/shelf=1/slot=6/domain=sdh/port=1@CTP:/sts3c_au4-j=19/vt2_tu12-k=1-l=5-m=1";
		String otherDn = "EMS:Huawei/U2000@ManagedElement:3145731@PTP:/rack=1/shelf=1/slot=1/domain=sdh/port=2@CTP:/sts3c_au4-j=1/vt2_tu12-k=1-l=1-m=3";
		String dn = oneDn + "<>" + StringUtils.substringAfter(otherDn, "@PTP:");
		dn = StringUtils.replace(dn, "@CTP:", "");
		dn = StringUtils.replace(dn, "PTP", "CrossConnect");
		
		List<String> vc12dns = new ArrayList<>();
		vc12dns.add("EMS:Huawei/U2000@ManagedElement:3145731@PTP:/rack=1/shelf=1/slot=29/domain=sdh/port=1@CTP:/sts3c_au4-j=34/tu3_vc3-k=1");
		int[] vc3k = new int[]{};
		for (String vc12dn : vc12dns) {
			if (CTPUtil.isVC3(vc12dn)) {
				vc3k = ArrayUtils.add(vc3k, CTPUtil.getK(vc12dn));
			}
		}
		
		List<CrossConnect> ccs = (List<CrossConnect>) ObjectUtil.readObjectByPath("d:\\cache\\result_1431952368947");
		List<SubnetworkConnection> sncs = new ArrayList<SubnetworkConnection>();
		List<CTP> ctps = (List<CTP>)ObjectUtil.readObjectByPath("d:\\cache\\result_1431952312635");

		task1.processCTP(ctps, ccs, sncs);

		System.out.println("ctps = " + ctps.size());
		for (CTP ctp : ctps) {
			System.out.println(ctp.getDn());
		}
	}

}
