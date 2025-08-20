package colormaya.mythosmod.mod;

import colormaya.mythosmod.mod.item.ModItems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythosMod implements ModInitializer {
	public static final String MOD_ID = "mythos-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerModItems();
	}
}