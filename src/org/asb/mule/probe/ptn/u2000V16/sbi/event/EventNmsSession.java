package org.asb.mule.probe.ptn.u2000V16.sbi.event;

import java.io.File;

import maintenanceOps.MaintenanceMgr_IHelper;
import managedElementManager.ManagedElementMgr_I;
import managedElementManager.ManagedElementMgr_IHelper;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper;
import nmsSession.NmsSession_IPOA;

import org.asb.mule.probe.framework.util.CodeTool;
import org.asb.mule.probe.framework.util.FileLogger;
import org.asb.mule.probe.framework.util.corba.CorbaMgr;
import org.asb.mule.probe.ptn.u2000V16.sbi.event.ObjectCreationNotification;
import org.omg.CORBA.SystemException;
import org.omg.CosNotification.EventType;
import org.omg.CosNotification.Property;
import org.omg.CosNotification.StructuredEvent;
import org.omg.CosNotifyChannelAdmin.ClientType;
import org.omg.CosNotifyChannelAdmin.ConsumerAdmin;
import org.omg.CosNotifyChannelAdmin.EventChannelHolder;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplier;
import org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper;
import org.omg.CosNotifyComm.StructuredPushConsumerHelper;
import org.omg.CosNotifyComm.StructuredPushConsumerOperations;
import org.omg.CosNotifyComm.StructuredPushConsumerPOATie;
import org.omg.PortableServer.POA;

import session.Session_I;
import trailNtwProtection.TrailNtwProtMgr_I;
import trailNtwProtection.TrailNtwProtMgr_IHelper;
import HW_mstpInventory.HW_MSTPInventoryMgr_I;
import HW_mstpInventory.HW_MSTPInventoryMgr_IHelper;
import HW_mstpService.HW_MSTPServiceMgr_I;
import HW_mstpService.HW_MSTPServiceMgr_IHelper;
import HW_vpnManager.HW_VPNMgr_I;
import HW_vpnManager.HW_VPNMgr_IHelper;
import TopoManagementManager.TopoMgr_I;
import TopoManagementManager.TopoMgr_IHelper;

import common.Common_IHolder;

import emsMgr.EMSMgr_I;
import emsMgr.EMSMgr_IHelper;
import emsSession.EmsSession_I;
import emsSession.EmsSession_IPackage.managerNames_THolder;
import equipment.EquipmentInventoryMgr_I;
import equipment.EquipmentInventoryMgr_IHelper;
import globaldefs.ProcessingFailureException;

/**
 * Implementation for interface nmsSession_I.
 */
public class EventNmsSession extends NmsSession_IPOA implements StructuredPushConsumerOperations {

	private FileLogger eventlog = null;
	private static final String head1 = "NmsSession::";

	//
	// Name of the mgr objects.
	private static final String NameOfManagedElement = "ManagedElement";
	private static final String NameOfEquipmentInventory = "EquipmentInventory";
	private static final String NameOfEmsMgr = "EMS";
	private static final String NameOfMultiLayerSubnetwork = "MultiLayerSubnetwork";
	private static final String NameOfProtection = "Protection";
	private static final String NameOfPerformance = "PerformanceManagement";
	private static final String NameOfVpn = "CORBA_VPN";
	private static final String NameOfTrailNtwProtMgr = "TrailNetworkProtection";
	private static final String NameOfMaintenance = "Maintenance";

	private EMSMgr_I emsMgr = null;
	private EquipmentInventoryMgr_I equipmentMgr = null;
	private ManagedElementMgr_I managedElementMgr = null;
	private MultiLayerSubnetworkMgr_I subnetworkMgr = null;
	private TopoMgr_I topoMgr = null;
	private protection.ProtectionMgr_I protectionMgr = null;
	private performance.PerformanceManagementMgr_I performanceMgr = null;
	private HW_VPNMgr_I vpnMgr = null;
	private TrailNtwProtMgr_I trailNtwProtMgr = null;
	private maintenanceOps.MaintenanceMgr_I maintenanceMgr = null;

	private StructuredPushConsumerPOATie consumerTie = null;

	// object id of StructuredPushConsumer object. assigned by poa.
	private byte[] consumerObjectId;

	// proxy supplier used to receive notifications.
	private StructuredProxyPushSupplier proxySupplier;

	private static final String NameOfMstpInventory = "CORBA_MSTP_INV";
	private static final String NameOfMstpService = "CORBA_MSTP_SVC";

	private HW_mstpInventory.HW_MSTPInventoryMgr_I mstpInventoryMgr = null;
	private HW_mstpService.HW_MSTPServiceMgr_I mstpServiceMgr = null;

	private String iorFile = "temp.ior";

	//
	// =====================================================================
	// IDL implementation methods, from NmsSession_I
	// =====================================================================
	//
	public EventNmsSession() {

	}

	public EventNmsSession(FileLogger eventlog) {
		this.eventlog = eventlog;
	}

	/**
	 * @parm startTime: The time of the first notification lost.
	 * @parm notificationId: The notificationId of the first notification lost.
	 **/
	public void eventLossOccurred(String startTime, String notificationId) {
		eventlog.info("eventLossOccurred>>	........" + startTime);

	}

	/**
	 * @parm endTime: The time of the end of the event loss period, as determined by the EMS.
	 **/
	public void eventLossCleared(String endTime) {
		eventlog.info("eventLossCleared>>	 ........" + endTime);

	}

	/**
	 * readonly attribute Session_I associatedSession;
	 */
	public Session_I associatedSession() {
		return emsSession;
	}

	/**
	 * <p>
	 * Allows for the detection of loss of communication. It is implementation specific to differenciate intermittent problems from loss of connection.
	 * </p>
	 **/
	public void ping() {

		eventlog.info("ping>>	ping event...");

	}

	/**
	 * <p>
	 * Allows for a controlled disconnect between parties. All resources allocated for the session are deleted by operation.
	 * </p>
	 **/
	public void endSession() {
		String head2 = "endSession: ";

		eventlog.info("endSession>>	" + head1 + head2 + "Session ended.");

	}

	/**
	 * The cousumer was asked to disconnect. We consider this calling as a signal to end the session.
	 */
	public void disconnect_structured_push_consumer() {
		eventlog.info("disconnect_structured_push_consumer>>	" + head1 + " disconnect_structured_push_consumer.");
	}

	/**
	 * Dispath the notifications to specific listener based on the event type of notification.
	 * 
	 * @param notification
	 */
	public void push_structured_event(StructuredEvent notification) {

		String eventType = notification.header.fixed_header.event_type.type_name;
		eventlog.info("push_structured_event>>	=================================");

		eventlog.info("push_structured_event>>	Got notification of type: " + eventType);

		// eventlog.info(notification.filterable_data);
		// if (notification.filterable_data!=null) {
		// String detail="";
		// for (int i=0;i<notification.filterable_data.length;i++) {
		// Property p=notification.filterable_data[i];
		// detail+=p.name+":"+p.value.toString()+"\n";
		// }
		//
		// eventlog.info(detail);
		// }

		// try {
		// FileOutputStream fs = new FileOutputStream(eventType);
		// ObjectOutputStream os = new ObjectOutputStream(fs);
		// os.writeObject(notification.filterable_data);
		// os.flush();
		// os.close();
		// } catch (Exception ex) {
		// ex.printStackTrace();
		// }
		//
		//
		if (eventType.equals("NT_OBJECT_CREATION")) {
			eventlog.info("push_structured_event>>	NT_OBJECT_CREATION EVENT==========");
			ObjectCreationNotification ocn = new ObjectCreationNotification(notification);
			eventlog.info(ocn);
		} else if (eventType.equals("NT_ALARM")) {
			eventlog.info("push_structured_event>>	NT_ALARM EVENT==========");
		} else if (eventType.equals("NT_HEARTBEAT")) {
			eventlog.info("push_structured_event>>	NT_HEARTBEAT EVENT==========");
		} else if (eventType.equals("NT_FILE_TRANSFER_STATUS")) {
			eventlog.info("push_structured_event>>	NT_FILE_TRANSFER_STATUS EVENT==========");
		} else if (eventType.equals("NT_OBJECT_DELETION")) {
			eventlog.info("push_structured_event>>	NT_OBJECT_DELETION EVENT==========");
		} else if (eventType.equals("NT_ATTRIBUTE_VALUE_CHANGE")) {
			eventlog.info("push_structured_event>>	NT_ATTRIBUTE_VALUE_CHANGE EVENT==========");
		} else if (eventType.equals("NT_STATE_CHANGE")) {
			eventlog.info("push_structured_event>>	NT_STATE_CHANGE EVENT==========");
		} else if (eventType.equals("NT_ROUTE_CHANGE")) {
			eventlog.info("push_structured_event>>	NT_ROUTE_CHANGE EVENT==========");
		} else if (eventType.equals("NT_PROTECTION_SWITCH")) {
			eventlog.info("push_structured_event>>	NT_PROTECTION_SWITCH EVENT==========");
		} else if (eventType.equals("NT_TCA")) {
			eventlog.info("push_structured_event>>	NT_TCA EVENT==========");
		} else {
			eventlog.info("push_structured_event>>	UNKNOWN EVENT==========");
		}
	}

	public void offer_change(EventType[] added, EventType[] removed) {
		eventlog.info("offer_change>>	start...");
	}

	/**
	 * Shut down this session.
	 * <P>
	 * Main job in shutdown is to release the resources, including: disconnect the supplier; deactivate this NmsSession object. deactivate the
	 * StructuredPushConsumer object.
	 * </P>
	 */
	public void shutdownSession() {
		// send signal to end the ems session.
		try {
			// 'endSession' is defined as oneway operation, so the calling won't hang NmsSession_I and emsSession object even if
			// we enter this procedure from 'endSession' or 'disconnect_structured_event_consumer'.
			if (emsSession != null)
				emsSession.endSession();
			eventlog.info("shutdownSession>>	We ask ems session to be ended");
		} catch (Throwable e) {
			eventlog.info("shutdownSession>>	Exception: Failed to ask ems session be enede, detail:" + e);
			eventlog.error("shutdownSession>>	Exception", e);
		}

		// Disconnect supplier.
		try {
			if (proxySupplier != null)
				proxySupplier.disconnect_structured_push_supplier();
			eventlog.info("shutdownSession>>	Proxy supplier disconnected");
		} catch (Throwable e) {
			eventlog.info("shutdownSession>>	Exception: Failed to disconnect push supplier, detail: " + e);
			eventlog.error("shutdownSession>>	Exception", e);
		}

		if (_poa != null) {
			try {
				_poa.deactivate_object(_poa.servant_to_id(this));
				eventlog.info("shutdownSession>>	NmsSession_I object was deactivated");
			} catch (Throwable e) {
				eventlog.info("shutdownSession>>	Exception: Failed to deactivate the NmsSession_I,detail: " + e);
				eventlog.error("shutdownSession>>	Exception", e);
			}

			// Deactivate this StructuredPushConsumer object.
			try {
				if (consumerObjectId != null && consumerObjectId.length > 0)
					_poa.deactivate_object(consumerObjectId);
				eventlog.info("shutdownSession>>	Consumer object was deactivated");
			} catch (Throwable e) {
				eventlog.info("shutdownSession>>	Exception: Failed to deac tivate the consumer,detail: " + e);
				eventlog.error("shutdownSession>>	Exception", e);
			}

			try {
				_poa.destroy(false, false);
				eventlog.info("shutdownSession>>	nmsSessionPOA destoryed!");

				if (_poa != null) {
					eventlog.info("shutdownSession>>	after _nmsSessionPOA destoryed, set _nmsSessionPOA=null");
					_poa = null;
				}
			} catch (Exception ex) {
				eventlog.info("shutdownSession>>	Exception: Can not destory _nmsSessionPOA! " + ex);
			}
		}
		// Has disconnected so delete the iorFile.
		File file = new File(iorFile);
		file.delete();

		eventlog.info("shutdownSession>>	Session was shutdown");
	}

	/**
	 * Whether the associated ems session is in good status.
	 * 
	 * @param boolean
	 */
	public boolean isEmsSessionOK() {
		try {
			emsSession.ping();
			return true;
		} catch (Throwable e) {
			eventlog.error("isEmsSessionOK>>	Failed to ping ems session:" + e);
			eventlog.error("isEmsSessionOK Exception: " + e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Get ManagedElementMgr_I object.
	 */
	public ManagedElementMgr_I getManagedElementMgr() throws ProcessingFailureException {
		if (managedElementMgr == null) {
			managedElementMgr = ManagedElementMgr_IHelper.narrow(getManager(NameOfManagedElement));
		}
		return managedElementMgr;
	}

	public TrailNtwProtMgr_I getTrailNtwProtMgr() throws ProcessingFailureException {
		if (trailNtwProtMgr == null)
			trailNtwProtMgr = TrailNtwProtMgr_IHelper.narrow(getManager(NameOfTrailNtwProtMgr));
		return trailNtwProtMgr;
	}

	/**
	 * Get HW_VpnMgr_I object.
	 */
	public HW_VPNMgr_I getVpnMgr() throws ProcessingFailureException {
		if (vpnMgr == null) {
			vpnMgr = HW_VPNMgr_IHelper.narrow(getManager(NameOfVpn));
		}
		return vpnMgr;
	}

	/**
	 * Get Equipment inventory mgr.
	 */
	public EquipmentInventoryMgr_I getEquipmentInventoryMgr() throws ProcessingFailureException {
		if (equipmentMgr == null)
			equipmentMgr = EquipmentInventoryMgr_IHelper.narrow(getManager(NameOfEquipmentInventory));
		return equipmentMgr;
	}

	public EMSMgr_I getEmsMgr() throws ProcessingFailureException {
		if (emsMgr == null)
			emsMgr = EMSMgr_IHelper.narrow(getManager(NameOfEmsMgr));
		return emsMgr;

	}

	public TopoMgr_I getTopoMgr() throws ProcessingFailureException {
		if (topoMgr == null)
			topoMgr = TopoMgr_IHelper.narrow(getManager("TopoManagement"));
		return topoMgr;
	}

	public MultiLayerSubnetworkMgr_I getMultiLayerSubnetworkMgr() throws ProcessingFailureException {
		if (subnetworkMgr == null)
			subnetworkMgr = MultiLayerSubnetworkMgr_IHelper.narrow(getManager(NameOfMultiLayerSubnetwork));
		return subnetworkMgr;
	}

	public protection.ProtectionMgr_I getProtectionMgr() throws ProcessingFailureException {
		if (protectionMgr == null)
			protectionMgr = protection.ProtectionMgr_IHelper.narrow(getManager(NameOfProtection));
		return protectionMgr;
	}

	public performance.PerformanceManagementMgr_I getPerformanceMgr() throws ProcessingFailureException {
		if (performanceMgr == null)
			performanceMgr = performance.PerformanceManagementMgr_IHelper.narrow(getManager(NameOfPerformance));
		return performanceMgr;
	}

	private common.Common_I getManager(String mgrName) throws globaldefs.ProcessingFailureException {
		common.Common_IHolder commonHolder = new common.Common_IHolder();
		try {
			emsSession.getManager(mgrName, commonHolder);
		} catch (ProcessingFailureException e) {
			eventlog.error("getManager ProcessingFailureException: " + CodeTool.isoToGbk(e.errorReason), e);
			throw e;
		} catch (SystemException e) {
			eventlog.error("getManager SystemException: " + e.getMessage(), e);
			throw e;
		} catch (Throwable ex) {
			eventlog.error("getManager>>	Exception:" + ex.getMessage(), ex);
			// throw ex;
		}

		return commonHolder.value;
	}

	/**
	 * Intialize this session.
	 * <P>
	 * During intialization, we will: 1) establish event channel with EMS;
	 * </P>
	 * 
	 * @param poa
	 * @param alarmReport
	 * @param oldIorFile
	 */
	public boolean startAlarm() {
		//
		// Perform necessary initialization for attributes.
		//
		try {

			EventChannelHolder eventChannelHolder = new EventChannelHolder();
			emsSession.getEventChannel(eventChannelHolder);

			eventlog.info("startAlarm>>	eventChannel: " + CorbaMgr.instance().ORB().object_to_string(eventChannelHolder.value));

			// modified:
			ConsumerAdmin consumerAdmin = eventChannelHolder.value.default_consumer_admin();
			// ConsumerAdmin consumerAdmin = eventChannelHolder.value.get_consumeradmin(1);
			ClientType cType = ClientType.STRUCTURED_EVENT;
			org.omg.CORBA.IntHolder pid = new org.omg.CORBA.IntHolder();

			// subscribe the changes
			org.omg.CosNotification.EventType[] added = new org.omg.CosNotification.EventType[1];
			added[0] = new org.omg.CosNotification.EventType("*", "*");
			org.omg.CosNotification.EventType[] removed = new org.omg.CosNotification.EventType[0];
			try {
				consumerAdmin.subscription_change(added, removed);
			} catch (Throwable ex) {
				eventlog.info("startAlarm>>	Exception: Error get subscribe the change " + ex.getMessage());

			}

			// obtain proxy push supplier, we keep it's filter and qos setting as the original.
			proxySupplier = StructuredProxyPushSupplierHelper.narrow(consumerAdmin.obtain_notification_push_supplier(cType, pid));

			// activate consumer object and connect it into the supplier.
			consumerTie = new StructuredPushConsumerPOATie(this);
			consumerObjectId = _poa.activate_object(consumerTie);
			proxySupplier.connect_structured_push_consumer(StructuredPushConsumerHelper.narrow(_poa.servant_to_reference(consumerTie)));

		} catch (Throwable e) {
			eventlog.info("startAlarm>>	Exception: Failed to establish event channel ," + e.getMessage());
			return false;

		}

		eventlog.info("startAlarm>>	Connect event channel successfully.");

		// If the last connection was disconnected abnoramlly, now as a repair, the disconnection function should run.
		// RWProxySupplier rwProxySupplier = new RWProxySupplier(this,iorFile);
		// rwProxySupplier.RWFile();

		return true;
	}

	/**
	 * Start a thread to shutdown this session.
	 */
	public void waitAndShutdownSession() {
		Thread worker = new Thread() {
			public void run() {
				shutdownSession();
			}
		};

		worker.start();
	}

	public StructuredProxyPushSupplier getProxySupplier() {
		return proxySupplier;
	}

	public EmsSession_I getEMSSession() {
		return emsSession;
	}

	//
	// Attributes
	//

	// ems session.
	// @see associatedSession.
	protected EmsSession_I emsSession = null;

	// POA used to activate this servant.
	private POA _poa;

	/**
	 * Get MSTP inventory mgr.
	 */
	public HW_MSTPInventoryMgr_I getMstpInventoryMgr() throws ProcessingFailureException {

		if (mstpInventoryMgr == null) {
			common.Common_IHolder commonHolder = new common.Common_IHolder();

			try {
				emsSession.getManager(NameOfMstpInventory, commonHolder);
			} catch (ProcessingFailureException ex) {
				throw ex;
			} catch (Throwable ex) {
				ex.printStackTrace();
				System.out.println("getManager failed : " + ex);
				eventlog.info("getMstpInventoryMgr>>	Exception: " + ex.getMessage());

			}

			mstpInventoryMgr = HW_MSTPInventoryMgr_IHelper.narrow(commonHolder.value);
		}

		return mstpInventoryMgr;

	}

	/**
	 * Get MSTP service mgr.
	 */
	public HW_MSTPServiceMgr_I getMstpServiceMgr() throws ProcessingFailureException {
		if (mstpServiceMgr == null) {
			common.Common_IHolder commonHolder = new common.Common_IHolder();

			try {
				emsSession.getManager(NameOfMstpService, commonHolder);
			} catch (ProcessingFailureException ex) {
				throw ex;
			} catch (Throwable ex) {
				ex.printStackTrace();
				eventlog.info("getMstpServiceMgr>>	Exception: " + ex);

			}

			mstpServiceMgr = HW_MSTPServiceMgr_IHelper.narrow(commonHolder.value);
		}
		return mstpServiceMgr;
	}

	/**
	 * get MaintenanceMgr
	 * 
	 * @return
	 * @throws ProcessingFailureException
	 */

	public maintenanceOps.MaintenanceMgr_I getMaintenanceMgr() throws ProcessingFailureException {
		if (maintenanceMgr == null) {
			Common_IHolder commonHolder = new Common_IHolder();
			try {
				emsSession.getManager(NameOfMaintenance, commonHolder);
			} catch (ProcessingFailureException ex) {
				throw ex;
			} catch (Throwable ex) {
				ex.printStackTrace();
				eventlog.info("getMaintenanceMgr>>	Exception" + ex);
			}
			maintenanceMgr = MaintenanceMgr_IHelper.narrow(commonHolder.value);
		}
		return maintenanceMgr;

	}

	public void getsupportedManagers() throws ProcessingFailureException {
		managerNames_THolder ManagerName = new managerNames_THolder();
		try {
			this.emsSession.getSupportedManagers(ManagerName);
		} catch (ProcessingFailureException ex) {
			throw ex;
		} catch (Throwable ex) {
			ex.printStackTrace();
			eventlog.info("getsupportedManagers>>	Exception: " + ex);
		}

		for (int i = 0; i < ManagerName.value.length; i++) {
			eventlog.info("getsupportedManagers>>	The " + i + " supportedManager is : " + ManagerName.value[i]);
		}

		eventlog.info("getsupportedManagers>>	Leave getsupportedManagers.");
		return;

	}

	public void setEmsSession(EmsSession_I emsSession) {
		this.emsSession = emsSession;
	}

	public void set_poa(POA _poa) {
		this._poa = _poa;
	}

}
