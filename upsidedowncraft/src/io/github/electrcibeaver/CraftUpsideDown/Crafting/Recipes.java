package io.github.electrcibeaver.CraftUpsideDown.Crafting;

import io.github.electrcibeaver.CraftUpsideDown.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class Recipes {
    Plugin plugin = Main.getPlugin();

    //TODO Find a way to store all wood types in an object array and call it in shaped recipes
  /*  public Material woodReturn(Material wood){
        Object[] woods = new Object[]{Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS};

        for(int i = 0; i < woods.length; i++){
           wood = (Material) woods[i];
        }

        return wood;
    }*/

    public void buildingBlock(){
        //Purpur Block
        //Purpur Pillar
        //Stairs, all kinds
            //TODO Stairs, Add rest of them, Add new wood (Lines)
            ShapedRecipe woodStairs = new ShapedRecipe(new ItemStack(Material.OAK_STAIRS, 4)).shape( "www", "ww ", "w  ").setIngredient('w', Material.OAK_PLANKS);
            ShapedRecipe woodStairs01 = new ShapedRecipe(new ItemStack(Material.OAK_STAIRS, 4)).shape( "www", " ww", "  w").setIngredient('w', Material.OAK_PLANKS);
            Main.addToArray(woodStairs);
            Main.addToArray(woodStairs01);

            ShapedRecipe woodStairs02 = new ShapedRecipe(new ItemStack(Material.BIRCH_STAIRS,4 )).shape("www", "ww ","w  " ).setIngredient('w', Material.BIRCH_PLANKS);
            ShapedRecipe woodStairs03 = new ShapedRecipe(new ItemStack(Material.BIRCH_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.BIRCH_PLANKS);
            Main.addToArray(woodStairs02);
            Main.addToArray(woodStairs03);

            ShapedRecipe woodStairs04 = new ShapedRecipe(new ItemStack(Material.SPRUCE_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.SPRUCE_PLANKS);
            ShapedRecipe woodStairs05 = new ShapedRecipe(new ItemStack(Material.SPRUCE_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.SPRUCE_PLANKS);
            Main.addToArray(woodStairs04);
            Main.addToArray(woodStairs05);

            ShapedRecipe woodStairs06 = new ShapedRecipe(new ItemStack(Material.JUNGLE_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.JUNGLE_PLANKS);
            ShapedRecipe woodStairs07 = new ShapedRecipe(new ItemStack(Material.JUNGLE_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.JUNGLE_PLANKS);
            Main.addToArray(woodStairs06);
            Main.addToArray(woodStairs07);

            ShapedRecipe woodStairs08 = new ShapedRecipe(new ItemStack(Material.ACACIA_PLANKS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.ACACIA_PLANKS);
            ShapedRecipe woodStairs09 = new ShapedRecipe(new ItemStack(Material.ACACIA_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.ACACIA_PLANKS);
            Main.addToArray(woodStairs08);
            Main.addToArray(woodStairs09);

            ShapedRecipe woodStairs10 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.DARK_OAK_PLANKS);
            ShapedRecipe woodStairs11 = new ShapedRecipe(new ItemStack(Material.DARK_OAK_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.DARK_OAK_PLANKS);
            Main.addToArray(woodStairs10);
            Main.addToArray(woodStairs11);

            ShapedRecipe stoneStairs00 = new ShapedRecipe(new ItemStack(Material.STONE_STAIRS,4 )).shape("www", "ww ", "w  ").setIngredient('w', Material.STONE);
            ShapedRecipe stoneStairs01 = new ShapedRecipe(new ItemStack(Material.STONE_STAIRS,4)).shape("www", " ww", "  w").setIngredient('w', Material.STONE);
            Main.addToArray(stoneStairs00);
            Main.addToArray(stoneStairs01);

            ShapedRecipe cobblestoneStairs01 = new ShapedRecipe(new ItemStack(Material.COBBLESTONE_STAIRS)).shape("www", "ww ", "w  ").setIngredient('w', Material.COBBLESTONE);
            ShapedRecipe cobblestoneStairs02 = new ShapedRecipe(new ItemStack(Material.COBBLESTONE_STAIRS)).shape("www", " ww", "  w").setIngredient('w', Material.COBBLESTONE);
            Main.addToArray(cobblestoneStairs01);
            Main.addToArray(cobblestoneStairs02);

            ShapedRecipe mossyCobblestoneStairs01 = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.MOSSY_COBBLESTONE);
            ShapedRecipe mossyCobblestoneStairs02 = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.MOSSY_COBBLESTONE);
            Main.addToArray(mossyCobblestoneStairs01);
            Main.addToArray(mossyCobblestoneStairs02);

            ShapedRecipe stoneBrickStairs01 = new ShapedRecipe(new ItemStack(Material.STONE_BRICK_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.STONE_BRICKS);
            ShapedRecipe stoneBrickStairs02 = new ShapedRecipe(new ItemStack(Material.STONE_BRICK_STAIRS)).shape("www", " ww", "  w").setIngredient('w', Material.STONE_BRICKS);
            Main.addToArray(stoneBrickStairs01);
            Main.addToArray(stoneBrickStairs02);

            ShapedRecipe mossyStoneBricks01 = new ShapedRecipe(new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.MOSSY_STONE_BRICKS);
            ShapedRecipe mossyStoneBricks02 = new ShapedRecipe(new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.MOSSY_STONE_BRICKS);
            Main.addToArray(mossyStoneBricks01);
            Main.addToArray(mossyStoneBricks02);

            ShapedRecipe andesite01 = new ShapedRecipe(new ItemStack(Material.ANDESITE_STAIRS, 4)).shape("www", "ww ", "w  ").setIngredient('w', Material.ANDESITE);
            ShapedRecipe andesite02 = new ShapedRecipe(new ItemStack(Material.ANDESITE_STAIRS, 4)).shape("www", " ww", "  w").setIngredient('w', Material.ANDESITE);
            Main.addToArray(andesite01);
            Main.addToArray(andesite02);
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
        //Jukebox
        //Soul Torch
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
        //Glazed Terracotta, all colors
        //Coral, all types
        //Coral Fans, all types
        //Scaffolding
        //Painting
        //Signs, all types
        //Beds, all colors
            //TODO Beds, Add Rest of them (Lines), add wood (Mats/Lines)
            ShapedRecipe wBed = new ShapedRecipe(new ItemStack(Material.WHITE_BED, 1)).shape("www", "sss", "   ").setIngredient('w', Material.OAK_PLANKS).setIngredient('s', Material.WHITE_WOOL);
            Main.addToArray(wBed);
        //Item Frame
        //Flower Pot
        //Armor Stand
        //Banners, all colors
        //End Crystal
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
        //Barrel
            ShapedRecipe barrel = new ShapedRecipe(new ItemStack(Material.BARREL)).shape("wsw", "w w", "wsw").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('s', new RecipeChoice.MaterialChoice(Material.ACACIA_SLAB, Material.BIRCH_SLAB, Material.DARK_OAK_SLAB, Material.JUNGLE_SLAB, Material.SPRUCE_SLAB, Material.OAK_SLAB));
            Main.addToArray(barrel);
        //Smoker
        //Blast Furnace
        //Cartography Table
            ShapedRecipe cartographyTable00 = new ShapedRecipe(new ItemStack(Material.CARTOGRAPHY_TABLE,1)).shape("ww ", "ww ", "pp ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.PAPER);
            ShapedRecipe cartographyTable01 = new ShapedRecipe(new ItemStack(Material.CARTOGRAPHY_TABLE,1)).shape(" ww", " ww", " pp").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('p', Material.PAPER);
            Main.addToArray(cartographyTable00);
            Main.addToArray(cartographyTable01);
        //Fletching Table
        //Grindstone
        //Smithing Table
            ShapedRecipe smithingTable = new ShapedRecipe(new ItemStack(Material.SMITHING_TABLE)).shape("ww ", "ww ", "ii ").setIngredient('w', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.SPRUCE_PLANKS, Material.OAK_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(smithingTable);
        //Stonecutter
        //Bell
        //Lantern
        //Soul Lantern
        //Campfire
        //Shroomlight
        //Beehives, both types
        //Honey Block
        //Honeycomb Block
    }

    public void redstone(){
        //Dispenser
        //Note Block
        //Piston
            ShapedRecipe piston = new ShapedRecipe(new ItemStack(Material.PISTON, 1)).shape("crc", "cic", "www").setIngredient('w', new RecipeChoice.MaterialChoice(Material.OAK_PLANKS, Material.BIRCH_PLANKS, Material.SPRUCE_PLANKS, Material.JUNGLE_PLANKS, Material.ACACIA_PLANKS, Material.CRIMSON_PLANKS, Material.WARPED_PLANKS)).setIngredient('c', Material.COBBLESTONE).setIngredient('r', Material.REDSTONE).setIngredient('i', Material.IRON_INGOT);
            Main.addToArray(piston);
        //Sticky Piston
        //Lever
        //Redstone Torch
        //Wooden Trapdoors, all types
        //Fence Gates, all types
        //Redstone Lamp
        //Tripwire Hook
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
        //Redstone Comparator
            ShapedRecipe comparator = new ShapedRecipe(new ItemStack(Material.COMPARATOR, 1)).shape("sss", "tqt", " t ").setIngredient('s', Material.STONE).setIngredient('t', Material.REDSTONE_TORCH).setIngredient('q', Material.QUARTZ);
            Main.addToArray(comparator);
        //Redstone Dust
        //Lectern
        //Target
    }

    public void transportation(){
        //Powered Rail
        //Detector Rail
        //Rail
        //Activator Rail
        //Minecart
        //Minecart with Chest
        //Minecart with Furnace
        //Carrot on a Stick
        //Minecart with TNT
        //Minecart with Hopper
        //Boats, all types
            //TODO Boats, add new wood if they add them to the game (lines)
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

    public void miscellaneous(){
        //Beacon
        //Conduit
        //Scute
        //Coal
        //Bowl
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
            //TODO Picks, add new wood (Mats)
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
            //TODO Axes, add new wood (Mats)
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

    public void combat(){
        //Bow
        //Arrow
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
    }

    public void brewing(){
        //Glass Bottle
            ShapedRecipe bottle00 = new ShapedRecipe(new ItemStack(Material.GLASS_BOTTLE, 3)).shape(" i ", "i i", "   ").setIngredient('i', Material.GLASS);
            ShapedRecipe bottle01 = new ShapedRecipe(new ItemStack(Material.GLASS_BOTTLE,3)).shape("   ", " i ", "i i").setIngredient('i', Material.GLASS);
            Main.addToArray(bottle00);
            Main.addToArray(bottle01);
        //Fermented Spider Eye
        //Brewing Stand
        //Cauldron
            ShapedRecipe cauldron = new ShapedRecipe(new ItemStack(Material.CAULDRON, 1)).shape("***", "* *", "* *").setIngredient('*', Material.IRON_INGOT);
        //Glistering Melon Slice
        //Golden Carrot
    }

}