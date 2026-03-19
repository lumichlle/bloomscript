package kloud.item;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Set;

public class ModLootTableModifiers {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            if(source.isBuiltin() && FLOWER_LOOT_TABLES.contains(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.MAGIC_PETAL));

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }

    private static final Set<Identifier> FLOWER_LOOT_TABLES = Set.of(
            Identifier.of("minecraft", "blocks/poppy"),
            Identifier.of("minecraft", "blocks/dandelion"),
            Identifier.of("minecraft", "blocks/blue_orchid"),
            Identifier.of("minecraft", "blocks/allium"),
            Identifier.of("minecraft", "blocks/azure_bluet"),
            Identifier.of("minecraft", "blocks/red_tulip"),
            Identifier.of("minecraft", "blocks/orange_tulip"),
            Identifier.of("minecraft", "blocks/white_tulip"),
            Identifier.of("minecraft", "blocks/pink_tulip"),
            Identifier.of("minecraft", "blocks/oxeye_daisy"),
            Identifier.of("minecraft", "blocks/cornflower"),
            Identifier.of("minecraft", "blocks/lily_of_the_valley"),
            Identifier.of("minecraft", "blocks/sunflower"),
            Identifier.of("minecraft", "blocks/lilac"),
            Identifier.of("minecraft", "blocks/rose_bush"),
            Identifier.of("minecraft", "blocks/peony"),
            Identifier.of("minecraft", "blocks/pink_petals"),
            Identifier.of("minecraft", "blocks/flowering_azalea")
    );



}
