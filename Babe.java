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

public class Stun{
  private int time;
  private Stun instance = new Stun(){};
  
  public Stun(int time){
    this.time = time;
  }
  
  public Stun getInstance(){
    return instance;
  }
  
  public int getTime(){
    return time;
  }
  
}

public class Frozen{
  private int time;
  private Frozen instance = new Frozen(){};
  
  public Frozen(int time){
    this.time = time;
  }
  
  public Frozen getInstance(){
    return insance;
  }
}

public class Confused{
  private Confused instance;
  private int time;
  
  public Confused(int time){
    this.time = time;
  }
  
  public int getTime(){
    return time;
  }
  
  public Confused getInstance(){
    return instance;
  }
}

public class Slow{
  private int time;
  private Slow instance = new Slow(){};
  
  public Slow(int time){
    this.time = time;
  }
  
  public int getTime(){
    return time;
  }
  
  public Slow getInstance(){
    return instance;
  }
}
