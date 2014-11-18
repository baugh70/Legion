private HashMap<Player, Boolean> canShoot;

public boolean getAllowed(){
  Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
    public void run(){
      // Delayed Code
    }
  }, time *20); // Time is equal how ever many seconds
}


public void onPlayerDamage(EntityDamageByEntityEvent event){
  if(event.getDamager().getType() == EntityType.PLAYER){
    // Code
  }
}
