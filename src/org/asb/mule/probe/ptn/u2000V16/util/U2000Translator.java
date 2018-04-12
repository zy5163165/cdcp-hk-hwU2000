package org.asb.mule.probe.ptn.u2000V16.util;

import com.alcatelsbell.nms.valueobject.pfms.PFMData;
import globaldefs.NameAndStringValue_T;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.service.Constant;
import performance.PMData_T;
import performance.PMMeasurement_T;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 2014/11/8
 * Time: 21:31
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class U2000Translator {
    private static Log logger = LogFactory.getLog(U2000Translator.class);
    public static List<PFMData> transPFMData(String neDn,String entityDn,int entityType,PMData_T pmData_t) {
        List<PFMData> data = new ArrayList<PFMData>();
        PMMeasurement_T[] pmMeasurementList = pmData_t.pmMeasurementList;
        if (pmMeasurementList != null) {
            for (PMMeasurement_T pmMeasurement_t : pmMeasurementList) {
                PFMData pfmData = new PFMData();
                pfmData.setCategory(pmMeasurement_t.pmParameterName);
                pfmData.setValue((double)pmMeasurement_t.value);
                pfmData.setUnit(pmMeasurement_t.unit);
                pfmData.setEntityDn(entityDn);
             //   pfmData.setEntityId(entityId);
                pfmData.setEntityType(entityType);
              //  pfmData.setDeviceId(neId);
                pfmData.setDeviceDn(neDn);
                pfmData.setTimestamp(convertTime(pmData_t.retrievalTime));
                data.add(pfmData);
            }
        }
        return data;
    }

    public static Date convertTime(String retrievalTime) {

        if (retrievalTime == null || retrievalTime.length() < 14) return null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            return sdf.parse(retrievalTime.substring(0,14));
        } catch (ParseException e) {
            logger.error("Failed to parse time : "+retrievalTime);
        }
        return null;
    }

    public static String nv2dn(NameAndStringValue_T[] name) {
        if (name != null && name.length > 0) {
            StringBuilder dnString = new StringBuilder();
            for (NameAndStringValue_T nv : name) {
                dnString.append(Constant.dnSplit).append(nv.name).append(Constant.namevalueSplit).append(nv.value);
            }
            return dnString.substring(1);
        }
        return "";
    }

}
