package me.YourName.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.confuser.barapi.BarAPI;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin implements Listener {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		// BarAPI.setMessage(p, "Confuser is really cool");
		showBarChanging(p);
	}
	
	public void showBarChanging(final Player p){
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
            public void run(){
            	Random random = new Random();
            	List<String> list = new ArrayList<>();
            	list.add("§0Much Custom. So Tutorial. Wow.");
            	list.add("§1Much Custom. So Tutorial. Wow.");
            	list.add("§2Much Custom. So Tutorial. Wow.");
            	list.add("§3Much Custom. So Tutorial. Wow.");
            	list.add("§4Much Custom. So Tutorial. Wow.");
            	list.add("§5Much Custom. So Tutorial. Wow.");
            	list.add("§6Much Custom. So Tutorial. Wow.");
            	list.add("§7Much Custom. So Tutorial. Wow.");
            	list.add("§8Much Custom. So Tutorial. Wow.");
            	list.add("§9Much Custom. So Tutorial. Wow.");
            	list.add("§aMuch Custom. So Tutorial. Wow.");
            	list.add("§bMuch Custom. So Tutorial. Wow.");
            	list.add("§cMuch Custom. So Tutorial. Wow.");
            	list.add("§dMuch Custom. So Tutorial. Wow.");
				list.add("§eMuch Custom. So Tutorial. Wow.");
				list.add("§fMuch Custom. So Tutorial. Wow.");
		
			String message = (String) list.get(random.nextInt(list.size()));
		
			BarAPI.setMessage(p, message);
            }		
		}, 0, 1 * 20);
	}
}