package com.ncoder.paradoxium.items.materials;

import com.ncoder.paradoxium.Paradoxium;
import com.ncoder.paradoxium.enums.PresentType;
import com.ncoder.paradoxium.items.ParadoxRecipeType;
import com.ncoder.paradoxium.utils.Categories;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Materials {

    public static final SlimefunItemStack BARK = new SlimefunItemStack(
            "BARK",
            Material.PAPER,
            "&f树皮",
            "",
            "&6&l右键 &7将去皮原木恢复成普通原木"
    );

    public static SlimefunItemStack PRESENT(PresentType type) {
        return new SlimefunItemStack(
                "PRESENT_" + type.toString(),
                type.getTexture().getBase64(),
                "&6魔盒 &7(&b" + type.getName() + "&7)",
                "",
                "&6&l右键 &7打开魔盒"
        );
    }

    public static void setup(Paradoxium plugin) {
        new Bark(
                Categories.materialsIG, BARK, ParadoxRecipeType.STRIPPING,
                new ItemStack[] {
                        null, null, null,
                        null, new ItemStack(Material.STRIPPED_OAK_LOG), null,
                        null, null, null
                }
        ).register(plugin);

        /* Presents */
        for (PresentType pEnum : PresentType.values()) {
            SlimefunItemStack item = PRESENT(pEnum);
            new Present(
                    Categories.blocksIG,
                    item,
                    ParadoxRecipeType.GIFT_WRAPPER,
                    new ItemStack[] {
                            null, null, null,
                            null, null, null,
                            null, null, null
                    }
            ).register(plugin);
        }

        /* Shards */
        new Shards(plugin);

    }

}
