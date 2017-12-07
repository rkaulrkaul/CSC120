package proj5;
import java.util.Random;

/**
 * <p>Title: The DiceArray class</p>
 *
 * <p>Description: This class represents a DiceArray. The parameterized constructor
 * creates an array with a length chosen as the argument. Each number within the array
 * acts as a die, being assigned a number between 1-6 if its diceToRoll value is
 * set as true and if it is rolled via the roll method. The getDice method returns a
 * copy of the dice array, while the toString method returns a reference to a string
 * containing the values within the dice array. The reset method sets all the dice to
 * be rolled in the next roll, while the keep method holds back a face value from being
 * rolled. The calculateTotal method calculates the total for a specified face value.</p>
 * 
 * @author Rishab Kaul
 */
public class DiceArray {
	
	
	//instance variables
	private int[] dice;
	private boolean[] diceToRoll;
	
	/** 
	 * parameterized constructor
	 * sets the number of dice needed and initializes the instance variables
	 * @param numDice sets the number of dice needed for the game
	 */
	public DiceArray(int numDice)
	{
		dice = new int[numDice];
		diceToRoll = new boolean[numDice];
		
		for (int i = 0; i < numDice; i++) {
			dice[i] = -1;
			diceToRoll[i] = true;
		}
	}
	
	/**
	 * toString method -- 
	 * create and return a String with the instance variable values
	 * @return a reference to a String containing the values of the dice and 
	 * indicates which are or are not being kept.
	 */
	public String toString()
	{
		String str = "";
		int[] diceCopy = new int[dice.length];
		boolean[] rollCopy = new boolean[dice.length];
		for(int i = 0; i < dice.length; i++) {
			diceCopy[i] = dice[i];
			str += diceCopy[i] + " ";
		}
		str += '\n';
		for (int i = 0; i < dice.length; i++) {
			rollCopy[i] = diceToRoll[i];
			if (rollCopy[i] == true)
				str += "T ";
			else
				str += "F ";
		}
		return str;
	}
	
	/**
	 * roll method -- 
	 * assigns a random number between 1 to 6 to the appropriate dice, based upon 
	 * which ones are set to roll
	 */
	public void roll()
	{
		Random rand = new Random();
		for (int i = 0; i < dice.length; i++) {
			if (diceToRoll[i] == true)
				dice[i] = rand.nextInt(6) + 1;
		}	
	}
	
	/**
	 * getDice accessor method --
	 * returns a reference to the array storing the face value of the dice
	 * @return a reference to the copy of dice array
	 */
	public int[] getDice()
	{
		int[] diceCopy = new int[dice.length];
		for (int i = 0; i < dice.length; i++)
			diceCopy[i] = dice[i];
		return diceCopy;
	}
	
	/**
	 * reset method --
	 * allows all dice to be rolled when the roll method is next called
	 */
	public void reset()
	{
		for (int i = 0; i < dice.length; i++)
			diceToRoll[i] = true;
	}
	
	/**
	 * keep method --
	 * accepts an integer indicating which dice value should be kept
	 * @param num a number that indicates which dice will have diceToRoll
	 * set as false
	 */
	public void keep(int num)
	{
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == num) 
				diceToRoll[i] = false;
			else
				diceToRoll[i] = true;
		}
	}
	
	/**
	 * calculateTotal method --
	 * accepts an integer indicating which of the face values to calculator a
	 * total for. It will calculate and return the total for this face value.
	 * @param num a number indicating which of the face values the method will 
	 * calculate a total for
	 * @return the total for the face value input as the argument 
	 */
	public int calculateTotal(int num)
	{
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == num)
				sum += num;
		}
		return sum;
	}

}
