package lab4;

import javax.print.attribute.standard.MediaSize.Other;

/**
 * <p>Title: The Card class</p>
 *
 * <p>Description: This class will represent a single playing card 
 * that has a value between 1 and 13 and a suit (clubs, diamonds, hearts or 
 * spades).  A card can return its value, suit, point value or reference to a 
 * String containing the card's value and suit.  It can determine if it a red card or 
 * a face card.  It can check to see if two cards have the same value or the same suit. </p>
 *
 * @author Rishab Kaul
 */

public class Card
{
    // instance variables
    private int value;
    private String suit;

    /**
     * parameterized Card constructor
     * gets called when an object of the Card class is instantiated sending a number 
     * as an argument - it determines the value and suit of the card based upon the 
     * number received
     * @param num a number that gets converted to a value between 1 and 13
     * and one of the four suits (clubs, diamonds, hearts, or spades)
     */
    public Card(int num)
    {
        int suitNumber;
        value = num % 13;
        if (value == 0) {
            value = 13;
            /**
             * 5,5,0,clubs
             *18,5,1,diamonds
             *12,12,0,clubs
             *51,12,3,spades
             *0,13,0,clubs
             *35,9,2,hearts
             *1-13, 14-26, 27-39, 40-52
             */
        }
        suitNumber = (num - 1) / 13;
        if (suitNumber == 0) {
            suit = new String("clubs");
        }
        else if (suitNumber == 1) {
        	suit = new String("diamonds");
        }
        else if (suitNumber == 2) {
        	suit = new String("hearts");
        }
        else if (suitNumber == 3) {
        	suit = new String("spades");
        }
        else {
        	suit = new String("ERROR");
        }
    }

    /**
     * getValue method - returns what's stored in the instance variable value
     * @return the state of the instance variable value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * getSuit method - returns what's stored in the instance variable suit
     * @return a reference to a String that contains the state of the instance variable suit
     */
    public String getSuit()
    {
        return suit;
    }
	
    /**
	* isAFaceCard method - determines if the card is a jack, queen or king based upon the card's value
	* @return true if the card is a face card, returns false otherwise
	*/
    public boolean isAFaceCard()
    {
    	if (value == 11 || value == 12 || value == 13) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * getPointValue method - this method returns the point value for the
     * card -- 10 for a face card, the actual value for cards 1 through 10
     * @return the point value of the card
     */
    public int getPointValue()
    {
    	if (value >= 10) {
    		return 10;
    	}
    	else {
    		return value;
    	}
    }

    /**
	* isRed method - determines if the card is red or black based upon the card's suit
	* @return true if the card's suit is diamonds or hearts, returns false otherwise
	*/
	public boolean isRed()
	{
		if (suit.equals("diamonds") || suit.equals("hearts")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** equalValue method - determines if the otherCard's value is the same
     * as this card's value
     * @param otherCard a reference to the Card object (assumes the object has been 
     * instantiated) to compare to this Card object
     * @return true if the values are equal, false if the values are not equal
     */
    public boolean equalValue(Card otherCard)
    {
    	if (this.value == otherCard.value) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /**
     * equalSuit method - determines if the otherCards's suit is the same as
     * this card's suit
     * @param otherCard a reference to the Card object (assumes the object has been 
     * instantiated) to compare to this Card object
     * @return true if the suits are the same, false if not
     */
    public boolean equalSuit(Card otherCard)
    {
    	if (this.suit.equals(otherCard.suit)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }


    /**
     * toString method - this method returns the state of the card object
     * @return a reference to a String object that contains Ace, Jack, Queen, and King or value and the
     * suit of the card
     */
    public String toString()
    {
    	if (value == 1) {
    		return (new String("Ace of " + suit));
    	}
    	else if (value == 11) {
    		return (new String("Jack of " + suit));
    	}
    	else if (value == 12) {
    		return (new String("Queen of " + suit));
    	}
    	else if (value == 13) {
    		return (new String("King of " + suit));
    	}
    	else {
    		String str = new String(value + " of " + suit);
    		return str;
    	}	
    }
}
