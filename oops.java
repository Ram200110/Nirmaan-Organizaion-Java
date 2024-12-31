package day6;

public class oops {
	String name;
	String id;
	long phone;
	float salary;
public static void main(String[] args) {
	oops emp1 = new oops();
	oops emp2 = new oops();
	
	emp1.name="Ashok";
	emp1.id="A001";
	emp1.phone=12345678910l;// use l in the last value of date.
	emp1.salary=25.000f;
	
	System.out.println(emp1.name);
	
	
	emp2.name="Bala";
	emp2.id="A002";
	emp2.phone=12345678888l;
	emp2.salary=25.000f;
	
	System.out.println(emp2.name);
	
	oops emp3 = new oops();
	emp3.name="Chandru";
	emp3.id="A003";
	emp3.phone=12345678888l;
	emp3.salary=25000.5f;
	
	System.out.println(emp3.name);
	
	oops emp4 = new oops();
	emp4.name="Elango";
	emp4.id="A004";
	emp4.phone=12345678888l;
	emp4.salary=25.000f;
	
	System.out.println(emp4.name);
	
	oops emp5 = new oops();
	emp5.name="Fazil";
	emp5.id="A005";
	emp5.phone=12345678888l;
	emp5.salary=25000.5f;
	
	System.out.println("Employee name: "+emp5.name+"\n"+emp5.id+"\n"+emp5.phone+"\n"+emp5.salary);
	
}
}
