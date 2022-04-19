package previousAssignments.warrior;
import java.util.Random;
public class WarriorFred {

	private String nickName = "unknown";
	private int lifeForce = 10;
	private int damage = 0;

	public void setNickname(String nick) {
		this.nickName = nick;
	}

	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
	
	public void reSpawn() {
		lifeForce = 10;
	}
	
	public void takeDamage(int n) {
		damage += n;
		if (damage >= 10) {
			lifeForce--;
			damage = 0;
		}
	}
	
	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}
	
	public boolean isDead() {
		if (lifeForce <= 0) return true;
		else return false;
	}
	
	public boolean isAlive() {
		if (lifeForce > 0) return true;
		else return false;
	}

	public void printInfo() {
		System.out.println("Nick Name:" + getNickName());
		System.out.println("Life Force:" + getLifeForce());
		System.out.println("Damage:" + getDamage());
		for(int i=0;i<armory.length;i++)
			System.out.println("Armory:" + this.armory[i]);
		System.out.println();
	}

	public int getDamage() {
		return this.damage;
	}

	public int getLifeForce() {
		return this.lifeForce;
	}

	public String getNickName() {
		return this.nickName;
	}
}