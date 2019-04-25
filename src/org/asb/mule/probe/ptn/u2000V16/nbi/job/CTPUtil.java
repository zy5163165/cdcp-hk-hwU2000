package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import com.alcatelsbell.nms.util.ObjectUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.service.Constant;

import java.util.*;

/**
 * Author: Ronnie.Chen Date: 14-7-25 Time: 上午10:34
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class CTPUtil {
	public static Log logger = LogFactory.getLog(CTPUtil.class);

	public static short[] layRateList(String layRate) {
		String[] lrs = layRate.split(Constant.listSplitReg);
		short[] rate = new short[lrs.length];

		for (int i = 0; i < lrs.length; i++) {
			String lr = lrs[i];
			rate[i] = Short.parseShort(lr);
		}
		return rate;
	}

	public static void filterCTPSForHK(String portDn, List<CTP> ctps, List<String> ccEnds) {
		// ObjectUtil.saveObject(portDn.replaceAll("/","<>"),ctps);
		List<CTP> vc4s = filterVC4(ctps);
		List<CTP> vc3s = filterVC3(ctps);
		List<CTP> vc12s = filterVC12(ctps);
		System.out.println("vc4s size = " + vc4s.size());
		System.out.println("vc3s size = " + vc3s.size());
		System.out.println("vc12 size = " + vc12s.size());

		HashMap<Integer, HashMap<Integer, List<CTP>>> jkMap = new HashMap<Integer, HashMap<Integer, List<CTP>>>();

		HashSet<Integer> vc4JSet = new HashSet<Integer>();
		for (CTP vc4 : vc4s) {
			vc4JSet.add(getJ(vc4.getDn()));
		}

		// 可能会有丢失的VC4
		List<CTP> newVC4S = new ArrayList<CTP>();
		for (CTP ctp : ctps) {
			int j = getJ(ctp.getDn());
			if (j < 0)
				continue;
			if (!vc4JSet.contains(j)) {
				CTP newCTP = new CTP();
				String newDn = portDn + "@CTP:/sts3c_au4-j=" + j;
				newCTP.setDn(newDn);
				newCTP.setTag1("NEW");
				newCTP.setPortdn(portDn);
				newCTP.setParentDn(portDn);
				newCTP.setNativeEMSName("VC4-" + j);
				newCTP.setUserLabel("VC4-" + j);
				vc4s.add(newCTP);
				newVC4S.add(newCTP);
				vc4JSet.add(j);
			}
		}
		if (newVC4S.size() > 0) {
			System.out.println(portDn + ":newVC4S = " + newVC4S.size());
			ctps.addAll(newVC4S);
		}

		////////////////////////////// 删除已经打散为VC12的vc3///////////////////////////////////
		if (vc12s.size() > 0) {
			for (CTP vc12 : vc12s) {

				String vc12Dn = vc12.getDn();
				if (!vc12Dn.contains("vt2_tu12-k="))
					continue;
				int k = getK(vc12Dn);
				int j = getJ(vc12Dn);

				HashMap<Integer, List<CTP>> kmap = jkMap.get(j);
				if (kmap == null) {
					kmap = new HashMap<Integer, List<CTP>>();
					jkMap.put(j, kmap);
				}

				List<CTP> list = kmap.get(k);
				if (list == null) {
					list = new ArrayList<CTP>();
					kmap.put(k, list);
				}
				list.add(vc12);

			}
		}

		HashSet<String> vc3KSet = new HashSet<String>();
		List<CTP> toDeleteVC3 = new ArrayList<CTP>();
		for (CTP vc3 : vc3s) {
			String dn = vc3.getDn();
			int j = getJ(dn);
			int k = getK(dn);
			vc3KSet.add(j + "-" + k);
			if (jkMap.containsKey(j) && jkMap.get(j).containsKey(k)) {
				List<CTP> vc12FromVc3 = jkMap.get(j).get(k);
				if (ccEnds.contains(dn)) {
					toDeleteVC3.addAll(vc12FromVc3);
				} else {
					toDeleteVC3.add(vc3);
				}
			}
		}

		////////////////////////////// 删除已经打散为VC12的vc3///////////////////////////////////

		HashMap<String, List<String>> vc4vc12map = new HashMap<String, List<String>>();

		for (CTP vc12 : vc12s) {

			String vc12dn = vc12.getDn();
			if (vc12dn.contains("/vt2_tu12")) {
				String vc4dn = vc12dn.substring(0, vc12dn.indexOf("/vt2_tu12"));
				List l = vc4vc12map.get(vc4dn);
				if (l == null) {
					l = new ArrayList();
					vc4vc12map.put(vc4dn, l);
				}
				l.add(vc12dn);

			}
		}

		////////////////////////////// 补充VC12//////////////////////////////////////////////
		List<CTP> newCTPs = new ArrayList<CTP>();
		for (Integer j : vc4JSet) {

			String vc4dn = portDn + "@CTP:/sts3c_au4-j=" + j;
			if (!vc4vc12map.containsKey(vc4dn))
				continue; // 如果该vc4下一个vc12都没有，则无视

			HashMap<Integer, List<CTP>> kmap = jkMap.get(j);
			if (kmap == null)
				kmap = new HashMap<Integer, List<CTP>>();
			for (int k = 1; k <= 3; k++) {
				if (vc3KSet.contains(j + "-" + k))
					continue;
				List<CTP> jkvc12s = kmap.get(k);
				for (int l = 1; l <= 7; l++) {
					for (int m = 1; m <= 3; m++) {
						if (getCTP(jkvc12s, k, l, m) == null) {
							CTP newCTP = new CTP();
							String newDn = portDn + "@CTP:/sts3c_au4-j=" + j + "/vt2_tu12-k=" + k + "-l=" + l + "-m="
									+ m;
							newCTP.setDn(newDn);
							newCTP.setTag1("NEW");
							newCTP.setNativeEMSName("VC12-" + (21 * (m - 1) + 3 * (l - 1) + k));
							newCTP.setPortdn(portDn);
							newCTP.setParentDn(portDn);
							newCTPs.add(newCTP);

						}
					}
				}
			}
		}
		System.out.println(portDn + ":ctps = " + ctps.size());

		if (toDeleteVC3.size() > 0)
			System.out.println(portDn + ":toDeleteVC3 = " + toDeleteVC3.size());
		if (newCTPs.size() > 0)
			System.out.println(portDn + ":newCTPs = " + newCTPs.size());
		ctps.removeAll(toDeleteVC3);
		ctps.addAll(newCTPs);

		filterVC4C(portDn, ctps);
	}

	public static void filterCTPS(String portDn, List<CTP> ctps) {
		// ObjectUtil.saveObject(portDn.replaceAll("/","<>"),ctps);
		List<CTP> vc4s = filterVC4(ctps);
		List<CTP> vc3s = filterVC3(ctps);
		List<CTP> vc12s = filterVC12(ctps);
		System.out.println("vc4s size = " + vc4s.size());
		System.out.println("vc3s size = " + vc3s.size());
		System.out.println("vc12 size = " + vc12s.size());

		HashMap<Integer, HashMap<Integer, List<CTP>>> jkMap = new HashMap<Integer, HashMap<Integer, List<CTP>>>();

		HashSet<Integer> vc4JSet = new HashSet<Integer>();
		for (CTP vc4 : vc4s) {
			vc4JSet.add(getJ(vc4.getDn()));
		}

		// 可能会有丢失的VC4
		List<CTP> newVC4S = new ArrayList<CTP>();
		for (CTP ctp : ctps) {
			int j = getJ(ctp.getDn());
			if (j < 0)
				continue;
			if (!vc4JSet.contains(j)) {
				CTP newCTP = new CTP();
				String newDn = portDn + "@CTP:/sts3c_au4-j=" + j;
				newCTP.setDn(newDn);
				newCTP.setTag1("NEW");
				newCTP.setPortdn(portDn);
				newCTP.setParentDn(portDn);
				newCTP.setNativeEMSName("VC4-" + j);
				newCTP.setUserLabel("VC4-" + j);
				vc4s.add(newCTP);
				newVC4S.add(newCTP);
				vc4JSet.add(j);
			}
		}
		if (newVC4S.size() > 0) {
			System.out.println(portDn + ":newVC4S = " + newVC4S.size());
			ctps.addAll(newVC4S);
		}

		////////////////////////////// 删除已经打散为VC12的vc3///////////////////////////////////
		if (vc12s.size() > 0) {
			for (CTP vc12 : vc12s) {

				String vc12Dn = vc12.getDn();
				if (!vc12Dn.contains("vt2_tu12-k="))
					continue;
				int k = getK(vc12Dn);
				int j = getJ(vc12Dn);

				HashMap<Integer, List<CTP>> kmap = jkMap.get(j);
				if (kmap == null) {
					kmap = new HashMap<Integer, List<CTP>>();
					jkMap.put(j, kmap);
				}

				List<CTP> list = kmap.get(k);
				if (list == null) {
					list = new ArrayList<CTP>();
					kmap.put(k, list);
				}
				list.add(vc12);

			}
		}

		HashSet<String> vc3KSet = new HashSet<String>();
		List<CTP> toDeleteVC3 = new ArrayList<CTP>();
		for (CTP vc3 : vc3s) {
			String dn = vc3.getDn();
			int j = getJ(dn);
			int k = getK(dn);
			vc3KSet.add(j + "-" + k);
			if (jkMap.containsKey(j) && jkMap.get(j).containsKey(k)) {
				toDeleteVC3.add(vc3);
			}
		}

		////////////////////////////// 删除已经打散为VC12的vc3///////////////////////////////////

		HashMap<String, List<String>> vc4vc12map = new HashMap<String, List<String>>();

		for (CTP vc12 : vc12s) {

			String vc12dn = vc12.getDn();
			if (vc12dn.contains("/vt2_tu12")) {
				String vc4dn = vc12dn.substring(0, vc12dn.indexOf("/vt2_tu12"));
				List l = vc4vc12map.get(vc4dn);
				if (l == null) {
					l = new ArrayList();
					vc4vc12map.put(vc4dn, l);
				}
				l.add(vc12dn);

			}
		}

		////////////////////////////// 补充VC12//////////////////////////////////////////////
		List<CTP> newCTPs = new ArrayList<CTP>();
		for (Integer j : vc4JSet) {

			String vc4dn = portDn + "@CTP:/sts3c_au4-j=" + j;
			if (!vc4vc12map.containsKey(vc4dn))
				continue; // 如果该vc4下一个vc12都没有，则无视

			HashMap<Integer, List<CTP>> kmap = jkMap.get(j);
			if (kmap == null)
				kmap = new HashMap<Integer, List<CTP>>();
			for (int k = 1; k <= 3; k++) {
				if (vc3KSet.contains(j + "-" + k))
					continue;
				List<CTP> jkvc12s = kmap.get(k);
				for (int l = 1; l <= 7; l++) {
					for (int m = 1; m <= 3; m++) {
						if (getCTP(jkvc12s, k, l, m) == null) {
							CTP newCTP = new CTP();
							String newDn = portDn + "@CTP:/sts3c_au4-j=" + j + "/vt2_tu12-k=" + k + "-l=" + l + "-m="
									+ m;
							newCTP.setDn(newDn);
							newCTP.setTag1("NEW");
							newCTP.setNativeEMSName("VC12-" + (21 * (m - 1) + 3 * (l - 1) + k));
							newCTP.setPortdn(portDn);
							newCTP.setParentDn(portDn);
							newCTPs.add(newCTP);

						}
					}
				}
			}
		}
		System.out.println(portDn + ":ctps = " + ctps.size());

		if (toDeleteVC3.size() > 0)
			System.out.println(portDn + ":toDeleteVC3 = " + toDeleteVC3.size());
		if (newCTPs.size() > 0)
			System.out.println(portDn + ":newCTPs = " + newCTPs.size());
		ctps.removeAll(toDeleteVC3);
		ctps.addAll(newCTPs);

		filterVC4C(portDn, ctps);
	}

	public static void filterVC4C(String portDn, List<CTP> ctps) {
		List<CTP> vc4s = filterVC4(ctps);
		List<CTP> vc3s = filterVC3(ctps);
		List<CTP> vc12s = filterVC12(ctps);

		HashSet<Integer> vc4cJs = new HashSet<Integer>();
		for (CTP vc4 : vc4s) {
			if (isVC44C(vc4.getDn())) {
				vc4cJs.add(getJ(vc4.getDn()));
			}
		}

		List<CTP> remove = new ArrayList<CTP>();
		for (CTP vc4 : vc4s) {
			if (!isVC44C(vc4.getDn()) && vc4cJs.contains(getJ(vc4.getDn())))
				remove.add(vc4);
			else {
				int j = getJ(vc4.getDn());
				if (vc4cJs.contains(j - 1) || vc4cJs.contains(j - 2) || vc4cJs.contains(j - 3))
					remove.add(vc4);
			}
		}

		for (CTP vc3 : vc3s) {
			if (vc4cJs.contains(getJ(vc3.getDn())))
				remove.add(vc3);
		}

		for (CTP vc12 : vc12s) {
			if (vc4cJs.contains(getJ(vc12.getDn())))
				remove.add(vc12);
		}

		ctps.removeAll(remove);
	}

	public static CTP getCTP(List<CTP> ctps, int k, int l, int m) {
		if (ctps == null)
			return null;
		for (CTP ctp : ctps) {
			String dn = ctp.getDn();
			if (getK(dn) == k && getL(dn) == l && getM(dn) == m) {
				return ctp;
			}
		}
		return null;
	}

	private static List<CTP> filterVC4(List<CTP> ctps) {
		List<CTP> vc4s = new ArrayList<CTP>();

		for (CTP ctp : ctps) {
			if (isVC4(ctp.getDn()))
				vc4s.add(ctp);
		}
		return vc4s;
	}

	private static List<CTP> filterVC3(List<CTP> ctps) {
		List<CTP> vc3 = new ArrayList<CTP>();
		for (CTP ctp : ctps) {
			if (isVC3(ctp.getDn()))
				vc3.add(ctp);
		}
		return vc3;
	}

	private static List<CTP> filterVC12(List<CTP> ctps) {
		List<CTP> vc12 = new ArrayList<CTP>();
		for (CTP ctp : ctps) {
			if (isVC12(ctp.getDn()))
				vc12.add(ctp);
		}
		return vc12;
	}

	public static boolean isVC4(String dn) {
		return dn.indexOf("/sts3c_au4-j") == dn.lastIndexOf("/")
				|| (dn.contains("sts48c_vc4_16c") && dn.indexOf("/sts48c_vc4_16c") == dn.lastIndexOf("/")
				|| (dn.contains("sts12c_vc4_4c") && dn.indexOf("/sts12c_vc4_4c") == dn.lastIndexOf("/"))
				|| (dn.contains("sts192c_vc4_64c") && dn.indexOf("/sts192c_vc4_64c") == dn.lastIndexOf("/")));
	}
	
	public static boolean isVC4Only(String dn) {
		return dn.indexOf("/sts3c_au4-j") == dn.lastIndexOf("/");
	}

	public static boolean isVC44C(String dn) {
		return (dn.contains("sts12c_vc4_4c") && (dn.indexOf("/sts12c_vc4_4c") == dn.lastIndexOf("/")))
				|| (dn.contains("sts48c_vc4_16c") && (dn.indexOf("/sts48c_vc4_16c") == dn.lastIndexOf("/")))

		;
	}
	
	public static boolean isVC4_4C(String dn) {
		return (dn.contains("sts12c_vc4_4c") && (dn.indexOf("/sts12c_vc4_4c") == dn.lastIndexOf("/")));
	}
	
	public static boolean isVC4_16C(String dn) {
		return (dn.contains("sts48c_vc4_16c") && (dn.indexOf("/sts48c_vc4_16c") == dn.lastIndexOf("/")));
	}
	
	public static boolean isVC4_64C(String dn) {
		return (dn.contains("sts192c_vc4_64c") && (dn.indexOf("/sts192c_vc4_64c") == dn.lastIndexOf("/")));
	}

	public static boolean isVC3(String dn) {
		boolean b = dn.indexOf("/tu3_vc3-k") == dn.lastIndexOf("/");
		return b;
	}

	public static boolean isVC12(String dn) {
		return dn.indexOf("/vt2_tu12") > -1;
	}

	public static int getJ(String dn) {
		String vc4c = "sts48c_vc4_16c=";
		if (dn.contains("sts48c_vc4_16c="))
			vc4c = "sts48c_vc4_16c=";
		if (dn.contains("sts12c_vc4_4c="))
			vc4c = "sts12c_vc4_4c=";
		if (dn.contains("sts192c_vc4_64c="))
			vc4c = "sts192c_vc4_64c=";
		if (dn.contains("sts48c_vc4_16c=") || dn.contains("sts12c_vc4_4c=") || dn.contains("sts192c_vc4_64c=")) {
			try {
				int i = dn.lastIndexOf(vc4c);
				if (i > -1) {
					int j = dn.indexOf("/", i);

					if (j > -1) {
						return Integer.parseInt(dn.substring(i + vc4c.length(), j));
					} else
						return Integer.parseInt(dn.substring(i + vc4c.length()));
				}
				return -1;
			} catch (NumberFormatException e) {
				logger.error(e, e);
				return -1;
			}
		}
		try {
			int i = dn.lastIndexOf("j=");
			if (i > -1) {
				int j = dn.indexOf("/", i);

				if (j > -1) {
					return Integer.parseInt(dn.substring(i + 2, j));
				} else
					return Integer.parseInt(dn.substring(i + 2));
			}
			return -1;
		} catch (NumberFormatException e) {
			logger.error(e, e);
			return -1;
		}
	}

	public static int getK(String dn) {
		try {
			int i = dn.lastIndexOf("k=");
			if (i > -1) {
				int j = dn.indexOf("-", i);

				if (j > -1) {
					return Integer.parseInt(dn.substring(i + 2, j));
				} else
					return Integer.parseInt(dn.substring(i + 2));
			}
			return -1;
		} catch (NumberFormatException e) {
			logger.error("Error getK : dn=" + dn);
			logger.error(e, e);
			return -1;
		}
	}

	public static int getL(String dn) {
		try {
			int i = dn.lastIndexOf("l=");
			if (i > -1) {
				int j = dn.indexOf("-", i);
				if (j > -1) {
					return Integer.parseInt(dn.substring(i + 2, j));
				} else
					return Integer.parseInt(dn.substring(i + 2));
			}

		} catch (NumberFormatException e) {
			logger.error(e, e);
		}
		return -1;
	}

	public static int getM(String dn) {
		try {
			int i = dn.lastIndexOf("m=");
			if (i > -1) {
				return Integer.parseInt(dn.substring(i + 2).trim());
			}
		} catch (NumberFormatException e) {
			logger.error(e, e);
		}
		return -1;
	}

	public static void main(String[] args) {
		String ptpName = "EMS_QUZ-T2000-3-P@ManagedElement_591080@PTP___rack=1__shelf=1__slot=1__domain=sdh__port=1";
		List<CTP> o = (List<CTP>) ObjectUtil.readObject(ptpName);
		for (CTP ctp : o) {
			System.out.println("ctp = " + ctp.getDn());
		}
		filterCTPS(ptpName.replaceAll("__", "/"), (List) o);

		System.out.println(isVC4(
				"EMS:QUZ-T2000-3-P@ManagedElement:591080@PTP:/rack=1/shelf=1/slot=1/domain=sdh/port=1@CTP:/sts3c_au4-j=1"));
		System.out.println(isVC3(
				"EMS:QUZ-T2000-3-P@ManagedElement:591080@PTP:/rack=1/shelf=1/slot=1/domain=sdh/port=1@CTP:/sts3c_au4-j=1/tu3_vc3-k=3"));

	}

	class CTPDN {
		int k;
		int l;

	}
}
