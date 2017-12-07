package proj1;
import java.util.Scanner;

/**
 * <p>Title: Project 1 - Debugging Program Logic</p>
 * 
 * <p>Description: Input of Name and Grades</p>
 * 
 * @author Rishab Kaul
 *
 */

public class Project1
{
    /**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		String fullName;
		int posOfSpace;
		String firstName;
		String lastName;
		int firstNameLength;
		int lastNameLength;
		int fullNameLength;
		char firstInitial;
		char lastInitial;
		double midterm;
		double finalExam;
		double average;
		
		// set up the Scanner object for reading user input
		Scanner scanner = new Scanner(System.in);
		
        // ask the user for their full name
		System.out.println("Please enter your first name, followed by a space, followed by your last name:"); 
		fullName = scanner.nextLine();  

		System.out.println("Please enter your midterm grade:"); 
		midterm = Double.parseDouble(scanner.nextLine());

		System.out.println("Please enter your final exam grade:"); 
		finalExam = Double.parseDouble(scanner.nextLine());
		posOfSpace = fullName.indexOf(" ");
		
		// Changed index to (0, posOfSpace) to include the first initial and last letter of the first name
		firstName = fullName.substring(0, posOfSpace);
		
		// Changed index from hard code index 5 to the one index after the space to obtain the full last name
		lastName = fullName.substring(posOfSpace + 1);
		
		// Switched firstName and lastName to reflect lastName, firstName
		System.out.println("Name: " + lastName + ", " + firstName + "\n");
		
		// changed lastName to firstName to obtain the right length
		firstNameLength = firstName.length();
		
		lastNameLength = lastName.length();
		
		// Subtracted 1 as the blank space does not count as a letter 
		fullNameLength = fullName.length() - 1;
		
		// Placed firstNamelength in the middle and removed hard code
		System.out.println("There are " + firstNameLength + " letters in my first name");
		System.out.println("There are " + lastNameLength + " letters in my last name");
		// Added fullnameLength and removed hard code
		System.out.println("There are " + fullNameLength + " letters in my full name\n"); 
		
		firstInitial = fullName.charAt(0);
		
		// Changed to posOfSpace + 1 so that Last Initial takes the correct letter
		lastInitial = fullName.charAt(posOfSpace + 1); 
		
		// Prints the words First initial: , with the first initial of name following
		System.out.println("First initial: " + firstInitial);
		System.out.println("Last initial: " + lastInitial + "\n");
		
		// Added parenthesis to correct the calculation
		average = (midterm + finalExam) / 2; 
		
		System.out.println("Midterm: " + midterm);
		// Changed to finalExam to display the correct value
		System.out.println("Final Exam: " + finalExam);
		System.out.println("\nAverage: " + average);
		
		int num = 15;
		for (int i = 0; i < num + 1; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizzbuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		//Number 15
		//div 3, fizz
		//div 5, buzz
	}
}
