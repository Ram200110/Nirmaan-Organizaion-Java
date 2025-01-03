package day9;

public class constructor {
int  id;
String name;

 constructor (int number,String modelname){
	 id = number;
	 name = modelname;
}
 
 constructor(){
	 
	 
 }

 public static void main(String[] args) {
	constructor car  = new constructor(1001,"Tesla");
	
	System.out.println("car id: "+car.id+" car name :"+car.name);
	
	constructor car1 = new constructor();
	car1.id=1002;
	car1.name="BMW";
System.out.println("car id: "+car1.id+" car name :"+car1.name);	
	
}
	
}
