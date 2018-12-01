import java.util.Random;
public class Tamagotchi {

	//method for feeding the pet
	public int[] food(int hunger, int thirst, int boredom, int sickness ) {
		
		System.out.println("What food would you like to feed your pet?");
		System.out.println("Enter 1 for salad.");
		System.out.println("Enter 2 for candy.");
		System.out.println("Enter 3 for pretzels.");
		int inputFood = IO.readInt();

		if (inputFood == 1 || inputFood == 2 || inputFood == 3) {
			
		//salad option
			if (inputFood == 1) {
				if (hunger != 0) {
					hunger -= 10; //decrease hunger
					thirst += 0; 
					boredom += 10;
					
						if (sickness != 0) {
							sickness -= 10; // decrease sickness
						}
						else {
							sickness += 0; 
						}
				}
				else {
					hunger += 0; //hunger does not change
					thirst += 0; 
					boredom += 10;

					if (sickness != 0) {
						sickness -= 10; // decrease sickness
					}
					else {
						sickness += 0; 
					}
				}
			}
			
		//candy option
			if (inputFood == 2) {
				if (hunger != 0) {
					hunger -= 10; //decrease hunger
					thirst += 0;  //thirst does not change
					boredom += 10;
					sickness += 10;
				}
				
				else {
					hunger += 0; //hunger does not change
					thirst += 0; 
					boredom += 10;
					sickness += 10;
				}
			}
			
		//pretzel option
			if (inputFood == 3) {
				if (hunger != 0) {
					hunger -= 10; //decrease hunger
					thirst += 10;  //increase thirst
					boredom += 10;
					sickness += 0;
				}
			
				else {
					hunger += 0; //hunger does not change
					thirst += 10; 
					boredom += 10;
					sickness += 0;
				}
			}
		}	
		
		else {
			IO.reportBadInput();
			System.out.println("You ignored your pet.");
			hunger += 10;
			thirst += 10; 
			boredom += 10;
			sickness += 10;
		}
		
		int[] hungerThirstBoredomSickness = new int [4];
		hungerThirstBoredomSickness[0] = hunger;
		hungerThirstBoredomSickness[1] = thirst;
		hungerThirstBoredomSickness[2] = boredom;
		hungerThirstBoredomSickness[3] = sickness;

		System.out.println("Hunger is at " + hunger + "%");
		System.out.println("Thirst is at " + thirst + "%");
		System.out.println("Boredom is at " + boredom + "%");
		System.out.println("Sickness is at " + sickness + "%");
		return hungerThirstBoredomSickness;	
	}	
	
		
	
	//method for giving the pet drinks
	public int[] drinks(int hunger, int thirst, int boredom, int sickness ) {
		
		System.out.println("What food would you like to feed your pet?");
		System.out.println("Enter 1 for water.");
		System.out.println("Enter 2 for green juice.");
		System.out.println("Enter 3 for beer.");
		int inputDrink = IO.readInt();
		
		if (inputDrink == 1 || inputDrink == 2 || inputDrink == 3) {
			
			//water option
				if (inputDrink == 1) {
					if (thirst != 0) {
						hunger += 0; 
						thirst -= 10; //decrease thirst
						boredom += 10;
						sickness += 0;		
					}
					else {
						hunger += 0; 
						thirst += 0; 
						boredom += 10;
						sickness += 0;
						}
					}
				
			//green juice option
				if (inputDrink == 2) {
					if (thirst != 0) {
						thirst -= 10;  //thirst does not change
						boredom += 10;
							
						//green juice decreases hunger and sickness
							if (sickness != 0) {
								sickness -= 10; // decrease sickness
							}
							else {
								sickness += 0; 
							}
							
							if (hunger != 0) {
								hunger -= 10; // decrease hunger
							}
							else {
								hunger += 0; 
							}
					}
					
					else {
						thirst -= 0; 
						boredom += 10;
							if (sickness != 0) {
								sickness -= 10; // decrease sickness
							}
							else {
								sickness += 0; 
							}
							
							if (hunger != 0) {
								hunger -= 10; // decrease hunger
							}
							else {
								hunger += 0; 
							}			
					}
				}
				
			//beer option
				if (inputDrink == 3) {
					if (thirst != 0) {
						thirst -= 10;  //decrease thirst
						boredom += 10;
						sickness += 10;
							if (hunger != 0) {
								hunger -= 10; // decrease hunger
							}
							else {
								hunger += 0; 
							}
					}
				
					else {
						thirst += 0; 
						boredom += 10;
						sickness += 10;
							if (hunger != 0) {
								hunger -= 10; // decrease hunger
							}
							else {
								hunger += 0; 
							}
					}
				}
			}	
		
			else {
				IO.reportBadInput();
				System.out.println("You ignored your pet.");
				hunger += 10;
				thirst += 10; 
				boredom += 10;
				sickness += 10;
			}
			
			int[] hungerThirstBoredomSickness = new int [4];
			hungerThirstBoredomSickness[0] = hunger;
			hungerThirstBoredomSickness[1] = thirst;
			hungerThirstBoredomSickness[2] = boredom;
			hungerThirstBoredomSickness[3] = sickness;

			System.out.println("Hunger is at " + hunger + "%");
			System.out.println("Thirst is at " + thirst + "%");
			System.out.println("Boredom is at " + boredom + "%");
			System.out.println("Sickness is at " + sickness + "%");
			return hungerThirstBoredomSickness;	
	}
	
	
	
	//method for playing with the pet
	public int[] bored(int hunger, int thirst, int boredom, int sickness ) {

		System.out.println("Enter 1 to give your pet a toy.");
		System.out.println("Enter 2 to play a guessing game with your pet.");
		System.out.println("Enter 3 to take your pet on a vacation.");
		int inputPlayChoice = IO.readInt();

			if (inputPlayChoice == 1 || inputPlayChoice == 2 || inputPlayChoice == 3) {

				//toy option
				if (inputPlayChoice == 1) {
					if (boredom != 0) {
						hunger += 10; //increase hunger
						thirst += 10; //increase thirst
						boredom -= 10;
						sickness += 0;
					}
					else {
						hunger += 10;
						thirst += 10;
						boredom += 0;
						sickness += 0;
					}
				}

				//calls game method from player class
				if (inputPlayChoice == 2) {
					Player game = new Player();
					int[] hungerThirstBoredomSickness = game.randomNumberGame(hunger, thirst, boredom, sickness);
					hunger = hungerThirstBoredomSickness[0];
					thirst = hungerThirstBoredomSickness[1];
					boredom = hungerThirstBoredomSickness[2];
					sickness = hungerThirstBoredomSickness[3];
				}
				
				//vacation option
				if (inputPlayChoice == 3) {
					System.out.println("Where would your pet like to go?");
					System.out.println("Enter 1 for Mumbai (India)!"); 
					System.out.println("Enter 2 for New York City (USA)!");
					System.out.println("Enter 3 for Zürich (Switzerland)!");
					int inputVacation = IO.readInt();
					
					if (inputVacation == 1 || inputVacation == 2 || inputVacation == 3) {
						
						//Mumbai Option
						if (inputVacation == 1) {
							if(sickness == 90) {
								hunger += 0;
								thirst += 0;
								boredom = 0; //boredom reset to 0
								sickness += 10; //pet caught malaria
							}
							else {							
								hunger += 0;
								thirst += 0;
								boredom = 0; //boredom reset to 0
								sickness += 20; //pet caught malaria
							}
							System.out.println("Oh, no! Your pet has caught Malaria!");
						}					
					
						//New York Option
						if (inputVacation == 2) {
							hunger += 10; //going to NY makes the pet hungry
							thirst += 0;
							boredom = 0; //boredom reset to 0
							sickness += 0;
						}
						
						//Zurich option
						if (inputVacation == 3){
							if(sickness == 90) {
								hunger += 0;
								thirst += 0;
								boredom = 0; //boredom reset to 0
								sickness += 10; //pet got frostbite
							}
							else {							
								hunger += 0;
								thirst += 0;
								boredom = 0; //boredom reset to 0
								sickness += 20; //pet got frostbite
							}
							System.out.println("Oh, no! Your pet has gotten frostbite!");
						}	
					}
					
					else {
						IO.reportBadInput();
						System.out.println("You did not take your pet on vacation.");
						hunger += 10;
						thirst += 10;
						boredom += 10;//boredom increases
						sickness += 10;
					}
				}
			}

			else {
				  IO.reportBadInput();
			      System.out.println("You did not play with your pet.");
			      hunger += 10;
			      thirst += 10;
			      boredom += 10;
			      sickness += 10;
			 }

		    int[] hungerThirstBoredomSickness = new int [4];
			hungerThirstBoredomSickness[0] = hunger;
			hungerThirstBoredomSickness[1] = thirst;
			hungerThirstBoredomSickness[2] = boredom;
			hungerThirstBoredomSickness[3] = sickness;

			System.out.println("Hunger is at " + hunger + "%");
			System.out.println("Thirst is at " + thirst + "%");
			System.out.println("Boredom is at " + boredom + "%");
			System.out.println("Sickness is at " + sickness + "%");
			return hungerThirstBoredomSickness;
	}
	
	
	
	//method for giving medicine to the pet
	public int[] sick(int hunger, int thirst, int boredom, int sickness ) {

		System.out.println("Your pet is sick. Please give your pet medicine.");
		System.out.println("Enter 1 to give your pet medicine.");
		System.out.println("Enter 2 to not give your pet medicine.");
		int inputMedicine = IO.readInt();
		
			if (inputMedicine == 1) {
				System.out.println("You treated your pet with some medicine");
    		      if (sickness != 0) {
			    	  hunger += 0;
			    	  thirst += 0;
			    	  boredom += 0;
			    	  sickness -= 10;
    		      }
	     
    		      else {
			    	  hunger += 0;
			    	  thirst += 0;
		  			  boredom += 0;
		  			  sickness += 0;
    		      }
			}
			
			else if (inputMedicine == 2) {
				System.out.println("You did not give medicine to your pet.");
			    	  hunger += 0;
			    	  thirst += 0;
			    	  boredom += 0;
			    	  sickness += 10;
			}
			
			else {
				IO.reportBadInput();
				System.out.println("You ignored your pet.");
				hunger += 10;
				thirst += 10; 
				boredom += 10;
				sickness += 10;
			}
			
			int[] hungerThirstBoredomSickness = new int [4];
			hungerThirstBoredomSickness[0] = hunger;
			hungerThirstBoredomSickness[1] = thirst;
			hungerThirstBoredomSickness[2] = boredom;
			hungerThirstBoredomSickness[3] = sickness;
			
			System.out.println("Hunger is at " + hunger + "%");
			System.out.println("Thirst is at " + thirst + "%");
			System.out.println("Boredom is at " + boredom + "%");
			System.out.println("Sickness is at " + sickness + "%");
			return hungerThirstBoredomSickness;	
	}
	

	
	//method for a random assigned gender
	public String randomGender(){
		
		String gender = "";
		
		Random rand = new Random();
		int oneOrTwo = 1 + rand.nextInt(2);		
	
			if (oneOrTwo == 1) {
				gender = "male";
			}
			
			else {
				gender = "female";
			}
		
		return gender;
	}	
}



