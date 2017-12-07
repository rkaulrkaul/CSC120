package lab5;
/**
 * <p>Title: Lab5App class</p>
 * <p>Description: First creates three dice and displays the values of each. 
 * Next, it rolls the dice and displays the new values of all three dice.
 * It also finds the roll total, whether the dice are three of a kind, and
 * finds the highest value of the three dice. Lastly, it rolls each individual
 * die and displays the new states of the dice after each roll.</p>
 * 
 * @author Rishab Kaul
 *
 */
public class Lab5App {
	
	/**
	 * <p>main method</p>
	 * 
	 * @param args - values to be sent to the main method
	 */
	public static void main(String[] args)
	{
		// instantiate a Dice object
		Dice myDice = new Dice();
		
		//display the state of the Dice object
		System.out.println("After instantiation: " + myDice.toString());
		
		//call the getDie1 method
		System.out.println("\n" + "Value of die 1: " + myDice.getDie1());
		
		//call the getDie2 method
		System.out.println("Value of die 2: " + myDice.getDie2());
		
		//call the getDie3 method
		System.out.println("Value of die 3: " + myDice.getDie3());
		
		//call the roll method
		myDice.roll();
		
		//Display the new state of the object
		System.out.println("\n" + "After rolling the dice: " + myDice);
		
		//Displays the sum of the dice
		System.out.println("\n" + "The roll total is " + myDice.calcTotalRoll());
		
		//Displays if the dice are three of a kind or not
		if (myDice.threeOfAKind()) {
			System.out.println("\n" + "Three of a kind.");
		}
		else {
			System.out.println("\n" + "Not three of a kind.");
		}
		
		//Displays the value of the highest die
		System.out.println("\n" + "The highest value of the three dice is " + myDice.findHighestDie());
	
		//roll only the first die and display the new state of the object
		myDice.rollOneDie(1);
		System.out.println("\n" + "Rolling die 1 only: " + myDice);
		
		//roll only the second die and display the new state of the object
		myDice.rollOneDie(2);
		System.out.println("Rolling die 2 only: " + myDice);
		
		//roll only the third die and display the new state of the object
		myDice.rollOneDie(3);
		System.out.println("Rolling die 3 only: " + myDice);
		

	}

}
