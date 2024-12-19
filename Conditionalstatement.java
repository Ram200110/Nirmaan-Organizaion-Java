package day3;

import java.util.Scanner;

public class Conditionalstatement {

	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		/*
		 * System.out.println("Enter the mark : "); 
		 * int m = check.nextInt();
		 * 
		 * if ((m >= 35) && (m <= 100)) {
		 * 
		 * if (m > 90) { System.out.println("Grade A"); }
		 * 
		 * else if (m > 75) { System.out.println("Grade B"); }
		 * 
		 * else if (m >= 50) { System.out.println("Grade c"); }
		 * 
		 * else { System.out.println("Pass"); }
		 * 
		 * }
		 * 
		 * else if (m > 100) { System.out.println("Given value is invalid"); } else {
		 * System.out.println("Fail"); }
		 */
		System.out.println("Enter your first number ");
		int fn = check.nextInt();

		System.out.println("Enter your first number ");
		int sn = check.nextInt();

		System.out.println("case 1 ADDDITION");
		System.out.println("case 2 SUBRACTION");
		System.out.println("case 3 MULTIPLICATION");
		System.out.println("case 4 DIVISON");
		System.out.println("case 5 MODULES");
		System.out.println("Enter your choice");

		int key = check.nextInt();

		switch (key) {
		case 1: {

			int total = fn + sn;
			System.out.println("The Total value of :"+total);	
			break;
		}
		case 2: {

			int total = fn - sn;
			System.out.println("The Total value of :"+total);	
			break;
		}
		case 3: {

			int total = fn * sn;
			System.out.println("The Total value of :"+total);	
			break;
		}

		case 4: {

			int total = fn / sn;
			System.out.println("The Total value of :"+total);	
			break;
		}
		case 5: {

			int total = fn % sn;
			System.out.println("The Total value of :"+total);	
			break;
		}		


		default:{
			System.out.println("invalid choice");
		}

		}
	}
}
