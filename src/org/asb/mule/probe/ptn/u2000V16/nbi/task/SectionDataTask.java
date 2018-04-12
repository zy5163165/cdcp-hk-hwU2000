package org.asb.mule.probe.ptn.u2000V16.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.db.components.service.JPASupport;
import com.alcatelsbell.nms.db.components.service.JPAUtil;
import com.alcatelsbell.nms.valueobject.BObject;

public class SectionDataTask extends CommonDataTask {

	public SectionDataTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		Vector<BObject> neVec = new Vector<BObject>();

		List<Section> sectionList = service.retrieveAllSections();
		try {
			if (sectionList != null && sectionList.size() > 0) {
				nbilog.info("Section : " + sectionList.size());
				// JPASupport sqliteJPASupport = SqliteService.getInstance().getJpaSupport();
				// sqliteJPASupport.begin();
				for (Section section : sectionList) {
					insertToSqliteDB(section);
					// JPAUtil.getInstance().saveObject(sqliteJPASupport, -1, section);
					neVec.add(section);
				}
				// SqliteService.getInstance().getJpaSupport().end();
				// SqliteService.getInstance().getJpaSupport().release();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// SqliteService.getInstance().getJpaSupport().release();
			return neVec;
		}

	}

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
