package day4;

public class NumbersinReverse {
public static void main(String[] args) {
	
//	
//	//print 1 to 50 
//	 for(int i=0;i<=50;i++) {
//	System.out.println(i);
//}
//	
//	System.out.println("");
//	
//	
//	//print 50 to 1 
//	 for(int i=50;i>=0;i--) {
//	System.out.println(i);
//}
//	 
//	 System.out.println("");
	 
	 
	 //Task 2: Sum of Odd Numbers
	 //Write a program to calculate the sum of all odd numbers from 1 to 100. Display the result at the
	 //end
	int sum = 0;
	for (int j=1;j<=100;j++) {
		if (j%2!=0) {
			sum+=j;
			System.out.println(j);
		
	}		
}
	
	System.out.println(sum);
}
}