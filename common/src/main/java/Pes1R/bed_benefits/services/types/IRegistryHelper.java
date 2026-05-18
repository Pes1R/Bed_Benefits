package Pes1R.bed_benefits.services.types;

import Pes1R.bed_benefits.Constants;
import Pes1R.bed_benefits.services.util.RegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import java.util.function.Function;

public interface IRegistryHelper {
    <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties,T> item);
    static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, Constants.id(name));
    }
}
