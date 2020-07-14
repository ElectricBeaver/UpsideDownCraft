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
            }
            //B
            else if (recipe != null && recipe.getResult().getType().equals(Material.BARREL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BIRCH_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BIRCH_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.BUCKET)) {
                it.remove();
            }
            //C
            else if (recipe != null && recipe.getResult().getType().equals(Material.CARTOGRAPHY_TABLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.COBBLESTONE_STAIRS)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.CAULDRON)) {
                it.remove();
            }
            //D
            else if (recipe != null && recipe.getResult().getType().equals(Material.DARK_OAK_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DARK_OAK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DAYLIGHT_DETECTOR)) {
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
            } else if (recipe != null && recipe.getResult().getType().equals(Material.DROPPER)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_HELMET)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_CHESTPLATE)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.DIAMOND_LEGGINGS)) {
                it.remove();
            }
            //E
            else if (recipe != null && recipe.getResult().getType().equals(Material.ENCHANTING_TABLE)) {
                it.remove();
            }
            //F
            else if (recipe != null && recipe.getResult().getType().equals(Material.FISHING_ROD)) {
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
            }else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_HELMET)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_CHESTPLATE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.GOLDEN_LEGGINGS)) {
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
              else if (recipe != null && recipe.getResult().getType().equals(Material.LOOM)){
                it.remove();
            }
            //M
            else if (recipe != null && recipe.getResult().getType().equals(Material.MOSSY_COBBLESTONE_STAIRS)) {
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
            }
            //Q
            //R
            //S
            else if (recipe != null && recipe.getResult().getType().equals(Material.SMITHING_TABLE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SPRUCE_BOAT)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.SPRUCE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_AXE)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_BRICK_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_HOE)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_STAIRS)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_SHOVEL)) {
                it.remove();
            } else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_SWORD)) {
                it.remove();
            }else if (recipe != null && recipe.getResult().getType().equals(Material.STONE_PICKAXE)) {
                it.remove();
            }
            //T
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
            //X
            //Y
            //Z
        }

    }
}
