package kloud.item;

import kloud.bloomscript.BloomScript;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static void initialize() {}

    public static final RegistryEntry<ArmorMaterial> BLOSSOM_ARMOR_MATERIAL = registerArmorMaterial("blossom_armor",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 20);
                map.put(ArmorItem.Type.LEGGINGS, 20);
                map.put(ArmorItem.Type.CHESTPLATE, 20);
                map.put(ArmorItem.Type.HELMET, 20);
                map.put(ArmorItem.Type.BODY, 20);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.fromTag(TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft", "flowers"))), // ingredient to repair the armor
                    List.of(new ArmorMaterial.Layer(Identifier.of(BloomScript.MOD_ID, "blossom_armor"))), 0,0));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(BloomScript.MOD_ID, name), material.get());
    }
}
