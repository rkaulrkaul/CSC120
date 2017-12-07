package lab9;

/**
 * <p>Title: The Lab9App class</p>
 *
 * <p>Description: This class will be used to test the various methods in the Hand class</p>
 * 
 * @author Rishab Kaul
 */
public class Lab9App {
	
	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// create and shuffle the deck
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();
		
		// instantiate a Hand object
		Hand myHand = new Hand();
		
		// insert 7 cards in the hand
		Card theCard;
		for (int i = 0; i < 7; i++)
		{
			theCard = theDeck.dealCard();
			myHand.insertCard(theCard);
		}
		
		System.out.println("Display the cards in the hand:" + '\n' +
				myHand.toString());
		
		System.out.println("Get a copy of the cards array, and display the contents of the copy:");
		Card[] copy1 = myHand.getCards();
		for (int i = 0; i < copy1.length; i++)
			System.out.println(copy1[i]);
		
		System.out.println('\n' + "Changing the first card in the copy to the 4 of hearts:");
		Card newCard = new Card(30);
		copy1[0] = newCard;
		for (int i = 0; i < copy1.length; i++)
			System.out.println(copy1[i]);
		
		System.out.println('\n' + "Display the cards in the hand:" + '\n' + 
				myHand.toString());
		
		System.out.println("Replacing the card in position 0 with a deck card and display the cards "
				+ "in the hand:");
		Card deckCard = theDeck.dealCard();
		myHand.replaceCard(0, deckCard);
		System.out.println(myHand.toString());
		
		Card aceCard = new Card(40);
		if (myHand.searchCard(aceCard))
			System.out.println("The hand has the Ace of Spades.");
		else
			System.out.println("The hand does not have the Ace of Spades.");
		
		System.out.println('\n' + "There are " + myHand.findNumFaceCards() + 
				" face card(s) in the hand.");
		
		Card lowDeckCard = theDeck.dealCard();
		myHand.replaceLowCard(lowDeckCard);
		System.out.println('\n' + "Replacing the lowest card in position with a deck card and display the "
				+ "cards in the hand:" + '\n' + myHand.toString());
	}
	
}
