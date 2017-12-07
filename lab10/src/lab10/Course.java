package lab10;
/**
 * <p>Title: The Course Class</p>
 * 
 * <p>Description: This class models a Course and is capable of storing references 
 * to Student objects. Students can be inserted in the course and the number of students
 * in the course can be determined. The average for a given exam can be calculated, the 
 * position of the Student with the lowest score for a given exam can be determined and 
 * the students at a given position can be returned.</p>
 *
 * @author Rishab Kaul
 *
 */
public class Course 
{
    //instance variables
	private Student[] students;
	private int numStudents;

	/**
	 * Default constructor --
	 * Creates storage for at most 30 students and sets the number of
	 * students in the course to 0.
	 */
	public Course()
	{
		students = new Student[30];
		numStudents = 0;
	}
	

	/**
	 * getNumStudents --
	 * Returns the number of students currently in the course.
	 * @return numStudents
	 */
	public int getNumStudents()
	{
		return numStudents;
	}
	
	
	/**
	 * insertStudent --
	 * Adds a student to the course if there's room.  If the course is full, 
	 * it doesn't do anything.
	 * @param newStudent - a reference to the student to be added 
	 */
	public void insertStudent(Student newStudent)
	{
		if (numStudents < students.length) {
			students[numStudents] = newStudent;
			numStudents++;
		}
	}
	

	/**
	 * calcExamAverage --
	 * Calculates the average for a particular exam.
	 * @param examNum - the exam number to calculate the average for
	 * @return the average for the specified exam
	 */
	public double calcExamAverage(int examNum)
	{
		double average = 0.0;
		if (examNum != 1 && examNum != 2 && examNum != 3 && examNum != 4)
			average = -1.0;
		else {
			double sum = 0.0;
			for (int i = 0; i < numStudents; i++)
				sum += students[i].getExams()[examNum - 1];
			average = (sum / numStudents);
		}
		return average;
	}


	/**
	 * findLowestExam --
	 * Determines the index of the student in the students array with the lowest score 
	 * for a particular exam. 
	 * 
	 * @param examNum - an integer representing the exam number to find the lowest 
	 * exam score for 
	 * @return the index of the student with the lowest exam score for the 
	 * specified exam
	 */
	public int findLowestExam(int examNum)
	{
		int lowestIndex = 0;
		if (examNum != 1 && examNum != 2 && examNum != 3 && examNum != 4)
			lowestIndex = -1;
		else {
			for (int i = 1; i < numStudents; i++) {
				double first = students[i].getExams()[examNum - 1];
				double second = students[lowestIndex].getExams()[examNum - 1];
				if (first < second)
					lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	

	/**
	 * toString method -- 
	 * Returns a String representing the state of the Course.
	 * @return a reference to a string containing all the students in
	 * the course
	 */
	public String toString()
	{
		String str = "";
		for (int i = 0; i < numStudents; i++)
			str += students[i].toString() + '\n';
		return str;
	}
	
}
