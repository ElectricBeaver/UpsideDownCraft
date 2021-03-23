package io.github.electrcibeaver.CraftUpsideDown.Crafting;

import io.github.electrcibeaver.CraftUpsideDown.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class Recipes {
    Plugin plugin = Main.getPlugin();

    //TODO MAIN Find a way to store all wood types in an object array and call it in shaped recipes
  /*  public Material woodReturn(Material wood){
        Object[] woods = new Object[]{Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS};

        for(int i = 0; i < woods.length; i++){
           wood = (Material) woods[i];
        }

        return wood;
    }*/
    @Deprecated
    public void buildingBlock(){
        //Purpur Block
        //Purpur Pillar
        //Stairs, all kinds
            //TODO BLOCKS Stairs, add 1.17
            ShapedRecipe woodStairs = new ShapedRecipe(new ItemStack(Material.OAK_STAIRS, 4)).shape( "***", "** ", "*  ").setIngredient('*', Material.OAK_PLANKS);
            ShapedRecipe woodStairs01 = new ShapedRecipe(new ItemStack(Material.OAK_STAIRS, 4)).shape( "***", " **", "  *").setIngredient('*', Material.OAK_PLANKS);
            Main.addToArray(woodStairs);
            Main.addToArray(woodStairs01);

            ShapedRecipe woodStairs02 = new ShapedRecipe(new ItemStack(Material.BIRCH_STAIRS,4 )).shape("***", "** ","*  " ).setIngredient('*', Material.BIRCH_PLANKS);
            ShapedRecipe woodStairs03 = new ShapedRecipe(new ItemStack(Material.BIRCH_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.BIRCH_PLANKS);
            Main.addToArray(woodStairs02);
            Main.addToArray(woodStairs03);

            ShapedRecipe woodStairs04 = new ShapedRecipe(new ItemStack(Material.SPRUCE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.SPRUCE_PLANKS);
            ShapedRecipe woodStairs05 = new ShapedRecipe(new ItemStack(Material.SPRUCE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.SPRUCE_PLANKS);
            Main.addToArray(woodStairs04);
            Main.addToArray(woodStairs05);

            ShapedRecipe woodStairs06 = new ShapedRecipe(new ItemStack(Material.JUNGLE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.JUNGLE_PLANKS);
            ShapedRecipe woodStairs07 = new ShapedRecipe(new ItemStack(Material.JUNGLE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.JUNGLE_PLANKS);
            Main.addToArray(woodStairs06);
            Main.addToArray(woodStairs07);

            ShapedRecipe woodStairs08 = new ShapedRecipe(new ItemStack(Material.ACACIA_PLANKS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.ACACIA_PLANKS);
            ShapedRecipe woodStairs09 = new ShapedRecipe(new ItemStack(Material.ACACIA_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.ACACIA_PLANKS);
            Main.addToArray(woodStairs08);
            Main.addToArray(woodStairs09);

            ShapedRecipe woodStairs10 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.DARK_OAK_PLANKS);
            ShapedRecipe woodStairs11 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.DARK_OAK_PLANKS);
            Main.addToArray(woodStairs10);
            Main.addToArray(woodStairs11);

            ShapedRecipe woodStairs12 = new ShapedRecipe(new ItemStack(Material.WARPED_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.WARPED_PLANKS);
            ShapedRecipe woodStairs13 = new ShapedRecipe(new ItemStack(Material.WARPED_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.WARPED_PLANKS);
            Main.addToArray(woodStairs12);
            Main.addToArray(woodStairs13);

            ShapedRecipe woodStairs14 = new ShapedRecipe(new ItemStack(Material.CRIMSON_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.CRIMSON_PLANKS);
            ShapedRecipe woodStairs15 = new ShapedRecipe(new ItemStack(Material.CRIMSON_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.CRIMSON_PLANKS);
            Main.addToArray(woodStairs14);
            Main.addToArray(woodStairs15);

            ShapedRecipe stoneStairs00 = new ShapedRecipe(new ItemStack(Material.STONE_STAIRS,4 )).shape("***", "** ", "*  ").setIngredient('*', Material.STONE);
            ShapedRecipe stoneStairs01 = new ShapedRecipe(new ItemStack(Material.STONE_STAIRS,4)).shape("***", " **", "  *").setIngredient('*', Material.STONE);
            Main.addToArray(stoneStairs00);
            Main.addToArray(stoneStairs01);

            ShapedRecipe cobblestoneStairs01 = new ShapedRecipe(new ItemStack(Material.COBBLESTONE_STAIRS)).shape("***", "** ", "*  ").setIngredient('*', Material.COBBLESTONE);
            ShapedRecipe cobblestoneStairs02 = new ShapedRecipe(new ItemStack(Material.COBBLESTONE_STAIRS)).shape("***", " **", "  *").setIngredient('*', Material.COBBLESTONE);
            Main.addToArray(cobblestoneStairs01);
            Main.addToArray(cobblestoneStairs02);

            ShapedRecipe mossyCobblestoneStairs01 = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.MOSSY_COBBLESTONE);
            ShapedRecipe mossyCobblestoneStairs02 = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.MOSSY_COBBLESTONE);
            Main.addToArray(mossyCobblestoneStairs01);
            Main.addToArray(mossyCobblestoneStairs02);

            ShapedRecipe stoneBrickStairs01 = new ShapedRecipe(new ItemStack(Material.STONE_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.STONE_BRICKS);
            ShapedRecipe stoneBrickStairs02 = new ShapedRecipe(new ItemStack(Material.STONE_BRICK_STAIRS)).shape("***", " **", "  *").setIngredient('*', Material.STONE_BRICKS);
            Main.addToArray(stoneBrickStairs01);
            Main.addToArray(stoneBrickStairs02);

            ShapedRecipe mossyStoneBricks01 = new ShapedRecipe(new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.MOSSY_STONE_BRICKS);
            ShapedRecipe mossyStoneBricks02 = new ShapedRecipe(new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.MOSSY_STONE_BRICKS);
            Main.addToArray(mossyStoneBricks01);
            Main.addToArray(mossyStoneBricks02);

            ShapedRecipe andesite01 = new ShapedRecipe(new ItemStack(Material.ANDESITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.ANDESITE);
            ShapedRecipe andesite02 = new ShapedRecipe(new ItemStack(Material.ANDESITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.ANDESITE);
            Main.addToArray(andesite01);
            Main.addToArray(andesite02);

            ShapedRecipe polishedAndesite01 = new ShapedRecipe(new ItemStack(Material.POLISHED_ANDESITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_ANDESITE);
            ShapedRecipe polishedAndesite02 = new ShapedRecipe(new ItemStack(Material.POLISHED_ANDESITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_ANDESITE);
            Main.addToArray(polishedAndesite01);
            Main.addToArray(polishedAndesite02);

            ShapedRecipe dioriteStairs01 = new ShapedRecipe(new ItemStack(Material.DIORITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.DIORITE);
            ShapedRecipe dioriteStairs02 = new ShapedRecipe(new ItemStack(Material.DIORITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.DIORITE);
            Main.addToArray(dioriteStairs01);
            Main.addToArray(dioriteStairs02);

            ShapedRecipe polishedDioriteStairs01 = new ShapedRecipe(new ItemStack(Material.POLISHED_DIORITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_DIORITE);
            ShapedRecipe polishedDioriteStairs02 = new ShapedRecipe(new ItemStack(Material.POLISHED_DIORITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_DIORITE);
            Main.addToArray(polishedDioriteStairs01);
            Main.addToArray(polishedDioriteStairs02);

            ShapedRecipe graniteStairs01 = new ShapedRecipe(new ItemStack(Material.GRANITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.GRANITE);
            ShapedRecipe graniteStairs02 = new ShapedRecipe(new ItemStack(Material.GRANITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.GRANITE);
            Main.addToArray(graniteStairs01);
            Main.addToArray(graniteStairs02);

            ShapedRecipe polishedGraniteStairs01 = new ShapedRecipe(new ItemStack(Material.POLISHED_GRANITE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_GRANITE);
            ShapedRecipe polishedGraniteStairs02 = new ShapedRecipe(new ItemStack(Material.POLISHED_GRANITE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_GRANITE);
            Main.addToArray(polishedGraniteStairs01);
            Main.addToArray(polishedGraniteStairs02);

            ShapedRecipe sandstoneStairs01 = new ShapedRecipe(new ItemStack(Material.SANDSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.SANDSTONE);
            ShapedRecipe sandstoneStairs02 = new ShapedRecipe(new ItemStack(Material.SANDSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.SANDSTONE);
            Main.addToArray(sandstoneStairs01);
            Main.addToArray(sandstoneStairs02);

            ShapedRecipe redSandstoneStairs01 = new ShapedRecipe(new ItemStack(Material.RED_SANDSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.RED_SANDSTONE);
            ShapedRecipe redSandstoneStairs02 = new ShapedRecipe(new ItemStack(Material.RED_SANDSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.RED_SANDSTONE);
            Main.addToArray(redSandstoneStairs01);
            Main.addToArray(redSandstoneStairs02);

            ShapedRecipe smoothSandstoneStairs01 = new ShapedRecipe(new ItemStack(Material.SMOOTH_SANDSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.SMOOTH_SANDSTONE);
            ShapedRecipe smoothSandstoneStairs02 = new ShapedRecipe(new ItemStack(Material.SMOOTH_SANDSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.SMOOTH_SANDSTONE);
            Main.addToArray(smoothSandstoneStairs01);
            Main.addToArray(smoothSandstoneStairs02);

            ShapedRecipe smoothRedSandstoneStairs01 = new ShapedRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.SMOOTH_RED_SANDSTONE);
            ShapedRecipe smoothRedSandstoneStairs02 = new ShapedRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.SMOOTH_RED_SANDSTONE);
            Main.addToArray(smoothRedSandstoneStairs01);
            Main.addToArray(smoothRedSandstoneStairs02);

            ShapedRecipe brickStairs01 = new ShapedRecipe(new ItemStack(Material.BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.BRICK );
            ShapedRecipe brickStairs02 = new ShapedRecipe(new ItemStack(Material.BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.BRICK );
            Main.addToArray(brickStairs01);
            Main.addToArray(brickStairs02);

            ShapedRecipe prismarineStairs01 = new ShapedRecipe(new ItemStack(Material.PRISMARINE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.PRISMARINE);
            ShapedRecipe prismarineStairs02 = new ShapedRecipe(new ItemStack(Material.PRISMARINE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.PRISMARINE);
            Main.addToArray(prismarineStairs01);
            Main.addToArray(prismarineStairs02);

            ShapedRecipe prismarineBrickStairs01 = new ShapedRecipe(new ItemStack(Material.PRISMARINE_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.PRISMARINE_BRICKS );
            ShapedRecipe prismarineBrickStairs02 = new ShapedRecipe(new ItemStack(Material.PRISMARINE_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.PRISMARINE_BRICKS );
            Main.addToArray(prismarineBrickStairs01);
            Main.addToArray(prismarineBrickStairs02);

            ShapedRecipe darkPrismarineStairs01 = new ShapedRecipe(new ItemStack(Material.DARK_PRISMARINE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.DARK_PRISMARINE );
            ShapedRecipe darkPrismarineStairs02 = new ShapedRecipe(new ItemStack(Material.DARK_PRISMARINE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.DARK_PRISMARINE );
            Main.addToArray(darkPrismarineStairs01);
            Main.addToArray(darkPrismarineStairs02);

            ShapedRecipe netherBrickStairs01 = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.NETHER_BRICK );
            ShapedRecipe netherBrickStairs02 = new ShapedRecipe(new ItemStack(Material.NETHER_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.NETHER_BRICK );
            Main.addToArray(netherBrickStairs01);
            Main.addToArray(netherBrickStairs02);

            ShapedRecipe redNetherBrickStairs01 = new ShapedRecipe(new ItemStack(Material.RED_NETHER_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.RED_NETHER_BRICKS );
            ShapedRecipe redNetherBrickStairs02 = new ShapedRecipe(new ItemStack(Material.RED_NETHER_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.RED_NETHER_BRICKS );
            Main.addToArray(redNetherBrickStairs01);
            Main.addToArray(redNetherBrickStairs02);

            ShapedRecipe quartzStairs01 = new ShapedRecipe(new ItemStack(Material.QUARTZ_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.QUARTZ_BLOCK);
            ShapedRecipe quartzStairs02 = new ShapedRecipe(new ItemStack(Material.QUARTZ_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.QUARTZ_BLOCK);
            Main.addToArray(quartzStairs01);
            Main.addToArray(quartzStairs02);

            ShapedRecipe smoothQuartzStairs01 = new ShapedRecipe(new ItemStack(Material.SMOOTH_QUARTZ_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.SMOOTH_QUARTZ);
            ShapedRecipe smoothQuartzStairs02 = new ShapedRecipe(new ItemStack(Material.SMOOTH_QUARTZ_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.SMOOTH_QUARTZ);
            Main.addToArray(smoothQuartzStairs01);
            Main.addToArray(smoothQuartzStairs02);

            ShapedRecipe purpurStairs01 = new ShapedRecipe(new ItemStack(Material.PURPUR_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', new RecipeChoice.MaterialChoice(Material.PURPUR_BLOCK, Material.PURPUR_PILLAR) );
            ShapedRecipe purpurStairs02 = new ShapedRecipe(new ItemStack(Material.PURPUR_STAIRS, 4)).shape("***", "  *", "  *").setIngredient('*', new RecipeChoice.MaterialChoice(Material.PURPUR_BLOCK, Material.PURPUR_PILLAR) );
            Main.addToArray(purpurStairs01);
            Main.addToArray(purpurStairs02);

            ShapedRecipe endStoneBrickStairs01 = new ShapedRecipe(new ItemStack(Material.END_STONE_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.END_STONE_BRICKS );
            ShapedRecipe endStoneBrickStairs02 = new ShapedRecipe(new ItemStack(Material.END_STONE_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.END_STONE_BRICKS );
            Main.addToArray(endStoneBrickStairs01);
            Main.addToArray(endStoneBrickStairs02);

            ShapedRecipe blackStoneStairs01 = new ShapedRecipe(new ItemStack(Material.BLACKSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.BLACKSTONE );
            ShapedRecipe blackStoneStairs02 = new ShapedRecipe(new ItemStack(Material.BLACKSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.BLACKSTONE );
            Main.addToArray(blackStoneStairs01);
            Main.addToArray(blackStoneStairs02);

            ShapedRecipe polishedBlackStoneStairs01 = new ShapedRecipe(new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_BLACKSTONE);
            ShapedRecipe polishedBlackStoneStairs02 = new ShapedRecipe(new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_BLACKSTONE );
            Main.addToArray(polishedBlackStoneStairs01);
            Main.addToArray(polishedBlackStoneStairs02);

            ShapedRecipe polishedBlackStoneBrickStairs01 = new ShapedRecipe(new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_BLACKSTONE_BRICKS);
            ShapedRecipe polishedBlackStoneBrickStairs02 = new ShapedRecipe(new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_BLACKSTONE_BRICKS );
            Main.addToArray(polishedBlackStoneBrickStairs01);
            Main.addToArray(polishedBlackStoneBrickStairs02);

            /*
            ShapedRecipe CutCopperStairs01 = new ShapedRecipe(new ItemStack(Material.CUT_COPPER_STAIRS, 4)).shape("***", "** ", "*  ").setIngredient('*', Material.POLISHED_BLACKSTONE_BRICKS);
            ShapedRecipe CutCopperStairs02 = new ShapedRecipe(new ItemStack(Material.CUT_COPPER_STAIRS, 4)).shape("***", " **", "  *").setIngredient('*', Material.POLISHED_BLACKSTONE_BRICKS );
            Main.addToArray(polishedBlackStoneBrickStairs01);
            Main.addToArray(polishedBlackStoneBrickStairs02);
            */




        //Basalt
        //Jack o'Lantern
        //Nether Bricks
        //End Stone Bricks
        //Block of Quartz, all types
        //Colored Terracotta, all colors
        //Terracotta
        //Stained Glass, all colors
        //Prismarine
        //Prismarine Bricks
        //Dark Prismarine
        //Sea Lantern
        //Magma Block
        //Nether Wart Block, both kinds
        //Red Nether Bricks
        //Bone Block
        //Concrete, all colors
        //Concrete Powder, all colors
        //Coral Blocks, all types
        //Dried Kelp Block
        //Block of Netherite
    }
    @Deprecated
    public void decorationBlock(){
        //Nether Sprouts
        //Weeping Vines
        //Twisting Vines
        //Torch
            ShapedRecipe torch00 = new ShapedRecipe(new ItemStack(Material.TORCH, 4)).shape("i ", "* ").setIngredient('i', Material.STICK).setIngredient('*', Material.COAL);
            ShapedRecipe torch01 = new ShapedRecipe(new ItemStack(Material.TORCH, 4)).shape(" i", " *").setIngredient('i', Material.STICK).setIngredient('*', Material.COAL);
            Main.addToArray(torch00);
            Main.addToArray(torch01);
        //End Rod
        //Crafting Table
            //not actually upside down but made of logs
            ShapedRecipe craftingTable = new ShapedRecipe(new ItemStack(Material.CRAFTING_TABLE)).shape("ll", "ll").setIngredient('l', new RecipeChoice.MaterialChoice(Material.ACACIA_LOG, Material.BIRCH_LOG, Material.DARK_OAK_LOG, Material.JUNGLE_LOG, Material.SPRUCE_LOG, Material.OAK_LOG, Material.CRIMSON_STEM, Material.WARPED_STEM));
            Main.addToArray(craftingTable);
            //Jukebox
        //Soul Torch
            ShapedRecipe soulTorch00 = new ShapedRecipe(new ItemStack(Material.SOUL_TORCH, 4)).shape("s  ", "t  ", "c  ").setIngredient('t', Material.STICK).setIngredient('c', Material.COAL).setIngredient('s', Material.SOUL_SOIL);
            ShapedRecipe soulTorch01 = new ShapedRecipe(new ItemStack(Material.SOUL_TORCH, 4)).shape(" s ", " t ", " c ").setIngredient('t', Material.STICK).setIngredient('c', Material.COAL).setIngredient('s', Material.SOUL_SOIL);
            ShapedRecipe soulTorch02 = new ShapedRecipe(new ItemStack(Material.SOUL_TORCH, 4)).shape("  s", "  t", "  c").setIngredient('t', Material.STICK).setIngredient('c', Material.COAL).setIngredient('s', Material.SOUL_SOIL);
            Main.addToArray(soulTorch00);
            Main.addToArray(soulTorch01);
            Main.addToArray(soulTorch02);

        //Iron Bars
        //Glass Pane
        //Nether Brick Fence
        //Enchanting Table
            ShapedRecipe enchantTable = new ShapedRecipe(new ItemStack(Material.ENCHANTING_TABLE, 1)).shape("ooo", "dod", " b ").setIngredient('o', Material.OBSIDIAN).setIngredient('d', Material.DIAMOND).setIngredient('b', Material.BOOK);
            Main.addToArray(enchantTable);
        //Walls, all types
        //Anvils, all levels of damage
        //Stained Glass Panes, all colors
        //Shulker Boxes, all colors
            //TODO IDEAS maybe add shulker but horizontal recipe instead of vertical
        //Glazed Terracotta, all colors
        //Coral, all types
        //Coral Fans, all types
        //Scaffolding
            ShapedRecipe scaffolding = new ShapedRecipe(new ItemStack(Material.SCAFFOLDING, 6)).shape("b b", "b b", "bsb").setIngredient('b', Material.BAMBOO).setIngredient('s', Material.STRING);
            Main.addToArray(scaffolding);
        //Painting
        //Signs, all types
        //Beds, all colors
            //TODO BLOCKS Beds, Add Rest of them (Lines), add wood (Mats/Lines)
            ShapedRecipe wBed = new ShapedRecipe(new ItemStack(Material.WHITE_BED, 1)).shape("www", "sss", "   ").setIngredient('w', Material.OAK_PLANKS).setIngredient('s', Material.WHITE_WOOL);
            Main.addToArray(wBed);
        //Item Frame
        //Flower Pot
            ShapedRecipe flowerpot1 = new ShapedRecipe(new ItemStack(Material.FLOWER_POT, 1)).shape(" b ", "b b", "   ").setIngredient('b', Material.BRICK);
            ShapedRecipe flowerpot2 = new ShapedRecipe(new ItemStack(Material.FLOWER_POT, 1)).shape("   ", " b ", "b b").setIngredient('b', Material.BRICK);
            Main.addToArray(flowerpot1);
            Main.addToArray(flowerpot2);
        //Armor Stand
            ShapedRecipe armorStand = new ShapedRecipe(new ItemStack(Material.ARMOR_STAND, 1)).shape("sls", " s ", "sss").setIngredient('s', Material.STICK).setIngredient('l', Material.SMOOTH_STONE_SLAB);
            Main.addToArray(armorStand);
        //Banners, all colors
            //TODO BLOCKS add all color banners
        //End Crystal
            ShapedRecipe endCrystal = new ShapedRecipe(new ItemStack(Material.END_CRYSTAL, 1)).shape("gtg", "geg", "ggg").setIngredient('g', Material.GLASS).setIngredient('t', Material.GHAST_TEAR).setIngredient('e', Material.ENDER_EYE);
            Main.addToArray(endCrystal);
        //Loom
            ShapedRecipe loom00 = new ShapedRecipe(new ItemStack(Material.LOOM)).shape("ww ", "ss ", "   ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.LOOM);
            ShapedRecipe loom01 = new ShapedRecipe(new ItemStack(Material.LOOM)).shape(" ww", " ss", "   ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.LOOM);
            ShapedRecipe loom02 = new ShapedRecipe(new ItemStack(Material.LOOM)).shape("   ", "ww ", "ss ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.LOOM);
            ShapedRecipe loom03 = new ShapedRecipe(new ItemStack(Material.LOOM)).shape("   ", " ww", " ss").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS,Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.LOOM);
            Main.addToArray(loom00);
            Main.addToArray(loom01);
            Main.addToArray(loom02);
            Main.addToArray(loom03);
        //Composter
             ShapedRecipe composter = new ShapedRecipe(new ItemStack(Material.COMPOSTER, 1)).shape("sss", "s s", "s s").setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_SLAB, Material.SPRUCE_SLAB, Material.BIRCH_SLAB, Material.JUNGLE_SLAB, Material.ACACIA_SLAB, Material.DARK_OAK_SLAB, Material.CRIMSON_SLAB, Material.WARPED_SLAB));
             Main.addToArray(composter);
        //Barrel
            ShapedRecipe barrel = new ShapedRecipe(new ItemStack(Material.BARREL)).shape("wsw", "w w", "wsw").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', new RecipeChoice.MaterialChoice(Material.ACACIA_SLAB, Material.BIRCH_SLAB, Material.DARK_OAK_SLAB, Material.JUNGLE_SLAB, Material.SPRUCE_SLAB, Material.OAK_SLAB));
            Main.addToArray(barrel);
        //Smoker
        //Blast Furnace
            ShapedRecipe blastFurnace = new ShapedRecipe(new ItemStack(Material.BLAST_FURNACE, 1)).shape("sss", "ifi", "iii").setIngredient('s', Material.SMOOTH_STONE).setIngredient('i', Material.IRON_INGOT).setIngredient('f', Material.FURNACE);
            Main.addToArray(blastFurnace);
        //Cartography Table
            ShapedRecipe cartographyTable00 = new ShapedRecipe(new ItemStack(Material.CARTOGRAPHY_TABLE,1)).shape("ww ", "ww ", "pp ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.PAPER);
            ShapedRecipe cartographyTable01 = new ShapedRecipe(new ItemStack(Material.CARTOGRAPHY_TABLE,1)).shape(" ww", " ww", " pp").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.PAPER);
            Main.addToArray(cartographyTable00);
            Main.addToArray(cartographyTable01);
        //Fletching Table
            ShapedRecipe fetchingTable00 = new ShapedRecipe(new ItemStack(Material.FLETCHING_TABLE,1)).shape("ww ", "ww ", "pp ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.FLINT);
            ShapedRecipe fetchingTable01 = new ShapedRecipe(new ItemStack(Material.FLETCHING_TABLE,1)).shape(" ww", " ww", " pp").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.FLINT);
            Main.addToArray(fetchingTable00);
            Main.addToArray(fetchingTable01);
        //Grindstone
                ShapedRecipe grindStone00 = new ShapedRecipe(new ItemStack(Material.GRINDSTONE, 1)).shape("w w", "sls", "   ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS,Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.STICK).setIngredient('l', Material.STONE_SLAB);
                ShapedRecipe grindStone01 = new ShapedRecipe(new ItemStack(Material.GRINDSTONE, 1)).shape("   ", "sls", "w w").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS,Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', Material.STICK).setIngredient('l', Material.STONE_SLAB);
                Main.addToArray(grindStone00);
                Main.addToArray(grindStone01);
        //Smithing Table
            ShapedRecipe smithingTable = new ShapedRecipe(new ItemStack(Material.SMITHING_TABLE)).shape("ww ", "ww ", "ii ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(smithingTable);
        //StoneCutter
            ShapedRecipe stoneCutter00 = new ShapedRecipe(new ItemStack(Material.STONECUTTER)).shape("sss"," i ", "   ").setIngredient('s', Material.STONE).setIngredient('i', Material.IRON_INGOT);
            ShapedRecipe stoneCutter01 = new ShapedRecipe(new ItemStack(Material.STONECUTTER)).shape("   ", "sss", " i ").setIngredient('s', Material.STONE).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(stoneCutter00);
            Main.addToArray(stoneCutter01);
        //Bell
        //Lantern
        //Soul Lantern
        //Campfire
            //TODO BLOCK find a way to only allow one type of log like using recipe choice but can only be one type also add to removed
            ShapedRecipe campfire = new ShapedRecipe(new ItemStack(Material.CAMPFIRE, 1)).shape("lll", "scs", " s ").setIngredient('c', new RecipeChoice.MaterialChoice(Material.COAL, Material.CHARCOAL)).setIngredient('s', Material.STICK);
            Main.addToArray(campfire);
        //Soul Campfire
            ShapedRecipe soulCampfire = new ShapedRecipe(new ItemStack(Material.SOUL_CAMPFIRE, 1)).shape("lll", "scs", " s ").setIngredient('c', new RecipeChoice.MaterialChoice(Material.SOUL_SOIL, Material.SOUL_SAND)).setIngredient('s', Material.STICK);
            Main.addToArray(soulCampfire);
        //Shroomlight
        //Beehives, both types
        //Honey Block
        //Honeycomb Block
    }
    @Deprecated
    public void redstone(){
        //Dispenser
            ShapedRecipe dispenser = new ShapedRecipe(new ItemStack(Material.DISPENSER,1)).shape("crc", "cbc", "ccc").setIngredient('c', Material.COBBLESTONE).setIngredient('r', Material.REDSTONE).setIngredient('b', Material.BOW);
            Main.addToArray(dispenser);
        //Note Block
        //Piston
            ShapedRecipe piston = new ShapedRecipe(new ItemStack(Material.PISTON, 1)).shape("crc", "cic", "www").setIngredient('w', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('c', Material.COBBLESTONE).setIngredient('r', Material.REDSTONE).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(piston);
        //Sticky Piston
            ShapedRecipe stickyPiston00 = new ShapedRecipe(new ItemStack(Material.TORCH, 4)).shape("i ", "* ").setIngredient('i', Material.PISTON).setIngredient('*', Material.SLIME_BALL);
            ShapedRecipe stickyPiston01 = new ShapedRecipe(new ItemStack(Material.TORCH, 4)).shape(" i", " *").setIngredient('i', Material.PISTON).setIngredient('*', Material.SLIME_BALL);
            Main.addToArray(stickyPiston01);
            Main.addToArray(stickyPiston00);
        //Lever
            ShapedRecipe lever00 = new ShapedRecipe(new ItemStack(Material.LEVER, 1)).shape("i ", "* ").setIngredient('i', Material.COBBLESTONE).setIngredient('*', Material.STICK);
            ShapedRecipe lever01 = new ShapedRecipe(new ItemStack(Material.LEVER, 1)).shape(" i", " *").setIngredient('i', Material.COBBLESTONE).setIngredient('*', Material.STICK);
            Main.addToArray(lever00);
            Main.addToArray(lever01);
        //Redstone Torch
            ShapedRecipe redstoneTorch00 = new ShapedRecipe(new ItemStack(Material.REDSTONE_TORCH, 4)).shape("i ", "* ").setIngredient('i', Material.STICK).setIngredient('*', Material.REDSTONE);
            ShapedRecipe redstoneTorch01 = new ShapedRecipe(new ItemStack(Material.REDSTONE_TORCH, 4)).shape(" i", " *").setIngredient('i', Material.STICK).setIngredient('*', Material.REDSTONE);
            Main.addToArray(redstoneTorch00);
            Main.addToArray(redstoneTorch01);
        //Wooden Trapdoors, all types
        //Fence Gates, all types
        //Redstone Lamp
        //Tripwire Hook
            ShapedRecipe tripWireHook00 = new ShapedRecipe(new ItemStack(Material.TRIPWIRE_HOOK, 4)).shape("s  ", "t  ", "c  ").setIngredient('t', Material.STICK).setIngredient('c', Material.IRON_INGOT).setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            ShapedRecipe tripWireHook01 = new ShapedRecipe(new ItemStack(Material.TRIPWIRE_HOOK, 4)).shape(" s ", " t ", " c ").setIngredient('t', Material.STICK).setIngredient('c', Material.IRON_INGOT).setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            ShapedRecipe tripWireHook02 = new ShapedRecipe(new ItemStack(Material.TRIPWIRE_HOOK, 4)).shape("  s", "  t", "  c").setIngredient('t', Material.STICK).setIngredient('c', Material.IRON_INGOT).setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(tripWireHook00);
            Main.addToArray(tripWireHook01);
            Main.addToArray(tripWireHook02);

        //Trapped Chest
        //Daylight Detector
            ShapedRecipe dayLightDetector = new ShapedRecipe(new ItemStack(Material.DAYLIGHT_DETECTOR, 1)).shape("sss", "qqq", "ggg").setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_SLAB, Material.BIRCH_SLAB, Material.SPRUCE_SLAB, Material.JUNGLE_SLAB, Material.ACACIA_SLAB, Material.DARK_OAK_SLAB)).setIngredient('q', Material.QUARTZ).setIngredient('g', Material.GLASS);
            Main.addToArray(dayLightDetector);
        //Hopper
            ShapedRecipe hopper = new ShapedRecipe(new ItemStack(Material.HOPPER, 1)).shape(" i ", "ici", "i i").setIngredient('i', Material.IRON_INGOT).setIngredient('c', Material.CHEST);
            Main.addToArray(hopper);
        //Dropper
            ShapedRecipe dropper = new ShapedRecipe(new ItemStack(Material.DROPPER, 1)).shape("crc", "c c", "ccc").setIngredient('c', Material.COBBLESTONE).setIngredient('r', Material.REDSTONE);
            Main.addToArray(dropper);
        //Observer
        //Redstone Repeater
            ShapedRecipe repeater00 = new ShapedRecipe(new ItemStack(Material.REPEATER, 1)).shape("sss", "tqt", "   ").setIngredient('s', Material.STONE).setIngredient('t', Material.REDSTONE_TORCH).setIngredient('q', Material.REDSTONE);
            ShapedRecipe repeater01 = new ShapedRecipe(new ItemStack(Material.REPEATER, 1)).shape("   ", "sss", "tqt").setIngredient('s', Material.STONE).setIngredient('t', Material.REDSTONE_TORCH).setIngredient('q', Material.REDSTONE);
            Main.addToArray(repeater00);
            Main.addToArray(repeater01);
        //Redstone Comparator
            ShapedRecipe comparator = new ShapedRecipe(new ItemStack(Material.COMPARATOR, 1)).shape("sss", "tqt", " t ").setIngredient('s', Material.STONE).setIngredient('t', Material.REDSTONE_TORCH).setIngredient('q', Material.QUARTZ);
            Main.addToArray(comparator);
        //Redstone Dust
        //Lectern
            ShapedRecipe lectern = new ShapedRecipe(new ItemStack(Material.LECTERN, 1)).shape(" s ", " b ", "sss").setIngredient('s', new RecipeChoice.MaterialChoice(Material.OAK_SLAB, Material.SPRUCE_SLAB, Material.BIRCH_SLAB, Material.JUNGLE_SLAB, Material.ACACIA_SLAB, Material.DARK_OAK_SLAB, Material.CRIMSON_SLAB, Material.WARPED_SLAB)).setIngredient('b', Material.BOOKSHELF);
            Main.addToArray(lectern);
        //Target
    }
    @Deprecated
    public void transportation(){
        //Powered Rail
            ShapedRecipe poweredRail = new ShapedRecipe(new ItemStack(Material.POWERED_RAIL, 6)).shape("grg", "gsg", "g g").setIngredient('g', Material.GOLD_INGOT).setIngredient('r', Material.REDSTONE).setIngredient('s', Material.STICK);
            Main.addToArray(poweredRail);
        //Detector Rail
            ShapedRecipe detectorRail = new ShapedRecipe(new ItemStack(Material.DETECTOR_RAIL, 6)).shape("iri", "ipi", "i i").setIngredient('i', Material.IRON_INGOT).setIngredient('p', Material.STONE_PRESSURE_PLATE).setIngredient('r', Material.REDSTONE);
            Main.addToArray(detectorRail);
        //Rail
        //Activator Rail
        //Minecart
            ShapedRecipe minecart00 = new ShapedRecipe(new ItemStack(Material.MINECART, 1)).shape("iii", "i i", "   ").setIngredient('i', Material.IRON_INGOT);
            ShapedRecipe minecart01 = new ShapedRecipe(new ItemStack(Material.MINECART, 1)).shape("iii", "i i", "   ").setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(minecart00);
            Main.addToArray(minecart01);
        //Minecart with Chest
            ShapedRecipe minecartWithChest00 = new ShapedRecipe(new ItemStack(Material.CHEST_MINECART, 1)).shape("m ", "c ").setIngredient('m', Material.MINECART).setIngredient('c', Material.CHEST);
            ShapedRecipe minecartWithChest01 = new ShapedRecipe(new ItemStack(Material.CHEST_MINECART, 1)).shape(" m", " c").setIngredient('m', Material.MINECART).setIngredient('c', Material.CHEST);
            Main.addToArray(minecartWithChest00);
            Main.addToArray(minecartWithChest01);
        //Minecart with Furnace
            ShapedRecipe minecartWithFurnace00 = new ShapedRecipe(new ItemStack(Material.FURNACE_MINECART, 1)).shape("m ", "c ").setIngredient('m', Material.MINECART).setIngredient('c', Material.FURNACE);
            ShapedRecipe minecartWithFurnace01 = new ShapedRecipe(new ItemStack(Material.FURNACE_MINECART, 1)).shape(" m", " c").setIngredient('m', Material.MINECART).setIngredient('c', Material.FURNACE);
            Main.addToArray(minecartWithFurnace00);
            Main.addToArray(minecartWithFurnace01);
        //Minecart with TNT
            ShapedRecipe minecartWithTNT00 = new ShapedRecipe(new ItemStack(Material.TNT_MINECART, 1)).shape("m ", "c ").setIngredient('m', Material.MINECART).setIngredient('c', Material.TNT);
            ShapedRecipe minecartWithTNT01 = new ShapedRecipe(new ItemStack(Material.TNT_MINECART, 1)).shape(" m", " c").setIngredient('m', Material.MINECART).setIngredient('c', Material.TNT);
            Main.addToArray(minecartWithTNT00);
            Main.addToArray(minecartWithTNT01);
        //Minecart with Hopper
            ShapedRecipe minecartWithHopper00 = new ShapedRecipe(new ItemStack(Material.HOPPER_MINECART, 1)).shape("m ", "c ").setIngredient('m', Material.MINECART).setIngredient('c', Material.HOPPER);
            ShapedRecipe minecartWithHopper01 = new ShapedRecipe(new ItemStack(Material.HOPPER_MINECART, 1)).shape(" m", " c").setIngredient('m', Material.MINECART).setIngredient('c', Material.HOPPER);
            Main.addToArray(minecartWithHopper00);
            Main.addToArray(minecartWithHopper01);
        //Carrot on a Stick
        //Boats, all types
            //TODO BLOCKS Boats, add new wood if they add them to the game (lines)
            ShapedRecipe boat00 = new ShapedRecipe(new ItemStack(Material.ACACIA_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.ACACIA_PLANKS);
            ShapedRecipe boat01 = new ShapedRecipe(new ItemStack(Material.BIRCH_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.BIRCH_PLANKS);
            ShapedRecipe boat02 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.DARK_OAK_PLANKS);
            ShapedRecipe boat03 = new ShapedRecipe(new ItemStack(Material.JUNGLE_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.JUNGLE_PLANKS);
            ShapedRecipe boat04 = new ShapedRecipe(new ItemStack(Material.OAK_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.OAK_PLANKS);
            ShapedRecipe boat05 = new ShapedRecipe(new ItemStack(Material.SPRUCE_BOAT, 1)).shape("www", "w w", "   ").setIngredient('w', Material.SPRUCE_PLANKS);
            Main.addToArray(boat00);
            Main.addToArray(boat01);
            Main.addToArray(boat02);
            Main.addToArray(boat03);
            Main.addToArray(boat04);
            Main.addToArray(boat05);
            ShapedRecipe boat10 = new ShapedRecipe(new ItemStack(Material.ACACIA_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.ACACIA_PLANKS);
            ShapedRecipe boat11 = new ShapedRecipe(new ItemStack(Material.BIRCH_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.BIRCH_PLANKS);
            ShapedRecipe boat12 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.DARK_OAK_PLANKS);
            ShapedRecipe boat13 = new ShapedRecipe(new ItemStack(Material.JUNGLE_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.JUNGLE_PLANKS);
            ShapedRecipe boat14 = new ShapedRecipe(new ItemStack(Material.OAK_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.OAK_PLANKS);
            ShapedRecipe boat15 = new ShapedRecipe(new ItemStack(Material.SPRUCE_BOAT, 1)).shape("   ", "www", "w w").setIngredient('w', Material.SPRUCE_PLANKS);
            Main.addToArray(boat10);
            Main.addToArray(boat11);
            Main.addToArray(boat12);
            Main.addToArray(boat13);
            Main.addToArray(boat14);
            Main.addToArray(boat15);
    }
    @Deprecated
    public void miscellaneous(){
        //Beacon
            ShapedRecipe beacon = new ShapedRecipe(new ItemStack(Material.BEACON, 1)).shape("ooo", "gsg", "ggg").setIngredient('o', Material.OBSIDIAN).setIngredient('g', Material.GLASS).setIngredient('s', Material.NETHER_STAR);
            Main.addToArray(beacon);
        //Conduit
        //Scute
        //Coal
        //Bowl
            //TODO NOTE should work and allow for only one line of code with 2x3 crafting grids
            ShapedRecipe bowl00 = new ShapedRecipe(new ItemStack(Material.BOWL, 4)).shape(" w ", "w w").setIngredient('w', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(bowl00);
        //Flint
        //Bucket
            ShapedRecipe bucket00 = new ShapedRecipe(new ItemStack(Material.BUCKET, 1)).shape(" i ", "i i", "   ").setIngredient('i', Material.IRON_INGOT);
            ShapedRecipe bucket01 = new ShapedRecipe(new ItemStack(Material.BUCKET, 1)).shape("   ", " i ", "i i").setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(bucket00);
            Main.addToArray(bucket01);
        //Book
        //Eye of Ender
        //Fire Charge
        //Book and Quill
        //Empty Map
        //Firework Rocket, no effects
        //Firework Star, no effects
        //Nether Brick
        //Nether Quartz
        //Prismarine Crystals
        //Nautilus Shell
        //Heart of the Sea
        //Banner Patterns, all kinds
        //Honeycomb
    }

    public void foodStuffs(){
        //Apple
        //Mushroom Stew
        //Bread
        //Raw Porkchop
        //Cooked Porkchop
        //Golden Apple
        //Enchanted Golden Apple
        //Raw Cod
        //Raw Salmon
        //Tropical Fish
        //Pufferfish
        //Cooked Cod
        //Cooked Salmon
        //Cake
        //Cookie
        //Melon Slice
        //Dried Kelp
        //Raw Beef
        //Steak
        //Raw Chicken
        //Cooked Chicken
        //Rotten Flesh
        //Spider Eye
        //Carrot
        //Potato
        //Baked Potato
        //Poisonous Potato
        //Pumpkin Pie
        //Raw Rabbit
        //Cooked Rabbit
        //Rabbit Stew
        //Raw Mutton
        //Cooked Mutton
        //Beetroot
        //Beetroot Soup
        //Sweet Berries
        //Honey Bottle
    }
    @Deprecated
    public void tools(){
        //Shovels, all types
            ShapedRecipe diamondShovel00 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SHOVEL, 1)).shape(" * ", " * ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironShovel00 = new ShapedRecipe(new ItemStack(Material.IRON_SHOVEL, 1)).shape(" * ", " * ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenShovel00 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SHOVEL, 1)).shape(" * ", " * ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneShovel00 = new ShapedRecipe(new ItemStack(Material.STONE_SHOVEL, 1)).shape(" * ", " * ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenShovel00 = new ShapedRecipe(new ItemStack(Material.WOODEN_SHOVEL, 1)).shape(" * ", " * ", " % ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondShovel00);
            Main.addToArray(ironShovel00);
            Main.addToArray(goldenShovel00);
            Main.addToArray(stoneShovel00);
            Main.addToArray(woodenShovel00);

            ShapedRecipe diamondShovel01 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SHOVEL, 1)).shape("*  ", "*  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironShovel01 = new ShapedRecipe(new ItemStack(Material.IRON_SHOVEL, 1)).shape("*  ", "*  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenShovel01 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SHOVEL, 1)).shape("*  ", "*  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneShovel01 = new ShapedRecipe(new ItemStack(Material.STONE_SHOVEL, 1)).shape("*  ", "*  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenShovel01 = new ShapedRecipe(new ItemStack(Material.WOODEN_SHOVEL, 1)).shape("*  ", "*  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondShovel01);
            Main.addToArray(ironShovel01);
            Main.addToArray(goldenShovel01);
            Main.addToArray(stoneShovel01);
            Main.addToArray(woodenShovel01);

            ShapedRecipe diamondShovel02 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SHOVEL, 1)).shape("  *", "  *", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironShovel02 = new ShapedRecipe(new ItemStack(Material.IRON_SHOVEL, 1)).shape("  *", "  *", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenShovel02 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SHOVEL, 1)).shape("  *", "  *", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneShovel02 = new ShapedRecipe(new ItemStack(Material.STONE_SHOVEL, 1)).shape("  *", "  *", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenShovel02 = new ShapedRecipe(new ItemStack(Material.WOODEN_SHOVEL, 1)).shape("  *", "  *", "  %").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondShovel02);
            Main.addToArray(ironShovel02);
            Main.addToArray(goldenShovel02);
            Main.addToArray(stoneShovel02);
            Main.addToArray(woodenShovel02);
        //Pickaxes, all types
            ShapedRecipe diamondPick = new ShapedRecipe(new ItemStack(Material.DIAMOND_PICKAXE, 1)).shape(" * ", " * ", "%%%").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironPick = new ShapedRecipe(new ItemStack(Material.IRON_PICKAXE, 1)).shape(" * ", " * ", "%%%").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenPick = new ShapedRecipe(new ItemStack(Material.GOLDEN_PICKAXE, 1)).shape(" * ", " * ", "%%%").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stonePick = new ShapedRecipe(new ItemStack(Material.STONE_PICKAXE, 1)).shape(" * ", " * ", "%%%").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenPick = new ShapedRecipe(new ItemStack(Material.WOODEN_PICKAXE, 1)).shape(" * ", " * ", "www").setIngredient('*', Material.STICK).setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondPick);
            Main.addToArray(ironPick);
            Main.addToArray(goldenPick);
            Main.addToArray(stonePick);
            Main.addToArray(woodenPick);
        //Axes, all types
            ShapedRecipe diamondAxe00 = new ShapedRecipe(new ItemStack(Material.DIAMOND_AXE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironAxe00 = new ShapedRecipe(new ItemStack(Material.IRON_AXE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenAxe00 = new ShapedRecipe(new ItemStack(Material.GOLDEN_AXE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneAxe00 = new ShapedRecipe(new ItemStack(Material.STONE_AXE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenAxe00 = new ShapedRecipe(new ItemStack(Material.WOODEN_AXE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondAxe00);
            Main.addToArray(ironAxe00);
            Main.addToArray(goldenAxe00);
            Main.addToArray(stoneAxe00);
            Main.addToArray(woodenAxe00);
            ShapedRecipe diamondAxe01 = new ShapedRecipe(new ItemStack(Material.DIAMOND_AXE, 1)).shape(" * ", " *%", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironAxe01 = new ShapedRecipe(new ItemStack(Material.IRON_AXE, 1)).shape(" * ", " *%", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenAxe01 = new ShapedRecipe(new ItemStack(Material.GOLDEN_AXE, 1)).shape(" * ", " *%", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneAxe01 = new ShapedRecipe(new ItemStack(Material.STONE_AXE, 1)).shape(" * ", " *%", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenAxe01 = new ShapedRecipe(new ItemStack(Material.WOODEN_AXE, 1)).shape(" * ", " *%", "%% ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondAxe01);
            Main.addToArray(ironAxe01);
            Main.addToArray(goldenAxe01);
            Main.addToArray(stoneAxe01);
            Main.addToArray(woodenAxe01);
        //Flint and Steel
        //Hoes, all types
            ShapedRecipe diamondHoe00 = new ShapedRecipe(new ItemStack(Material.DIAMOND_HOE, 1)).shape(" * ", " * ", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironHoe00 = new ShapedRecipe(new ItemStack(Material.IRON_HOE, 1)).shape(" * ", " * ", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenHoe00 = new ShapedRecipe(new ItemStack(Material.GOLDEN_HOE, 1)).shape(" * ", " * ", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneHoe00 = new ShapedRecipe(new ItemStack(Material.STONE_HOE, 1)).shape(" * ", " * ", " %%").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenHoe00 = new ShapedRecipe(new ItemStack(Material.WOODEN_HOE, 1)).shape(" * ", " *%", " %%").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondHoe00);
            Main.addToArray(ironHoe00);
            Main.addToArray(goldenHoe00);
            Main.addToArray(stoneHoe00);
            Main.addToArray(woodenHoe00);

            ShapedRecipe diamondHoe01 = new ShapedRecipe(new ItemStack(Material.DIAMOND_HOE, 1)).shape(" * ", " * ", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironHoe01 = new ShapedRecipe(new ItemStack(Material.IRON_HOE, 1)).shape(" * ", " * ", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenHoe01 = new ShapedRecipe(new ItemStack(Material.GOLDEN_HOE, 1)).shape(" * ", " * ", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneHoe01 = new ShapedRecipe(new ItemStack(Material.STONE_HOE, 1)).shape(" * ", " * ", "%% ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenHoe01 = new ShapedRecipe(new ItemStack(Material.WOODEN_HOE, 1)).shape(" * ", " * ", "%% ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondHoe01);
            Main.addToArray(ironHoe01);
            Main.addToArray(goldenHoe01);
            Main.addToArray(stoneHoe01);
            Main.addToArray(woodenHoe01);
        //Compass
        //Fishing Rod
            ShapedRecipe fishingRod = new ShapedRecipe(new ItemStack(Material.FISHING_ROD, 1)).shape("s t", " st", "  s" ).setIngredient('s', Material.STICK).setIngredient('t', Material.STRING);
            Main.addToArray(fishingRod);
        //Clock
        //Shears
        //Lead
        //Name Tag
    }
    @Deprecated
    public void combat(){
        //Turt shell
            //TODO NOTE should work and allow for only one line of code with 2x3 crafting grids
            ShapedRecipe turtShell = new ShapedRecipe(new ItemStack(Material.TURTLE_HELMET, 1)).shape("s s", "sss").setIngredient('s', Material.SCUTE);
            Main.addToArray(turtShell);
        //Bow
        //Arrow
            //TODO NOT another line that might work to help save time on a 1x3 grid
            ShapedRecipe arrow =new ShapedRecipe(new ItemStack(Material.ARROW, 4)).shape("f", "s", "e").setIngredient('f', Material.FLINT).setIngredient('s', Material.STICK).setIngredient('e', Material.FEATHER);
            Main.addToArray(arrow);
        //Swords, all types
            ShapedRecipe diamondSword00 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SWORD, 1)).shape(" * ", " % ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironSword00 = new ShapedRecipe(new ItemStack(Material.IRON_SWORD, 1)).shape(" * ", " % ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenSword00 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SWORD, 1)).shape(" * ", " % ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneSword00 = new ShapedRecipe(new ItemStack(Material.STONE_SWORD, 1)).shape(" * ", " % ", " % ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenSword00 = new ShapedRecipe(new ItemStack(Material.WOODEN_SWORD, 1)).shape(" * ", " % ", " % ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondSword00);
            Main.addToArray(ironSword00);
            Main.addToArray(goldenSword00);
            Main.addToArray(stoneSword00);
            Main.addToArray(woodenSword00);

            ShapedRecipe diamondSword01 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SWORD, 1)).shape("*  ", "%  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironSword01 = new ShapedRecipe(new ItemStack(Material.IRON_SWORD, 1)).shape("*  ", "%  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenSword01 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SWORD, 1)).shape("*  ", "%  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneSword01 = new ShapedRecipe(new ItemStack(Material.STONE_SWORD, 1)).shape("*  ", "%  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenSword01 = new ShapedRecipe(new ItemStack(Material.WOODEN_SWORD, 1)).shape("*  ", "%  ", "%  ").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondSword01);
            Main.addToArray(ironSword01);
            Main.addToArray(goldenSword01);
            Main.addToArray(stoneSword01);
            Main.addToArray(woodenSword01);

            ShapedRecipe diamondSword02 = new ShapedRecipe(new ItemStack(Material.DIAMOND_SWORD, 1)).shape("  *", "  %", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.DIAMOND);
            ShapedRecipe ironSword02 = new ShapedRecipe(new ItemStack(Material.IRON_SWORD, 1)).shape("  *", "  %", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.IRON_INGOT);
            ShapedRecipe goldenSword02 = new ShapedRecipe(new ItemStack(Material.GOLDEN_SWORD, 1)).shape("  *", "  %", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.GOLD_INGOT);
            ShapedRecipe stoneSword02 = new ShapedRecipe(new ItemStack(Material.STONE_SWORD, 1)).shape("  *", "  %", "  %").setIngredient('*', Material.STICK).setIngredient('%', Material.COBBLESTONE);
            ShapedRecipe woodenSword02 = new ShapedRecipe(new ItemStack(Material.WOODEN_SWORD, 1)).shape("  *", "  %", "  %").setIngredient('*', Material.STICK).setIngredient('%', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS));
            Main.addToArray(diamondSword02);
            Main.addToArray(ironSword02);
            Main.addToArray(goldenSword02);
            Main.addToArray(stoneSword02);
            Main.addToArray(woodenSword02);
        //Armor, all sets
            ShapedRecipe diamondHelmet00 = new ShapedRecipe(new ItemStack(Material.DIAMOND_HELMET, 1)).shape("* *","***", "   ").setIngredient('*', Material.DIAMOND);
            ShapedRecipe diamondHelmet01 = new ShapedRecipe(new ItemStack(Material.DIAMOND_HELMET, 1)).shape("   ", "* *", "***").setIngredient('*', Material.DIAMOND);
            ShapedRecipe diamondChestplate = new ShapedRecipe(new ItemStack(Material.DIAMOND_CHESTPLATE, 1)).shape("***", "***", "* *").setIngredient('*', Material.DIAMOND);
            ShapedRecipe diamondLeggings = new ShapedRecipe(new ItemStack(Material.DIAMOND_LEGGINGS, 1)).shape("* *", "* *", "***").setIngredient('*', Material.DIAMOND);
            Main.addToArray(diamondHelmet00);
            Main.addToArray(diamondHelmet01);
            Main.addToArray(diamondChestplate);
            Main.addToArray(diamondLeggings);

            ShapedRecipe goldenHelmet00 = new ShapedRecipe(new ItemStack(Material.GOLDEN_HELMET, 1)).shape("* *","***", "   ").setIngredient('*', Material.GOLD_INGOT);
            ShapedRecipe goldenHelmet01 = new ShapedRecipe(new ItemStack(Material.GOLDEN_HELMET, 1)).shape("   ", "* *", "***").setIngredient('*', Material.GOLD_INGOT);
            ShapedRecipe goldenChestplate = new ShapedRecipe(new ItemStack(Material.GOLDEN_CHESTPLATE, 1)).shape("***", "***", "* *").setIngredient('*', Material.GOLD_INGOT);
            ShapedRecipe goldenLeggings = new ShapedRecipe(new ItemStack(Material.GOLDEN_LEGGINGS, 1)).shape("* *", "* *", "***").setIngredient('*', Material.GOLD_INGOT);
            Main.addToArray(goldenHelmet00);
            Main.addToArray(goldenHelmet01);
            Main.addToArray(goldenChestplate);
            Main.addToArray(goldenLeggings);

            ShapedRecipe ironHelmet00 = new ShapedRecipe(new ItemStack(Material.IRON_HELMET, 1)).shape("* *","***", "   ").setIngredient('*', Material.IRON_INGOT);
            ShapedRecipe ironHelmet01 = new ShapedRecipe(new ItemStack(Material.IRON_HELMET, 1)).shape("   ", "* *", "***").setIngredient('*', Material.IRON_INGOT);
            ShapedRecipe ironChestplate = new ShapedRecipe(new ItemStack(Material.IRON_CHESTPLATE, 1)).shape("***", "***", "* *").setIngredient('*', Material.IRON_INGOT);
            ShapedRecipe ironLeggings = new ShapedRecipe(new ItemStack(Material.IRON_LEGGINGS, 1)).shape("* *", "* *", "***").setIngredient('*', Material.IRON_INGOT);
            Main.addToArray(ironHelmet00);
            Main.addToArray(ironHelmet01);
            Main.addToArray(ironChestplate);
            Main.addToArray(ironLeggings);

            ShapedRecipe leatherHelmet00 = new ShapedRecipe(new ItemStack(Material.LEATHER_HELMET, 1)).shape("* *","***", "   ").setIngredient('*', Material.LEATHER);
            ShapedRecipe leatherHelmet01 = new ShapedRecipe(new ItemStack(Material.LEATHER_HELMET, 1)).shape("   ", "* *", "***").setIngredient('*', Material.LEATHER);
            ShapedRecipe leatherChestplate = new ShapedRecipe(new ItemStack(Material.LEATHER_CHESTPLATE, 1)).shape("***", "***", "* *").setIngredient('*', Material.LEATHER);
            ShapedRecipe leatherLeggings = new ShapedRecipe(new ItemStack(Material.LEATHER_LEGGINGS, 1)).shape("* *", "* *", "***").setIngredient('*', Material.LEATHER);
            Main.addToArray(leatherHelmet00);
            Main.addToArray(leatherHelmet01);
            Main.addToArray(leatherChestplate);
            Main.addToArray(leatherLeggings);

        //Tipped Arrows, all craftable types that have effects
        //Shield
            ShapedRecipe shield = new ShapedRecipe(new ItemStack(Material.SHIELD)).shape(" w ", "www", "wiw").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(shield);
    }
    @Deprecated
    public void brewing(){
        //Glass Bottle
            ShapedRecipe bottle00 = new ShapedRecipe(new ItemStack(Material.GLASS_BOTTLE, 3)).shape(" i ", "i i", "   ").setIngredient('i', Material.GLASS);
            ShapedRecipe bottle01 = new ShapedRecipe(new ItemStack(Material.GLASS_BOTTLE,3)).shape("   ", " i ", "i i").setIngredient('i', Material.GLASS);
            Main.addToArray(bottle00);
            Main.addToArray(bottle01);
        //Fermented Spider Eye
        //Brewing Stand
            //TODO 1.17 Add any tier cobblestone ie black slate
            //TODO NOTE should work and allow for only one line of code with 2x3 crafting grids
            ShapedRecipe brewingStand = new ShapedRecipe(new ItemStack(Material.BREWING_STAND, 1)).shape("ccc", " b ").setIngredient('c', new RecipeChoice.MaterialChoice(Material.COBBLESTONE, Material.BLACKSTONE)).setIngredient('b', Material.BLAZE_ROD);
            Main.addToArray(brewingStand);
        //Cauldron
            ShapedRecipe cauldron = new ShapedRecipe(new ItemStack(Material.CAULDRON, 1)).shape("***", "* *", "* *").setIngredient('*', Material.IRON_INGOT);
            Main.addToArray(cauldron);
        //Glistering Melon Slice
        //Golden Carrot
    }

}