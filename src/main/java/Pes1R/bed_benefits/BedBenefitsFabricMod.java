package Pes1R.bed_benefits;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;

public class BedBenefitsFabricMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        // Inizializza la mod comune (carica il config)
        CommonClass.init();

        // Registra l'evento del sonno nativo di Fabric
        EntitySleepEvents.STOP_SLEEPING.register((entity, pos) -> {
            // Esegui il codice solo se l'entità che si sveglia è un Player
            if (entity instanceof net.minecraft.world.entity.player.Player player) {
                CommonClass.onPlayerWakeUp(player);
            }
        });
    }
}
