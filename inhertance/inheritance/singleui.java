package inheritance;

public class singleui {
public static void main(String[] args) {
	
	
	
	// single 
	vehicle v = new vehicle();
	v.startEngine();
	
	//multilevel
	Car c= new Car();
	
	Electriccar E = new Electriccar();
	E.chargeBattery();
	E.drive();
	
	//hierarchical
	Bike b= new Bike();
	
	b.startEngine();
	b.kickstart();
	
		
	
}
}
