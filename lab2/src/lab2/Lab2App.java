package lab2;
import java.util.Scanner;

/**
 * <p> Title: Lab 2: Parsing a URL </p>
 * <p> Description: Ask the user to enter a URL and it will display
 * the protocol, domain name and file name specified. </p>
 * 
 * @author Rishab Kaul, Hamza Majid
 *
 */

public class Lab2App 
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		String url;
		int positionOfColon;
		String protocol;
		String restOfUrl;
		String domainName;
		String fileName;
		int positionOfSlash;
		int fileNameLength;
		char firstLetter;
		char lastLetter;
		
		// set up the Scanner object for reading user input
		Scanner scanner = new Scanner(System.in);
		

		//if divisible by 3, print fizz, otherwise if divisible by 5, then buzz, if divisible by both 3 and 5, fizzbuzz, input user.
		int input = scanner.nextInt();
		for (int i = 0; i < input + 1; i++)
		{
			if ((i % 3 ==0) && (i % 5 == 0))
				System.out.println("fizzbuzz");
			else if (i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("buzz");
			else
				System.out.println(i);
		}
	
	}
}