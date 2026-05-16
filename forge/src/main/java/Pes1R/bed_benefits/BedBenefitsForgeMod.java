package Pes1R.bed_benefits;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BedBenefitsForgeMod {

    public BedBenefitsForgeMod() {
        CommonClass.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerWakeUp(PlayerWakeUpEvent event) {
        if (!event.getEntity().getCommandSenderWorld().isClientSide()) {
            CommonClass.onPlayerWakeUp(event.getEntity());
        }
    }
}