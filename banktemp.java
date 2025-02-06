package assignment4;

public class banktemp {

	private int pin=2001;
	private String name = "Ram";
	private double balance = 3000;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double balance) {
	     this.balance = balance; // Update balance with the new amount
		
	}
	@Override
	public String toString() {
		return "banktemp [name=" + name + ", balance=" + balance + "]";
	}
	public banktemp(int pin, String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public banktemp(){
	}

}
