package assignment4;

import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class uibank {
	public static void main(String[] args) {
		banktemp bank = new banktemp();
		Scanner sc = new Scanner (System.in);
		boolean bo = true;
		System.out.println("Enter the pin:");
		int p = sc.nextInt();//2001
		if(p == bank.getPin()) 
			while (bo) {
				{
			System.out.println("Enter 1 to add the ammount:");
			System.out.println("Enter 2 to withdraw the ammount:");
			System.out.println("Enter 3 to display:");
			System.out.println("Enter 0 to End");
			int key=sc.nextInt();
				switch (key) {

				case 1: {
					System.out.println("Enter the ammount");
					double ammount =sc.nextDouble();
					bank.setBalance(bank.getBalance()+ammount);
					break;					

				}
				case 2:{
					System.out.println("Enter the ammount to withdraw");
					double ammount = sc.nextDouble();
					if (ammount<=bank.getBalance()) {
					bank.setBalance(bank.getBalance()-ammount);
					System.out.println(ammount+"Withdrawl sucessfully");
					System.out.println("Balance"+bank.getBalance());
					}else {
						System.out.println("Insufficient balance");
					}
					break;

				}
				case 3:{
					System.out.println(bank);
					break;
				}
				case 0:{
					bo = false;
					System.err.println("Operation Ended");
					break;
				}

				}	
			}
		}else {
			System.err.println("In correct");
		}
	}

}
