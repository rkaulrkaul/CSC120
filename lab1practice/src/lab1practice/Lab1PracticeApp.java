package lab1practice;

/**
 * <p>Title: Lab 1</p>
 *
 * <p>Description: Understanding Program Execution </p>
 *
 * @author 
 */

public class Lab1PracticeApp
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
    public static void main(String[] args)
    {
        double price;
        int quantity;
        double subtotal;
	double taxOwed;
	double taxRate;
	double total;

        price = 5.0;
        quantity = 2;
        subtotal = price + quantity;
	taxRate = 8.5;
	taxOwed = subtotal * taxRate / 100;
	total = subtotal + taxOwed;	

        System.out.println("Price:   $" + total);
        System.out.println("Quantity: quantity");
        System.out.println("Subtotal:   $" + subtotal);
	System.out.println("Tax Rate: %" + taxRate);
	System.out.println("Tax:   $" + taxOwed);
        System.out.println("Total:   $" + price);
    }
}
