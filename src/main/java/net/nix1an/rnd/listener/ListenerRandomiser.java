package net.nix1an.rnd.listener;

import net.nix1an.rnd.ThisPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class ListenerRandomiser implements Listener {
    Material[] allMats = Material.class.getEnumConstants();


    public ListenerRandomiser() {
        (new BukkitRunnable() {
            public void run() {
                Bukkit.getOnlinePlayers().forEach((p) -> {
                    p.getInventory().addItem(new ItemStack(allMats[new Random().nextInt(allMats.length)]));
                });
            }
        }).runTaskTimer(ThisPlugin.get(), 600L, 600L);
    }
}
