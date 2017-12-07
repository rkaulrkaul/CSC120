package proj2;
import cardgames.*;

/**
 * <p> Title: Project 2- Working with the Card class </p>
 * 
 * <p> Description: This program deals three random cards to the player and puts them 
 * to the window. It then prints the suits of the cards, checks if there is a pair,
 * and states the highest value of the three cards. It also checks the sum of the 
 * point values of these three cards. If the sum is 25 or above, the player wins. If not,
 * the computer wins. </p>
 * 
 * @author Rishab
 *
 */
public class Project2 
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		GUI theWindow = new GUI();
		
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		// Deals random cards from theDeck and stores one in each card
		Card card1 = theDeck.dealCard();
		Card card2 = theDeck.dealCard();
		Card card3 = theDeck.dealCard();
		
		// Testing cards with different arguments for program accuracy
		// Card card1 = new Card(5);
		// Card card2 = new Card(18);
		// Card card3 = new Card(31);
		
		theWindow.showCard(card1);
		theWindow.showCard(card2);
		theWindow.showCard(card3);
		
		// Set up int variables to hold values for the three cards
		int val1 = card1.getValue();
		int val2 = card2.getValue();
		int val3 = card3.getValue();
		
		// Set up int variable psum to hold sum of three point values	
		int psum = card1.getPointValue() + card2.getPointValue() + card3.getPointValue();
		
		// Prints suits of the three cards
		System.out.println("Card 1 is: " + card1.toString());
		System.out.println("Card 2 is: " + card2.toString());
		System.out.println("Card 3 is: " + card3.toString());		
		
		// Prints pair if there are at least two cards with same value and not a pair if no pairs exist
		if (val1 == val2 || val1 == val3 || val2 == val3) 
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		// Prints the value of the card with the highest value
		if (val1 >= val2 && val1 >= val3)
			System.out.println("The highest value is " + val1);
		else if (val2 >= val1 && val2 >= val3)
			System.out.println("The highest value is " + val2);
		else if (val3 >= val1 && val3 >= val2)
			System.out.println("The highest Value is " + val3);
		
		// Prints the sum of the point values of the cards
		System.out.println("The sum is " + psum);
		
		// If/else statement, if sum is 25 or above, player wins. If not, computer wins
		if (psum >= 25)
			System.out.println("You win!");
		else
			System.out.println("Computer wins.");
	}
}