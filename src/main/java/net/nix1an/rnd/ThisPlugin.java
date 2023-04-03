package net.nix1an.rnd;

import org.bukkit.plugin.Plugin;

public abstract class ThisPlugin {
    private static Plugin p;

    public ThisPlugin() {}

    public static void constructor(Plugin p) { ThisPlugin.p = p; }

    public static Plugin get() { return p; }
}
