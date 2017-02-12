import java.util.Random;


public class Fighter {

	private String name;
	private int health;
	private int damage;
	private int blockPercent;
	private int dodgePercent;
	private int wonFights;
	private int maxHealth;
	private static final int HIGH_KICK_BLOCK = 4;
	private static final int LOW_PUNCH_BLOCK = 6;
	private static final int LOW_KICK_BLOCK = 8;

    public Fighter (String name, int damage) {
    	this();
    	this.name = name;
    	this.damage = damage;
    }
    
    public Fighter() {
    	this.health = 100;
    	this.maxHealth = this.health;
    	this.blockPercent = 10;
    	this.dodgePercent = 12;
    }
    
	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	public void highPunch(Fighter enemy) {
    	if(randomPercent(enemy.blockPercent)) {
    		enemy.health -= this.damage / 2; 
    		System.out.println(enemy.name + " took a high punch, but blocked it. Damage : " + (this.damage / 2) + " .Health: " + enemy.health);
    		return;
    	}
    	
    	if(randomPercent(enemy.dodgePercent)) {
    		System.out.println(enemy.name + " took a high punch, but dodged it. No damage. Health: " + enemy.health);
    		return;
    	}
    	
    	enemy.health -= this.damage;
    	System.out.println(enemy.name + " took a high punch. Damage : " + this.damage + " .Health: " + enemy.health);  	
    }
    
    public void highKick (Fighter enemy) {
    	if(randomPercent(enemy.blockPercent)) {
    		enemy.health -= this.damage - HIGH_KICK_BLOCK; 
    		System.out.println(enemy.name + " took a high punch, but blocked it. Damage : " + (this.damage - HIGH_KICK_BLOCK) + " .Health: " + enemy.health);
    		return;
    	}
    	
    	if(randomPercent(enemy.dodgePercent)) {
    		System.out.println(enemy.name + " took a high kick, but dodged it. No damage. Health: " + enemy.health);
    		return;
    	}
    	
    	enemy.health -= this.damage;
    	System.out.println(enemy.name + " took a high kick. Damage : " + this.damage + " .Health: " + enemy.health);  	
    }
    
    public void lowPunch(Fighter enemy) {
    	if(randomPercent(enemy.blockPercent)) {
    		enemy.health -= this.damage - LOW_PUNCH_BLOCK; 
    		System.out.println(enemy.name + " took a low punch, but blocked it. Damage : " + (this.damage - LOW_PUNCH_BLOCK) + " .Health: " + enemy.health);
    		return;
    	}
    	
    	if(randomPercent(enemy.dodgePercent)) {
    		System.out.println(enemy.name + " took a low punch, but dodged it. No damage. Health: " + enemy.health);
    		return;
    	}
    	
    	enemy.health -= this.damage;
    	System.out.println(enemy.name + " took a low punch. Damage : " + this.damage + " .Health: " + enemy.health);  	
    }
    
    public void lowKick(Fighter enemy) {
    	if(randomPercent(enemy.blockPercent)) {
    		enemy.health -= this.damage - LOW_KICK_BLOCK; 
    		System.out.println(enemy.name + " took a low kick, but blocked it. Damage : " + (this.damage - LOW_KICK_BLOCK) + " .Health: " + enemy.health);
    		return;
    	}
    	
    	if(randomPercent(enemy.dodgePercent)) {
    		System.out.println(enemy.name + " took a low kick, but dodged it. No damage. Health: " + enemy.health);
    		return;
    	}
    	
    	enemy.health -= this.damage;
    	System.out.println(enemy.name + " took a low kick. Damage : " + this.damage + " .Health: " + enemy.health);  	
    }
    
    public void fatality (Fighter enemy) {
    	System.out.println("Finish him!");
    	enemy.health = 0;
    	System.out.println(this.name + " wins.");
    	System.out.println("Fatality.");
    }
    
    public void fireBall(Fighter enemy) {
    	System.out.println(this.name + " threw a fire ball! Double damage!");
    	enemy.health -= this.damage * 2;
    	System.out.println(enemy.name + " health: " + enemy.health);
    }
    
    public void flyingKick(Fighter enemy) {
    	System.out.println(this.name + " did a flying kick! Double damage!");
    	enemy.health -= this.damage * 2;
    	System.out.println(enemy.name + " health: " + enemy.health);
    }
    
    public void knifeThrow(Fighter enemy) {
    	System.out.println(this.name + " threw knife! Double damage!");
    	enemy.health -= this.damage * 2;
    	System.out.println(enemy.name + " health: " + enemy.health);
    }
    
    public boolean randomPercent(int percent) {
    	return new Random(100).nextInt() < percent;
    }
    
    public void chooseAttack(Fighter enemy) {
		int attack = new Random().nextInt(7) + 1;
		switch(attack) {
		case 1 : this.highPunch(enemy); break;
		case 2 : this.highKick(enemy); break;
		case 3 : this.lowKick(enemy); break;
		case 4 : this.highPunch(enemy); break;
		case 5 : this.fireBall(enemy); break;
		case 6 : this.flyingKick(enemy); break;
		case 7 : this.knifeThrow(enemy); break;
		default : break;
		}
	}
    
    public boolean isDead() {
    	return this.health <= 0;
    }
   
    public void revive () {
    	this.health = maxHealth;
    }
}
