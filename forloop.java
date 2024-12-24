package kishore;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
//	for(int i= 0;i<10;i++) {
//		System.out.println(i);
//		
//	}
//	for(int i=10 ;i>0;i--) {
//		System.out.println(i);
//	}
	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a numer:");
//	int n = sc.nextInt();
//	
//	for(int i = 1; i<=10;i++ ) {
//		System.out.println(n+"x"+i+"="+n*i);
//	}
	
//	for(int i = 1; i<=10;i++ ) {
//if(i%2==0) {
//	
//	System.out.println("kishore");
//	
//}
//else {
//	System.out.println(i);
//}
//}

//continue	
//	for(int i = 1; i<=10;i++) {
//if(i%5==0) {
//	continue;
//}
//else {
//	System.out.println(i);
//}
//}
//	
//	for(int i =1;i<=5;i++) {
//		for(int j = 1;j<=5;j++) {
//			System.out.print("* ");
//		}
//		System.out.println(" ");
//	}
	
	for(int i =1;i<=5;i++) {
	for(int j = 1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	
}
}