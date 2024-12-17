package day1;

public class Operator {
	public static void main(String[] arg) {
		System.out.println("Arithmetic Operations:   ");
		
		int a = 12;
		int b = 25;
		int c = 10;
		int d = 5;
		int e = 100;
		int f = 50;
		int g = 20;
		
		
		System.out.println("Addition:  "+(a+b));
		System.out.println("Subtraction:  "+(a-b));
		System.out.println("Multiplication:  "+(a*b));
		System.out.println("Division:  "+(a/b));
		System.out.println("Modulus:  "+(a%b));
		
		System.out.println("");
		System.out.println("Relatioal Operation");
		
		System.out.println(a+">"+b+" :" +(a>b));
		System.out.println("Lesser tha:  "+(a<b));
		System.out.println("Greater than or Equal to:  "+(a>=b));
		System.out.println("Less than or Equal to:  "+(a<=b));
		System.out.println("Equal to Equal:  "+(a==b));
		System.out.println("Not Equal to :  "+(a!=b));
		
		System.out.println("");
		System.out.println("Logical Operations");
		System.out.println(a+">"+c+" And "+b+"<"+f+ ":"+((a>c)&&(b<f)));
		System.out.println(a+"<"+d+" And "+b+">"+e+ ":"+((a<c)||(b>e)));
		
		System.out.println("");
		System.out.println("Assignment Operations");
		System.out.println("Inital value : "+c);
		System.out.println("After += : "+ (c+=12));
		System.out.println("After -= : "+ (c-=12));
		System.out.println("After *- : "+ (c*=12));
		System.out.println("After /= : "+ (c/=12));
		System.out.println("After %= : "+ (c%=2));
		
		
		System.out.println("");
		System.out.println("unary Operations");
		System.out.println("Inital value : "+a);
		System.out.println("After increment: "+(++a));
		System.out.println("After increment: "+(--a));
		  
			 
		System.out.println("");
		System.out.println("Conditional Operations");
		String  even = (a%2==0)?"even":"odd";
		System.out.println(a+" is " +even);
		String  odd = (d%2==0)?"even":"odd";
		System.out.println(d+" is " +odd);

		
		
		
		
	}

}
