package io.github.electrcibeaver.CraftUpsideDown.Events;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.Objects;

public class Events implements Listener {

    @EventHandler
    public void enterBed(PlayerBedEnterEvent e){
        Block bed = e.getBed();
        Location bedLoc = bed.getLocation();
        World bedWorld = bedLoc.getWorld();
        Player p = e.getPlayer();
        assert bedWorld != null;
        if(bedWorld.getEnvironment() == World.Environment.NETHER){
            if(bedWorld.getTime() >= 12542 && bedWorld.getTime() <= 23460){
                e.setUseBed(Event.Result.ALLOW);
                bedWorld.setTime(0);
            }else {
                e.setUseBed(Event.Result.DENY);
                //TitleManager.sendActionBar(p, "You can only sleep at night and during thunderstorms");
                p.sendMessage("You can only sleep at night and during thunderstorms");
                p.sendMessage("This is a temp fix because 1.16 fucked with packets... It should send this on the action bar");
            }

        }

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void boatDamage(VehicleDamageEvent e){
        if(e.getVehicle().getType().equals(EntityType.BOAT)){
            e.setCancelled(true);
            if(Objects.requireNonNull(e.getAttacker()).getType() == EntityType.PLAYER){
                e.setCancelled(false);
            }
        }
    }
    @EventHandler
    public void onVehicleMove(VehicleMoveEvent e)
    {

        if(e.getVehicle() instanceof Boat)
        {
            Vector vect = e.getVehicle().getVelocity();
            double y = 0;
            double x = vect.getX() * 2;
            double z = vect.getZ() * 2;
            Material mat = Objects.requireNonNull(e.getVehicle().getLocation().getWorld()).getBlockAt(e.getVehicle().getLocation()).getType();
            if(mat == Material.LAVA)
            {
                y= 0.05;
                e.getVehicle().setVelocity(new Vector(x,y,z));
            }else if(mat != Material.WATER){
                y=-0.05;
                e.getVehicle().setVelocity(new Vector(x, y, z));
            }

        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBreak(BlockBreakEvent e){
        Block b = e.getBlock();
        Player p = e.getPlayer();

        if(p.getGameMode() == GameMode.SURVIVAL){
            //Coal
            if(b.getType().equals(Material.COAL_ORE)){
                e.setCancelled(true);
                b.setType(Material.AIR);
                b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.IRON_ORE));
            } //Iron
            else if (b.getType().equals(Material.IRON_ORE)) {
                e.setCancelled(true);
                b.setType(Material.AIR);
                b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.COAL));
            }//Lapis
            else if (b.getType().equals(Material.LAPIS_ORE)){
                int drop = 4;
                e.setCancelled(true);
                b.setType(Material.AIR);
                b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.REDSTONE, drop));
            }//Redstone
            else if(b.getType().equals(Material.REDSTONE_ORE)){
                int drop = 4;
                e.setCancelled(true);
                b.setType(Material.AIR);
                b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LAPIS_LAZULI, drop));

            }


        }
    }

    @EventHandler
    public void entityDamage(EntityDamageByEntityEvent e){

        if(e.getEntity() instanceof Pig){
            if(e.getDamager() instanceof Player){
                Entity pig = e.getEntity();
                pig.getWorld().createExplosion(pig.getLocation(), 3);
            }
        }
    }


}
