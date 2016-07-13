package jasper.deathmatchminigame;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Team;

/**
 * Created by jasper on 7/12/16.
 */
public class DeathmatchMinigame extends JavaPlugin {

	@Override
	public void onEnable() {
		if (getServer().getScoreboardManager().getMainScoreboard().getTeam("deathmatch") == null) {
			getServer().getScoreboardManager().getMainScoreboard().registerNewTeam("deathmatch");
		}
	}

	public Team getMainTeam() {
		return getServer().getScoreboardManager().getMainScoreboard().getTeam("deathmatch");
	}

	public boolean playerIsPlayingDeathmatch(Player p){
		return getMainTeam().hasEntry(p.getUniqueId().toString());
	}
}
