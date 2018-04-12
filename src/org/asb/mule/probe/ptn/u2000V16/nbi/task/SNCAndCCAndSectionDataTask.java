package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.R_TrafficTrunk_CC_Section;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;


import com.alcatelsbell.nms.valueobject.BObject;

public class SNCAndCCAndSectionDataTask extends CommonDataTask {

	private String TYPECC = "CC";
	private String TYPESECTION = "SECTION";

	public Vector<BObject> excute() {
		try {
			Vector<R_TrafficTrunk_CC_Section> relationList = new Vector<R_TrafficTrunk_CC_Section>();
			List<CrossConnect> ccList = new ArrayList<CrossConnect>();
			List<Section> sectionList = new ArrayList<Section>();
			service.retrieveRouteAndTopologicalLinks(getTask().getObjectName(), ccList, sectionList);
			for (CrossConnect cc : ccList) {
				R_TrafficTrunk_CC_Section relation = CCToRelation(cc, TYPECC);
				relationList.add(relation);
			}
			for (Section section : sectionList) {
				R_TrafficTrunk_CC_Section relation = SectionToRelation(section, TYPESECTION);
				relationList.add(relation);
			}
			if (relationList != null && relationList.size() > 0) {
				for (R_TrafficTrunk_CC_Section relation : relationList) {
					insertToSqliteDB(relation);
				}
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

	private R_TrafficTrunk_CC_Section CCToRelation(CrossConnect cc, String type) {
		R_TrafficTrunk_CC_Section relation = new R_TrafficTrunk_CC_Section();
		relation.setTrafficTrunDn(this.getTask().getObjectName());
		relation.setType(type);
		relation.setCcOrSectionDn(cc.getDn());
		relation.setaEnd(cc.getaEndNameList());
		relation.setzEnd(cc.getzEndNameList());
		relation.setaPtp(cc.getaEndTP());
		relation.setzPtp(cc.getzEndTP());
		relation.setAdditionalInfo(cc.getAdditionalInfo());
        relation.setTag1(cc.getTag1());
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

}
