package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import globaldefs.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.CTP;
import org.asb.mule.probe.framework.entity.PTP;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler.ManagedElementMgrHandler;
import org.asb.mule.probe.ptn.u2000V16.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.VendorDNFactory;
import terminationPoint.TerminationPoint_T;
import transmissionParameters.LayeredParameters_T;

import java.util.*;

/**
 * Author: Ronnie.Chen
 * Date: 14-7-24
 * Time: 下午8:36
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class CTPTest implements CommandBean{
    public U2000Service getService() {
        return service;
    }

    public void setService(U2000Service service) {
        this.service = service;
    }

    public U2000Service service;



    @Override
    public void execute() {
        PTP ptp = new PTP();
//        ptp.setDn("EMS:QUZ-T2000-3-P@ManagedElement:591049@PTP:/rack=1/shelf=1/slot=3/domain=sdh/port=1");
//        ptp.setRate("46||80||5");
        ptp.setDn("EMS:QUZ-T2000-3-P@ManagedElement:591831@PTP:/rack=1/shelf=1/slot=11/domain=sdh/port=1");
        ptp.setRate("47||49||77||23||28");



        List<CTP> ctps = service.retrieveAllCtps(ptp.getDn());
        for (CTP ctp : ctps) {
      //      System.out.println(ctp.getDn()+" rate="+ctp.getRate()+" trans="+ctp.getTransmissionParams()+" direction="+ctp.getDirection());
        }
        System.out.println("==============================================");
     //   execute1();
    }


    public void execute1() {
        String layRate = "47||49||73||20||25";
        String ptpName = "EMS:QUZ-T2000-3-P@ManagedElement:591080@PTP:/rack=1/shelf=1/slot=1/domain=sdh/port=1";
        NameAndStringValue_T[] ptpDn = VendorDNFactory.createCommonDN(ptpName);

        short[] layerRateList = CTPUtil.layRateList(layRate);
        short stmNumber = getContainedSTMn(layerRateList);
        if (stmNumber != -1)
        {
            //vendorCTPs = getMSSTMnContainedTPs(vendorTpName, stmNumber);
            Vector<TerminationPoint_T> gxluctps = null;
            try {
                gxluctps = getMSSTMnContainedTPs_New(ptpDn, ptpDn, stmNumber);
            } catch (ProcessingFailureException e) {
                e.printStackTrace();
            }
            System.out.println("gxluctps = " + gxluctps.size());
            for (TerminationPoint_T gxluctp : gxluctps) {
                System.out.println("gxluctp = " + nv2dn(gxluctp.name));
                System.out.println("direction = " + (gxluctp.direction == null ? null:gxluctp.direction.value()));
                System.out.println("transmissionParams = " + string(gxluctp.transmissionParams));

            }

            return;
        }

    }

    private String string(LayeredParameters_T[] lp) {
        if (lp == null) return null;
        StringBuffer sb = new StringBuffer();
        for (LayeredParameters_T layeredParameters_t : lp) {
            sb.append(layeredParameters_t.toString());

        }
        return sb.toString();


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


    private Vector getMSSTMnContainedTPs_New(NameAndStringValue_T[] tpName, globaldefs.NameAndStringValue_T[] vendorTpName, short stmNumber) throws ProcessingFailureException
    {
        try
        {
            short[] rateList = new short[3];
            rateList[0] = 15;
            rateList[1] = 13;
            rateList[2] = 11;
            terminationPoint.TerminationPoint_T[] usedCtps = ManagedElementMgrHandler.instance().retrieveContainedInUseTPs(service.getCorbaService().getNmsSession().getManagedElementMgr(), vendorTpName, rateList);

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


    public static short getContainedSTMn(short[] layerRateList)
    {
        short stmNumber = -1;
        for (int i = 0; i < layerRateList.length; i++)
        {

            if (layerRateList[i] == 20)
            {
                stmNumber = 1;
                break;
            }
            else if (layerRateList[i] == 21)
            {
                stmNumber = 4;
                break;
            }
            else if (layerRateList[i] == 22)
            {
                stmNumber = 16;
                break;
            }
            else if (layerRateList[i] == 23)
            {
                stmNumber = 64;
                break;
            }
            else if (layerRateList[i] ==124 || layerRateList[i] ==125)
            {
                stmNumber =8;
                break;
            }

        }
        return stmNumber;

    }




}
