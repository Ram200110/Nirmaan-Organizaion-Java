package day4;

public class student {
	private int id;
	private String name;
	private String classname;
	private long number;
	private double cgpa;
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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", classname=" + classname + ", number=" + number + ", cgpa="
				+ cgpa + "]";
	}
	public student(int id, String name, String classname, long number, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.classname = classname;
		this.number = number;
		this.cgpa = cgpa;
	}
	
	public student() {
		
	}

}
