package kloud.item;

import kloud.bloomscript.BloomScript;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static kloud.item.ModItems.*;

public class ModItemGroups {
    public static final ItemGroup BLOOM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BloomScript.MOD_ID, "bloom_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MAGIC_PETAL))
                    .displayName(Text.translatable("itemgroup.bloomscript.bloom_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLOSSOM_HELMET);
                        entries.add(ModItems.BLOSSOM_CHESTPLATE);
                        entries.add(ModItems.BLOSSOM_LEGGINGS);
                        entries.add(ModItems.BLOSSOM_BOOTS);
                        entries.add(ModItems.MAGIC_WAND);
                        entries.add(ModItems.MAGIC_SOUP);
                        entries.add(ModItems.MAGIC_PETAL);
                        entries.add(BLOSSOM_SWORD);
                        entries.add(BLOSSOM_PICKAXE);
                        entries.add(BLOSSOM_SHOVEL);
                        entries.add(BLOSSOM_AXE);
                        entries.add(BLOSSOM_HOE);
                    })
                    .build()

    );


    public static void registerItemGroups() {
        BloomScript.LOGGER.info("Registering Item Groups for: " + BloomScript.MOD_ID);
    }
}
