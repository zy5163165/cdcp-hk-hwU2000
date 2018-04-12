package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.entity.R_TrafficTrunk_CC_Section;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.valueobject.BObject;

public class TrafficTrunkAndCrossConnectionAndSectionDataTask extends CommonDataTask {

	private HashMap<String, Section> tpSectionMap;

	private String TYPECC = "CC";
	private String TYPESECTION = "SECTION";
	private String tunnelName = null;

	// private Logger logger = ProbeLog.getInstance().getDataLog();

	public Vector<BObject> excute() {

		try {
			List<IPCrossconnection> ccList = service.retrieveRoute(this.getTask().getObjectName());

			Map<String, R_TrafficTrunk_CC_Section> relationList = new HashMap<String, R_TrafficTrunk_CC_Section>();
			for (IPCrossconnection cc : ccList) {
				// 1.mapper IPCrossconnection to R_TrafficTrunk_CC_Section
				if (cc.getNativeEMSName().equals(tunnelName)) {
					//Route����Ҫ��
					//R_TrafficTrunk_CC_Section relation = CCToRelation(cc, TYPECC);
					//relationList.put(relation.getCcOrSectionDn(), relation);
					// 2.get related section by CC aend
					Section secA = tpSectionMap.get(cc.getaPtp());
					if (secA != null) {
						R_TrafficTrunk_CC_Section relationA = SectionToRelation(secA, TYPESECTION);
						relationList.put(relationA.getCcOrSectionDn(), relationA);
					}
					// 3.get related section by CC zend
					Section secZ = tpSectionMap.get(cc.getzPtp());
					if (secZ != null) {
						R_TrafficTrunk_CC_Section relationZ = SectionToRelation(secZ, TYPESECTION);
						relationList.put(relationZ.getCcOrSectionDn(), relationZ);
					}
				}
			}

			for (R_TrafficTrunk_CC_Section rel : relationList.values()) {
				getSqliteConn().insertBObject(rel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	private R_TrafficTrunk_CC_Section SectionToRelation(Section section, String type) {
		R_TrafficTrunk_CC_Section relation = new R_TrafficTrunk_CC_Section();
		relation.setTrafficTrunDn(this.getTask().getObjectName());
		relation.setType(type);
		relation.setCcOrSectionDn(section.getDn());
		relation.setaEnd(section.getaEndTP());
		relation.setzEnd(section.getzEndTP());
		return relation;
	}

	private R_TrafficTrunk_CC_Section CCToRelation(IPCrossconnection cc, String type) {
		R_TrafficTrunk_CC_Section relation = new R_TrafficTrunk_CC_Section();
		relation.setTrafficTrunDn(this.getTask().getObjectName());
		relation.setType(type);
		relation.setCcOrSectionDn(cc.getDn());
		relation.setaEnd(cc.getaEnd());
		relation.setaPtp(cc.getaPtp());
		relation.setzEnd(cc.getzEnd());
		relation.setzPtp(cc.getzPtp());
		return relation;
	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	public void setTpSectionMap(HashMap tpSectionMap) {
		this.tpSectionMap = tpSectionMap;
	}

	public HashMap getTpSectionMap() {
		return tpSectionMap;
	}

	public String getTunnelName() {
		return tunnelName;
	}

	public void setTunnelName(String tunnelName) {
		this.tunnelName = tunnelName;
	}

}
