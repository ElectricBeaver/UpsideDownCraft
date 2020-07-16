package io.github.electrcibeaver.CraftUpsideDown;


import io.github.electrcibeaver.CraftUpsideDown.Crafting.Recipes;
import io.github.electrcibeaver.CraftUpsideDown.Crafting.Removed;
import io.github.electrcibeaver.CraftUpsideDown.Events.Events;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;




@SuppressWarnings("unused")
public class Main extends JavaPlugin implements Listener {

    //Globals
    private static Plugin plugin;
    static List<ShapedRecipe> craftingRecipes = new ArrayList<>();


    //on Enable
   @Override
    public void onEnable(){
       plugin = this;
       //Events
       Bukkit.getPluginManager().registerEvents(new Events(), this);
       //Classes
       Removed removeClass = new Removed();
        removeClass.removed();
       Recipes recipes = new Recipes();
        recipes.buildingBlock();
        recipes.decorationBlock();
        recipes.redstone();
        recipes.transportation();
        recipes.miscellaneous();
        recipes.foodStuffs();
        recipes.tools();
        recipes.combat();
        recipes.brewing();

       if(getServer().getPluginManager().getPlugin("BursedCois") != null){
           getLogger().info(ChatColor.GRAY + "[" + ChatColor.BLUE + "Cursed" + ChatColor.DARK_RED + "UpsideDown" + ChatColor.GRAY + "] " + "Cursed Boys detected... This is a good thing");
       }else if(getServer().getPluginManager().getPlugin("BursedCois") == null){
           getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "UpsideDown" + ChatColor.DARK_RED + "Craft" + ChatColor.GRAY + "] " + ChatColor.DARK_RED + "Well shit this is not good... BursedCois hasn't been detected this plugin wont give the full cursed effect without it." )  ;
           getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "UpsideDown" + ChatColor.DARK_RED + "Craft" + ChatColor.GRAY + "] " + ChatColor.RED + "This plugin will still work without it though...");
       }

       //Recipe Array Setup
       for (ShapedRecipe craftingRecipe : craftingRecipes) {
           Bukkit.getServer().addRecipe(craftingRecipe);
       }

        //Welcome Message
           getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "*----------------------------------------*");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      "             UpsideDownCraft              ");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      "             	 V1.0.0                   ");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      " UpsideDownCraft is a plugin that was made");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      " off a joke/troll for some friends and yes");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      " it is heavily inspired by Dream's cursed ");
           getServer().getConsoleSender().sendMessage(ChatColor.BLUE +      " minecraft series...                      ");
           getServer().getConsoleSender().sendMessage(ChatColor.DARK_BLUE + "*----------------------------------------*");

   }
   //Disable
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "UpsideDown" + ChatColor.DARK_RED + "Craft" + ChatColor.GRAY + "] " + ChatColor.RED + "I hope you didn't RAGE quit :)");
        plugin = null;
    }
    public static Plugin getPlugin(){
        return plugin;
    }
    //Add to array
    public static void addToArray(ShapedRecipe r){
       craftingRecipes.add(r);
    }

}
