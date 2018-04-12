package equipment;

/**
 *	Generated from IDL definition of union "EquipmentOrHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentOrHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private equipment.EquipmentTypeQualifier_T discriminator;
	private equipment.Equipment_T equip;
	private equipment.EquipmentHolder_T holder;

	public EquipmentOrHolder_T ()
	{
	}

	public equipment.EquipmentTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public equipment.Equipment_T equip ()
	{
		if (discriminator != equipment.EquipmentTypeQualifier_T.EQT)
			throw new org.omg.CORBA.BAD_OPERATION();
		return equip;
	}

	public void equip (equipment.Equipment_T _x)
	{
		discriminator = equipment.EquipmentTypeQualifier_T.EQT;
		equip = _x;
	}

	public equipment.EquipmentHolder_T holder ()
	{
		if (discriminator != equipment.EquipmentTypeQualifier_T.EQT_HOLDER)
			throw new org.omg.CORBA.BAD_OPERATION();
		return holder;
	}

	public void holder (equipment.EquipmentHolder_T _x)
	{
		discriminator = equipment.EquipmentTypeQualifier_T.EQT_HOLDER;
		holder = _x;
	}

}
