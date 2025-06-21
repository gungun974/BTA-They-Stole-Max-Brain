package gungun974.brainless;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BrainlessMod implements ModInitializer {
    public static final String MOD_ID = "TheyStoleMaxBrain";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("TheyStoleMaxBrain initialized.");
    }
}
