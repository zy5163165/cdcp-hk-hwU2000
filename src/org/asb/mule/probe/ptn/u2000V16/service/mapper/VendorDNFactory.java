/**************************************************************************
 *
 * $RCSfile: IFW_DNFactory.java,v $  $Revision: 1.5 $  $Date: 2002/10/22 11:49:02 $
 *
 * $Log: IFW_DNFactory.java,v $
 * Revision 1.5  2002/10/22 11:49:02  sea2000
 * *** empty log message ***
 *
 * Revision 1.4  2002/06/25 06:20:40  zgliu
 * no message
 *
 *
 ***************************************************************************/
 
/*
 * @(#)IFW_DNFactory.java 1.0 2002/03/19
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

import org.asb.mule.probe.framework.service.Constant;

import globaldefs.NameAndStringValue_T;



public class VendorDNFactory
{
	final public static String _emsName = "EMS";
	final public static String _subnetworkName = "MultiLayerSubnetwork";
	final public static String _subnetworkConnectionName = "SubnetworkConnection";
	final public static String _managedElementName = "ManagedElement";
	final public static String _protectionGroupName = "PGP";
	final public static String _EquipmentHolderName = "EquipmentHolder";
	final public static String _EquipmentName = "Equipment";
	final public static String _ptpName = "PTP";
	final public static String _ctpName = "CTP";
	final public static String _topologicalLinkName = "TopologicalLink";
	final public static String _trailName = "Trail";
	final public static String _trafficTrunkName = "TrafficTrunk";
	public static String _flowdomainName = "Flowdomain";
	public static String _TrafficTrunkName = "TrafficTrunk";
	
	public static NameAndStringValue_T[] createEmsDN(String emsValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[1];

		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;

		return dn;
	}
	
	public static NameAndStringValue_T[] createSubnetworkDN(String emsValue , String subnetworkValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];

		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _subnetworkName;
		dn[1].value = subnetworkValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createFlowDomainDN(String emsValue , String fdValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];

		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _flowdomainName;
		dn[1].value = fdValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createCommonDN(String dnString) {
		String[] ss=dnString.split(Constant.dnSplit);
		NameAndStringValue_T[] dn = new NameAndStringValue_T[ss.length];
		for (int i=0;i<ss.length;i++) {
			dn[i] = new NameAndStringValue_T();
			String[] nameAndValueStr=ss[i].split(Constant.namevalueSplit);
			dn[i].name = nameAndValueStr[0];
			dn[i].value = nameAndValueStr[1];
		}
		return dn;
	}
	
	public static NameAndStringValue_T[] createTrafficTrunkDN(String emsValue , String fdValue,String trafficTrunkValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];

		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _flowdomainName;
		dn[1].value = fdValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = _TrafficTrunkName;
		dn[2].value = trafficTrunkValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createSNCDN(String emsValue , String subnetworkValue , String sncValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _subnetworkName;
		dn[1].value = subnetworkValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = _subnetworkConnectionName;
		dn[2].value = sncValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createMEDN(String emsValue , String meValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createTrafficTrunkDN(String emsName,String emsValue ,String meName, String meValue,String traffictrunkName,String traffictrunkValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = meName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = traffictrunkName;
		dn[2].value = traffictrunkValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createPGPDN(String emsValue , String meValue , String pgpValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = _protectionGroupName;
		dn[2].value = pgpValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createEquipmentHolderDN(String emsValue , String meValue , String shelfValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = _EquipmentHolderName;
		dn[2].value = shelfValue;
		
		return dn;
	}
	
	
	
	public static NameAndStringValue_T[] createCircuitPackDN(String emsValue , String meValue , String equipmentHolderValue , String circuitpackValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[4];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = _EquipmentHolderName;
		dn[2].value = equipmentHolderValue;
		
		dn[3] = new NameAndStringValue_T();
		dn[3].name = _EquipmentName;
		dn[3].value = circuitpackValue;
		
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createPTPDN(String emsValue , String meValue ,String tpName, String ptpValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[3];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = tpName;
		dn[2].value = ptpValue;
		
		return dn;
	}
	
	
	
	public static NameAndStringValue_T[] createCTPDN(String emsValue , String meValue ,String ptpName, String ptpValue ,String ctpValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[4];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _managedElementName;
		dn[1].value = meValue;
		
		dn[2] = new NameAndStringValue_T();
		dn[2].name = ptpName;
		dn[2].value = ptpValue;
		
		
		dn[3] = new NameAndStringValue_T();
		dn[3].name = _ctpName;
		dn[3].value = ctpValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createTLDN(String emsValue , String topologicallinkValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _topologicalLinkName;
		dn[1].value = topologicallinkValue;
		
		return dn;
	}
	
	public static NameAndStringValue_T[] createTrailDN(String emsValue , String trailValue)
	{
		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];
		
		dn[0] = new NameAndStringValue_T();
		dn[0].name = _emsName;
		dn[0].value = emsValue;
		
		dn[1] = new NameAndStringValue_T();
		dn[1].name = _trailName;
		dn[1].value = trailValue;
		
		return dn;
	}
	
	
}
