package lilmrmagoo.rwbymfan.init;

import java.util.ArrayList;
import java.util.List;

import lilmrmagoo.rwbymfan.items.RWBYGunDouble;
import io.github.blaezdev.rwbym.Init.RWBYCreativeTabs;
import io.github.blaezdev.rwbym.weaponry.RWBYGun;
import lilmrmagoo.rwbymfan.items.ItemBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TESTINGOT = new ItemBase("testingot");
	
	public static final Item claw_fang_scy = new RWBYGunDouble(
			"claw_fang_scy",
			2500,
			16,
			RWBYGunDouble.SCYTHE,
			"{AttributeModifiers:[{AttributeName:\"generic.attackDamage\",Name:\"generic.attackDamage\",Amount:18,Operation:0,UUIDLeast:571090,UUIDMost:892303,Slot:\"mainhand\"}]}",
			"rwbyfm:claw_fang",
			"rwbyfm:nuller,rwbyfm:nulls",
			false,
			1,
			false,
			false,
			0,
			1,
			0,
			1,
			RWBYCreativeTabs.tab_rwbyWeapons).setRecoil(5);
	public static final Item claw_fang = new RWBYGunDouble(
			"claw_fang",
			2500,
			16,
			RWBYGunDouble.SWORD,
			"{AttributeModifiers:[{AttributeName:\"generic.attackDamage\",Name:\"generic.attackDamage\",Amount:18,Operation:0,UUIDLeast:571090,UUIDMost:892303,Slot:\"mainhand\"}]}",
			"rwbyfm:claw_fang_scy",
			"rwbyfm:nuller,rwbyfm:nulls",
			false,
			1,
			false,
			false,
			0,
			1,
			0,
			1,
			RWBYCreativeTabs.tab_rwbyWeapons).setRecoil(5);
}
