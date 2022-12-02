package uk.co.jcox.spectator.util;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class PlayerState {

    private final Location location;
    private final Vector velocity;
    private final List<ItemStack> inventory;
    private final List<PotionEffect> effects;
    private final int oxygen;
    private final UUID uuid;


    public PlayerState(UUID uuid, Location location, Vector velocity, List<ItemStack> inventory, List<PotionEffect> effects,
                       int oxygen) {
        this.location = location;
        this.velocity = velocity;
        this.inventory = inventory;
        this.effects = effects;
        this.oxygen = oxygen;
        this.uuid = uuid;
    }


    public Location getLocation() {
        return location;
    }

    public Vector getVelocity() {
        return velocity;
    }

    public List<ItemStack> getInventory() {
        return new ArrayList<>(inventory);
    }

    public List<PotionEffect> getEffects() {
        return new ArrayList<>(effects);
    }

    public int getOxygen() {
        return oxygen;
    }
}
