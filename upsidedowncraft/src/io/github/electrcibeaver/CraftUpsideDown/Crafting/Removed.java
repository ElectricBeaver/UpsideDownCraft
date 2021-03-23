package io.github.electrcibeaver.CraftUpsideDown.Crafting;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Recipe;

import java.util.Iterator;

public class Removed {

    public void removed() {
        Iterator<Recipe> it = Bukkit.getServer().recipeIterator();
        Recipe recipe;

        while (it.hasNext()) {
            recipe = it.next();
            //A
            if (recipe != null && recipe.getResult().getType().equals(Material.ACACIA_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.ACACIA_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.ARMOR_STAND)){
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.ARROW)){
                it.remove();
            }
            //B
            else if (recipe != null && recipe.getResult().getType().equals(Material.BARREL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BEACON)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BIRCH_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BIRCH_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BLAST_FURNACE)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BOWL)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BREWING_STAND)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BUCKET)) {
                it.remove();
            }
            //C
            else if (recipe != null && recipe.getResult().getType().equals(Material.CAMPFIRE)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SOUL_CAMPFIRE)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.CARTOGRAPHY_TABLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.COBBLESTONE_STAIRS)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.CAULDRON)) {
                it.remove();
            } else if(recipe != null && recipe.getResult().getType().equals(Material.CRAFTING_TABLE)){
                it.remove();
            } else if(recipe != null && recipe.getResult().getType().equals(Material.COMPOSTER)){
                it.remove();
            }
            //D
            else if (recipe != null && recipe.getResult().getType().equals(Material.DARK_OAK_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DARK_OAK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DAYLIGHT_DETECTOR)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DETECTOR_RAIL)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_HOE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_SHOVEL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_SWORD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_PICKAXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DISPENSER)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DROPPER)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_HELMET)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_CHESTPLATE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_LEGGINGS)) {
                it.remove();
            }
            //E
            else if (recipe != null && recipe.getResult().getType().equals(Material.ENCHANTING_TABLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.END_CRYSTAL)){
                it.remove();
            }
            //F
            else if (recipe != null && recipe.getResult().getType().equals(Material.FISHING_ROD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.FLOWER_POT)){
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.FLETCHING_TABLE)){
                it.remove();
            }
            //G
            else if (recipe != null && recipe.getResult().getType().equals(Material.GLASS_BOTTLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_HOE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_SHOVEL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_SWORD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_PICKAXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_HELMET)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_CHESTPLATE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_LEGGINGS)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.GRINDSTONE)){
                it.remove();
            }
            //H
            else if (recipe != null && recipe.getResult().getType().equals(Material.HOPPER)) {
                it.remove();
            }
            //I
            else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_HOE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_SHOVEL)) {
                it.remove();

            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_SWORD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_PICKAXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_HELMET)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_CHESTPLATE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.IRON_LEGGINGS)) {
                it.remove();
            }
            //J
            else if (recipe != null && recipe.getResult().getType().equals(Material.JUNGLE_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.JUNGLE_STAIRS)) {
                it.remove();
            }
            //k
            //L
            else if (recipe != null && recipe.getResult().getType().equals(Material.LECTERN)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.LEVER)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.LOOM)){
                it.remove();
            }
            //M
            else if (recipe != null && recipe.getResult().getType().equals(Material.MINECART)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.CHEST_MINECART)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.FURNACE_MINECART)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.TNT_MINECART)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.HOPPER_MINECART)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.MOSSY_COBBLESTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.MOSSY_STONE_BRICK_STAIRS)) {
                it.remove();
            }
            //O
            else if (recipe != null && recipe.getResult().getType().equals(Material.OAK_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.OAK_STAIRS)) {
                it.remove();
            }
            //P
            else if (recipe != null && recipe.getResult().getType().equals(Material.PISTON)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POWERED_RAIL)){
                it.remove();
            }
            //Q
            //R
            else if (recipe != null && recipe.getResult().getType().equals(Material.REPEATER)){
                it.remove();
            }
            //S
            else if(recipe != null && recipe.getResult().getType().equals(Material.SCAFFOLDING)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SHIELD)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SMITHING_TABLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SOUL_TORCH)){
                it.remove();
            }
            else if (recipe != null && recipe.getResult().getType().equals(Material.SPRUCE_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SPRUCE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STICKY_PISTON)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONECUTTER)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_HOE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_SHOVEL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_SWORD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_PICKAXE)) {
                it.remove();
            }
            //T
            else if (recipe != null && recipe.getResult().getType().equals(Material.TURTLE_HELMET)){
                it.remove();
            } else if(recipe != null && recipe.getResult().getType().equals(Material.TORCH)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.TRIPWIRE_HOOK)){
                it.remove();
            }
            //U
            //V
            //W
            else if (recipe != null && recipe.getResult().getType().equals(Material.WOODEN_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.WOODEN_HOE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.WOODEN_SHOVEL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.WOODEN_SWORD)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.WOODEN_PICKAXE)) {
                it.remove();
            }

            else if(recipe != null && recipe.getResult().getType().equals(Material.ANDESITE_STAIRS)){
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POLISHED_ANDESITE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DIORITE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POLISHED_DIORITE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GRANITE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POLISHED_GRANITE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SANDSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.RED_SANDSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SMOOTH_SANDSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SMOOTH_RED_SANDSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.PRISMARINE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.PRISMARINE_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DARK_PRISMARINE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.NETHER_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.RED_NETHER_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.QUARTZ_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SMOOTH_QUARTZ_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.PURPUR_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.END_STONE_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BLACKSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POLISHED_BLACKSTONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.POLISHED_BLACKSTONE_BRICK_STAIRS)) {
                it.remove();
            }









            //X
            //Y
            //Z
        }

    }
}
