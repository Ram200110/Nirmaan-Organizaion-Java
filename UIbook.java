package day4;

import java.util.Scanner;

public class UIbook {
	public static void main(String[] args) {
		book b1 = new book();
		Scanner sc = new Scanner(System.in);

boolean bo = true;
		while(bo) {

			System.out.println("Enter your choice :");
			System.out.println("1 for Add book detils  :");
			System.out.println("2 for ");
			System.out.println("3 for show :");
			System.out.println("0 for end");
			int key = sc.nextInt();

			if(key==1) {
				System.out.println("Enter book ID : ");
				int id = sc.nextInt();
				System.out.println("Enter book name  : ");
				String bname = sc.nextLine();
				sc.nextLine();
				System.out.println("Aurthor name : ");
				String aname = sc.nextLine();
				System.out.println("Enter the price : ");
				int price = sc.nextInt();
				b1 = new book(id, bname, aname, price);

			}else if (key==2) {
				
				System.out.println("Enter book ID : ");
				int id = sc.nextInt();
				b1.setId(id);
				
				System.out.println("Enter book name  : ");
				String bname = sc.nextLine();
				b1.setBname(bname);
				sc.nextLine();
				
				System.out.println("Aurthor name : ");
				String aname = sc.nextLine();
				b1.setAname(aname);
				
				System.out.println("Enter the price : ");
				int price = sc.nextInt();
				b1.setPrice(price);

			}else if (key ==3 ){
				System.out.println(b1);
			}else if (key ==0) {
					bo = false;
					System.out.println("Operation Ended");
			}
			else {
				System.err.println("invalid");
				
			}
		}	

	}
}


