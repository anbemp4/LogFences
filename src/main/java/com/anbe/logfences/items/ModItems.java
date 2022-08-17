package com.anbe.logfences.items;

import com.anbe.logfences.Logfences;
import com.anbe.logfences.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Logfences.MODID);

    public static final RegistryObject<BlockItem> OAK_LOG_FENCE = ITEMS.register("oak_log_fence", () -> new BlockItem(
            ModBlocks.OAK_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> OAK_LOG_FENCE_GATE = ITEMS.register("oak_log_fence_gate", () -> new BlockItem(
            ModBlocks.OAK_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE = ITEMS.register("spruce_log_fence", () -> new BlockItem(
            ModBlocks.SPRUCE_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE_GATE = ITEMS.register("spruce_log_fence_gate", () -> new BlockItem(
            ModBlocks.SPRUCE_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE = ITEMS.register("birch_log_fence", () -> new BlockItem(
            ModBlocks.BIRCH_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE_GATE = ITEMS.register("birch_log_fence_gate", () -> new BlockItem(
            ModBlocks.BIRCH_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE = ITEMS.register("jungle_log_fence", () -> new BlockItem(
            ModBlocks.JUNGLE_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE_GATE = ITEMS.register("jungle_log_fence_gate", () -> new BlockItem(
            ModBlocks.JUNGLE_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE = ITEMS.register("acacia_log_fence", () -> new BlockItem(
            ModBlocks.ACACIA_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE_GATE = ITEMS.register("acacia_log_fence_gate", () -> new BlockItem(
            ModBlocks.ACACIA_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE = ITEMS.register("dark_oak_log_fence", () -> new BlockItem(
            ModBlocks.DARK_OAK_LOG_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });
    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE_GATE = ITEMS.register("dark_oak_log_fence_gate", () -> new BlockItem(
            ModBlocks.DARK_OAK_LOG_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)){
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
            return 300;
        }
    });

    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE = ITEMS.register("crimson_stem_fence", () -> new BlockItem(
            ModBlocks.CRIMSON_STEM_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE_GATE = ITEMS.register("crimson_stem_fence_gate", () -> new BlockItem(
            ModBlocks.CRIMSON_STEM_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE = ITEMS.register("warped_stem_fence", () -> new BlockItem(
            ModBlocks.WARPED_STEM_FENCE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE_GATE = ITEMS.register("warped_stem_fence_gate", () -> new BlockItem(
            ModBlocks.WARPED_STEM_FENCE_GATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
