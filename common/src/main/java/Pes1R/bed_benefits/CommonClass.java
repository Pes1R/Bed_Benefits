package Pes1R.bed_benefits;

import Pes1R.bed_benefits.config.Config;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class CommonClass {

    private static Config config;

    public static void init() {

        config = Config.load();
    }

    public static void onPlayerWakeUp(Player player) {

        if (config != null && player instanceof ServerPlayer serverPlayer) {

            if (config.restoreHealth.canApply(serverPlayer)) {

                config.restoreHealth.apply(serverPlayer);
            }

            if (config.sleepOffEffects.canApply(serverPlayer)) {

                config.sleepOffEffects.apply(serverPlayer);
            }
        }
    }
}