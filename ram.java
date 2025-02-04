package interfac;

public class ram implements calculator1,calculator2 {
	
	public static void main(String[] args) {
		ram c = new ram();
		c.add(10, 20);
		calculator1.st();//static only use when we call the interface name 
		c.de();

	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}

	@Override
	public void modul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a%b);
		
	}

	

}
