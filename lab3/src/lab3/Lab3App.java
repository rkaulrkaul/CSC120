package lab3;
// The import statement allows program to use the cardgames.jar file
import cardgames.*;

/**
 * <p>Title: Lab 3: Exploring Programmer-Defined Classes</p>
 * 
 * <p>Description: Deals 1 card from a deck of 52 cards and outputs string value, suit, value, and point value.</p>
 * 
 * @author Rishab Kaul and Hamza Majid
 */

public class Lab3App {

    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// Changed Deck() to GUI() to declare and instantiate a GUI object
		GUI theWindow = new GUI();
		// Changed Card to Deck to declare and instantiate a Deck object using correct constructor
		Deck theDeck = new Deck();
		Card card1;
		theDeck.shuffleDeck();
		// dealCard() method is defined for Deck objects, not GUI objects
		card1 = theDeck.dealCard();
		theWindow.showCard(card1);
		System.out.println(card1.toString());
		// Statements for printing value and point value of card1 to console
		System.out.println("The value of card1 is " + card1.getValue());
		System.out.println("The point value of card1 is " + card1.getPointValue());
	}
}