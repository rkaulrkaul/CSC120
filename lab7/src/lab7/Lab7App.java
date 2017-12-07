package lab7;

/**
 * <p>Title: The Lab7App class</p>
 *
 * <p>Description: This class will be used to thoroughly test the 
 * various methods in the PokerHand class.  The seven cards specified 
 * will be used to test each method.</p>
 *
 * @author Rishab Kaul
 */
public class Lab7App
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		testFourOfAKind();
		testFlush();
		testThreeOfAKind();
		testPair();
		testLowCard();
    }
    
    /**
     * <p> Name: testFourOfAKind method </p>
     * 
     * <p> Description: tests the fourOfAKind method in the PokerHand class.</p>
     */
	public static void testFourOfAKind()
	{
		// cards to be used to test the various methods
		// in the PokerHand class
		
		Card twoClubs = new Card(2);
		Card twoDiamonds = new Card(15);
		Card twoHearts = new Card(28);
		Card twoSpades = new Card(41);
		Card threeClubs = new Card(3);
		Card fourClubs = new Card(4);
		Card fiveClubs = new Card(5);
		
		PokerHand fourSame = new PokerHand(twoClubs, twoDiamonds, twoHearts, twoSpades);
		
		System.out.println("Testing fourOfAKind method: " + "\n" + fourSame.toString());
		
		if (fourSame.fourOfAKind() == true) {
			System.out.println("Four of a kind");
		}
		else {
			System.out.println("Not four of a kind");
		}
			
		fourSame.replaceCard(2, threeClubs);
		
		System.out.println("\n" + "Replaced the 2 of diamonds with the 3 of clubs: ");
		System.out.println(fourSame.toString());
		
		if (fourSame.fourOfAKind() == true) {
			System.out.println("Four of a kind");
		}
		else {
			System.out.println("Not four of a kind");
		}
	}
	
    /**
     * <p> Name: testFlush method </p>
     * 
     * <p> Description: Tests the flush method in the PokerHand class.</p>
     */
	public static void testFlush()
	{
		// cards to be used to test the various methods
		// in the PokerHand class
		Card twoClubs = new Card(2);
		Card twoDiamonds = new Card(15);
		Card twoHearts = new Card(28);
		Card twoSpades = new Card(41);
		Card threeClubs = new Card(3);
		Card fourClubs = new Card(4);
		Card fiveClubs = new Card(5);
		
		PokerHand hand2 = new PokerHand(twoClubs, threeClubs, twoHearts, twoSpades);
		
		System.out.println("\n" + "Testing flush method: ");
		System.out.println(hand2.toString());
		
		if (hand2.flush()) {
			System.out.println("Flush");
		}
		else {
			System.out.println("Not a flush");
		}
		
		hand2.replaceCard(3, fourClubs);
		hand2.replaceCard(4, fiveClubs);
		
		System.out.print("\n" + "Replaced the 2 of hearts with the 4 of clubs ");
		System.out.println("and the 2 of spades with the 5 of clubs: ");
		System.out.println(hand2.toString());
		
		if (hand2.flush()) {
			System.out.println("Flush");
		}
		else {
			System.out.println("Not a flush");
		}
		
	}
	
    /**
     * <p> Name: testThreeOfAKind method </p>
     * 
     * <p> Description: tests the threeOfAKind method in the PokerHand class.</p>
     */
	public static void testThreeOfAKind()
	{
		// cards to be used to test the various methods
		// in the PokerHand class
		Card twoClubs = new Card(2);
		Card twoDiamonds = new Card(15);
		Card twoHearts = new Card(28);
		Card twoSpades = new Card(41);
		Card threeClubs = new Card(3);
		Card fourClubs = new Card(4);
		Card fiveClubs = new Card(5);
	
		System.out.println("\n" + "Testing threeOfAKind method: ");
		PokerHand hand3 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
		System.out.println(hand3.toString());
		if (hand3.threeOfAKind())
			System.out.println("Three of a kind");
		else
			System.out.println("Not three of a kind");
		
		System.out.println("\n");
		PokerHand hand4 = new PokerHand(twoClubs, twoDiamonds, twoHearts, fiveClubs);
		System.out.println(hand4.toString());
		if (hand4.threeOfAKind())
			System.out.println("Three of a kind");
		else 
			System.out.println("Not three of a kind");
		
		System.out.println("\n");
		PokerHand hand5 = new PokerHand(twoClubs, twoDiamonds, threeClubs, twoHearts);
		System.out.println(hand5.toString());
		if (hand5.threeOfAKind())
			System.out.println("Three of a kind");
		else 
			System.out.println("Not three of a kind");
		
		System.out.println("\n");
		PokerHand hand6 = new PokerHand(twoClubs, threeClubs, twoDiamonds, twoHearts);
		System.out.println(hand6.toString());
		if (hand6.threeOfAKind())
			System.out.println("Three of a kind");
		else
			System.out.println("Not three of a kind");
		
		System.out.println("\n");
		PokerHand hand7 = new PokerHand(threeClubs, twoClubs, twoDiamonds, twoHearts);
		System.out.println(hand7.toString());
		if (hand7.threeOfAKind())
			System.out.println("Three of a kind");
		else
			System.out.println("Not three of a kind");
	}
	
    /**
     * <p> Name: testPair method </p>
     * 
     * <p> Description: tests the pair method in the PokerHand class.</p>
     */
	public static void testPair()
	{
		// cards to be used to test the various methods
		// in the PokerHand class
		Card twoClubs = new Card(2);
		Card twoDiamonds = new Card(15);
		Card twoHearts = new Card(28);
		Card twoSpades = new Card(41);
		Card threeClubs = new Card(3);
		Card fourClubs = new Card(4);
		Card fiveClubs = new Card(5);
		
		System.out.println("\n" + "Testing pair method: ");
		PokerHand hand8 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
		System.out.println(hand8.toString());
		if (hand8.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		System.out.println("\n");
		PokerHand hand9 = new PokerHand(twoClubs, twoDiamonds, fourClubs, fiveClubs);
		System.out.println(hand9.toString());
		if (hand9.pair())
			System.out.println("Pair");
		else 
			System.out.println("Not a Pair");
		
		System.out.println("\n");
		PokerHand hand10 = new PokerHand(twoClubs, fourClubs, twoDiamonds, fiveClubs);
		System.out.println(hand10.toString());
		if (hand10.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		System.out.println("\n");
		PokerHand hand11 = new PokerHand(twoClubs, fourClubs, fiveClubs, twoDiamonds);
		System.out.println(hand11.toString());
		if (hand11.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		System.out.println("\n");
		PokerHand hand12 = new PokerHand(fiveClubs, twoClubs, twoDiamonds, fourClubs);
		System.out.println(hand12.toString());
		if (hand12.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		System.out.println("\n");
		PokerHand hand13 = new PokerHand(fiveClubs, twoClubs, fourClubs, twoDiamonds);
		System.out.println(hand13.toString());
		if (hand13.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
		
		System.out.println("\n");
		PokerHand hand14 = new PokerHand(fiveClubs, fourClubs, twoClubs, twoDiamonds);
		System.out.println(hand14.toString());
		if (hand14.pair())
			System.out.println("Pair");
		else
			System.out.println("Not a pair");
	}
	
    /**
     * <p> Name: testLowCard method </p>
     * 
     * <p> Description: tests lowCard method in the PokerHand class.</p>
     */
	public static void testLowCard()
	{
		// cards to be used to test the various methods
		// in the PokerHand class
		Card twoClubs = new Card(2);
		Card twoDiamonds = new Card(15);
		Card twoHearts = new Card(28);
		Card twoSpades = new Card(41);
		Card threeClubs = new Card(3);
		Card fourClubs = new Card(4);
		Card fiveClubs = new Card(5);
		
		System.out.println("\n" + "Testing lowCard method: ");
		PokerHand hand15 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
		System.out.println(hand15.toString());
		System.out.println("The low card is " + hand15.lowCard());
		
		System.out.println("\n");
		PokerHand hand16 = new PokerHand(threeClubs, twoClubs, fourClubs, fiveClubs);
		System.out.println(hand16.toString());
		System.out.println("The low card is " + hand16.lowCard());
		
		System.out.println("\n");
		PokerHand hand17 = new PokerHand(threeClubs, fourClubs, twoClubs, fiveClubs);
		System.out.println(hand17.toString());
		System.out.println("The low card is " + hand17.lowCard());
		
		System.out.println("\n");
		PokerHand hand18 = new PokerHand(threeClubs, fourClubs, fiveClubs, twoClubs);
		System.out.println(hand18.toString());
		System.out.println("The low card is " + hand18.lowCard());
		
		System.out.println("\n");
		PokerHand hand19 = new PokerHand(threeClubs, twoDiamonds, fiveClubs, twoClubs);
		System.out.println(hand19.toString());
		System.out.println("The low card is " + hand19.lowCard());
	}
}