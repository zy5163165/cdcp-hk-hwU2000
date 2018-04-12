/**************************************************************************
 *
 * $RCSfile: ConvertorHelper.java,v $  $Revision: 1.1 $  $Date: 2010/04/01 03:03:44 $
 *
 * $Log: ConvertorHelper.java,v $
 * Revision 1.1  2010/04/01 03:03:44  panling
 * MR#:151
 *
 * Revision 1.1  2004/11/26 06:16:52  sea2000
 * MR#:NGINF-124
 *
 * Revision 1.6  2004/09/16 07:56:55  zhengcm
 * MR#:NGWDM50-382
 *
 * Revision 1.5  2004/08/27 08:54:19  zhengcm
 * MR#:NGWDM50-359
 *
 * Revision 1.4  2004/07/22 12:27:20  zhengcm
 * MR#:NGWDM50-255,256
 *
 * Revision 1.3  2004/07/19 08:50:02  zhengcm
 * MR#:NGWDM50-256,255
 *
 * Revision 1.2  2004/07/12 10:38:30  zhengcm
 * MR#:NGINF-101
 *
 * Revision 1.1  2003/08/25 08:34:40  zhough
 * no message
 *
 * Revision 1.4  2003/08/06 08:05:27  zhough
 * *** empty log message ***
 *
 * Revision 1.3  2003/08/04 05:34:30  zhough
 * no message
 *
 * Revision 1.2  2003/06/30 01:28:20  zhough
 * no message
 *
 * Revision 1.1  2003/06/20 06:22:51  zhough
 * *** empty log message ***
 *
 *
 *************************************************************************/
 
/*
 * @(#)ConvertorHelper.java 1.0 2003-06-10
 * Author: Zhou Ganhong
 *
 * Copyright (c) 2001 Gxlu, Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gxlu, Inc. 
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with Gxlu.
 */

package org.asb.mule.probe.ptn.u2000V16.service.mapper;



import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Set;
import java.util.Iterator;

public class ConvertorHelper
{
	
	public static final int[] TOPO_LINK_LEVELS ={0/*highest level*/,1/*subnetwork level*/};
	public static final String DN_DELIM = "@";
	public static final String PARENT_DN = "parentDN";
	public static final String RELATED_DN = "relatedDN";
	public static final String FREQUENCE = "Frequency";
	public static final String SEQUENCE = "Sequence";
	public static final String TYPENAME = "typeName";
	
	static public String printHWname(globaldefs.NameAndStringValue_T[] vendorName)
	{
		String name="";
		for(int i=0;i<vendorName.length-1;i++)
		{
			name=name+vendorName[i].name+"="+vendorName[i].value+"@";
		}
		name=name+vendorName[vendorName.length-1].name+"="+vendorName[vendorName.length-1].value+"@";
		return name;
	}
	
	
	public static globaldefs.NameAndStringValue_T[] createCTPDN(String emsValue , String meValue , String ptpValue ,String ctpValue)
	{
		globaldefs.NameAndStringValue_T[] dn = new globaldefs.NameAndStringValue_T[4];
		
		dn[0] = new globaldefs.NameAndStringValue_T();
		dn[0].name = "EMS";
		dn[0].value = emsValue;
		
		dn[1] = new globaldefs.NameAndStringValue_T();
		dn[1].name = "ManagedElement";
		dn[1].value = meValue;
		
		dn[2] = new globaldefs.NameAndStringValue_T();
		dn[2].name = "PTP";
		dn[2].value = ptpValue;
		
		
		dn[3] = new globaldefs.NameAndStringValue_T();
		dn[3].name = "CTP";
		dn[3].value = ctpValue;
		
		return dn;
	}

	public static String t2gConvertTime(String tmfTime)
	{
		//:TODO from "yyyyMMddhhmmss.s[Z]{+|-}HHmm" to "yyyymmddhhmmss.s[Z]"
		return tmfTime;
	}

	public static String getCurrentTime()
	{
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		StringBuffer g_tm = new StringBuffer();
		
		g_tm.append(year);
		
		if (month < 10) g_tm.append(0).append(month);
		else g_tm.append(month);
		
		if (day <10) g_tm.append(0).append(day);
		else g_tm.append(day);
		
		if (hour < 10) g_tm.append(0).append(hour);
		else g_tm.append(hour);
		
		if (minute < 10) g_tm.append(0).append(minute);
		else g_tm.append(minute);
		
		if (second < 10) g_tm.append(0).append(second);
		else g_tm.append(second);
		
		g_tm.append(".0");
		
		return g_tm.toString();
	}

	//modify by wdm modify code 011 action add
	public static String getString(String str){
		if( str == null )
			str = "";
		return str;
	}
	
	public static String getfShowedStr(String str)

	{

		String ret = "";

		try

		{

			byte[] bytes = str.getBytes("ISO-8859-1");

			
			System.out.println("bytes.length = " + bytes.length);
			
			byte[] bytetest = str.getBytes();
			System.out.println("The bytes are: " + bytetest);

			ret = new String(bytes, "gb2312");

			return ret;

		}

		catch (UnsupportedEncodingException e)

		{

			

		}
		return ret;
	}
	
	

}
