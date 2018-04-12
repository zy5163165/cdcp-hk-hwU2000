package HW_mstpService;

/**
 *	Generated from IDL interface "HW_MSTPServiceMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface HW_MSTPServiceMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createEthService(HW_mstpService.HW_EthServiceCreateData_T createData, HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws globaldefs.ProcessingFailureException;
	void deleteEthService(globaldefs.NameAndStringValue_T[] serviceName) throws globaldefs.ProcessingFailureException;
	void getAllEthService(globaldefs.NameAndStringValue_T[] meName, HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, HW_mstpService.HW_EthServiceList_THolder serviceList, HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws globaldefs.ProcessingFailureException;
	void getEthService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_EthService_THolder ethService) throws globaldefs.ProcessingFailureException;
	void createAtmService(HW_mstpService.HW_AtmServiceCreateData_T createData, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException;
	void deleteAtmService(globaldefs.NameAndStringValue_T[] serviceName) throws globaldefs.ProcessingFailureException;
	void getAllAtmService(globaldefs.NameAndStringValue_T[] meName, HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, HW_mstpService.HW_AtmServiceList_THolder serviceList, HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws globaldefs.ProcessingFailureException;
	void getAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException;
	void activateAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException;
	void deactivateAtmService(globaldefs.NameAndStringValue_T[] serviceName, HW_mstpService.HW_AtmService_THolder atmService) throws globaldefs.ProcessingFailureException;
}
