package lab10;
/**
 * <p>Title: The Student Class</p>
 *
 * <p>Description: This class models a student object with an id, 
 * first name, last name, and exams.  In addition to setting and 
 * retrieving these values, it can calculate the average.</p>
 *
 * @author CSC 120 Instructor
 */
public class Student
{
	private String studentId;
	private String firstName;
	private String lastName;
	private double[] exams;

	/**
	 * default Student constructor --
	 * initializes instance variables to default values
	 */
	public Student()
	{
		studentId = new String("None");
		firstName = new String("None");
		lastName = new String("None");
		//create space for 4 scores
		exams = new double[4];
		for (int i = 0; i < exams.length; i++)
			exams[i] = 0.0;
	}

	/**
	 * parameterized Student constructor --
	 * initializes instance variables to user-specified values
	 * @param id the student id to be stored
	 * @param first the student's first name to be stored
	 * @param last the student's last name to be stored
	 * @param scores an array of exam scores to be stored in exams
	 */
	public Student(String id, String first, String last, double[] scores)
	{
		studentId = id;
		firstName = first;
		lastName = last;
		//create space for the scores
		exams = new double[scores.length];
		for (int i = 0; i < exams.length; i++)
			exams[i] = scores[i];
	}

	/**
	 * setStudentId method --
	 * stores the student id passed to the method in the instance 
	 * variable studentId
	 * @param studentId the student id to be stored
	 */
	public void setStudentId(String studentId)
	{
		this.studentId = new String(studentId);
	}

	/**
	 * setFirstName method --
	 * stores the first name passed to the method in the instance 
	 * variable firstName
	 * @param firstName the first name to be stored
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = new String(firstName);
	}

	/**
	 * setLastName method --
	 * stores the last name passed to the method in the instance 
	 * variable lastName
	 * @param lastName the last name to be stored
	 */
	public void setLastName(String lastName)
	{
		this.lastName = new String(lastName);
	}

	/**
	 * setExams method --
	 * stores the exam scores passed to the method in the instance 
	 * variable exams
	 * @param scores an array of exam scores to be stored in exams
	 */
	public void setExams(double[] scores)
	{
		// check to see if scores is a different length than exams
		if (scores.length != exams.length)
		{
			// if the lengths are different then re-create the exams array so it is the same size as scores
			exams = new double[scores.length];
		}
		for(int i = 0; i < scores.length; i++)
			exams[i] = scores[i];
	}

	/**
	 * getId method --
	 * returns the value of the instance variable studentId
	 * @return the student's id
	 */
	public String getStudentId()
	{
		return studentId;
	}

	/**
	 * getFirstName method --
	 * returns the value of the instance variable firstName
	 * @return the student's first name
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * getLastName method --
	 * returns the value of the instance variable lastName
	 * @return the student's last name
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * getExams method -- 
	 * returns a reference to a copy of the array containing the exam scores
	 * @return a reference to an array containing the exam scores
	 */
	public double[] getExams()
	{
		double[] temp = new double[exams.length];
		// copy the values into a new array
		for (int i = 0; i < exams.length; i++)
			temp[i] = exams[i];
		// return the copy of the array
		return temp;
	}

	/**
	 * calcAverage method --
	 * calculates the average of the exam scores
	 * @return the average of the exams
	 */
	public double calcAverage()
	{
		double sum = 0.0;
		for (int i = 0; i < exams.length; i++)
			sum += exams[i];
		return (sum / exams.length);
	}

	/**
	 * toString method --
	 * returns the state of the object as a string
	 * @return the id, name, and exam scores along with appropriate 
	 * labels, as a string
	 */
	public String toString()
	{
		String studentInfo = new String();
		studentInfo = "Student Id: " + studentId + "\nName: " +
                    firstName + " " + lastName + "\nExams: ";
		for (int i = 0; i < exams.length; i++)
			studentInfo = studentInfo + exams[i] + " ";
		return studentInfo;
	}
}
