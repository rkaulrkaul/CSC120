package proj3;
import java.util.Scanner;

/**
 * <p> Title: Project 4- Math Game</p>
 * 
 * <p> Description: This program creates a math game. It uses
 * the question class to create 10 random questions which are
 * then answered by the user. If the user answers at least 85%
 * of the questions correctly, the game ends, and a progress
 * report is made which states the user's answer statistics.</p>
 * 
 * @author Rishab Kaul
 *
 */
public class Project4App {
	
	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		// Primitive variables and a Scanner Object
		Scanner sc = new Scanner(System.in);
		int question = 1;
		int uAnswer;
		int addCorrect = 0;
		int addIncorrect = 0;
		int subCorrect = 0;
		int subIncorrect = 0;
		int totalCorrect = 0;
		double questions;
		double correctQuestions;
		double percentCorrect;
		int percentage;
		
		/*
		 *  While loop; loops 10 times, prompts a response to randomized 
		 * 	If/elseif/else statements used to record the amount of correct
		 *  and incorrect responses.
		 */ 
		while(question < 11) {
			Question q = new Question();
			System.out.println("What is the result?");
			System.out.println(q.toString());
			uAnswer = sc.nextInt(); 
			if (uAnswer == q.determineAnswer()) {
				System.out.println("Congratulations, you got it correct!");
				if (q.getOperator() == '+')
					addCorrect++;
				else if (q.getOperator() == '-')
					subCorrect++;
				totalCorrect++;
			}
			else {
				System.out.println("The correct answer for " + 
						q.toString() + " is " + q.determineAnswer());
				if (q.getOperator() == '+')
					addIncorrect++;
				else if (q.getOperator() == '-')
					subIncorrect++;
			}
			question++;
		}
		
		// Conversion of int variables to double variables for percent calculation
		questions = (double) question - 1.0;
		correctQuestions = (double) totalCorrect;
		percentCorrect = (correctQuestions / questions) * 100;
		/*
		 * If/else statement with percentage of questions correct as condition
		 * While loop if conditional is false, breaks only if there are a total
		 * of 20 questions asked, or if the percent of correct answers is greater
		 * than or equal to 85.0. If/elseif statements within while loop adds to
		 * the correct question counter. Then, it prints a progress report of the
		 * questions asked.
		 * If the percentCorrect is greater than or equal to 85.0 on the first
		 * conditional, the else statement prints a progress report of the first
		 * 10 questions.
		 */
		if (percentCorrect < 85.0) {
			while (question < 21 && percentCorrect < 85.0) {
				Question q = new Question();
				System.out.println("What is the result?");
				System.out.println(q.toString());
				uAnswer = sc.nextInt(); 
				if (uAnswer == q.determineAnswer()) {
					System.out.println("Congratulations, you got it correct!");
					if (q.getOperator() == '+')
						addCorrect++;
					else if (q.getOperator() == '-')
						subCorrect++;
					correctQuestions++;
				}
				else {
					System.out.println("The correct answer for " + 
							q.toString() + " is " + q.determineAnswer());
					if (q.getOperator() == '+')
						addIncorrect++;
					else if (q.getOperator() == '-')
						subIncorrect++;
				}
				question++;
				questions++;
				
				percentCorrect = (correctQuestions / questions) * 100;
			}
			percentage = (int) Math.ceil(percentCorrect);
			System.out.println('\n' + "Progress Report:");
			System.out.println("Addition:");
			System.out.println("You got " + addCorrect + " correct and " + 
					addIncorrect + " incorrect.");
			System.out.println("Subtraction:");
			System.out.println("You got " + subCorrect + " correct and " + 
					subIncorrect + " incorrect.");
			System.out.println("The percent correct is " + percentage + ".0%");
		}
		else {
			percentage = (int) Math.ceil(percentCorrect);
			System.out.println('\n' + "Progress Report:");
			System.out.println("Addition:");
			System.out.println("You got " + addCorrect + " correct and " + 
					addIncorrect + " incorrect.");
			System.out.println("Subtraction:");
			System.out.println("You got " + subCorrect + " correct and " + 
					subIncorrect + " incorrect.");
			System.out.println("The percent correct is " + percentage + ".0%");
		}

	}

}
