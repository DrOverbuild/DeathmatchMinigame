package jasper.deathmatchminigame.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * Created by jasper on 7/12/16.
 */
public class PlayerEvents {

	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent e){

	}
	
	public Player getPlayer(Entity e){
		if(e instanceof Player){
			return (Player) e;
		}

		if(e instanceof Projectile){
			Projectile projectile = (Projectile) e;
			if(projectile.getShooter() instanceof  Player){
				return (Player) projectile.getShooter();
			}
		}

		return null;
	}
}
