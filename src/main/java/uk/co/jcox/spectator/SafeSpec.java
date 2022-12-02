package uk.co.jcox.spectator;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public final class SafeSpec extends JavaPlugin {

    private String version;
    private String website;
    private String api;

    private SpectatorManager spectatorManager;

    private Logger logger;

    @Override
    public void onEnable() {
        this.version = getDescription().getVersion();
        this.website = getDescription().getWebsite();
        this.api = getDescription().getAPIVersion();
        this.logger = getLogger();
        this.spectatorManager = new SpectatorManager(this);

        printStatusMessage();
    }

    @Override
    public void onDisable() {
        printStatusMessage();
    }


    private void registerCommands() {

    }

    private void printStatusMessage() {
        this.logger.info("SMP Safe Spectator Mode, running version " + this.version + " for API: " + this.api);
        this.logger.info("Report bugs/issues and request feartures: " + this.website);
    }

}
