package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import com.alcatelsbell.nms.util.ObjectUtil;
import globaldefs.NameAndStringValue_T;
import globaldefs.NamingAttributesList_THolder;
import globaldefs.ProcessingFailureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.asb.mule.probe.framework.CommandBean;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.ptn.u2000V16.service.U2000Service;
import org.asb.mule.probe.ptn.u2000V16.service.mapper.VendorDNFactory;
import subnetworkConnection.Route_THolder;
import topologicalLink.TopologicalLink_THolder;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Author: Ronnie.Chen
 * Date: 14-7-30
 * Time: 上午11:18
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class U2000Test implements CommandBean {
    private Log logger = LogFactory.getLog(getClass());
    public U2000Service getService() {
        return service;
    }

    public void setService(U2000Service service) {
        this.service = service;
    }

    public U2000Service service;

    //@Override
    public void execute1() {
        String ochSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2012-10-22 02:56:22 - 14008 -wdm";
        String dsrSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2011-12-20 10:03:06 - 23917 -wdm";
        String oduSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2011-12-21 06:15:34 - 26095 -wdm";

        getRoutes("och",ochSncDn);
        getRoutes("dsr",dsrSncDn);
        getRoutes("odu",oduSncDn);
    }
    @Override
    public void execute() {
        String ochSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2012-10-22 02:56:22 - 14008 -wdm";
        String dsrSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2011-12-20 10:03:06 - 23917 -wdm";
        String oduSncDn = "EMS:HZ-U2000-3-P@MultiLayerSubnetwork:1@SubnetworkConnection:2011-12-21 06:15:34 - 26095 -wdm";

        service.retrieveRouteAndTopologicalLinks(ochSncDn,new ArrayList<CrossConnect>(),new ArrayList<Section>() );
        service.retrieveRouteAndTopologicalLinks(dsrSncDn,new ArrayList<CrossConnect>(),new ArrayList<Section>() );
        service.retrieveRouteAndTopologicalLinks(oduSncDn,new ArrayList<CrossConnect>(),new ArrayList<Section>() );
    }


    private void getRoutes(String type,String sncName) {
        HashMap map = new HashMap();
        subnetworkConnection.Route_THolder normalRoute = new subnetworkConnection.Route_THolder();
        topologicalLink.TopologicalLinkList_THolder topologicalLinkList = new topologicalLink.TopologicalLinkList_THolder();
        String[] sncdns = sncName.split("@");
        NameAndStringValue_T[] vendorSncName = VendorDNFactory.createSNCDN(sncdns[0].substring(4), sncdns[1].substring(21), sncdns[2].substring(21));

        try {
            {
                try {
                    Route_THolder route_tHolder = new Route_THolder();
                    service.getCorbaService().getNmsSession().getMultiLayerSubnetworkMgr().
                            getRoute(vendorSncName, false, route_tHolder);
                    map.put(type + "-getRoute-false", route_tHolder.value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            {
                try {
                    Route_THolder route_tHolder2 = new Route_THolder();
                    service.getCorbaService().getNmsSession().getMultiLayerSubnetworkMgr().
                            getRoute(vendorSncName, true, route_tHolder2);
                    map.put(type + "-getRoute-true", route_tHolder2.value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (type.equals("och")) {
                try {
                    NamingAttributesList_THolder holder1 = new NamingAttributesList_THolder();
                    service.getCorbaService().getNmsSession().getMultiLayerSubnetworkMgr().
                        getAllSNCNamesWithHigherOrderSNC(vendorSncName, new short[0], holder1);
                    map.put(type + "-getAllSNCNamesWithHigherOrderSNC", holder1.value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

//            {
//                try {
//                    TopologicalLink_THolder holder = new TopologicalLink_THolder();
//                    service.getCorbaService().getNmsSession().getMultiLayerSubnetworkMgr().getAllSNCNamesWithHigherOrderSNC();op                            (vendorSncName, holder);
//                    map.put(type + "-getTopologicalLink", holder.value);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }

            //ObjectUtil.saveObject(type,map);
            
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Object och = ObjectUtil.readObject("och");
        Object dsr = ObjectUtil.readObject("dsr");
        Object odu = ObjectUtil.readObject("odu");
        System.out.println("odu = " + odu);

    }
}
