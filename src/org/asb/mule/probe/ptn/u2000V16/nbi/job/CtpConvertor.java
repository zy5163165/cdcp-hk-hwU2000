package org.asb.mule.probe.ptn.u2000V16.nbi.job;

 
import globaldefs.NameAndStringValue_T;
import notifications.NameAndAnyValue_T;
import notifications.ObjectType_T;
import org.asb.mule.probe.framework.service.Constant;
import terminationPoint.*;
import transmissionParameters.LayeredParameters_T;

import java.util.Vector;

public class CtpConvertor  
{
     private static CtpConvertor instance = new CtpConvertor();

     public static CtpConvertor instance()
     {
          return instance;
     }

 

 


     public TerminationPoint_T createNonUsedCtp(NameAndStringValue_T[] portName, String ctpRdn)
     {
          TerminationPoint_T ctp = new TerminationPoint_T();

          ctp.name = new NameAndStringValue_T[4];
          ctp.name[0] = portName[0];
          ctp.name[1] = portName[1];
          ctp.name[2] = portName[2];
          ctp.name[3] = new NameAndStringValue_T("CTP", ctpRdn);

          String jStr = getTimeSlot(ctpRdn, 0);
          String kStr = getTimeSlot(ctpRdn, 1);
          String lStr = getTimeSlot(ctpRdn, 2);
          String mStr = getTimeSlot(ctpRdn, 3);

          ctp.transmissionParams = new LayeredParameters_T[1];
          if (ctpRdn.indexOf("vt2_tu12-k") > 0) //vc12--stmn����
          {
               int k = Integer.parseInt(kStr);
               int l = Integer.parseInt(lStr);
               int m = Integer.parseInt(mStr);
               int slotno = (m - 1) * 21 + (l - 1) * 3 + k;

               ctp.userLabel = "VC12-" + slotno;
               ctp.nativeEMSName = "VC12-" + slotno;

               ctp.transmissionParams[0] = new LayeredParameters_T( (short) 11, new NameAndStringValue_T[0]);
          }
          else if (ctpRdn.indexOf("vt2_tu12") > 0) //vc12 -- 2m����
          {
               ctp.userLabel = "CTP-1";
               ctp.nativeEMSName = "CTP-1";

               ctp.transmissionParams[0] = new LayeredParameters_T( (short) 11, new NameAndStringValue_T[0]);
          }
          else if (ctpRdn.indexOf("tu3_vc3-k") > 0) //vc3
          {
               ctp.userLabel = "VC3-" + kStr;
               ctp.nativeEMSName = "VC3-" + kStr;

               ctp.transmissionParams[0] = new LayeredParameters_T( (short) 13, new NameAndStringValue_T[0]);
          }
          else if (ctpRdn.indexOf("tu3_vc3") > 0) //vc3 -- 34m����
          {
               ctp.userLabel = "CTP-1";
               ctp.nativeEMSName = "CTP-1";

               ctp.transmissionParams[0] = new LayeredParameters_T( (short) 13, new NameAndStringValue_T[0]);
          }
          else //vc4
          {
               ctp.userLabel = "VC4-" + jStr;
               ctp.nativeEMSName = "VC4-" + jStr;

               ctp.transmissionParams[0] = new LayeredParameters_T( (short) 15, new NameAndStringValue_T[0]);
          }

          ctp.owner = "";
//          ctp.mountingPosition = "-";
//          ctp.timeSlot = new TimeSlotOpt_T();
//          ctp.timeSlot.timeSlot(getTimeSlot(ctpRdn));
          ctp.type = TPType_T.TPT_CTP;
          ctp.connectionState = TPConnectionState_T.TPCS_NOT_CONNECTED; ;
  //        ctp.protectionState = TPProtectionState_T.PTS_NA;
          ctp.tpMappingMode = TerminationMode_T.TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING;
          ctp.direction = Directionality_T.D_BIDIRECTIONAL;
          ctp.tpProtectionAssociation = TPProtectionAssociation_T.TPPA_NA;
          ctp.edgePoint = false;
          ctp.additionalInfo = new NameAndStringValue_T[0];

          return ctp;
     }


     public TerminationPoint_T convertCtp(terminationPoint.TerminationPoint_T vendorCtp,String gxluEmsName)
     {
          TerminationPoint_T ctp = new TerminationPoint_T();

          ctp.name = (vendorCtp.name);
          ctp.userLabel = vendorCtp.userLabel;
          ctp.nativeEMSName = vendorCtp.nativeEMSName;
          ctp.owner = vendorCtp.owner;
//          ctp.mountingPosition = "-";
//          ctp.timeSlot = new TimeSlotOpt_T();
//          ctp.timeSlot.timeSlot(getTimeSlot(vendorCtp.name[3].value));
          ctp.type = TPType_T.TPT_CTP;
          ctp.connectionState = getConnectionState(vendorCtp.connectionState);
 //         ctp.protectionState = TPProtectionState_T.PTS_NA;
          ctp.tpMappingMode = TerminationMode_T.from_int(vendorCtp.tpMappingMode.value());
          ctp.direction = getDirection(vendorCtp.direction);
          ctp.transmissionParams = getTransmissionParameters(vendorCtp.transmissionParams);
          ctp.tpProtectionAssociation = TPProtectionAssociation_T.TPPA_NA;
          ctp.edgePoint = vendorCtp.edgePoint;
          ctp.additionalInfo = new NameAndStringValue_T[0];

          return ctp;
     }

    protected TPConnectionState_T getConnectionState(terminationPoint.TPConnectionState_T vendorConnectionState)
    {
        TPConnectionState_T state = null;
        switch (vendorConnectionState.value())
        {
            case terminationPoint.TPConnectionState_T._TPCS_NOT_CONNECTED:
                state = TPConnectionState_T.TPCS_NOT_CONNECTED;
                break;
            case terminationPoint.TPConnectionState_T._TPCS_SOURCE_CONNECTED:
                state = TPConnectionState_T.TPCS_SOURCE_CONNECTED;
                break;
            case terminationPoint.TPConnectionState_T._TPCS_SINK_CONNECTED:
                state = TPConnectionState_T.TPCS_SINK_CONNECTED;
                break;
            case terminationPoint.TPConnectionState_T._TPCS_BI_CONNECTED:
                state = TPConnectionState_T.TPCS_BI_CONNECTED;
                break;
            case terminationPoint.TPConnectionState_T._TPCS_NA: // for PTP
                state = TPConnectionState_T.TPCS_NA;
                break;
        }
        return state;
    }

    protected  LayeredParameters_T[] getTransmissionParameters(transmissionParameters.LayeredParameters_T[] transmissionParameters)
    {
        Vector parametersVector = new Vector();
        for (int i = 0; i < transmissionParameters.length; i++)
        {
            short rate = (transmissionParameters[i].layer);
            if (rate != 1)
            {
                parametersVector.addElement(new  LayeredParameters_T(rate,
                         (transmissionParameters[i].transmissionParams)));
            }
        }
        LayeredParameters_T[] parameters = new LayeredParameters_T[parametersVector.size()];
        parametersVector.copyInto(parameters);
        return parameters;
    }

    protected Directionality_T getDirection(terminationPoint.Directionality_T vendorDirection)
    {
        Directionality_T direction = null;
        switch (vendorDirection.value())
        {
            case terminationPoint.Directionality_T._D_NA:
                direction = Directionality_T.D_NA;
                break;
            case terminationPoint.Directionality_T._D_BIDIRECTIONAL:
                direction = Directionality_T.D_BIDIRECTIONAL;
                break;
            case terminationPoint.Directionality_T._D_SOURCE:
                direction = Directionality_T.D_SOURCE;
                break;
            case terminationPoint.Directionality_T._D_SINK:
                direction = Directionality_T.D_SINK;
                break;
        }
        return direction;
    }    
    


     public String getTimeSlot(String value, int jklm) // 0 : J , 1 : K, 2 : L, 3 : M
     {
          String timeSlot = "-";
          String delims[] = new String[4];
          delims[0] = "-j=";
          delims[1] = "-k=";
          delims[2] = "-l=";
          delims[3] = "-m=";

          int index1 = value.indexOf(delims[jklm]);

          if (index1 != -1)
          {
               int index2 = -1;
               if (0 == jklm)
                    index2 = value.indexOf("/", index1);
               else if (jklm < 3)
                    index2 = value.indexOf(delims[jklm + 1]);

               if (index2 != -1)
                    timeSlot = value.substring(index1 + 3, index2);
               else
                    timeSlot = value.substring(index1 + 3);
          }

          return timeSlot;
     }

    public String nv2dn(NameAndStringValue_T[] name) {
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
