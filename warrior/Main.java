package previousAssignments.warrior;
import java.util.Random;
public class Main {

	public static void main(String[] args) {

		WarriorFred guy[] = new WarriorFred[5];

		for (int i = 0; i < 5; i++) {
			guy[i] = new WarriorFred();
		}
		guy[0].setNickname("Archer");
		guy[1].setNickname("Mage");
		guy[2].setNickname("Healer");
		guy[3].setNickname("Tank");
		guy[4].setNickname("Rogue");

		for (int i  = 0; i < 5; i++) {
			guy[i].printInfo();
		}

		int round = 0;
		System.out.println("*** Battle! ***   All warriors start with 10 units of health for 10 rounds");
		while (round < 10) {
			System.out.println("round "+(round+1));

			for (int i = 0; i<5;i++) {

				if (guy[i].isAlive() == false) {
					System.out.println("Warrior "+guy[i].getNickName()+" status (dead)");
				} else {
					System.out.println("Warrior "+guy[i].getNickName()+" status (health="+guy[i].getLifeForce()+", damage="+guy[i].getDamage()+")");
					Random r = new Random();
					int damage = r.nextInt(10)+1;
					guy[i].takeDamage(damage);
					System.out.println(guy[i].getNickName()+" is attacked and takes "+damage+" units of damage");
					guy[i].reaction();
				}
			}


			round++;
		}
		System.out.println("How did the warriors fare?");
		for (int i = 0; i < 5; i++) {
			if (guy[i].isAlive() == false) {
				System.out.println("Warrior "+guy[i].getNickName()+" status (dead)");
			} else {
				System.out.println("Warrior "+guy[i].getNickName()+" status (health="+guy[i].getLifeForce()+", damage="+guy[i].getDamage()+")");
			}
		}

	}

}
