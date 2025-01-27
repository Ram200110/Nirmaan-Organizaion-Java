package day4;

import java.util.Scanner;

public class teacherui {
	public static void main(String[] args) {
		teacher th = new teacher();
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		while(bo) {

			System.out.println("Enter your choice :");
			System.out.println("1 for Add Teacher detils  :");
			System.out.println("2 for ");
			System.out.println("3 for show :");
			System.out.println("0 for end");
			int key = sc.nextInt();


			if (key==1){
				System.out.println("Enter Techer ID : ");
				int id = sc.nextInt();
				System.out.println("Enter Teacher name  : ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Class name : ");
				String classname = sc.nextLine();
				System.out.println("Teacher number: ");
				long number = sc.nextLong();
				System.out.println("Enter the Salary : ");
				double salary = sc.nextInt();	

				th = new teacher(id, name, classname, number, salary);

			}else if(key ==3) {
				System.out.println(th);
			}
			else if (key ==2) {
				System.out.println("Enter book ID : ");
				int id = sc.nextInt();
				th.setId(id);
				sc.nextLine();
				
				System.out.println("Enter teacher name  : ");
				String name = sc.nextLine();
				th.setName(name);

				
				System.out.println("Class name : ");
				String Classname = sc.nextLine();
				th.setClassname(Classname);
				
				System.out.println("Enter the price : ");
				int price = sc.nextInt();
				th.setSalary(price);
			}
			else if (key ==0) {
				bo = false;
				System.out.println("Operation Ended");
			}


		}
	}
}
