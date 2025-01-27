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
			String name = sc.next();
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
			
			System.out.println("Enter 1 to change ID");
			System.out.println("Enter 2 to change NAME");
			System.out.println("Enter 3 to change CLASS NAME");
			System.out.println("Enter 4 to change STUDENT NUMBER");
			System.out.println("Enter 5 to change C.G.P.A");
			System.out.println("Enter which should update");
			int a = sc.nextInt();
			if (a==1) {
			System.out.println("Enter Student ID : ");
			int id = sc.nextInt();
			st.setId(id);
			}else if (a==2 ) {
			
			System.out.println("Enter Student name  : ");
			String name = sc.next();
			st.setName(name);
			}
			else if (a==3) {
			System.out.println("Class name : ");
			String classname = sc.next();
			st.setClassname(classname);
			}
			else if (a==4) {
			System.out.println("Student number: ");
			long number = sc.nextLong();
			st.setNumber(number);
			}
			else if (a==5) {
			System.out.println("over all CGPA Mark : ");
			double cgpa = sc.nextDouble();
			st.setCgpa(cgpa);
			}
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