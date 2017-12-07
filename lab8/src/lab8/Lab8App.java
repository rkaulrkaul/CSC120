package lab8;

/**
 * <p>Title: The Lab8App Class</p>
 * 
 * <p>Description: This class will be used to test the various methods in the Student class.
 * 
 * @author Rishab Kaul
 *
 */
public class Lab8App 
{
	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args)
	{
		Student myStudent = new Student();
		System.out.println("Testing default constructor:" + '\n' + myStudent.toString());
		
		double[] firstGrades = {98.5, 76.5, 79.0, 84.0};
		Student stu = new Student("123456789", "Jane", "Doe", firstGrades);
		System.out.println('\n' + "Testing parameterized constructor:" + '\n' + stu.toString());
		
		stu.setStudentId("987654321");
		System.out.println('\n' + "Setting Jane Doe's id:" + '\n' + stu.toString());
		
		double[] newGrades = {98.5, 95.0, 79.0, 84.0};
		stu.setGrades(newGrades);
		
		System.out.println('\n' + "Setting Jane Doe's second exam:" + '\n' +
				stu.toString());
		
		System.out.println('\n' + "Getting the student id for Jane Doe:" + '\n' +
				"Id is " + stu.getStudentId());
		
		System.out.println('\n' + "Getting the first name for Jane Doe:" + '\n' +
				"First name is " + stu.getFirstName());
		
		System.out.println('\n' + "Getting the last name for Jane Doe:" + '\n' +
				"Last name is " + stu.getLastName());
		
		double[] nGrade = stu.getGrades();
		System.out.println('\n' + "Getting Jane Doe's grades:" + '\n' + nGrade[0] + 
				" " + nGrade[1] + " " + nGrade[2] + " " + nGrade[3]);
		
		System.out.println('\n' + "Getting the array position of the lowest exam:" + '\n' + 
				"Lowest exam is at position " + stu.findLowestExam());
		
		System.out.println('\n' + "Calculating the average without dropping the lowest exam:" + '\n' +
				stu.calcExamAverage(false));
		
		System.out.println('\n' + "Calculating the average after dropping the lowest exam:" + '\n' +
				stu.calcExamAverage(true));
		
	}

}
