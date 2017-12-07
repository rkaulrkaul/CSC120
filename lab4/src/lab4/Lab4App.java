package lab4;

/**
 * <p>Title: Understanding Programmer-Defined Classes</p>
 *
 * <p>Description: This class test the various methods in the Card class to see what is returned and
 * determine if the methods work properly. </p>
 *
 * @author Rishab Kaul 
 */

public class Lab4App 
{

    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// Instantiated 6 cards
		Card card1 = new Card(24);
		Card card2 = new Card(7);
		Card card3 = new Card(8);
		Card card4 = new Card(36);
		Card card5 = new Card(50);
		Card card6 = new Card(14);
		Card card7 = new Card(26);
		Card card8 = new Card(38);
		
		
		// Displays card1 value, suit, and type of face card
		System.out.println("Card 1: " +  card1.toString());
		System.out.println("Card 1's value is: " + card1.getValue());
		System.out.println("Card 1's suit is: " + card1.getSuit());
		System.out.println("Card 1 is a face card: " + card1.isAFaceCard());
		
		// Displays card2 and shows it is a face Card or not
		System.out.println('\n' + "Card 2: " + card2.toString());
		System.out.println("Card 2 is a face card: " + card2.isAFaceCard());
		
		// Displays the point value of both card1 and card2
		System.out.println('\n' + "Card 1's point value is: " + card1.getPointValue());
		System.out.println("Card 2's point value is: " + card2.getPointValue());
		
		// Displays the suits and shows if color is red for cards 1, 3, 4, and 5
		System.out.println('\n' + "Card 1 is " + card1.getSuit() + " - color is red: " + card1.isRed());
		System.out.println("Card 3 is " + card3.getSuit() + " - color is red: " + card3.isRed());
		System.out.println("Card 4 is " + card4.getSuit() + " - color is red: " + card4.isRed());
		System.out.println("Card 5 is " + card5.getSuit() + " - color is red: " + card5.isRed());
		
		// Displays card 6, 7, and 8
		System.out.println('\n' + card6.toString());
		System.out.println(card7.toString());
		System.out.println(card8.toString());
		
		
		// Displays whether two cards have the same value and suit
		if (card1.equalValue(card5)) {
			System.out.println("\n" + card1.toString() + " and " + card5.toString() + " have the same value.");
		}
		if (!card2.equalValue(card3)) {
			System.out.println(card2.toString() + " and " + card3.toString() + " do not have the same value.");
		}
		if (card2.equalSuit(card3)) {
			System.out.println(card2.toString() + " and " + card3.toString() + " have the same suit.");
		}
		if (!card1.equalSuit(card5)) {
			System.out.println(card1.toString() + " and " + card5.toString() + " do not have the same suit.");
		}
	}
}