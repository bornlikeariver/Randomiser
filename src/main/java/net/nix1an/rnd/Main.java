package net.nix1an.rnd;

import net.nix1an.rnd.listener.ListenerRandomiser;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ThisPlugin.constructor(this);
        this.getServer().getPluginManager().registerEvents(new ListenerRandomiser(), this);
    }
}
