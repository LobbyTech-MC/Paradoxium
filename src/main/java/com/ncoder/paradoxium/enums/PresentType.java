package com.ncoder.paradoxium.enums;

import com.ncoder.paradoxlib.utils.SkullTexture;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public enum PresentType {
    WHITE_WOOL("White", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2ZhZjRjMjlmMWU3NDA1ZjQ2ODBjNWMyYjAzZWY5Mzg0ZjFhZWNmZTI5ODZhZDUwMTM4YzYwNWZlZmZmMmYxNSJ9fX0="),
    ORANGE_WOOL("Orange", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2JmNzc5N2EyNGE2YWY4NzVmNWM4MjcxYzViOGM0MjVlMTlmMzcyYTQxNWUwNTUyZmMyNDc3NjNmMjg1OWQxIn19fQ=="),
    MAGENTA_WOOL("Magenta", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJiNDM4NmJjZGE4NGUzNTNjMzFkNzc4ZDNiMTFiY2QyNmZlYTQ5NGRkNjM0OTZiOGE4MmM3Yzc4YTRhZCJ9fX0="),
    LIGHT_BLUE_WOOL("Light Blue", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjFhZjQ2ZmViZDQ1YzBmNGQ4MWU4ZmExYjY2YjI3NWQ4OWUyNzJiMmFkNTVjOTc4NTUzYTk5YzczM2UxZmYifX19"),
    YELLOW_WOOL("Yellow", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdiYmQwYjI5MTFjOTZiNWQ4N2IyZGY3NjY5MWE1MWI4YjEyYzZmZWZkNTIzMTQ2ZDhhYzVlZjFiOGVlIn19fQ=="),
    LIME_WOOL("Lime", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDY3NDcwYTBjMThmNjg1MWU5MTQzNTM3MTllNzk1ODc3ZDI5YjMyNTJmN2U2YmQ0YTFiODY1NzY1YmQ3NGZlYiJ9fX0="),
    PINK_WOOL("Pink", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmJlY2ZiMzg3OTkzNmI4OTllNDIwYmZjZDNhNzRmOGExYmY5ZGQ1NGM1OGVjN2ZiOWY4MWQ5YTVkOTg4ZSJ9fX0="),
    GRAY_WOOL("Gray", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTllNjkxN2YyZmI0ZWEwOGU3MTMyZGYzMDk2MWQyYjVjNTIzYWJiYTE5Y2U0M2Y4MzVmYzE0YzU2OGY0In19fQ=="),
    LIGHT_GRAY_WOOL("Light Gray", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTk4YmEyYjM3NGNmYzg5NDU0YzFiOGMzMmRiNDU4YTI3MDY3NTQzOWE0OTU0OTZjOTY3NzFjOTg5MTE2MTYyIn19fQ=="),
    CYAN_WOOL("Cyan", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODhlZmFkNzRiMjU0ZTU3Yzc5OTc2M2RjZWVlNDUxMWZhMmY4NWFlOWZhNTU2ZWFhOTdkNDViZjY3ZTBiNmIzIn19fQ=="),
    PURPLE_WOOL("Purple", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmE5NGNiMjVkZTYyOGNhMzU5YjJmNmVhNWE4ODY4Y2JlMjY1OTVlZWRiMmJmZmI3NTA5NjdhZDFlZTE4NTAifX19"),
    BLUE_WOOL("Blue", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2YzZTQwNjI5MTE3NGQyNGNkZjBmOTUzZjhhMTc0YTgyYmIzNDg5ZGNlOGY2NzlhNDQzZWYxYWFlMDE2OTA2MSJ9fX0="),
    BROWN_WOOL("Brown", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJlMzZmNmE2NTRkZTc0NTgzZDgwMzAxNzdhZDZlM2FjNjc1NWQ3NDM1ZDkxMjNlOGViZGZmNzRiMmQ5MGNiIn19fQ=="),
    GREEN_WOOL("Green", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDg0Njg0MzQ0YWUwOTg1MjlmYzk0MWFhODRlMTk1YmRjYTM3NDhkNjlhY2ZlZTJiYWMxMzMyMTM1ZWRkOThjIn19fQ=="),
    RED_WOOL("Red", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWMxYmZhMTZiOTI2NDUyODU0ZTIzODdkZDFjNDk2MWM3ODRkNDc4MDNlNGFhZWUwZjgzMTRhMGQ2YTRlMGUxIn19fQ=="),
    BLACK_WOOL("Black", 4, "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FiMDI2M2JkZDc2ZjNlNDE4ZGJhNWJmNDgxYjkyMWNlZDM5N2Q4YjhhMzRhNTU2MWZiN2JlYWE0NmVjZTEifX19"),
    NETHERITE_BLOCK("Netherite", 1, "be0c7af591bd1337944abfac52b9bcf883528db72aacb6dbc4edd56a803667f4"),
    EMERALD_BLOCK("Emerald", 1, "509e5e444291e6837157002ee9d5f604c697039eec7acba2478fb09684f98ff7"),
    DIAMOND_BLOCK("Diamond", 1, "9dd8673f842e50f131b377c84b6fe51c219106df3fbc091a7bc9269b91c66052"),
    GOLD_BLOCK("Gold", 2, "bcaad86c708eb27773a64f93479e39f0442a5ce086b63296c7b7d1cf51160956"),
    COPPER_BLOCK("Copper", 2, "74300a5f8111753fb9e224d60e46d46fbb03cf3f0974b3dee43887ea5ff01fcb"),
    IRON_BLOCK("Iron", 2, "4025dd135b2e82e8cfd205cb27473f476735e8232b8238018cf15d34193024c1"),
    STONE("Stone", 4, "b06a3de2b1b95f42ffd448018d1cc11dc763f9d5c722cc1b6cc3fcfd4f09089e"),
    OAK_PLANKS("Oak", 4, "5028da6289d37e9432666b8f2d08d824852e75211dab7f87223e89845b42d9e2");

    private final String name;
    private final int amount;
    private final SkullTexture texture;

    @ParametersAreNonnullByDefault
    PresentType(String name, int amount, String texture) {
        this.name = name;
        this.amount = amount;
        this.texture = new SkullTexture(texture);
    }

    public static PresentType getByMaterial(Material material) {
        return PresentType.valueOf(material.name());
    }

    @Nonnull
    public String getName() { return name; }

    @Nonnull
    public int getAmount() { return amount; }

    @Nonnull
    public SkullTexture getTexture() { return texture; }
}
