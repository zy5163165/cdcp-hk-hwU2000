package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import org.omg.CosNotification.*;

import java.util.Hashtable;

/**
  * Class contains information used in object attribute value change or state change notification.
*/  
public class AVCNotification implements java.io.Serializable
{
	boolean isStateChanged = false;
	
	public AVCNotification(StructuredEvent notification,boolean isStateChanged)
	{
		for(int i =0 ;i < notification.filterable_data.length; i++){
			Property property = notification.filterable_data[i];

			properties.put(property.name, property.value);
		}
		this.isStateChanged = isStateChanged;
		
	}
	
	public boolean isStateChanged()
	{
		return isStateChanged;
	}


	public String notificationId()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("notificationId");

		return value.extract_string();
	}

	
	public globaldefs.NameAndStringValue_T[] objectName()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("objectName");

		return globaldefs.NamingAttributes_THelper.extract(value);
	}

	public notifications.ObjectType_T objectType()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("objectType");

		return  notifications.ObjectType_THelper.extract(value);
	}

	public String emsTime()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("emsTime");

		return value.extract_string();
	}

	public String neTime()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("neTime");

		return value.extract_string();
	}

	public boolean edgePointRelated()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("edgePointRelated");

		return value.extract_boolean();
	}

	public notifications.NameAndAnyValue_T[] attributeList()
	throws Exception
	{
		org.omg.CORBA.Any value = lookupProperty("attributeList");

		return notifications.NVList_THelper.extract(value);
	}
	
	public String toString()
 	{
 		StringBuffer buf = new StringBuffer();
 		
 		try{
	 		buf.append("[id: " + notificationId()+"]");
	 		buf.append("\t[location: " );
	 		globaldefs.NameAndStringValue_T[] objectName = objectName();
	 		for(int i=0; i<objectName.length; i++){
	 			buf.append("[");
	 			buf.append(objectName[i].name);
	 			buf.append(",");
	 			buf.append(objectName[i].value);
	 			buf.append("]");
	 		}
	 		buf.append("]");
	 		buf.append("\t[netime: " + neTime()+"]");
 		}
 		catch(Throwable e){}
 		
 		return buf.toString();
 	}


	private org.omg.CORBA.Any lookupProperty(String name)
	throws Exception
	{
		if(null == properties.get(name))
			throw new Exception("Can't find property: " + name);

		return (org.omg.CORBA.Any)properties.get(name);
	}

	//
	// Attributes.
	//

	// Key: String, name of property, value: org.omg.corba.any, value of property.
	private Hashtable properties = new Hashtable();
}

