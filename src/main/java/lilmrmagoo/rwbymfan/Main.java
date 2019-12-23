package lilmrmagoo.rwbymfan;

import lilmrmagoo.rwbymfan.proxy.CommonProxy;
import lilmrmagoo.rwbymfan.init.ItemInit;
import lilmrmagoo.rwbymfan.proxy.ClientProxy;
import lilmrmagoo.rwbymfan.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:rwbym")
public class Main 
{
	public static final String MOD_ID = "rwbymfanm";
	
	@Instance
	public static Main instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){ ItemInit.registerAll(event);}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		System.out.println("RWBYM is installed: " + Loader.isModLoaded("rwbym"));
	}	
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event){}
	
}
