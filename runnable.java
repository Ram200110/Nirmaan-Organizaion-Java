package multithreading;

class class1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Rnnable example");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class class2 implements Runnable{
	public void run() {
		for (int i = 1;i<=10;i++) {
			System.out.println("Second runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class runnable {
public static void main(String[] args) {
	Runnable obj = new class1();//create a obj for runnable class1
	Runnable obj2 = new class2();// create a obj2 for runnable class 2
	
	//to access thread create a obj for thread and implement runnable obj 
	Thread nool2 = new Thread(obj2);//noll2 is thread obj name , obj 2 is runnable name 
	Thread nool1 = new Thread(obj);
	
	
	nool1.start();//start is only accessable using thread so create a obj for thread
	nool2.start();
}
}
