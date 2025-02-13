package kishore;


import java.util.ArrayList;
import java.util.Scanner;

public class bookui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		book b = new book();
		ArrayList<book> Arr = new ArrayList<book>();
		boolean bo = true;
		while (bo) {
			System.out.println("Enter 1 to add the book");
			System.out.println("Enter 2 to up date");
			System.out.println("Enter 3 to show");
			System.out.println("Enter 4 to Remove");
			System.out.println("Enter 0 to end");

			int key = sc.nextInt();

			if (key ==1) {

				System.out.println("Enter the Book Id");
				int bookId= sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Book Name :");
				String bookName= sc.nextLine();
				System.out.println("Enter the Aurthor Name :");
				String aurName= sc.nextLine();
				System.out.println("Enter the Book price :");
				double bookPrice = sc.nextDouble();
				b = new book(bookId, bookName, aurName, bookPrice);
				Arr.add(b);

			}else if(key == 2){
				System.out.println("Enter Book id to up date : ");
				int bookId = sc.nextInt();
				sc.nextLine();
				for (book bk : Arr) {
					if (bookId == bk.getBookId()) {

						System.out.println("Enter the Book name : ");
						String bookName = sc.nextLine();
						bk.setBookName(bookName);
						System.out.println("Enter Aurthor name :");
						String aurName = sc.nextLine();
						bk.setAurName(aurName);
						System.out.println("Book price :");
						double bookPrice = sc.nextDouble();
						bk.setBookPrice(bookPrice);
						break;
					}else {
						System.err.println("Enter a valid id");
					}
				}				

			}
			else if (key == 4) {
				System.out.println("Enter Book ID to remove");
				int bookId = sc.nextInt();
				sc.nextLine();
				for (book bk :Arr) {
					if(bookId == bk.getBookId()) {
						Arr.remove(bk);
						System.err.println("Book removed");
						break;
					}
						}
				}
			else if(key ==3 ){
				System.out.println(Arr);
			}
			else if(key == 0) {
				bo=false;
				System.err.println("Program Ended");
			}

		}
	}

}
