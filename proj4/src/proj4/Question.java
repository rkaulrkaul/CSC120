package proj4;
import java.util.Random;
/**
 * <p>Title: The Question Class</p>
 * <p>Description: This class will create a question based on three variables-
 *  operand1, operand2, and the operator. If the operator is '+', operand1 and
 *  operand2 will have a random values each, in the range of 0-12. The two values
 *  would then be added together to find the solution. If the operator is '-', 
 *  operand1 is assigned a random value in the range 6-12, and operand2 is assigned
 *  a value from 0-operand1. Operand1 is then subtracted by operand2 to find the
 *  solution. These variables can be accessed via the accessor methods, and the
 *  question can be returned as a string reference containing the three instance
 *  variables.</p>
 *  
 * @author Rishab Kaul
 *
 */
public class Question {
	// instance variables
	private int operand1;
	private int operand2;
	private char operator;	
	
	/**
	 * <p>Method name: getOperand1</p>
	 * <p>Description: return the values of the operand1 instance variables</p>
	 * @return the value of the operand1 instance variable
	 */
	public int getOperand1()
	{
		return operand1;
	}
	
	/**
	 * <p>Method name: getOperand2</p>
	 * <p>Description: return the values of the operand2 instance variables</p>
	 * @return the value of the operand2 instance variable
	 */
	public int getOperand2()
	{
		return operand2;
	}
	
	/**
	 * <p>Method name: getOperator</p>
	 * <p>Description: return the values of the operator instance variables</p>
	 * @return the value of the operator instance variable
	 */
	public char getOperator()
	{
		return operator;
	}
	
	/**
	 * default Question constructor
	 * assigns random values to instance variables operand1, operand2,
	 * and operator
	 */
	
	public Question()
	{
		Random rand = new Random();
	
		int n = rand.nextInt(2);
		if (n == 0) 
			operator = '+';	
		else if (n == 1) 
			operator = '-';
		
		if (operator == '+') {
			operand1 = rand.nextInt(13);
			operand2 = rand.nextInt(13);
		}
		else if (operator == '-') {
			operand1 = rand.nextInt(7) + 6;
			operand2 = rand.nextInt(operand1 + 1);
		}		
	}
	
	/**
	 * <p>Method name: toString</p>
	 * <p>Description: the toString method returns the current values of
	 * the three instance variables, operand1, operand2, and operator as a String</p>
	 * @return a String reference with the values of operand1, operator, and operand2
	 * 
	 */
	public String toString()
	{
		// operand1 + " " + operator + " " + operand2 + " ="
		return operand1 + " " + operator + " " + operand2 + " =";
	}
	
	/**
	 * <p>Method name: determineAnswer</p>
	 * <p>Description: this method will calculate the answer to the question and return
	 * the answer as an integer</p>
	 * @return the value of the answer to the question
	 */
	public int determineAnswer()
	{
		int answer = 0;
		if (operator == '+')
			answer = operand1 + operand2;
		else if (operator == '-')
			answer = operand1 - operand2;
		return answer;
	}
}
