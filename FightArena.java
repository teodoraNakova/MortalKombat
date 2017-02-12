import java.util.Random;
import java.util.Scanner;


public class FightArena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] fightersNames = {"Goro", "Johnny Cage", "Kano", "Liu Kang", "Raiden", "Reptile", "Scorpion", "Shang Tsung", "Sonya Blade", "Sub-zero"};
		int [] damage = {14, 12, 8, 16, 12, 12, 18, 14, 16, 20};
		Fighter [] allFighters = new Fighter[10];
		
		for(int i = 0; i < 10; i++) {
			allFighters[i] = new Fighter(fightersNames[i], damage[i]);		
		}
			
		int myFigher = 1;
		do {
			System.out.println("WELCOME! Please insert coin and choose you character from the following: ");
			System.out.println("Enter 0 for Goro.");
			System.out.println("Enter 1 for Johnny Cage.");
			System.out.println("Enter 2 for Kano.");
			System.out.println("Enter 3 for Liu Kang.");
			System.out.println("Enter 4 for Raiden.");
			System.out.println("Enter 5 for Reptile.");
			System.out.println("Enter 6 for Scorpion.");
			System.out.println("Enter 7 for Shang Tsung.");
			System.out.println("Enter 8 for Sonya Blade.");
			System.out.println("Enter 9 for Sub-zero.");
			myFigher = sc.nextInt();
		} while (myFigher < 0 || myFigher > 9);
		
		System.out.println("You chose " + allFighters[myFigher].getName() + "!");
		
		int enemy = 0;
		do {
			enemy = new Random().nextInt(10);
		} while (enemy == myFigher);
		
		System.out.println(allFighters[enemy].getName() +  " is your oponent!");
		
		while(true) {
			allFighters[myFigher].chooseAttack(allFighters[enemy]);
			if(allFighters[enemy].getHealth() <= 10) {
				allFighters[myFigher].fatality(allFighters[enemy]);
				break;
			}
			if(allFighters[enemy].isDead()) {
				System.out.println(allFighters[myFigher].getName() +  " wins.");
				break;
			}
			
			allFighters[enemy].chooseAttack(allFighters[myFigher]);
			if(allFighters[myFigher].getHealth() <= 10) {
				allFighters[enemy].fatality(allFighters[myFigher]);
				break;
			}
			if(allFighters[myFigher].isDead()) {
				System.out.println(allFighters[enemy].getName() + " wins.");
				break;
			}
			
		}
		
	}
	
}
