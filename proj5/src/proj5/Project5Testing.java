package proj5;

/**
 * <p> Title: Project 5 - Yahtzee</p>
 * 
 * <p> Description: This program is used to test various methods of the
 * DiceArray class. It first creates a new DiceArray, and then tests
 * methods such as toString, roll, keep, reset, and calculateTotal.</p>
 * 
 * @author Rishab Kaul
 *
 */
public class Project5Testing {
	
	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// Creation of a new DiceArray and displaying initial values
		DiceArray game1 = new DiceArray(5);
		System.out.println("Testing the parameterized constructor with an argument of 5:");
		System.out.println(game1.toString());
		
		// Testing the roll method and displaying new values
		System.out.println('\n' + "Testing the roll method:");
		game1.roll();
		System.out.println(game1.toString());
		
		// Testing the keep method with argument 1, and displaying new values
		System.out.println('\n' + "Call the keep method with an argument of 1, then roll again:");
		game1.keep(1);
		game1.roll();
		System.out.println(game1.toString());
		
		// Testing the keep method with argument 2, and displaying new values
		System.out.println('\n' + "Call the keep method with an argument of 2, then roll again:");
		game1.keep(2);
		game1.roll();
		System.out.println(game1.toString());
		
		// Testing the keep method with argument 3, and displaying new values
		System.out.println('\n' + "Call the keep method with an argument of 3, then roll again:");
		game1.keep(3);
		game1.roll();
		System.out.println(game1.toString());
		
		// Testing the reset method, and displaying new values after rolling again
		System.out.println('\n' + "Call the reset method, then roll again:");
		game1.reset();
		game1.roll();
		System.out.println(game1.toString());
		
		// Calculating the sum of each face value after the final roll
		System.out.println('\n' + "Calculating the sum of all the 1s: " + game1.calculateTotal(1));
		System.out.println("Calculating the sum of all the 2s: " + game1.calculateTotal(2));
		System.out.println("Calculating the sum of all the 3s: " + game1.calculateTotal(3));
		System.out.println("Calculating the sum of all the 4s: " + game1.calculateTotal(4));
		System.out.println("Calculating the sum of all the 5s: " + game1.calculateTotal(5));
		System.out.println("Calculating the sum of all the 6s: " + game1.calculateTotal(6));
		
	}
}
