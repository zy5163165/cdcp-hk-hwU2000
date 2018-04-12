package trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */


public interface TrafficDescriptorMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrafficDescriptors(int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptors(globaldefs.NameAndStringValue_T[] meName, int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws globaldefs.ProcessingFailureException;
	void getAllTrafficDescriptorNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptorNames(globaldefs.NameAndStringValue_T[] meName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException;
	void activateTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException;
	void deactivateTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException;
	void getAssociatedCTPs(globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void createTrafficDescriptor(trafficDescriptor.TDCreateData_T newTDCreateData, trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws globaldefs.ProcessingFailureException;
	void HW_createTrafficDescriptor(globaldefs.NameAndStringValue_T[] meName, trafficDescriptor.TDCreateData_T newTDCreateData, trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws globaldefs.ProcessingFailureException;
	void deleteTrafficDescriptor(globaldefs.NameAndStringValue_T[] descriptorName) throws globaldefs.ProcessingFailureException;
}
