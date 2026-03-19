package kloud.bloomscript.util;

import kloud.bloomscript.BloomScript;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static final TagKey<Block> NEEDS_BLOSSOM_TOOL = createTag("needs_blossom_tool");
    public static final TagKey<Block> INCORRECT_BLOSSOM_TOOL = createTag("incorrect_blossom_tool");

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BloomScript.MOD_ID, name));
    }
}
