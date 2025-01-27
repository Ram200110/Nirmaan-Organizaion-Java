package day4;

public class teacher {
private int id;
private String name;
private String classname;
private long number;
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public teacher(int id, String name, String classname, long number, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.classname = classname;
	this.number = number;
	this.salary = salary;
}
public teacher() {

 

}
@Override
public String toString() {
	return "school [id=" + id + ", name=" + name + ", classname=" + classname + ", number=" + number + ", salary="
			+ salary + "]";
}


}