package guiCutThrough;

/**
 *	Generated from IDL definition of alias "GuiCutThroughDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughDataList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, guiCutThrough.GuiCutThroughData_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static guiCutThrough.GuiCutThroughData_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(guiCutThrough.GuiCutThroughDataList_THelper.id(), "GuiCutThroughDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, guiCutThrough.GuiCutThroughData_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/guiCutThrough/GuiCutThroughDataList_T:1.0";
	}
	public static guiCutThrough.GuiCutThroughData_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		guiCutThrough.GuiCutThroughData_T[] _result;
		int _l_result39 = _in.read_long();
		_result = new guiCutThrough.GuiCutThroughData_T[_l_result39];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=guiCutThrough.GuiCutThroughData_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, guiCutThrough.GuiCutThroughData_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			guiCutThrough.GuiCutThroughData_THelper.write(_out,_s[i]);
		}

	}
}
