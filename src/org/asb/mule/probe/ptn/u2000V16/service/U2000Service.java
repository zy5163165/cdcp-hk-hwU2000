package org.asb.mule.probe.ptn.u2000V16.service;

import com.alcatelsbell.cdcp.nodefx.exception.EmsDataIllegalException;
import com.alcatelsbell.cdcp.nodefx.exception.EmsFunctionInvokeException;
import com.alcatelsbell.nms.util.ObjectUtil;
import emsMgr.EMS_THolder;
import encapsulationLayerLink.EncapsulationLayerLink_T;
import equipment.EquipmentHolder_T;
import equipment.EquipmentOrHolder_T;
import equipment.EquipmentTypeQualifier_T;
import equipment.Equipment_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

import java.io.UnsupportedEncodingException;
import java.util.*;

import managedElement.ManagedElement_T;

import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.EncapsulationLayerLink;
import org.asb.mule.probe.framework.entity.Equipment;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.FlowDomain;
import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.HW_EthService;
import org.asb.mule.probe.framework.entity.HW_MSTPBindingPath;
import org.asb.mule.probe.framework.entity.HW_VirtualBridge;
import org.asb.mule.probe.framework.entity.HW_VirtualLAN;
import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.framework.entity.MatrixFlowDomainFragment;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.entity.PWTrail;
import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.R_FTP_PTP;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.entity.SubnetworkConnection;
import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.CTPTest;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.CTPUtil;
import org.asb.mule.probe.ptn.u2000V16.nbi.job.CtpConvertor;
import org.asb.mule.probe.ptn.u2000V16.sbi.NmsSession;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.EMSMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.EncapsulationLayerLinkMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.EquipmentInventoryMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.MSTPInventoryMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.MSTPServiceMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.ManagedElementMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.ProtectionMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.SubnetworkMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.TopoMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.VpnMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.ConvertorHelper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.CtpMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.EquipmentHolderMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.EquipmentMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.FlowDomainFragmentMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.HW_MSTPMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.IPCrossconnectionMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.IPProtectionGroupMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.ManagedElementMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.PtpMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.SectionMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.SubnetworkConnectionMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.TopoNodeMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.TrafficTrunkMapper;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.VendorDNFactory;

import performance.*;
import subnetworkConnection.CrossConnect_T;
import subnetworkConnection.SubnetworkConnection_T;
import subnetworkConnection.TPData_T;
import terminationPoint.TerminationPoint_T;
import topologicalLink.TopologicalLink_T;
import trailNtwProtection.TrailNtwProtection_T;
import HW_mstpInventory.HW_MSTPBindingPath_T;
import HW_mstpInventory.HW_MSTPEndPoint_T;
import HW_mstpInventory.HW_VirtualBridge_T;
import HW_mstpInventory.HW_VirtualLAN_T;
import HW_mstpService.HW_EthServiceType_T;
import HW_mstpService.HW_EthService_T;
import HW_vpnManager.FlowDomainFragment_T;
import HW_vpnManager.IPCrossConnection_T;
import HW_vpnManager.MatrixFlowDomainFragment_T;
import HW_vpnManager.TrafficTrunk_T;
import TopoManagementManager.Node_T;

public class U2000Service implements NbiService {

	// protected Logger errorlog = ProbeLog.getInstance().getErrorLog();
	// protected Logger sbilog = ProbeLog.getInstance().getSbiLog();

	private CorbaService corbaService;

	private FileLogger sbilog = null;
	private FileLogger errorlog = null;

	private String key;

	public U2000Service() {
	}

	public String getServiceName() {

		return corbaService.getEmsName();

	}

	@Override
	public String getEmsName() {
		// TODO Auto-generated method stub
		sbilog = corbaService.getSbilog();
		errorlog = corbaService.getErrorlog();
		return corbaService.getEmsName();
	}

	public void setCorbaService(CorbaService corbaService) {
		sbilog = corbaService.getSbilog();
		errorlog = corbaService.getErrorlog();
		this.corbaService = corbaService;
	}

	public CorbaService getCorbaService() {
		return corbaService;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public List<TopoNode> retrieveAllTopoNodes() {
		Node_T[] nodes = null;
		List<TopoNode> topoList = new ArrayList<TopoNode>();
		try {
			nodes = TopoMgrHandler.instance().retrieveAllTopNodes(corbaService.getNmsSession().getTopoMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllTopoNodes ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		}
		if (nodes != null) {
			for (Node_T node : nodes) {
				try {
					TopoNode ne = TopoNodeMapper.instance().convertTopoNode(node);
					topoList.add(ne);
				} catch (Exception e) {
					errorlog.error("retrieveAllTopoNodes convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllTopoNodes : " + topoList.size());
		return topoList;
	}

	// 1.
	public List<ManagedElement> retrieveAllManagedElements() {
		ManagedElement_T[] vendorNeList = null;
		List<ManagedElement> neList = new ArrayList();
		try {
			sbilog.info("retrieveAllManagedElements : corbaService.emsname=" + corbaService.getEmsName());
			sbilog.info("retrieveAllManagedElements : corbaService.getNmsSession().getManagedElementMgr()=" +corbaService.getNmsSession().getManagedElementMgr());
			vendorNeList = ManagedElementMgrHandler.instance().retrieveAllManagedElements(corbaService.getNmsSession().getManagedElementMgr());
			ObjectUtil.saveObject("Huawei_U2000.ne",vendorNeList);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			corbaService.handleException(new EmsFunctionInvokeException("retrieveAllManagedElements",e));
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
			corbaService.handleException(new EmsFunctionInvokeException("retrieveAllManagedElements",e));

		}
		sbilog.info("retrieveAllManagedElements : vendorNeList =" + vendorNeList);
		sbilog.info("retrieveAllManagedElements : vendorNeList length=" + vendorNeList.length);
		if (vendorNeList == null || vendorNeList.length == 0)
			corbaService.handleException(new EmsDataIllegalException("Managedelement",null," size = 0 "));
		if (vendorNeList != null && vendorNeList.length > 0) {
			corbaService.handleExceptionRecover(EmsDataIllegalException.EXCEPTION_CODE+"Managedelement");
			corbaService.handleExceptionRecover(EmsFunctionInvokeException.EXCEPTION_CODE+"retrieveAllManagedElements");
			sbilog.info("retrieveAllManagedElements : vendorNeList != null");
           for (ManagedElement_T vendorNe : vendorNeList) {
        	   sbilog.info("retrieveAllManagedElements : vendorNe.name=" + vendorNe.name + "vendorNe.nativeEMSName"+vendorNe.nativeEMSName);
				sbilog.info("vendorNe : " + CodeTool.IsoToUtf8(vendorNe.name+"-"+vendorNe.nativeEMSName));
				try {
					if (vendorNe.productName.contains("Virtual")) {
						sbilog.info("VirtualNE : " + vendorNe);
						continue;
					}
					ManagedElement ne = ManagedElementMapper.instance().convertManagedElement(vendorNe);
					neList.add(ne);
				} catch (Exception e) {
					errorlog.error("retrieveAllManagedElements convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllManagedElements : " + neList.size());
		return neList;
	}

	/**
	 * 2.
	 * 
	 * @return
	 */
	public List<Equipment> retrieveAllEquipments(String neName) {
		Equipment_T[] vendorCardList = null;
		List<Equipment> cardList = new ArrayList();
		try {

			// String[] neNameList = neName.split(Constant.dnSplit);
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			vendorCardList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipments(corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEquipments ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			e.printStackTrace();
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllEquipments CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorCardList != null) {
			for (Equipment_T vendorCard : vendorCardList) {
				try {
					Equipment card = EquipmentMapper.instance().convertEquipment(vendorCard, neName);
					cardList.add(card);
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipments convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEquipments : " + cardList.size());
		return cardList;

	}

	/**
	 * 3.
	 * 
	 * @return
	 */
	public List<EquipmentHolder> retrieveAllEquipmentHolders(String neName) {
		EquipmentHolder_T[] vendorHolderList = null;
		List<EquipmentHolder> holderList = new ArrayList();
		try {

			// String[] neNameList = neName.split(Constant.dnSplit);
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);

			vendorHolderList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentHolders(corbaService.getNmsSession().getEquipmentInventoryMgr(),
					neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEquipmentHolders ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			e.printStackTrace();
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllEquipmentHolders CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorHolderList != null) {
			for (EquipmentHolder_T vendorHolder : vendorHolderList) {
				try {
					EquipmentHolder card = EquipmentHolderMapper.instance().convertEquipmentHolder(vendorHolder, neName);
					holderList.add(card);
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipmentHolders convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEquipmentHolders : " + holderList.size());
		return holderList;
	}

	/**
	 * 2.3.???????????
	 * 
	 * @return
	 */
	public void retrieveAllEquipmentAndHolders(String neName, List<EquipmentHolder> equipmentHolderList, List<Equipment> equipmentList) {
		EquipmentOrHolder_T[] equipmentOrHolderList = null;
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
		try {
			equipmentOrHolderList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentAndHolders(
					corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
			sbilog.info("equipmentOrHolderList size ="+(equipmentOrHolderList == null ? "-1" : ""+equipmentOrHolderList.length));
		} catch (ProcessingFailureException e) {
			errorlog.error(neName + " retrieveAllEquipmentAndHolders ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			// once again
			try {
				Thread.sleep(120000L);
			} catch (InterruptedException e2) {
				errorlog.error("retrieveAllEquipmentAndHolders1 InterruptedException: ", e2);
			}
			try {
				equipmentOrHolderList = EquipmentInventoryMgrHandler.instance().retrieveAllEquipmentAndHolders(
						corbaService.getNmsSession().getEquipmentInventoryMgr(), neDn);
			} catch (ProcessingFailureException e1) {
				errorlog.error(neName + " retrieveAllEquipmentAndHolders1 ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			} catch (org.omg.CORBA.SystemException e1) {
				errorlog.error("retrieveAllEquipmentAndHolders1 CORBA.SystemException: " + e.getMessage(), e1);
			}
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllEquipmentAndHolders CORBA.SystemException: " + e.getMessage(), e);
		}
		if (equipmentOrHolderList != null) {
			for (EquipmentOrHolder_T equipmentOrHolder : equipmentOrHolderList) {
				try {
					if (equipmentOrHolder.discriminator().equals(EquipmentTypeQualifier_T.EQT_HOLDER)) {
						EquipmentHolder holder = EquipmentHolderMapper.instance().convertEquipmentHolder(equipmentOrHolder.holder(), neName);
						equipmentHolderList.add(holder);
					} else if (equipmentOrHolder.discriminator().equals(EquipmentTypeQualifier_T.EQT)) {
						Equipment card = EquipmentMapper.instance().convertEquipment(equipmentOrHolder.equip(), neName);
						equipmentList.add(card);
					}
				} catch (Exception e) {
					errorlog.error("retrieveAllEquipmentAndHolders convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEquipmentAndHolders EquipmentHolders: " + equipmentHolderList.size());
		sbilog.info("retrieveAllEquipmentAndHolders Equipments: " + equipmentList.size());

	}

	/**
	 * 4.
	 * 
	 * @return
	 */
	public List<PTP> retrieveAllPtps(String neName) {
		TerminationPoint_T[] vendorPtpList = null;
		List<PTP> ptpList = new ArrayList<PTP>();
		// String[] neNameList = neName.split(Constant.dnSplit);
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
		try {
			short[] tpLayerRateList = new short[0];
			short[] connectionLayerRateList = new short[0];
			vendorPtpList = ManagedElementMgrHandler.instance().retrieveAllPTPs(corbaService.getNmsSession().getManagedElementMgr(), neDn, tpLayerRateList,
					connectionLayerRateList);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllPtps ProcessingFailureException: " + (e.errorReason)+"_"+CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllPtps CORBA.SystemException: " + e.getMessage(), e);
		}
		// for (TerminationPoint_T ptp : vendorPtpList) {
		// sbilog.info("PTP : " + ptp);
		// }
		if (vendorPtpList != null) {
			for (TerminationPoint_T vendorPtp : vendorPtpList) {
				try {
					PTP ptp = PtpMapper.instance().convertPtp(vendorPtp, neName);
					ptpList.add(ptp);
				} catch (Exception e) {
					errorlog.error("retrieveAllPtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllPtps : " + ptpList.size());
		// try {
		// ptpList.addAll(retrieveAllMSTPPtps(neDn));
		// } catch (ProcessingFailureException e) {
		// errorlog.error("retrieveAllMSTPPtps  Exception: " + e.getMessage(), e);
		// }
		// sbilog.info("retrieveAllPtps : " + ptpList.size());
		return ptpList;
	}
    public List<CTP> retrieveAllSDHCtps(PTP ptp) {
    	sbilog.info("retrieveAllSDHCtps : Ready...");
        String ptpName = ptp.getDn();

        NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);

        short[] layerRateList = CTPUtil.layRateList(ptp.getRate());
        short stmNumber = CTPTest.getContainedSTMn(layerRateList);
        if (stmNumber != -1)
        {
            List<CTP> ctpList = new ArrayList<CTP>();
            //vendorCTPs = getMSSTMnContainedTPs(vendorTpName, stmNumber);
            Vector<TerminationPoint_T> vendorCtpList = null;
            try {
            	sbilog.info("retrieveAllSDHCtps : Start...");
                vendorCtpList = getMSSTMnContainedTPs_New(ptpDn, ptpDn, stmNumber);

                if (vendorCtpList != null) {
                    for (TerminationPoint_T vendorctp : vendorCtpList) {
                        try {
                            CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
                            ctpList.add(ctp);
                        } catch (Exception e) {
                            errorlog.error("retrieveAllCtps convertException: ", e);
                        }
                    }
                }
                sbilog.info("retrieveAllCtps : " + ctpList.size());
                 CTPUtil.filterCTPS(ptpName,ctpList);

            } catch (ProcessingFailureException e) {
                e.printStackTrace();
            }
            return ctpList;
        } else {
            return retrieveAllCtps(ptp.getDn());
        }


    }

    private Vector getMSSTMnContainedTPs_New(NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] vendorTpName, short stmNumber) throws ProcessingFailureException
    {
        try
        {
            short[] rateList = new short[3];
            rateList[0] = 15;
            rateList[1] = 13;
            rateList[2] = 11;
            terminationPoint.TerminationPoint_T[] usedCtps = ManagedElementMgrHandler.instance().retrieveContainedInUseTPs(getCorbaService().getNmsSession().getManagedElementMgr(), vendorTpName, rateList);

            Vector tpVector = new Vector();
            Vector usedTimeSlot = new Vector();
            Hashtable superCtps = new Hashtable();

            for (int i = 0; i < usedCtps.length; i++)
            {
                tpVector.addElement(CtpConvertor.instance().convertCtp(usedCtps[i],"emsname"));
                usedTimeSlot.add(usedCtps[i].name[3].value);

                StringTokenizer st = new StringTokenizer(usedCtps[i].name[3].value, "/");
                String vc4Rdn = "/" + st.nextToken();

                boolean containVc3 = usedCtps[i].name[3].value.indexOf("tu3_vc3-k") >= 0;
                if (containVc3)
                    superCtps.put(vc4Rdn, new Byte((byte)13));

                boolean containVc12 = usedCtps[i].name[3].value.indexOf("vt2_tu12-k") >= 0;
                if (containVc12)
                    superCtps.put(vc4Rdn, new Byte((byte)11));
            }

            //补充VC4下少了的VC12，VC3
            for (Iterator it = superCtps.keySet().iterator(); it.hasNext(); )
            {
                String vc4Rdn = (String) it.next();
                byte containedRate = ( (Byte) superCtps.get(vc4Rdn)).byteValue();

                if (containedRate == 13) //用vc3来补充少了的
                {
                    for (int k = 1; k <= 3; k++)
                    {
                        String vc3Rdn = vc4Rdn + "/tu3_vc3-k=" + k;
                        if (usedTimeSlot.contains(vc3Rdn)) //已有
                            continue;
                        usedTimeSlot.add(vc3Rdn);

                        TerminationPoint_T vc3ctp = CtpConvertor.instance().createNonUsedCtp(tpName, vc3Rdn);
                        tpVector.addElement(vc3ctp);
                    }
                }
                else if (containedRate == 11)//vc12
                {
                    for (int k = 1; k <= 3; k++)
                    {
                        for (int l = 1; l <= 7; l++)
                        {
                            for (int m = 1; m <= 3; m++)
                            {
                                String vc12Rdn = vc4Rdn + "/vt2_tu12-k=" + k + "-l=" + l + "-m=" + m;
                                if (usedTimeSlot.contains(vc12Rdn)) //已有
                                    continue;

                                usedTimeSlot.add(vc12Rdn);
                                TerminationPoint_T vc12ctp = CtpConvertor.instance().createNonUsedCtp(tpName, vc12Rdn);
                                tpVector.addElement(vc12ctp);
                            }
                        }
                    }
                }
            }

            //补充少了的VC4
            for (int j = 1; j <= stmNumber; j++)
            {
                String vc4Rdn = "/sts3c_au4-j=" + j;
                if (usedTimeSlot.contains(vc4Rdn)) //已有
                    continue;
                usedTimeSlot.add(vc4Rdn);

                TerminationPoint_T vc4ctp = CtpConvertor.instance().createNonUsedCtp(tpName, vc4Rdn);
                tpVector.addElement(vc4ctp);
            }

            return tpVector;
        }
        catch (globaldefs.ProcessingFailureException ex)
        {
            ex.printStackTrace();
        }
        catch (org.omg.CORBA.SystemException ex)
        {
            ex.printStackTrace();

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return null;

    }
	public List<CTP> retrieveContainedInUseCtps(String ptpName) {
		sbilog.info("retrieveContainedInUseCtps : Ready...");
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList<CTP>();
		try {
			sbilog.info("retrieveContainedInUseCtps : Start..." + ptpName);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);
			vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedInUseTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
					new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason) + " PTP=" + ptpName, e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCtps CORBA.SystemException: " + e.getMessage() + " PTP=" + ptpName, e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCtps : " + ctpList.size());

		return ctpList;

	}

	public List<CTP> retrieveContainedPotentialCtps(String ptpName) {
		sbilog.info("retrieveContainedPotentialCtps : Ready...");
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList<CTP>();
		try {
			sbilog.info("retrieveContainedPotentialCtps : Start..." + ptpName);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);
			vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedPotentialTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
					new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason) + " PTP=" + ptpName, e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCtps CORBA.SystemException: " + e.getMessage() + " PTP=" + ptpName, e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCtps : " + ctpList.size());

		return ctpList;

	}

	public List<CTP> retrieveContainedCurrentCtps(String ptpName) {
		sbilog.info("retrieveContainedCurrentCtps : Ready...");
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList<CTP>();
		try {
			sbilog.info("retrieveContainedCurrentCtps : Start..." + ptpName);
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);
 				vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
						new short[0]);

		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason) + " PTP=" + ptpName, e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCtps CORBA.SystemException: " + e.getMessage() + " PTP=" + ptpName, e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCtps : " + ctpList.size());

		return ctpList;

	}
	/**
	 * 5.
	 * 
	 * @return
	 */

	public List<CTP> retrieveAllCtps(String ptpName) {
		sbilog.info("retrieveAllCtpsFunction : Ready...");
		TerminationPoint_T[] vendorCtpList = null;
		List<CTP> ctpList = new ArrayList<CTP>();
		try {
			sbilog.info("retrieveAllCtpsFunction : Start...");
			NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);
			if (ptpName.contains("wdm")) {
				vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedPotentialTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
						new short[0]);
			} else if (ptpName.contains("sdh")) {
				vendorCtpList = ManagedElementMgrHandler.instance().retrieveContainedCurrentTPs(corbaService.getNmsSession().getManagedElementMgr(), ptpDn,
                        new short[0]);
			}
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason) + " PTP=" + ptpName, e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCtps CORBA.SystemException: " + e.getMessage() + " PTP=" + ptpName, e);
		}
		if (vendorCtpList != null) {
			for (TerminationPoint_T vendorctp : vendorCtpList) {
				try {
					CTP ctp = CtpMapper.instance().convertCtp(vendorctp, ptpName);
					ctpList.add(ctp);
				} catch (Exception e) {
					errorlog.error("retrieveAllCtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCtps : " + ctpList.size());
        if (ptpName.contains("sdh"))
            CTPUtil.filterCTPS(ptpName,ctpList);
		return ctpList;
	}

	/**
	 * 6.
	 * 
	 * @return
	 */

	public List<IPCrossconnection> retrieveAllCrossconnections(String neName) {
		IPCrossConnection_T[] vendorIPCrossconnectionList = null;
		List<IPCrossconnection> IPCrossconnectionList = new ArrayList();
		try {
			// String[] neNameList = neName.split(Constant.dnSplit);
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
			vendorIPCrossconnectionList = VpnMgrHandler.instance().retrieveAllIPCrossconnectionByMe(corbaService.getNmsSession().getVpnMgr(), neDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCrossconnections ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCrossconnections CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorIPCrossconnectionList != null) {
			for (IPCrossConnection_T vendorIPCc : vendorIPCrossconnectionList) {
				try {
					IPCrossconnection ipCC = IPCrossconnectionMapper.instance().convertIPCrossConnection(vendorIPCc, neName);
					IPCrossconnectionList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveAllCrossconnections convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCrossconnections : " + IPCrossconnectionList.size());
		return IPCrossconnectionList;
	}

	/**
	 * 7.
	 * 
	 * @return
	 */
	public List<Section> retrieveAllSections() {
		TopologicalLink_T[] topSectionList = null;
		TopologicalLink_T[] vendorSectionList = null;
		TopologicalLink_T[] internalSectionList = null;
		List<Section> sectionList = new ArrayList<Section>();
		NameAndStringValue_T[] subnetDn = VendorDNFactory.createSubnetworkDN(corbaService.getEmsDn(), "1");
		try {
			topSectionList = EMSMgrHandler.instance().retrieveAllTopLevelTopologicalLinks(corbaService.getNmsSession().getEmsMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllTopLevelTopologicalLinks ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllTopLevelTopologicalLinks CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.info("topSectionList : " + (topSectionList == null ? null:topSectionList.length));
		try {
			vendorSectionList = SubnetworkMgrHandler.instance()
					.retrieveAllTopologicalLinks(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(), subnetDn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllSections ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllSections CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.info("vendorSectionList : " +(vendorSectionList == null ? null: vendorSectionList.length));
		List<String> vneID = new ArrayList<String>();
		ManagedElement_T[] vendorNeList = null;
		try {
			vendorNeList = ManagedElementMgrHandler.instance().retrieveAllManagedElements(corbaService.getNmsSession().getManagedElementMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorNeList != null) {
			for (ManagedElement_T ne : vendorNeList) {
				if (ne.productName.contains("Virtual")) {
					vneID.add(ne.name[1].value);
				} else if (ne.productName.contains("WDM")) {
					try {
						internalSectionList = SubnetworkMgrHandler.instance().retrieveAllInternalTopologicalLinks(
								corbaService.getNmsSession().getMultiLayerSubnetworkMgr(), ne.name);
					} catch (ProcessingFailureException e) {
						errorlog.error("retrieveAllInternalTopologicalLinks ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
					} catch (org.omg.CORBA.SystemException e) {
						errorlog.error("retrieveAllInternalTopologicalLinks CORBA.SystemException: " + e.getMessage(), e);
					}
					if (internalSectionList != null) {
						for (TopologicalLink_T vendorSection : internalSectionList) {
							try {
								Section section = SectionMapper.instance().convertSection(vendorSection, ne.name);
								sectionList.add(section);
							} catch (Exception e) {
								errorlog.error("retrieveAllInternalTopologicalLinks convertException: ", e);
							}
						}
					}

				}
			}
		}
		if (topSectionList != null) {
			for (TopologicalLink_T vendorSection : topSectionList) {
				try {
					if (vneID.contains(vendorSection.aEndTP[1].value) || vneID.contains(vendorSection.zEndTP[1].value)) {
						sbilog.info("VirtualSection : " + vendorSection);
						continue;
					}
					Section section = SectionMapper.instance().convertSection(vendorSection, subnetDn);
					sectionList.add(section);
				} catch (Exception e) {
					errorlog.error("retrieveAllSections convertException: ", e);
				}
			}
		}
		if (vendorSectionList != null) {
			for (TopologicalLink_T vendorSection : vendorSectionList) {
				try {
					if (vneID.contains(vendorSection.aEndTP[1].value) || vneID.contains(vendorSection.zEndTP[1].value)) {
						sbilog.info("VirtualSection : " + vendorSection);
						continue;
					}
					Section section = SectionMapper.instance().convertSection(vendorSection, subnetDn);
					sectionList.add(section);
				} catch (Exception e) {
					errorlog.error("retrieveAllSections convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllSections : " + sectionList.size());
		return sectionList;
	}

	/**
	 * 8.
	 * 
	 * @return
	 */
	public List<TrafficTrunk> retrieveAllTrafficTrunk() {
		TrafficTrunk_T[] vendorTrafficTrunkList = null;
		List<TrafficTrunk> trafficTrunkList = new ArrayList<TrafficTrunk>();
		NameAndStringValue_T[] fdDn = VendorDNFactory.createFlowDomainDN(corbaService.getEmsDn(), "1");
		try {
			vendorTrafficTrunkList = VpnMgrHandler.instance().retrieveAllTrafficTrunks(corbaService.getNmsSession().getVpnMgr(), fdDn, errorlog);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllTrafficTrunk ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllTrafficTrunk CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.info("retrieveAllTrafficTrunk : " + vendorTrafficTrunkList.length);
		// for (TrafficTrunk_T tt : vendorTrafficTrunkList) {
		// if (tt.name[2].value.contains("PWTRAIL")) {
		// sbilog.info("PW : " + tt);
		// }
		// }
		if (vendorTrafficTrunkList != null) {
			for (TrafficTrunk_T vendorTrafficTrunk : vendorTrafficTrunkList) {
				try {
					TrafficTrunk trafficTrunk = TrafficTrunkMapper.instance().convertTrafficTrunk(vendorTrafficTrunk, fdDn);
					trafficTrunkList.add(trafficTrunk);
				} catch (Exception e) {
					errorlog.error("retrieveAllTrafficTrunk convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllTrafficTrunk : " + trafficTrunkList.size());
		return trafficTrunkList;
	}

	public List<String> retrieveAllTrafficTrunkNames() {
		List<String> trafficTrunkList = new ArrayList<String>();
		NameAndStringValue_T[] fdDn = VendorDNFactory.createFlowDomainDN(corbaService.getEmsDn(), "1");
		try {
			NameAndStringValue_T[][] trafficTrunkNames = VpnMgrHandler.instance().retrieveAllTrafficTrunkNames(corbaService.getNmsSession().getVpnMgr(), fdDn);
			for (NameAndStringValue_T[] names : trafficTrunkNames) {
				String name = TrafficTrunkMapper.instance().convertTrafficTrunkName(names);
				if (name != null) {
					trafficTrunkList.add(name);
				}
			}
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllTrafficTrunk ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllTrafficTrunk CORBA.SystemException: " + e.getMessage(), e);
		}
		sbilog.info("retrieveAllTrafficTrunkNames : " + trafficTrunkList.size());
		return trafficTrunkList;
	}

	public PWTrail retrieveTrafficTrunk(String rafficTrunkName) {
		TrafficTrunk_T vendorTrafficTrunk = null;
		NameAndStringValue_T[] trafficTrunkName = VendorDNFactory.createCommonDN(rafficTrunkName);
		try {
			long start = System.currentTimeMillis();
			vendorTrafficTrunk = VpnMgrHandler.instance().retrieveTrafficTrunk(corbaService.getNmsSession().getVpnMgr(), trafficTrunkName);
			long end = System.currentTimeMillis();
			long sub = end - start;
			sbilog.info("retrieveTrafficTrunk : " + sub + "ms PW: " + rafficTrunkName);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrievePWTrail ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			try {
				Thread.sleep(120000L);
			} catch (InterruptedException e2) {
				errorlog.error("retrievePWTrail InterruptedException: ", e2);
			}
			try {
				vendorTrafficTrunk = VpnMgrHandler.instance().retrieveTrafficTrunk(corbaService.getNmsSession().getVpnMgr(), trafficTrunkName);
			} catch (ProcessingFailureException e1) {
				errorlog.error("retrievePWTrail1 ProcessingFailureException: " + CodeTool.isoToGbk(e1.errorReason), e1);
			} catch (org.omg.CORBA.SystemException e1) {
				errorlog.error("retrievePWTrail1 CORBA.SystemException: " + e1.getMessage(), e1);
			}
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrievePWTrail CORBA.SystemException: " + e.getMessage(), e);
		}
		PWTrail traffic = null;
		if (vendorTrafficTrunk != null) {
			try {
				// sbilog.info("PWTRAIL : " + vendorTrafficTrunk);
				traffic = TrafficTrunkMapper.instance().convertPWTrail(vendorTrafficTrunk, trafficTrunkName);
			} catch (Exception e) {
				errorlog.error("retrievePWTrail convertException: ", e);
			}
		}
		// sbilog.info("retrievePW : " + rafficTrunkName);
		return traffic;
	}

	public List<MatrixFlowDomainFragment> retrieveFDFrRoute(String fdfrDn) {
		List<MatrixFlowDomainFragment> routes = new ArrayList<MatrixFlowDomainFragment>();
		MatrixFlowDomainFragment_T[] fdfrRoute = null;
		NameAndStringValue_T[] fdfrName = VendorDNFactory.createCommonDN(fdfrDn);
		try {
			fdfrRoute = VpnMgrHandler.instance().retrieveFDFrRoute(corbaService.getNmsSession().getVpnMgr(), fdfrName);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveFDFrRoute ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveFDFrRoute CORBA.SystemException: " + e.getMessage(), e);
		}
		if (fdfrRoute != null) {
			for (MatrixFlowDomainFragment_T mfdfr : fdfrRoute) {
				try {
					MatrixFlowDomainFragment route = TrafficTrunkMapper.instance().convertFDFrRoute(mfdfr, fdfrDn);
					routes.add(route);
				} catch (Exception e) {
					errorlog.error("retrieveFDFrRoute convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveFDFrRoute : " + routes.size() + " " + fdfrDn);
		return routes;
	}

	// no data
	// public List<TrafficTrunk> retrieveAllTrafficTrunkWithME(String ne) {
	// NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(ne);
	// TrafficTrunk_T[] vendorTrafficTrunkList = null;
	// List<TrafficTrunk> trafficTrunkList = new ArrayList<TrafficTrunk>();
	// try {
	// vendorTrafficTrunkList = VpnMgrHandler.instance().retrieveAllTrafficTrunksWithME(corbaService.getNmsSession().getVpnMgr(), neDn);
	// } catch (ProcessingFailureException e) {
	// errorlog.error("retrieveAllTrafficTrunk ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
	// } catch (org.omg.CORBA.SystemException e) {
	// sbilog.error("retrieveAllTrafficTrunk CORBA.SystemException: " + e.getMessage(), e);
	// }
	// if (vendorTrafficTrunkList != null) {
	// for (TrafficTrunk_T vendorTrafficTrunk : vendorTrafficTrunkList) {
	// try {
	// TrafficTrunk trafficTrunk = TrafficTrunkMapper.instance().convertTrafficTrunk(vendorTrafficTrunk, neDn);
	// trafficTrunkList.add(trafficTrunk);
	// } catch (Exception e) {
	// errorlog.error("retrieveAllTrafficTrunk convertException: ", e);
	// }
	// }
	// }
	// sbilog.info("retrieveAllTrafficTrunkWithME : " + trafficTrunkList.size());
	// return trafficTrunkList;
	// }

	/**
	 * 9.
	 * 
	 * @return
	 */
	public List<FlowDomainFragment> retrieveAllFdrs() {
		FlowDomainFragment_T[] vendorFdrList = null;
		List<FlowDomainFragment> fdrList = new ArrayList();
		NameAndStringValue_T[] fdDn = VendorDNFactory.createFlowDomainDN(getEmsName(), "1");
		try {

			vendorFdrList = VpnMgrHandler.instance().retrieveAllFDFrs(corbaService.getNmsSession().getVpnMgr(), fdDn);
			sbilog.info("AllFdrs COUNTS: " + vendorFdrList.length);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllFdrs ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllFdrs CORBA.SystemException: " + e.getMessage(), e);
		}
		// for (FlowDomainFragment_T fdfr : vendorFdrList) {
		// sbilog.info("fdfr : " + fdfr);
		// }
		if (vendorFdrList != null) {
			for (FlowDomainFragment_T vendorFdr : vendorFdrList) {
				try {
					FlowDomainFragment fdr = FlowDomainFragmentMapper.instance().convertFlowDomainFragment(vendorFdr, fdDn);
					fdrList.add(fdr);
				} catch (Exception e) {
					errorlog.error("retrieveAllFdrs convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllFdrs : " + fdrList.size());
		return fdrList;
	}

	/**
	 * 10.??
	 */
	public List<IPCrossconnection> retrieveRoute(String trafficTrunkName) {
		IPCrossConnection_T[] vendorIPCrossconnectionList = null;
		List<IPCrossconnection> IPCrossconnectionList = new ArrayList();
		try {
			sbilog.info("retrieveRoute start : corbaService.emsname=" + corbaService.getEmsName());
			NameAndStringValue_T[] dn = VendorDNFactory.createCommonDN(trafficTrunkName);
			vendorIPCrossconnectionList = VpnMgrHandler.instance().getRoute(corbaService.getNmsSession().getVpnMgr(), dn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveRoute ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveRoute CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorIPCrossconnectionList != null) {
			for (IPCrossConnection_T vendorIPCc : vendorIPCrossconnectionList) {
				try {
					IPCrossconnection ipCC = IPCrossconnectionMapper.instance().convertIPCrossConnection(vendorIPCc, trafficTrunkName);
					IPCrossconnectionList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveRoute convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveRoute : " + IPCrossconnectionList.size() + " " + trafficTrunkName);
		return IPCrossconnectionList;

	}

	@Override
	public boolean connect() {
		return corbaService.connect();

	}

	@Override
	public boolean disconnect() {
		return corbaService.disconnect();
	}

	@Override
	public boolean getConnectState() {
		// TODO Auto-generated method stub
		return corbaService.isConnectState();
	}

	@Override
	public String getLastestDayMigrationJobName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ping() {

		NmsSession nmsSession = corbaService.getNmsSession();
		EMS_THolder ems = new EMS_THolder();
		try {
			nmsSession.getEmsMgr().getEMS(ems);
		} catch (ProcessingFailureException e) {
			 errorlog.error(e,e);
		}
		return nmsSession.isEmsSessionOK();
	}

	@Override
	public List<FlowDomain> retrieveAllFlowDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	private void printErrorReason(String tag, ProcessingFailureException e) {
		sbilog.info("U2000Services | " + tag + " error reason is : " + CodeTool.isoToGbk(e.errorReason));
	}

	/**
	 * 11.
	 * 
	 */
	public List<R_FTP_PTP> retrieveAllPTPsByFtp(String ftpName) {
		sbilog.info("retrieveAllPTPsByFtp " + ftpName);
		TPData_T[] vendorTpList = null;
		List<R_FTP_PTP> ptpList = new ArrayList();
		try {

			// String[] ftpDn = ftpName.split(Constant.dnSplit);
			NameAndStringValue_T[] dn = VendorDNFactory.createCommonDN(ftpName);
			vendorTpList = ManagedElementMgrHandler.instance().retrieveAllPtpsByFtp(corbaService.getNmsSession().getManagedElementMgr(), dn);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllPTPsByFtp ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllPTPsByFtp CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorTpList != null) {
			for (TPData_T vptp : vendorTpList) {
				try {
					R_FTP_PTP ptp = PtpMapper.instance().convertPtpFtpRelation(vptp, ftpName);
					ptpList.add(ptp);
				} catch (Exception e) {
					errorlog.error("retrieveAllPTPsByFtp convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllPTPsByFtp : " + ptpList.size());
		return ptpList;
	}

	/**
	 * 12.
	 * *
	 */
	public List<ProtectionGroup> retrieveAllProtectionGroupByMe(String meName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CrossConnect> retrieveAllCrossConnects(String neName) {
		CrossConnect_T[] vendorCCs = null;
		List<CrossConnect> ccList = new ArrayList<CrossConnect>();
		sbilog.info("retrieveAllCrossConnects : Ready...");
		try {
			NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
			short[] layer = null;
			ManagedElement_T ne = ManagedElementMgrHandler.instance().retrieveManagedElement(corbaService.getNmsSession().getManagedElementMgr(), neDn);
			layer = ne.supportedRates;
			if (layer == null || layer.length == 0) {
				if (ne.productName.contains("WDM")) {
					layer = new short[] { 40, 50, 41, 49, 104, 105, 106, 107, 108, 109, 8006, 8007, 8031, 8042, 8041, 335 };
				} else {
					layer = new short[] { 11, 13, 15, 16, 17, 18, 29 };
				}
			}
			sbilog.info("retrieveAllCrossConnects : Start..." + ne.productName);
			vendorCCs = ManagedElementMgrHandler.instance().retrieveAllCrossConnections(corbaService.getNmsSession().getManagedElementMgr(), neDn, layer);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllCrossConnects ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
            errorlog.error("retrieveAllCrossConnects ProcessingFailureException: " +  (e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllCrossConnects CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vendorCCs != null) {
			for (CrossConnect_T vendorIPCc : vendorCCs) {
				try {
					CrossConnect ipCC = IPCrossconnectionMapper.instance().convertCrossConnection(vendorIPCc, neName);
					ccList.add(ipCC);
				} catch (Exception e) {
					errorlog.error("retrieveAllCrossConnects convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllCrossConnects : " + ccList.size());
		return ccList;
	}

	@Override
	public List<TrailNtwProtection> retrieveAllTrailNtwProtections() {
		Map<String, TrailNtwProtection> map = new HashMap<String, TrailNtwProtection>();
		NameAndStringValue_T[][] neNames = null;
		try {
			neNames = ManagedElementMgrHandler.instance().retrieveAllManagedElementNames(corbaService.getNmsSession().getManagedElementMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElementNames ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElementNames CORBA.SystemException: " + e.getMessage(), e);
		}
		if (neNames != null) {
			for (NameAndStringValue_T[] meName : neNames) {
				TrailNtwProtection_T[] pgs = null;
				try {
					pgs = ProtectionMgrHandler.instance().getAllTrailNtwProtections(corbaService.getNmsSession().getTrailNtwProtMgr(), meName);
				} catch (ProcessingFailureException e) {
					errorlog.error("retrieveAllTrailNtwProtection ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
				} catch (org.omg.CORBA.SystemException e) {
					errorlog.error("retrieveAllTrailNtwProtection CORBA.SystemException: " + e.getMessage(), e);
				}
				if (pgs != null) {
					for (TrailNtwProtection_T trailpg : pgs) {
						try {
							TrailNtwProtection pg = IPProtectionGroupMapper.instance().convert(trailpg);
							map.put(pg.getDn(), pg);
						} catch (Exception e) {
							errorlog.error("retrieveAllTrailNtwProtection convertException: ", e);
						}
					}
				}
			}
		}
		sbilog.debug("TrailNtwProtectionList : " + map.size());
		return new ArrayList<TrailNtwProtection>(map.values());
	}

	@Override
	public ManagedElement retrieveManagedElement(String neName) {
		ManagedElement_T vendorNe = null;
		try {
			NameAndStringValue_T[] ns = VendorDNFactory.createCommonDN(neName);
			vendorNe = ManagedElementMgrHandler.instance().retrieveManagedElement(corbaService.getNmsSession().getManagedElementMgr(), ns);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllManagedElements ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllManagedElements CORBA.SystemException: " + e.getMessage(), e);
		}
		ManagedElement ne = null;
		try {
			ne = ManagedElementMapper.instance().convertManagedElement(vendorNe);
		} catch (Exception e) {
			errorlog.error("retrieveAllManagedElements convertException: ", e);
		}
		return ne;
	}

	public List<SubnetworkConnection> retrieveAllSNCs() {
		List<SubnetworkConnection> sncList = new ArrayList<SubnetworkConnection>();
		SubnetworkConnection_T[] sncs = null;
		NameAndStringValue_T[] subnetworkName = VendorDNFactory.createSubnetworkDN(corbaService.getEmsDn(), "1");
		try {
			sncs = SubnetworkMgrHandler.instance().retrieveAllSNCs(corbaService.getNmsSession().getMultiLayerSubnetworkMgr(), subnetworkName, new short[0]);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllSNCs ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllSNCs CORBA.SystemException: " + e.getMessage(), e);
		}
		if (sncs != null) {
			for (SubnetworkConnection_T snc : sncs) {
				try {
					sncList.add(SubnetworkConnectionMapper.instance().convertSNC(snc));
				} catch (Exception e) {
					errorlog.error("retrieveAllSNCs convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllSNCs : " + sncList.size());
		return sncList;
	}

	public void retrieveRouteAndTopologicalLinks(String sncName, List<CrossConnect> ccList, List<Section> sectionList) {
		subnetworkConnection.Route_THolder normalRoute = new subnetworkConnection.Route_THolder();
        subnetworkConnection.Route_THolder sameLevelRoute = new subnetworkConnection.Route_THolder();
		topologicalLink.TopologicalLinkList_THolder topologicalLinkList = new topologicalLink.TopologicalLinkList_THolder();
		String[] sncdns = sncName.split("@");
		NameAndStringValue_T[] vendorSncName = VendorDNFactory.createSNCDN(sncdns[0].substring(4), sncdns[1].substring(21), sncdns[2].substring(21));
		try {
			sbilog.info("retrieveRouteAndTopologicalLinks start : corbaService.emsname=" + corbaService.getEmsName());
			
			corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRouteAndTopologicalLinks(vendorSncName, normalRoute, topologicalLinkList);


            corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRoute(vendorSncName, false, sameLevelRoute);

        //    corbaService.getNmsSession().getMultiLayerSubnetworkMgr().getRoute(vendorSncName, false, normalRoute);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveRouteAndTopologicalLinks CORBA.SystemException: " + e.getMessage(), e);
		}

        HashSet<String> sameLevelCCDns = new HashSet();
        if (sameLevelRoute.value != null) {
            for (subnetworkConnection.CrossConnect_T slcc  : sameLevelRoute.value) {
                CrossConnect _cc = IPCrossconnectionMapper.instance().convertCrossConnection(slcc, sncName);
                sameLevelCCDns.add(_cc.getDn());
                System.out.println("_cc = " + _cc.getDn());
            }
        }
		if (normalRoute.value != null) {
			for (subnetworkConnection.CrossConnect_T cc : normalRoute.value) {
				try {
                    CrossConnect ccRoute = IPCrossconnectionMapper.instance().convertCrossConnection(cc, sncName);
                    System.out.println("ccRoute = " + ccRoute.getDn());
                    if (sameLevelCCDns.contains(ccRoute.getDn()))
                        ccRoute.setTag1("SAME_ORDER");
                    ccList.add(ccRoute);
				} catch (Exception e) {
					errorlog.error("retrieveRouteAndTopologicalLinks convertException: ", e);
				}
			}
		}
		if (topologicalLinkList.value != null) {
			for (topologicalLink.TopologicalLink_T section : topologicalLinkList.value) {
				try {
					sectionList.add(SectionMapper.instance().convertSection(section, vendorSncName));
				} catch (Exception e) {
					errorlog.error("retrieveRouteAndTopologicalLinks convertException: ", e);
				}
			}
		}
        for (CrossConnect crossConnect : ccList) {
            System.out.println("tag1 = " + crossConnect.getTag1()+" cc="+crossConnect.getDn());
        }
        sbilog.info("retrieveRouteAndTopologicalLinks ccList: " + ccList.size());
		sbilog.info("retrieveRouteAndTopologicalLinks sectionList: " + sectionList.size());

	}

	/**
	 * HW_MSTP
	 */
	public List<PTP> retrieveAllMSTPPtps(String neName) throws ProcessingFailureException {
		NameAndStringValue_T[] neDn = VendorDNFactory.createCommonDN(neName);
		List<PTP> ptpList = new ArrayList<PTP>();
		HW_mstpInventory.HW_MSTPEndPoint_T[] vendorMSTPs = new HW_mstpInventory.HW_MSTPEndPoint_T[0];
		HW_mstpInventory.HW_MSTPEndPointTypeList_THolder typeList = new HW_mstpInventory.HW_MSTPEndPointTypeList_THolder();
		typeList.value = new HW_mstpInventory.HW_MSTPEndPointType_T[0];
		try {
			vendorMSTPs = MSTPInventoryMgrHandler.instance().retrieveAllMstpEndPoints(corbaService.getNmsSession().getMstpInventoryMgr(), neDn, typeList.value);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllMSTPPtps ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllMSTPPtps CORBA.SystemException: " + e.getMessage(), e);
		} catch (Exception e) {
			errorlog.error("retrieveAllMSTPPtps Exception: " + e.getMessage(), e);
		}

		if (vendorMSTPs != null) {
			for (HW_MSTPEndPoint_T vendorPtp : vendorMSTPs) {
				try {
					PTP ptp = PtpMapper.instance().convertMSTPPtp(vendorPtp, neName);
					ptpList.add(ptp);
				} catch (Exception e) {
					errorlog.error("retrieveAllMSTPPtps convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllMSTPPtps : " + ptpList.size());
		return ptpList;
	}

	public List<HW_MSTPBindingPath> getBindingPath(String vendorTpName) throws ProcessingFailureException {
		HW_MSTPBindingPath_T[] paths = null;
		List<HW_MSTPBindingPath> pathlist = new ArrayList<HW_MSTPBindingPath>();
		try {
			NameAndStringValue_T[] mp = VendorDNFactory.createCommonDN(vendorTpName);
			paths = MSTPInventoryMgrHandler.instance().retrieveBindingPath(corbaService.getNmsSession().getMstpInventoryMgr(), mp);
		} catch (ProcessingFailureException e) {
			errorlog.error("getBindingPathTP ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("getBindingPathTP CORBA.SystemException: " + e.getMessage(), e);
		}
		if (paths != null && paths.length > 0) {
			for (HW_MSTPBindingPath_T path : paths) {
				try {
					pathlist.add(HW_MSTPMapper.instance().convertBindingPath(path, vendorTpName));
				} catch (Exception e) {
					errorlog.error("getBindingPath convertException: ", e);
				}
			}
		}
		sbilog.info("getBindingPath : " + pathlist.size());
		return pathlist;
	}

	public List<HW_VirtualBridge> retrieveAllVBs(String nedn) throws ProcessingFailureException {
		HW_VirtualBridge_T[] vbs = null;
		List<HW_VirtualBridge> vblist = new ArrayList<HW_VirtualBridge>();
		try {
			NameAndStringValue_T[] ne = VendorDNFactory.createCommonDN(nedn);
			vbs = MSTPInventoryMgrHandler.instance().retrieveAllVBs(corbaService.getNmsSession().getMstpInventoryMgr(), ne);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllVBs ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllVBs CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vbs != null && vbs.length > 0) {
			for (HW_VirtualBridge_T vb : vbs) {
				try {
					vblist.add(HW_MSTPMapper.instance().convertVB(vb, nedn));
				} catch (Exception e) {
					errorlog.error("retrieveAllVBs convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllVBs : " + vblist.size());
		return vblist;
	}

	public List<HW_VirtualLAN> retrieveAllVLANsbyVB(String vbdn) throws ProcessingFailureException {
		HW_VirtualLAN_T[] vlans = null;
		List<HW_VirtualLAN> vlanlist = new ArrayList<HW_VirtualLAN>();
		try {
			NameAndStringValue_T[] vb = VendorDNFactory.createCommonDN(vbdn);
			vlans = MSTPInventoryMgrHandler.instance().retrieveAllVLANsbyVB(corbaService.getNmsSession().getMstpInventoryMgr(), vb);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllVLANsbyVB ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllVLANsbyVB CORBA.SystemException: " + e.getMessage(), e);
		}
		if (vlans != null && vlans.length > 0) {
			for (HW_VirtualLAN_T vlan : vlans) {
				try {
					vlanlist.add(HW_MSTPMapper.instance().convertVLAN(vlan, vbdn));
				} catch (Exception e) {
					errorlog.error("retrieveAllVLANsbyVB convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllVLANsbyVB : " + vlanlist.size());
		return vlanlist;
	}

	public List<HW_EthService> retrieveAllEthServices(String nedn) throws ProcessingFailureException {
		HW_EthService_T[] eths = null;
		List<HW_EthService> ethlist = new ArrayList<HW_EthService>();
		try {
			NameAndStringValue_T[] ne = VendorDNFactory.createCommonDN(nedn);
			HW_EthServiceType_T[] types = new HW_EthServiceType_T[0];
			eths = MSTPServiceMgrHandler.instance().retrieveAllEthServices(corbaService.getNmsSession().getMstpServiceMgr(), ne, types);
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEthServices ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllEthServices CORBA.SystemException: " + e.getMessage(), e);
		}
		if (eths != null && eths.length > 0) {
			for (HW_EthService_T eth : eths) {
				try {
					ethlist.add(HW_MSTPMapper.instance().convertEthService(eth, nedn));
				} catch (Exception e) {
					errorlog.error("retrieveAllEthServices convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEthServices : " + ethlist.size());
		return ethlist;
	}

	public List<EncapsulationLayerLink> retrieveAllELLinks() throws ProcessingFailureException {
		EncapsulationLayerLink_T[] ells = null;
		List<EncapsulationLayerLink> ethlist = new ArrayList<EncapsulationLayerLink>();
		try {
			ells = EncapsulationLayerLinkMgrHandler.instance().retrieveAllELLinks(corbaService.getNmsSession().getEncapsulationLayerLinkMgr());
		} catch (ProcessingFailureException e) {
			errorlog.error("retrieveAllEthServices ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
		} catch (org.omg.CORBA.SystemException e) {
			errorlog.error("retrieveAllEthServices CORBA.SystemException: " + e.getMessage(), e);
		}
		if (ells != null && ells.length > 0) {
			for (EncapsulationLayerLink_T eth : ells) {
				try {
					ethlist.add(HW_MSTPMapper.instance().convertEll(eth));
				} catch (Exception e) {
					errorlog.error("retrieveAllEthServices convertException: ", e);
				}
			}
		}
		sbilog.info("retrieveAllEthServices : " + ethlist.size());
		return ethlist;
	}


    public void getAllParameters() throws ProcessingFailureException {
        PerformanceManagementMgr_I performanceMgr = corbaService.getNmsSession().getPerformanceMgr();
        List<ManagedElement> managedElements = this.retrieveAllManagedElements();
        System.out.println("managedElements = " + (managedElements == null ? null:managedElements.size()));
        List<NameAndStringValue_T[]>  ptpDns = new ArrayList<NameAndStringValue_T[]>();
        HashMap<String,String> parameters = new HashMap<String, String>();
        for (ManagedElement managedElement : managedElements) {
            //      if (ptpDns.size() > 100) break;
            String dn = managedElement.getDn();
            NameAndStringValue_T[] meDn = VendorDNFactory.createCommonDN(dn);

//            List<PTP> ptps = this.retrieveAllPtps(dn);
//            System.out.println("ptps = " + (ptps == null ? null: ptps.size()));
//            if (ptps != null) {
//                for (PTP ptp : ptps) {
//                    String _dn = ptp.getDn();
//                    NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(_dn);
//                    System.out.println("ptpDn = " + _dn);
//                    ptpDns.add(ptpDn);
//                }
//            }


            String supportedRates = managedElement.getSupportedRates();
            if (supportedRates != null) {
                String[] rates = supportedRates.split(Constant.listSplitReg);
                for (String rate : rates) {

                    PMParameterList_THolder pmParameterList_tHolder = new PMParameterList_THolder();
                    performanceMgr.getMEPMcapabilities(meDn,Short.parseShort(rate), pmParameterList_tHolder);

                    PMParameter_T[] value = pmParameterList_tHolder.value;
                    System.out.println("rate = "+rate+", value = " + (value == null ? null : value.length));
                    if (value != null) {
                        for (PMParameter_T pmParameter_t : value) {
                            System.out.println("pmParameter_t = " + pmParameter_t.toString());
                            String s = parameters.get(rate);
                            if (s == null)  parameters.put(rate,"|"+pmParameter_t.toString()+"|");
                            else if (!s.contains("|"+pmParameter_t.toString()+"|")){
                                parameters.put(rate,s+";|"+pmParameter_t.toString()+"|");
                            }

                        }
                    }
                }
            }

        }

        System.out.println("finsih ");

        System.out.println("parameters = " + parameters.toString());

//        System.out.println("ptpDns = " + ptpDns.size());
//        NameAndStringValue_T[][] ptpList = new NameAndStringValue_T[ptpDns.size()][];
//        for (int i = 0; i < ptpDns.size(); i++) {
//            ptpList[i] = ptpDns.get(i);
//
//        }
//        performanceMgr.createPMCollectionTask("task-test-asb","135.192.135.117:/pmdata.csv","netcool","netcool@123","jiankong",
//                ptpList,"15min","20140903000000.0Z","20141024000000.0Z",true);
//        System.out.println("createPMCollectionTask success " );



    }

    public void createPerfTask() throws ProcessingFailureException {
        PerformanceManagementMgr_I performanceMgr = corbaService.getNmsSession().getPerformanceMgr();
        List<ManagedElement> managedElements = this.retrieveAllManagedElements();
        System.out.println("managedElements = " + (managedElements == null ? null:managedElements.size()));
        List<NameAndStringValue_T[]>  ptpDns = new ArrayList<NameAndStringValue_T[]>();
        HashMap<String,String> parameters = new HashMap<String, String>();
        for (ManagedElement managedElement : managedElements) {
                  if (ptpDns.size() > 100) break;
            String dn = managedElement.getDn();
            NameAndStringValue_T[] meDn = VendorDNFactory.createCommonDN(dn);

            List<PTP> ptps = this.retrieveAllPtps(dn);
            System.out.println("ptps = " + (ptps == null ? null: ptps.size()));
            if (ptps != null) {
                for (PTP ptp : ptps) {
                    String _dn = ptp.getDn();
                    NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(_dn);
                    System.out.println("ptpDn = " + _dn);
                    ptpDns.add(ptpDn);
                }
            }




        }



        System.out.println("ptpDns = " + ptpDns.size());
        NameAndStringValue_T[][] ptpList = new NameAndStringValue_T[ptpDns.size()][];
        for (int i = 0; i < ptpDns.size(); i++) {
            ptpList[i] = ptpDns.get(i);

        }
        performanceMgr.createPMCollectionTask("task-test-asb","135.192.135.117:/pmdata.csv","netcool","netcool@123","jiankong",
                ptpList,"15min","20140903000000.0Z","20141024000000.0Z",true);
        System.out.println("createPMCollectionTask success " );



    }
	public List<PMData_T> retrievePerformance(ManagedElement managedElement) throws ProcessingFailureException {
		PerformanceManagementMgr_I performanceMgr = corbaService.getNmsSession().getPerformanceMgr();
		PMTPSelect_T[] pmtpSelect_ts = new PMTPSelect_T[1];
		List<PMData_T> pmDataTList = new ArrayList<PMData_T>();
		PMTPSelect_T pmtpSelect_t =new PMTPSelect_T();
		String dn = managedElement.getDn();
		NameAndStringValue_T[] meDn = VendorDNFactory.createCommonDN(dn);
		pmtpSelect_t.name = meDn;
		pmtpSelect_t.granularityList = new String[0];
		pmtpSelect_t.layerRateList = new short[0];
		pmtpSelect_t.pMLocationList = new String[0];
		pmtpSelect_ts[0] = pmtpSelect_t;


		String supportedRates = managedElement.getSupportedRates();
		List<String> paraNames = new ArrayList<String>();
		if (supportedRates != null) {
			String[] rates = supportedRates.split(Constant.listSplitReg);
			for (String rate : rates) {

				PMParameterList_THolder pmParameterList_tHolder = new PMParameterList_THolder();
				performanceMgr.getMEPMcapabilities(meDn,Short.parseShort(rate), pmParameterList_tHolder);

				PMParameter_T[] value = pmParameterList_tHolder.value;
				System.out.println("rate = "+rate+", value = " + (value == null ? null : value.length));
				if (value != null) {
					for (PMParameter_T pmParameter_t : value) {
						if (!paraNames.contains(pmParameter_t.pmParameterName))
							paraNames.add(pmParameter_t.pmParameterName);
					}
				}
			}
		}

		String[] objects = new String[paraNames.size()];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = paraNames.get(i);

		}

		PMDataList_THolder pmDataList_tHolder = new PMDataList_THolder();
		PMDataIterator_IHolder pmDataIterator_iHolder = new PMDataIterator_IHolder();
		try {
			performanceMgr.getAllCurrentPMData(pmtpSelect_ts,objects,50, pmDataList_tHolder, pmDataIterator_iHolder);

		} catch ( ProcessingFailureException e) {
			errorlog.error(CodeTool.isoToGbk(e.errorReason));
			errorlog.error(e,e);
		}

	//	System.out.println(managedElement.getUserLabel()+" length = " + (pmDataIterator_iHolder.value == null ? null:pmDataIterator_iHolder.value.getLength()));
		if (pmDataList_tHolder != null && pmDataList_tHolder.value != null) {
			for (int i = 0; i < pmDataList_tHolder.value.length; i++) {
				PMData_T e = pmDataList_tHolder.value[i];
				if (e != null) {
					PMMeasurement_T[] pmMeasurementList = e.pmMeasurementList;
					if (pmMeasurementList != null) {
//                        for (PMMeasurement_T pmMeasurement_t : pmMeasurementList) {
//                            String unit = pmMeasurement_t.unit;
//                            pmMeasurement_t.unit = CodeTool.IsoToUtf8(unit);
////                            System.out.println("IsoToUtf8 = " + CodeTool.IsoToUtf8(unit));
////                            System.out.println("isoToGbk = " + CodeTool.isoToGbk(unit));
////                            System.out.println("GbkToIso = " + CodeTool.GbkToIso(unit));
////                            System.out.println("UTF8ToGbk = " + CodeTool.UTF8ToGbk(unit));
////                            System.out.println("gbk-8" + convert(unit, "gbk", "utf-8"));
////                            System.out.println("utf-iso" + convert(unit, "utf-8", "iso8859-1"));
//                        }
					}
				}
				pmDataTList.add(e);
			}
		}

		if (null != pmDataIterator_iHolder.value) {

			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = pmDataIterator_iHolder.value.next_n(50, pmDataList_tHolder);

				for (int i = 0; i < pmDataList_tHolder.value.length; i++) {
					pmDataTList.add(pmDataList_tHolder.value[i]);
				}

			}
			try {
				pmDataIterator_iHolder.value.destroy();
			} catch (Throwable ex) {

			}
		}

		sbilog.info("NE:"+managedElement.getDn()+" - "+pmDataTList.size()+" pmdatas");

		return pmDataTList;
	}
    public void testPerformance() throws  Exception {
        PerformanceManagementMgr_I performanceMgr = corbaService.getNmsSession().getPerformanceMgr();
        List<ManagedElement> managedElements = this.retrieveAllManagedElements();
        System.out.println("managedElements = " + (managedElements == null ? null : managedElements.size())) ;
        HashMap<String,List<PMData_T>> nePms = new HashMap<String, List<PMData_T>>();
        for (ManagedElement managedElement : managedElements) {
            PMTPSelect_T[] pmtpSelect_ts = new PMTPSelect_T[1];

            PMTPSelect_T pmtpSelect_t =new PMTPSelect_T();
            String dn = managedElement.getDn();
            NameAndStringValue_T[] meDn = VendorDNFactory.createCommonDN(dn);
            pmtpSelect_t.name = meDn;
            pmtpSelect_t.granularityList = new String[0];
            pmtpSelect_t.layerRateList = new short[0];
            pmtpSelect_t.pMLocationList = new String[0];
            pmtpSelect_ts[0] = pmtpSelect_t;
            nePms.put(dn,new ArrayList<PMData_T>());


            List<String> paraNames = new ArrayList<String>();
            String supportedRates = managedElement.getSupportedRates();
            if (supportedRates != null) {
                String[] rates = supportedRates.split(Constant.listSplitReg);
                for (String rate : rates) {

                    PMParameterList_THolder pmParameterList_tHolder = new PMParameterList_THolder();
                    performanceMgr.getMEPMcapabilities(meDn,Short.parseShort(rate), pmParameterList_tHolder);

                    PMParameter_T[] value = pmParameterList_tHolder.value;
                    System.out.println("rate = "+rate+", value = " + (value == null ? null : value.length));
                    if (value != null) {
                        for (PMParameter_T pmParameter_t : value) {
                             if (!paraNames.contains(pmParameter_t.pmParameterName))
                                 paraNames.add(pmParameter_t.pmParameterName);
                        }
                    }
                }
            }

            String[] objects = new String[paraNames.size()];
            for (int i = 0; i < objects.length; i++) {
                 objects[i] = paraNames.get(i);

            }

            PMDataList_THolder pmDataList_tHolder = new PMDataList_THolder();
            PMDataIterator_IHolder pmDataIterator_iHolder = new PMDataIterator_IHolder();
            try {
                performanceMgr.getAllCurrentPMData(pmtpSelect_ts,objects,50, pmDataList_tHolder, pmDataIterator_iHolder);
            } catch ( ProcessingFailureException e) {
                System.err.println(CodeTool.isoToGbk(e.errorReason));
                e.printStackTrace();
            }

            System.out.println(managedElement.getUserLabel()+" length = " + (pmDataIterator_iHolder.value == null ? null:pmDataIterator_iHolder.value.getLength()));

            for (int i = 0; i < pmDataList_tHolder.value.length; i++) {
                PMData_T e = pmDataList_tHolder.value[i];
                if (e != null) {
                    PMMeasurement_T[] pmMeasurementList = e.pmMeasurementList;
                    if (pmMeasurementList != null) {
//                        for (PMMeasurement_T pmMeasurement_t : pmMeasurementList) {
//                            String unit = pmMeasurement_t.unit;
//                            pmMeasurement_t.unit = CodeTool.IsoToUtf8(unit);
////                            System.out.println("IsoToUtf8 = " + CodeTool.IsoToUtf8(unit));
////                            System.out.println("isoToGbk = " + CodeTool.isoToGbk(unit));
////                            System.out.println("GbkToIso = " + CodeTool.GbkToIso(unit));
////                            System.out.println("UTF8ToGbk = " + CodeTool.UTF8ToGbk(unit));
////                            System.out.println("gbk-8" + convert(unit, "gbk", "utf-8"));
////                            System.out.println("utf-iso" + convert(unit, "utf-8", "iso8859-1"));
//                        }
                    }
                }
                nePms.get(dn).add(e);
            }

            if (null != pmDataIterator_iHolder.value) {

                boolean shouldContinue = true;
                while (shouldContinue) {
                    shouldContinue = pmDataIterator_iHolder.value.next_n(50, pmDataList_tHolder);

                    for (int i = 0; i < pmDataList_tHolder.value.length; i++) {
                        nePms.get(dn).add(pmDataList_tHolder.value[i]);
                    }

                }
                try {
                    pmDataIterator_iHolder.value.destroy();
                } catch (Throwable ex) {

                }
            }
        }

		Set<String> neDns = nePms.keySet();
		for (String neDn : neDns) {
			List<PMData_T> pmData_ts = nePms.get(neDn);



		}

		ObjectUtil.saveObject("pms",nePms);
        System.out.println("FINISH");


    }

    private String convert(String s,String sourceCharset,String destCharset) {
        try {
            return s == null ? null : new String(s.getBytes(sourceCharset),destCharset);
        } catch (UnsupportedEncodingException e) {

        }
        return  null;
    }

    public static void main(String[] args) {
        HashMap o = (HashMap)ObjectUtil.readObjectByPath("d:\\work\\pms");
        List  list = (List) o.get("EMS:Huawei/XiNing2@ManagedElement:33554489");
        PMData_T t = (PMData_T) list.get(0);
        String unit = t.pmMeasurementList[0].unit;
        System.out.println(unit);
        System.out.println("o = " + o);
    }
}
