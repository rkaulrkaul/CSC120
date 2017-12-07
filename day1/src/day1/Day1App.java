package day1;

public class Day1App 
{
	/** 
	 * 
	 * <p>Java Program- MyPLab Program 1 </p>
	 * 
	 * @author Rishab Kaul
	 * 
	 */
	
	public static void main(String[] args)
	{
		String diamond = new String("diamond");
		if ("diamond" == "diamond") {
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
		System.out.println(" *******");
		System.out.println("  *****");
		System.out.println("   ***");
		System.out.println("    *");
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
		}
	}

}