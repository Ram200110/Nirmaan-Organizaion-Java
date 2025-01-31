package inheritance;

import java.util.Scanner;

public class calc implements calculator {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("add:"+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("sub:"+(a-b));
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("mul:"+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("div:"+(a/b));
		
	}

	@Override
	public void modlu(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("modlu:"+(a%b));
		
	}
	public static void main(String[] args) {
		calc c = new calc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int a= sc.nextInt();
		System.out.println("Enter 2 num");
		int b= sc.nextInt();
		c.add(a, b);
		c.sub(a, b);
		c.mul(a, b);
		c.div(a, b);
		c.modlu(a, b);
	}
	

}
