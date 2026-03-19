package kloud.item;

import kloud.bloomscript.BloomScript;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MAGIC_WAND = registerItem("magic_wand", new MagicWandItem(new Item.Settings()));
    public static final Item MAGIC_PETAL = registerItem("magic_petal", new Item(new Item.Settings()));

    // armor
    public static final Item BLOSSOM_HELMET = registerItem("blossom_helmet",
            new ArmorItem(ModArmorMaterials.BLOSSOM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item BLOSSOM_CHESTPLATE = registerItem("blossom_chestplate",
            new ArmorItem(ModArmorMaterials.BLOSSOM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));
    public static final Item BLOSSOM_LEGGINGS = registerItem("blossom_leggings",
            new ArmorItem(ModArmorMaterials.BLOSSOM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));
    public static final Item BLOSSOM_BOOTS = registerItem("blossom_boots",
            new ArmorItem(ModArmorMaterials.BLOSSOM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    // nommies
    public static final Item MAGIC_SOUP = registerItem("magic_soup", new Item(new Item.Settings().food(ModFoodComponents.MAGIC_SOUP)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BloomScript.MOD_ID, name), item);
    }

    // tools
    public static final Item BLOSSOM_SWORD = registerItem("blossom_sword",
            new SwordItem(ModToolMaterials.BLOSSOM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLOSSOM, 8, -0.4f))));
    public static final Item BLOSSOM_PICKAXE = registerItem("blossom_pickaxe",
            new PickaxeItem(ModToolMaterials.BLOSSOM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLOSSOM, 1, -0.8f))));
    public static final Item BLOSSOM_SHOVEL = registerItem("blossom_shovel",
            new ShovelItem(ModToolMaterials.BLOSSOM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLOSSOM, 1.5f, -0.0f))));
    public static final Item BLOSSOM_AXE = registerItem("blossom_axe",
            new AxeItem(ModToolMaterials.BLOSSOM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLOSSOM, 6, -0.2f))));
    public static final Item BLOSSOM_HOE = registerItem("blossom_hoe",
            new HoeItem(ModToolMaterials.BLOSSOM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLOSSOM, 0, -0.3f))));


    public static void registerModItems() {
        BloomScript.LOGGER.info("Yay, " + BloomScript.MOD_ID + " items are being registered!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MAGIC_WAND);
            entries.add(MAGIC_PETAL);
            entries.add(BLOSSOM_HELMET);
            entries.add(BLOSSOM_CHESTPLATE);
            entries.add(BLOSSOM_LEGGINGS);
            entries.add(BLOSSOM_BOOTS);
            entries.add(MAGIC_SOUP);
            entries.add(BLOSSOM_SWORD);
            entries.add(BLOSSOM_PICKAXE);
            entries.add(BLOSSOM_SHOVEL);
            entries.add(BLOSSOM_AXE);
            entries.add(BLOSSOM_HOE);
        });
    }
}
