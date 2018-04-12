package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import globaldefs.NameAndStringValue_T;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.asb.mule.probe.framework.service.Constant;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;

/**
 * Class contains information used in Alarm notification.
 */
public class AlarmNotification implements java.io.Serializable {
	public AlarmNotification(StructuredEvent notification) {
		for (int i = 0; i < notification.filterable_data.length; i++) {
			Property property = notification.filterable_data[i];

			properties.put(property.name, property.value);

		}
	}

	public String notificationId() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("notificationId");

		return value.extract_string();
	}

	public globaldefs.NameAndStringValue_T[] objectName() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("objectName");

		return globaldefs.NamingAttributes_THelper.extract(value);
	}

	// Identifies the object as portrayed on the EMS user interface.
	public String nativeEMSName() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("nativeEMSName");

		return value.extract_string();
	}

	// Identifies the probableCause as portrayed on the EMS user interface.
	public String nativeProbableCause() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("nativeProbableCause");

		return value.extract_string();
	}

	public notifications.ObjectType_T objectType() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("objectType");

		return notifications.ObjectType_THelper.extract(value);
	}

	public String emsTime() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("emsTime");

		return value.extract_string();
	}

	public String neTime() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("neTime");

		return value.extract_string();
	}

	public boolean isClearable() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("isClearable");

		return value.extract_boolean();
	}

	// The layer which this switch is relevant to.
	public short layerRate() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("layerRate");

		return value.extract_short();
	}

	public String probableCause() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("probableCause");

		return value.extract_string();

	}

	public String probableCauseQualifier() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("probableCauseQualifier");

		return value.extract_string();

	}

	// Perceived severity should be set to PS_INDETERMINATE for raises and PS_CLEARED for clears.
	public notifications.PerceivedSeverity_T perceivedSeverity() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("perceivedSeverity");

		return notifications.PerceivedSeverity_THelper.extract(value);
	}

	// Indicates whether the alarm has affected service
	public notifications.ServiceAffecting_T serviceAffecting() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("serviceAffecting");

		return notifications.ServiceAffecting_THelper.extract(value);
	}

	public globaldefs.NameAndStringValue_T[][] affectedTPList() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("affectedTPList");

		return globaldefs.NamingAttributesList_THelper.extract(value);
	}

	public String additionalText() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("additionalText");

		return value.extract_string();
	}

	public globaldefs.NameAndStringValue_T[] additionalInfo() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("additionalInfo");

		return globaldefs.NVSList_THelper.extract(value);
	}

	public String toString() {
		StringBuilder localStringBuffer = new StringBuilder();

		try {
			localStringBuffer.append("AlarmNotification");
			localStringBuffer.append("(notificationId=");
			localStringBuffer.append(notificationId());
			localStringBuffer.append(",");
			localStringBuffer.append("objectName=[");
			for (NameAndStringValue_T nv : objectName()) {
				localStringBuffer.append(Constant.dnSplit).append(nv.name).append(Constant.namevalueSplit).append(nv.value);
			}
			localStringBuffer.append("],");
			localStringBuffer.append("nativeEMSName=");
			localStringBuffer.append(nativeEMSName());
			localStringBuffer.append(",");
			localStringBuffer.append("nativeProbableCause=");
			localStringBuffer.append(nativeProbableCause());
			localStringBuffer.append(",");
			localStringBuffer.append("objectType=");
			localStringBuffer.append(objectType());
			localStringBuffer.append(",");
			localStringBuffer.append("emsTime=");
			localStringBuffer.append(emsTime());
			localStringBuffer.append("neTime=");
			localStringBuffer.append(neTime());
			localStringBuffer.append(",");
			localStringBuffer.append("isClearable=");
			localStringBuffer.append(isClearable());
			localStringBuffer.append(",");
			localStringBuffer.append("layerRate=");
			localStringBuffer.append(layerRate());
			localStringBuffer.append(",");
			localStringBuffer.append("probableCause=");
			localStringBuffer.append(probableCause());
			localStringBuffer.append(",");
			localStringBuffer.append("probableCauseQualifier=");
			localStringBuffer.append(probableCauseQualifier());
			localStringBuffer.append(",");
			localStringBuffer.append("perceivedSeverity=");
			localStringBuffer.append(perceivedSeverity());
			localStringBuffer.append(",");
			localStringBuffer.append("serviceAffecting=");
			localStringBuffer.append(serviceAffecting());
			localStringBuffer.append(",");
			localStringBuffer.append("perceivedSeverity=");
			localStringBuffer.append(perceivedSeverity());
			localStringBuffer.append(",");
			localStringBuffer.append("additionalText=");
			localStringBuffer.append(additionalText());
			localStringBuffer.append(")");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return localStringBuffer.toString();
	}

	private org.omg.CORBA.Any lookupProperty(String name) throws Exception {
		if (null == properties.get(name))
			throw new Exception("Can't find property: " + name);

		return (org.omg.CORBA.Any) properties.get(name);
	}

	//
	// Attributes.
	//

	// Key: String, name of property, value: org.omg.corba.any, value of property.
	private Hashtable properties = new Hashtable();

	public static void main(String[] args) {
		Method[] declaredMethods = AlarmNotification.class.getDeclaredMethods();
		for (Method declaredMethod : declaredMethods) {
			System.out.println("data.put(\""+declaredMethod.getName()+"\",alarm."+declaredMethod.getName()+"());");
		}
	}

}
