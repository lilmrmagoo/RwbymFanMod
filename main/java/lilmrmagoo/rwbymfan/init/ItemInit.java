package lilmrmagoo.rwbymfan.init;

import java.util.ArrayList;
import java.util.List;

import lilmrmagoo.rwbymfan.items.RWBYGunDouble;
import io.github.blaezdev.rwbym.Init.RWBYCreativeTabs;
import io.github.blaezdev.rwbym.weaponry.RWBYGun;
import lilmrmagoo.rwbymfan.items.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;

public class ItemInit 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TESTINGOT = new ItemBase("testingot");
	
	public static final Item CLAW_FANG_SCY new RWBYGunDouble(
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
	public static final Item CLAW_FANG = new RWBYGunDouble(
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
	
	public static void registerAll(FMLPreInitializationEvent event){
		registerItems(event, ItemInit.CLAW_FANG_SCY);
		registerItems(event, ItemInit.CLAW_FANG);

	}

	private static void registerItems(FMLPreInitializationEvent event, Item...items) {
		//System.out.println("Registering Items");
		for(Item item : items){
			//System.out.println("Registering Item " + item.getUnlocalizedName().substring(5));
			if(event.getSide() == Side.CLIENT){
				ModelLoader.setCustomModelResourceLocation(item,0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
				//System.out.println("Item Model Registered");
			}
			ForgeRegistries.ITEMS.register(item);
			//System.out.println("Item Registered");
		}
	}
}
