import java.util.Random;
public class Player {

	//method for the guess random number game
	public int[] randomNumberGame(int hunger, int thirst, int boredom, int sickness) {
	
	  Random rand = new Random();
	  int secretNumber = rand.nextInt(10) + 1;
	
	  while (true) {
		  System.out.println("Guess a number from 1-10:");
		  int guess = IO.readInt();
	
		   if (guess == secretNumber) {
			   System.out.println("Correct Answer!");
			   System.out.println("The secret number was " + secretNumber);
			   if (boredom != 0) {
			     hunger += 10;
			     thirst += 10;
			     boredom -= 10;
			     sickness += 0;
			   } 
			   else {
			     hunger += 10;
			     thirst += 10;
			     boredom += 0;
			     sickness += 0;
			   }
			   break;
		   }
		   
		   else if (guess >= 1 && guess <= 10) {
			 System.out.println("You guessed the wrong answer.");
			 System.out.println("Your pet's boredom level did not change.");
			 System.out.println("The secret number was " + secretNumber);
				 hunger += 10;
				 thirst += 10;
				 boredom += 0;
				 sickness += 0;
			 break;
		   	}
	  }
	
	  int[] hungerThirstBoredomSickness = new int[4];
	  hungerThirstBoredomSickness[0] = hunger;
	  hungerThirstBoredomSickness[1] = thirst;
	  hungerThirstBoredomSickness[2] = boredom;
	  hungerThirstBoredomSickness[3] = sickness;
	
	  return hungerThirstBoredomSickness;
	}
}
