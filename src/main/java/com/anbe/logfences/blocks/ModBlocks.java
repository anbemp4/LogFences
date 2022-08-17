package com.anbe.logfences.blocks;

import com.anbe.logfences.Logfences;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, Logfences.MODID
    );

    public static final RegistryObject<Block> OAK_LOG_FENCE = BLOCKS.register(
            "oak_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_LOG_FENCE_GATE = BLOCKS.register(
            "oak_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_LOG_FENCE = BLOCKS.register(
            "spruce_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_LOG_FENCE_GATE = BLOCKS.register(
            "spruce_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_LOG_FENCE = BLOCKS.register(
            "birch_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_LOG_FENCE_GATE = BLOCKS.register(
            "birch_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_LOG_FENCE = BLOCKS.register(
            "jungle_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_LOG_FENCE_GATE = BLOCKS.register(
            "jungle_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_LOG_FENCE = BLOCKS.register(
            "acacia_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_LOG_FENCE_GATE = BLOCKS.register(
            "acacia_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE = BLOCKS.register(
            "dark_oak_log_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE_GATE = BLOCKS.register(
            "dark_oak_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CRIMSON_STEM_FENCE = BLOCKS.register(
            "crimson_stem_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.STEM)));
    public static final RegistryObject<Block> CRIMSON_STEM_FENCE_GATE = BLOCKS.register(
            "crimson_stem_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.STEM)));

    public static final RegistryObject<Block> WARPED_STEM_FENCE = BLOCKS.register(
            "warped_stem_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.STEM)));
    public static final RegistryObject<Block> WARPED_STEM_FENCE_GATE = BLOCKS.register(
            "warped_stem_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f, 3f).sound(SoundType.STEM)));
}
