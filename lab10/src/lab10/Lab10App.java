package lab10;
import java.util.Scanner;

/**
 * <p>Title: The Lab10App class</p>
 *
 * <p>Description: This class will be used to test the various methods in the Course class</p>
 * 
 * @author Rishab Kaul
 */
public class Lab10App {

	/**
     * <p> Name: main method </p>
     * 
     * @param args values to be sent to the method
     */
	public static void main(String[] args) 
	{
		Course course = new Course();
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of students is: " + course.getNumStudents());
		
		double[] grades = {78.0, 93.5, 91.0, 88.5};
		Student stu1 = new Student("1234", "Barack", "Obama", grades);
		course.insertStudent(stu1);
		
		double[] grades2 = {82.0, 67.5, 90.0, 85.0};
		Student stu2 = new Student("2345", "George", "Bush", grades2);
		course.insertStudent(stu2);
		
		System.out.println("The number of students is: " + course.getNumStudents());
		
		System.out.println(course);
		
		for (int i = 1; i < 5; i++) {
			System.out.println("The exam average for exam " + i + " is: " +
					course.calcExamAverage(i));
		}
		
		double[] grades3 = new double[4];
		
		for (int i = 0; i < grades3.length; i++) {
			System.out.println("Enter a grade for exam " + (i + 1) + ":");
			double newGrade = sc.nextDouble();
			while (newGrade < 0 || newGrade > 100) {
				System.out.println("Enter a grade for exam " + (i + 1) + ":");
				newGrade = sc.nextDouble();
			}
			grades3[i] = newGrade;
		}
		
		Student stu3 = new Student("3456", "Bill", "Clinton", grades3);
		course.insertStudent(stu3);
		
		System.out.println(course);
		
		for (int i = 1; i < 5; i++) {
			System.out.println("The exam average for exam " + i + " is: " +
					course.calcExamAverage(i));
		}
		
		for (int i = 1; i < 5; i++) {
			System.out.println("The position of the student with the lowest exam "
					+ i + " is: " + course.findLowestExam(i));
		}
		
		System.out.println("The position of the student with the lowest exam 0 is: " +
				course.findLowestExam(0));
		System.out.println("The position of the student with the lowest exam 5 is: " +
				course.findLowestExam(5));
	}
}
