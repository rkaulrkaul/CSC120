package lab8;
/**
 * <p>Title: Student Class</p>
 *
 * <p>Description: Creates a constructor and methods that store, assign, and 
 * obtain information pertaining to a single student.</p>
 *
 * @author Rishab Kaul
 */

public class Student {
	// instance variables
	private String studentId;
	private String firstName;
	private String lastName;
	private double[] grades;
	
	/** 
	 * default constructor
	 * the id, first and last names are initialized to "none"
	 * the array is instantiated to store 4 elements - each element is
	 * initialized to -1.0
	 */
	public Student()
	{
		studentId = "none";
		firstName = "none";
		lastName = "none";
		grades = new double[4];
		
		for(int i = 0; i < grades.length; i++)
			grades[i] = -1.0;

	}

	/** 
	 * parameterized constructor
	 * stores the parameters into the appropriate instance variables
	 * @param sId the value to be stored in the instance variable studentId
	 * @param sFirstName the value to be stored in the instance variable firstName
	 * @param sLastName the value to be stored in the instance variable lastName
	 * @param sExams the address of the array whose values will be copied into the 
	 * instance variable grades
	 */
	public Student(String sId, String sFirstName, String sLastName, double[] sExams)
	{
		studentId = sId;
		firstName = sFirstName;
		lastName = sLastName;
		grades = new double[4];
		
		for(int i = 0; i < grades.length; i++) {
			grades[i] = sExams[i];
		}
			
		
	}
	
	/**
	 * setStudentId - mutator method for studentId
	 * stores the parameter into the instance variable
	 * @param sId the value to be stored in the instance variable studentId
	 */
	public void setStudentId(String sId)
	{
		studentId = sId;
	}
	
	/**
	 * setGrades - mutator method for grades
	 * stores the parameter into the instance variable
	 * @param sExams the address of the array whose values will be copied into the 
	 * instance variable grades
	 */
	public void setGrades(double[] sExams)
	{
		for(int i = 0; i < grades.length; i++)
			grades[i] = sExams[i];
	}
	
	/**
	 * getStudentId - accessor method for id
	 * @return a reference to the instance variable id
	 */
	public String getStudentId()
	{
		return studentId;
	}
 
 
 	/**
	 * getFirstName - accessor method for firstName
	 * @return a reference to the instance variable firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * getLastName - accessor method for lastName
	 * @return a reference to the instance variable lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * getGrades - accessor method for grades
	 * @return a reference to a copy of the instance variable grades
	 */
	public double[] getGrades()
	{
		double[] gradesCopy = new double[4];
		for(int i = 0; i < grades.length; i++)
		{
			gradesCopy[i] = grades[i];			
		}
		return gradesCopy;
	}
	
	/**
	 * findLowestExam - find the lowest exam score in the array and returns its location 
	 * in the array
	 * @return the position of the lowest exam grade in the array
	 */
	public int findLowestExam()
	{
		int lowestIndex = 0;
		for (int i = 1; i < grades.length; i++)
		{
			if(grades[i] < grades[lowestIndex])
				lowestIndex = i;
		}
		return lowestIndex;
	}

	
	/**
	 * calcExamAverage - calculates the average of the exams in one of two ways 
	 * if the parameter is true, the lowest exam score is dropped in 
	 * calculating the average
	 * if the parameter is false, no exams are dropped in the calculating
	 * the average
	 * @param drop - a boolean variable to specify whether or not to drop the lowest score
	 * @return the average of the exams
	 */
	public double calcExamAverage(boolean drop)
	{
		double sum = 0.0;
		double average = 0.0;
		if(drop == true) {
			double lowestVal = grades[this.findLowestExam()];
			for (int i = 0; i < grades.length; i++)
			{
				sum += grades[i];
			}
			sum = sum - lowestVal;
			average = sum / (grades.length - 1);
		}
		else if(drop == false) {
			for(int i = 0; i < grades.length; i++)
			{
				sum += grades[i];
			}
			average = sum / grades.length;
		}
		return average;
	}

	
	/**
	 * toString - create and return a String with the instance variable values
	 * @return a reference to a String containing the id, first and last names
	 * and the exam grades
	 */
	public String toString()
	{
		String str = " ";
		double[] gradesCopy = new double[4];
		for(int i = 0; i < grades.length; i++) {
			gradesCopy[i] = grades[i];
			str += gradesCopy[i] + " ";
		}
		return "Id: " + studentId + '\n' + "Name: " + lastName + ", " + firstName + '\n' + "Grades: " + 
					str;
	}
}
