package day4;

import java.util.Scanner;


public class studentui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student st = new student();
		boolean bo = true;
		while(bo) {
			
		System.out.println("Enter your choice :");
		System.out.println("1 for Add Student detils  :");
		System.out.println("2 for ");
		System.out.println("3 for show :");
		System.out.println("0 for end");
		int key = sc.nextInt();

		switch (key) {
		case 1: {
			System.out.println("Enter Student ID : ");
			int id = sc.nextInt();
			System.out.println("Enter Student name  : ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Class name : ");
			String classname = sc.nextLine();
			System.out.println("Student number: ");
			long number = sc.nextLong();
			System.out.println("over all CGPA Mark : ");
			double cgpa = sc.nextDouble();	

			st = new student(id, name, classname, number, cgpa);
			break;
		}
		case 2:{
			System.out.println("Enter Student ID : ");
			int id = sc.nextInt();
			st.setId(id);
			
			System.out.println("Enter Student name  : ");
			String name = sc.nextLine();
			st.getName();
			sc.nextLine();
			
			System.out.println("Class name : ");
			String classname = sc.nextLine();
			st.getClassname();
			
			System.out.println("Student number: ");
			long number = sc.nextLong();
			st.getNumber();
			
			System.out.println("over all CGPA Mark : ");
			double cgpa = sc.nextDouble();
			st.setCgpa(cgpa);
			break;
		}
		case 3 :{
			System.out.println(st);
			break;
		}
		case 0:{
				bo = false;
				System.out.println("Operation Ended");
				break;
			
		}
		
		default:{
			System.err.println("Enter a valid number");
			break;
		}
		}
	}
}
}