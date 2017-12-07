package proj4;
import java.util.Scanner;

public class Project4App {
	
	public static void main(String[] args)
	{
		
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
		
		while(question < 11) {
			Question q = new Question();
			System.out.println("What is the result?");
			System.out.println(q.toString());
			uAnswer = sc.nextInt(); 
			if (uAnswer == q.determineAnswer()) {
				System.out.println("Congratulations, you got it correct!");
				if (q.getOperator() == '+')
					addCorrect ++;
				else if (q.getOperator() == '-')
					subCorrect ++;
				totalCorrect ++;
			}
			else {
				System.out.println("The correct answer for " + 
			q.toString() + " is " + q.determineAnswer());
				if (q.getOperator() == '+')
					addIncorrect ++;
				else if (q.getOperator() == '-')
					subIncorrect ++;
			}
			question++;
		}
		
		questions = (double) question - 1.0;
		correctQuestions = (double) totalCorrect;
		percentCorrect = (correctQuestions / questions) * 100;
		if (percentCorrect < 85.0) {
			while (question < 21 && percentCorrect < 85.0) {
				Question q = new Question();
				System.out.println("What is the result?");
				System.out.println(q.toString());
				uAnswer = sc.nextInt(); 
				if (uAnswer == q.determineAnswer()) {
					System.out.println("Congratulations, you got it correct!");
					if (q.getOperator() == '+')
						addCorrect ++;
					else if (q.getOperator() == '-')
						subCorrect ++;
					correctQuestions ++;
				}
				else {
					System.out.println("The correct answer for " + 
				q.toString() + " is " + q.determineAnswer());
					if (q.getOperator() == '+')
						addIncorrect ++;
					else if (q.getOperator() == '-')
						subIncorrect ++;
				}
				question++;
				questions++;
				
				percentCorrect = (correctQuestions / questions) * 100;
			}
			System.out.println(percentCorrect);
			percentage = (int) Math.ceil(percentCorrect);
			System.out.println("Progress Report:");
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
			System.out.println("Progress Report:");
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
