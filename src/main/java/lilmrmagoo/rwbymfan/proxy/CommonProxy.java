package lilmrmagoo.rwbymfan.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@EventBusSubscriber(modid = "rwbymfanm")
public class CommonProxy 
{	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event ) {
		event.getRegistry().register(lilmrmagoo.rwbymfan.init.ItemInit.CLAW_FANG_SCY);
		event.getRegistry().register(lilmrmagoo.rwbymfan.init.ItemInit.CLAW_FANG);

}
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelEvent(final ModelRegistryEvent event) {
    	
    	 registerItemModel(lilmrmagoo.rwbymfan.init.ItemInit.CLAW_FANG_SCY);
    	 registerItemModel(lilmrmagoo.rwbymfan.init.ItemInit.CLAW_FANG);
    }	
    
    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item parItem)
    {
        registerItemModel(parItem, 0);
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item parItem, int parMetaData)
    {
//        // DEBUG
//        System.out.println("Registering item model for: " + parItem.getRegistryName());

        ModelLoader.setCustomModelResourceLocation(parItem, parMetaData,
                new ModelResourceLocation(parItem.getRegistryName(), "inventory"));
    }



}
