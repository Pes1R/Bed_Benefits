package Pes1R.bed_benefits.services;

import Pes1R.bed_benefits.services.types.IRegistryHelper;
import Pes1R.bed_benefits.services.util.RegistryHandle;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class FabricRegistryHelper implements IRegistryHelper {

    @Override
    public <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item) {
        ResourceKey<Item> key = IRegistryHelper.itemKey(name);
        Identifier id = key.identifier();
        T registrered = Registry.register(BuiltInRegistries.ITEM, id, item.apply(new Item.Properties().setId(key)));
        return new RegistryHandle<T>() {
            @Override
            public Identifier id() {
                return id;
            }

            @Override
            public T get() {
                return registrered;
            }
        };
    }
}
