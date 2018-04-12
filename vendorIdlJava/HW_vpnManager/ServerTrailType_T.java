package HW_vpnManager;

/**
 *	Generated from IDL definition of struct "ServerTrailType_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ServerTrailType_T(){}
	public HW_vpnManager.ServerConnectionType_T[] serverConnectionList;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public ServerTrailType_T(HW_vpnManager.ServerConnectionType_T[] serverConnectionList, transmissionParameters.LayeredParameters_T transmissionParams)
	{
		this.serverConnectionList = serverConnectionList;
		this.transmissionParams = transmissionParams;
	}
}
