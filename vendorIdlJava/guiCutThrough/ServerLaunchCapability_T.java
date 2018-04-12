package guiCutThrough;
/**
 *	Generated from IDL definition of enum "ServerLaunchCapability_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerLaunchCapability_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CLIENT_LAUNCH_ONLY = 0;
	public static final ServerLaunchCapability_T CLIENT_LAUNCH_ONLY = new ServerLaunchCapability_T(_CLIENT_LAUNCH_ONLY);
	public static final int _SERVER_LAUNCH_CAPABLE = 1;
	public static final ServerLaunchCapability_T SERVER_LAUNCH_CAPABLE = new ServerLaunchCapability_T(_SERVER_LAUNCH_CAPABLE);
	public int value()
	{
		return value;
	}
	public static ServerLaunchCapability_T from_int(int value)
	{
		switch (value) {
			case _CLIENT_LAUNCH_ONLY: return CLIENT_LAUNCH_ONLY;
			case _SERVER_LAUNCH_CAPABLE: return SERVER_LAUNCH_CAPABLE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ServerLaunchCapability_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
