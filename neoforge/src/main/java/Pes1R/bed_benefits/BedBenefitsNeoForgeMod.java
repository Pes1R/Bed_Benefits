package Pes1R.bed_benefits;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerWakeUpEvent;

@Mod(Constants.MOD_ID)
public class BedBenefitsNeoForgeMod {

    public BedBenefitsNeoForgeMod(IEventBus eventBus) {
        CommonClass.init();
        NeoForge.EVENT_BUS.register(this);
    }
    @net.neoforged.bus.api.SubscribeEvent
    public void onPlayerWakeUp(PlayerWakeUpEvent event) {
        if (!event.getEntity().getCommandSenderWorld().isClientSide()) {
            CommonClass.onPlayerWakeUp(event.getEntity());
        }
    }
}