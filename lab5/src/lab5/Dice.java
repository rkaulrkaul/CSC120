package lab5;
import java.util.Random;
/**
 * <p>Title: Dice Class</p>
 * <p>Description: This class will represent three dice. A dice can 
 * return the value of each die or reference to a String containing
 * the dice's values. It can assign a random value all three of its dice by  
 * rolling, find the sum of its dice, and check whether the dice are 
 * three of a kind. It can determine the highest value of the three dice.
 * It can also roll a single die from the dice, randomizing its value.</p>
 * 
 * @author Rishab Kaul
 *
 */
public class Dice {
	
	private int die1;
	private int die2;
	private int die3;
	
	/**
	 * <p>Dice default constructor</p>
	 * <p>Description: assign initial values to each of the instance
	 * variables, die1, die2, and die3.</p>
	 */

	public Dice()
	{
		die1 = 0;
		die2 = 0;
		die3 = 0;
				
	}
	
	/**
	 * <p>Method name: tpString</p>
	 * <p>Description: the toString method returns the current values of
	 * the three instance variables, die1, die2, and die3 as a String</p>
	 * @return a String reference with the values of die1, die2, and die3
	 * 
	 */
	public String toString()
	{
		// die1 + " " + die2 + " " + die3
		return die1 + " " + die2 + " " + die3;
	}
	
	/**
	 * <p>Method name: getDie1</p>
	 * <p>Description: return the values of the die1 instance variables</p>
	 * @return the value of the die1 instance variable
	 */
	public int getDie1()
	{
		return die1;
	}
	
	/**
	 * <p>Method name: getDie2</p>
	 * <p>Description: return the values of the die2 instance variables</p>
	 * @return the value of the die2 instance variable
	 */
	public int getDie2()
	{
		return die2;
	}
	
	/**
	 * <p>Method name: getDie3</p>
	 * <p>Description: return the values of the die3 instance variables</p>
	 * @return the value of the die3 instance variable
	 */
	public int getDie3()
	{
		return die3;
	}
	
	/**
	 * <p>Method name: roll</p>
	 * <p>Description: assigns a random number between 1 and 6 to each of the 
	 * three instance variables.</p>
	 */
	public void roll()
	{
		// give random values to the three instance variables
		// the random value must be between 1 and 6
		Random rand = new Random();
		
		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;
		die3 = rand.nextInt(6) + 1;
		
	}
	
	/**
	 * <p>Method name: calcTotalRoll</p>
	 * <p>Description: this method will calculate the total of the three dice</p>
	 * @return the sum of the dice
	 */
	public int calcTotalRoll()
	{
		return die1 + die2 + die3;
	}
	
	/**
	 * <p>Method name: threeOfAKind</p>
	 * <p>Description: this method will determine if all three of the dice have
	 * the same value</p>
	 * @return true if they have the same value, false otherwise
	 */	
	public boolean threeOfAKind()
	{
		// if die1 == die2 and die2 == die3, then returns true; otherwise false
		if (die1 == die2 && die2 == die3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * <p>Method name: findHighestDie</p>
	 * <p>Description: this method will determine which of the three dice have
	 * the highest value - if two die have the same value, the first occurence
	 * of the value should be used
	 * @return the value of the highest die
	 */
	public int findHighestDie()
	{
		int die = 0;
		
		if (die1 >= die2 && die1 >= die3) {
			die = die1;
		}
		else if (die2 >= die1 && die2 >= die3) {
			die = die2;
		}
		else if (die3 >= die1 && die3 >= die2) {
			die =  die3;
		}
		return die;
	}
	
	/**
	 * <p>Method name: rollOneDie</p>
	 * <p>Description: this method will assign a random number between 1 and 6
	 * to a single die</p>
	 * @param numDie a number that picks a die and converts it to a random
	 * value between 1 and 6
	 */
	public void rollOneDie(int numDie)
	{
		Random rand = new Random();
		
		if (numDie == 1) {
			die1 = rand.nextInt(6) + 1;
		}
		else if (numDie == 2) {
			die2 = rand.nextInt(6) + 1;
		}
		else if (numDie == 3) {
			die3 = rand.nextInt(6) + 1;
		}
	}
}
