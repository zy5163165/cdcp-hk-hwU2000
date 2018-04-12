package guiCutThrough;

/**
 *	Generated from IDL definition of alias "GuiCutThroughDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public guiCutThrough.GuiCutThroughData_T[] value;

	public GuiCutThroughDataList_THolder ()
	{
	}
	public GuiCutThroughDataList_THolder (final guiCutThrough.GuiCutThroughData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GuiCutThroughDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GuiCutThroughDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GuiCutThroughDataList_THelper.write (out,value);
	}
}
