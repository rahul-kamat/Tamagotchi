import java.util.Random;
public class TamagotchiApp {

	public static void main(String[] args) {		
		
	System.out.println("Welcome to this Tamagotchi game!");
	System.out.println("You will be taking care of your own virtual pet.");
	
	Tamagotchi petGender = new Tamagotchi();
	System.out.println("The gender of your pet is " + petGender.randomGender() + "!");
		
	System.out.println("Enter the name of your pet"); //This is the name of the Tamagotchi pet.
	String nameOfPet = IO.readString();
	System.out.println("The name of your pet is " + nameOfPet + "!");
	
	//these are the 4 variables we are tracking
	int hunger = 0; 
	int thirst = 0;
	int boredom = 0;
	int sickness = 0;
	//Each one is defined from 0 to 100%. If any hit 0, the pet dies. All 3 begin at 100%, which is a pet with maximum health.
	
	Random rand = new Random();
	int  numberOfDays = rand.nextInt(1000) + 50; //the pet lives to a certain random age until it dies from old age
	
	
	//the main application is a for loop that iterates over each year that the pet lives
		for (int i = 1 ; i < numberOfDays ; i++) { //loop runs for each year the pet is alive and ends when the pet dies
			System.out.println(); //blank line to format
			System.out.println(nameOfPet + " is " + i + " days old.");
			System.out.println("Enter 1 to give " + nameOfPet + " food.");
			System.out.println("Enter 2 to give " + nameOfPet + " a drink.");
			System.out.println("Enter 3 to play with " + nameOfPet + ".");
			int inputNumber = IO.readInt();
			
			Tamagotchi tamagotchi = new Tamagotchi();
				
			if (inputNumber == 1 || inputNumber == 2 || inputNumber == 3) { 
			
			//Option 1: give food to pet
				if (inputNumber == 1) { //give food to pet
					int[] hungerThirstBoredomSickness = tamagotchi.food(hunger, thirst, boredom, sickness);
					hunger = hungerThirstBoredomSickness[0];
					thirst = hungerThirstBoredomSickness[1];
					boredom = hungerThirstBoredomSickness[2];
					sickness = hungerThirstBoredomSickness[3];
				}
				
			//Option 2: give drink to pet
				if (inputNumber == 2) { //give a drink to pet
					int[] hungerThirstBoredomSickness = tamagotchi.drinks(hunger, thirst, boredom, sickness);
					hunger = hungerThirstBoredomSickness[0];
					thirst = hungerThirstBoredomSickness[1];
					boredom = hungerThirstBoredomSickness[2];
					sickness = hungerThirstBoredomSickness[3];
				}
				
			//Option 3: play
				if (inputNumber == 3) { //play with pet
					int[] hungerThirstBoredomSickness = tamagotchi.bored(hunger, thirst, boredom, sickness);
					hunger = hungerThirstBoredomSickness[0];
					thirst = hungerThirstBoredomSickness[1];
					boredom = hungerThirstBoredomSickness[2];
					sickness = hungerThirstBoredomSickness[3];
				}
			}
			
			//different number than 1, 2, or 3
			else {
				IO.reportBadInput();
				System.out.println("You ignored your pet.");
				hunger += 10;
				thirst += 10; 
				boredom += 10;
				sickness += 10;
				System.out.println("Hunger is at " + hunger + "%");
				System.out.println("Thirst is at " + thirst + "%");
				System.out.println("Boredom is at " + boredom + "%");
				System.out.println("Sickness is at " + sickness + "%");
			}
			
			//Option 4: give medicine to pet
			//This only appears if the pet is at least 50% sick
			if(sickness >= 50 && sickness <=90) { 
				int[] hungerThirstBoredomSickness = tamagotchi.sick(hunger, thirst, boredom, sickness);
				hunger = hungerThirstBoredomSickness[0];
				thirst = hungerThirstBoredomSickness[1];
				boredom = hungerThirstBoredomSickness[2];
				sickness = hungerThirstBoredomSickness[3];
			}
				
			//if any variables hit 100%, the pet dies		
			if (hunger >= 100) {
				System.out.println(); //blank line to format
				System.out.println(nameOfPet + " died of hunger.");
				break;
			}
				
			if (thirst >= 100) {
				System.out.println(); //blank line to format
				System.out.println(nameOfPet + " died of thirst.");
				break;
			}
			
			if (boredom >= 100) {
				System.out.println(); //blank line to format
				System.out.println(nameOfPet + " died of boredom.");
				break;
			}
				
			if (sickness >= 100) {
				System.out.println(); //blank line to format
				System.out.println(nameOfPet + " died of sickness.");
				break;
			}
				
			//if the age of the pet reaches its maximum age, it will die of old age.
			if (i == numberOfDays) {
				System.out.println(); //blank line to format
				System.out.println(nameOfPet + " died of old age.");
			}		
		}		
	}
}
	
