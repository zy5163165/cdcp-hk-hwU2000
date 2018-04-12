package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import org.asb.mule.probe.framework.service.Constant;
import org.omg.CosNotification.*;

import globaldefs.NameAndStringValue_T;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Class contains information used in object creation notification.
 */
public class ObjectCreationNotification implements java.io.Serializable {

	public ObjectCreationNotification(StructuredEvent notification) {
		for (int i = 0; i < notification.filterable_data.length; i++) {
			Property property = notification.filterable_data[i];

			properties.put(property.name, property.value);
		}

		createdObject = notification.remainder_of_body;
	}

	public String notificationId() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("notificationId");

		return value.extract_string();
	}

	public globaldefs.NameAndStringValue_T[] objectName() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("objectName");

		return globaldefs.NamingAttributes_THelper.extract(value);
	}

	public notifications.ObjectType_T objectType() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("objectType");

		return notifications.ObjectType_THelper.extract(value);
	}

	public String objectTypeQualifier() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("objectTypeQualifier");

		return value.extract_string();
	}

	public String emsTime() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("emsTime");

		return value.extract_string();
	}

	public String neTime() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("neTime");

		return value.extract_string();
	}

	public boolean edgePointRelated() throws Exception {
		org.omg.CORBA.Any value = lookupProperty("edgePointRelated");

		return value.extract_boolean();
	}

	public org.omg.CORBA.Any createdObject() {
		return createdObject;

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

	private org.omg.CORBA.Any createdObject;

	public String toString() {
		StringBuilder localStringBuffer = new StringBuilder();

		try {
			localStringBuffer.append("ObjectCreationNotification");
			localStringBuffer.append("(notificationId=");
			localStringBuffer.append(notificationId());
			localStringBuffer.append(",");
			localStringBuffer.append("objectName=[");
			for (NameAndStringValue_T nv : objectName()) {
				localStringBuffer.append(Constant.dnSplit).append(nv.name).append(Constant.namevalueSplit).append(nv.value);
			}
			localStringBuffer.append("],");
			localStringBuffer.append("objectTypeQualifier=");
			localStringBuffer.append(objectTypeQualifier());
			localStringBuffer.append(",");
			localStringBuffer.append("objectType=");
			localStringBuffer.append(objectType());
			localStringBuffer.append(",");
			localStringBuffer.append("emsTime=");
			localStringBuffer.append(emsTime());
			localStringBuffer.append("neTime=");
			localStringBuffer.append(neTime());
			localStringBuffer.append(",");
			localStringBuffer.append("edgePointRelated=");
			localStringBuffer.append(edgePointRelated());
			localStringBuffer.append(")");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return localStringBuffer.toString();
	}

}
