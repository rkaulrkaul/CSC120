package proj5;
import java.util.Scanner;

/**
 * <p> Title: Project 5 - Yahtzee</p>
 * 
 * <p> Description: This program is used to create a game of Yahtzee. 
 * Yahtzee is a dice game that uses 5 dice. The player has 3 chances
 * to roll all, or some, of the 5 dice to get as many as possible of
 * a single value. The game starts with the player rolling all 5 dice.
 * During the second round, the player can choose to keep dice of a
 * specific face value while rolling the rest. After doing the same
 * for the third round, the player can choose which value to record.
 * After each round, a status report is made detailing current points,
 * and after all six rounds, the total points for the game are calculated.</p>
 * 
 * @author Rishab Kaul
 *
 */
public class Project5App {

	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// Instantiating DiceArray, Scanner, and GUI objects
		DiceArray yahtzee = new DiceArray(5);
		GUI gui = new GUI();
		Scanner sc = new Scanner(System.in);
		
		// Initializing primitive variables
		int round = 1;
		int[] points = new int[6];
		
		// While loop runs 6 times, starting at round 1 and ending after round 6
		while (round < 7)
		{
			System.out.println("Round " + round);
			int roll = 1;
			
			// While loop runs 2 times, starting at roll 1 and ending after roll 2
			while (roll < 3)
			{
				/**
				 * The roll method is called for the yahtzee DiceArray. The show dice  
				 * method is used to print the dice, and the user is asked to input which die
				 * value they want kept. After each input, the diceToRoll is reset to true
				 * via the reset method. The input int is used as an argument for the keep
				 * method.
				 */
				System.out.println("Roll " + roll + ":");
				yahtzee.roll();
				gui.showDice(yahtzee);
				System.out.println("\nWhich die value do you want to keep?");
				int answer = sc.nextInt();
				yahtzee.reset();
				yahtzee.keep(answer);
				roll++;
			}
			
			/**
			 * The roll method and showDice methods are called again. A summary of the points
			 * for each face value is printed at the end of roll 3, and the user is asked to
			 * input which face value to record for the round. 
			 */
			System.out.println("Roll 3:");
			yahtzee.roll();
			gui.showDice(yahtzee);
			System.out.println("\nWhich location would you like to record this round? \nScores:");
			for (int i = 0; i < 6; i++)
				System.out.println((i + 1) + "s: " + points[i] + " points");
			
			// The face value to be recorded is input via scanner object
			int record = sc.nextInt();
			
			// if the points are greater than 0, a do while loop is initiated
			if (points[record - 1] > 0) {
				/**
				 * The do while loop only runs if there is already a score for the location 
				 * being input. It continues to loop until the user inputs a location which
				 * does not yet have a score.
				 */
				do {
					System.out.println("There is already a score for location " + record +
							". Which location would you like to record this round? \nScores:");
					for (int i = 0; i < 6; i++)
						System.out.println((i + 1) + "s: " + points[i] + " points");
					record = sc.nextInt();
				} while (points[record - 1] > 0);
			}
			
			points[record - 1] += yahtzee.calculateTotal(record);
			
			// A final status report is printed at the end of the round with scores at each location
			System.out.println("Round " + round + " complete. \nScores:");
			for (int i = 0; i < 6; i++)
				System.out.println((i + 1) + "s: " + points[i] + " points");
			
			// The reset method is used to ensure no die is kept in the next roll for the next round
			yahtzee.reset();
			round++;
		}
		// The totalScore is calculated and printed with a final Game Over message
		int totalScore = 0;
		for (int i = 0; i < 6; i++)
			totalScore += points[i];
		System.out.println("Game over! Your total score is " + totalScore);
	}
}
