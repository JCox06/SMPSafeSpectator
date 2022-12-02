package uk.co.jcox.spectator;

import org.bukkit.entity.Player;
import uk.co.jcox.spectator.util.PlayerState;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SpectatorManager {

    private final SafeSpec plugin;
    private final Map<UUID, PlayerState> playerStateMap;

    public SpectatorManager(SafeSpec plugin) {
        this.plugin = plugin;
        this.playerStateMap = new HashMap<>();
    }

    public void togglePlayer(Player player) {
        if (this.playerStateMap.containsKey(player.getUniqueId())) {
            resetGamemode(player);
        }
        setGamemodeSpectator(player);
    }

    private void resetGamemode(Player player) {

    }

    private void setGamemodeSpectator(Player player) {

    }

    public boolean isPlayerInSpec(Player player) {
        return this.playerStateMap.containsKey(player.getUniqueId());
    }

    public PlayerState getPlayerState(UUID player) {
        return this.playerStateMap.get(player);
    }

    public boolean isPlayerInSpec(UUID player) {
        return this.playerStateMap.containsKey(player);
    }

    public PlayerState getPlayerState(Player player) {
        return this.playerStateMap.get(player.getUniqueId());
    }
}
