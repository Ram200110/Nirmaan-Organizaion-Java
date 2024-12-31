package day6;

public class calci {
	int FN;
	int SN;
	void add() {
		System.out.println("Adddition of 2 numbser : "+(FN+SN));
	}
	void sub() {
		System.out.println("sub of 2 numbser : "+(FN-SN));
	}
	void mul() {
		System.out.println("mul of 2 numbser : "+(FN*SN));
	}void div() {
		System.out.println("div of 2 numbser : "+(FN/SN));
	}
	void moduls() {
		System.out.println("moduls of 2 numbser : "+(FN%SN));
	}
public static void main(String[] args) {
	
	calci value = new calci();
	
	value.FN= 10;
	value.SN= 20;
	
	value.add();
	value.mul();
	value.div();
	value.moduls();
	value.mul();

	
	
}
}
