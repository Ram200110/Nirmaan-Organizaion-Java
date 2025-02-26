package multithreading;

class nool extends Thread{//class name and extends thread
	//void show() {method
	public void run() {//alwas create  a run function when creating thread
		for (int i = 1;i<=10;i++) {
			System.out.println("First thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class nool2 extends Thread{
	public void run() {
		for (int i = 1;i<=5;i++) {
			System.out.println("second thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class nool3 extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("thread three...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class threading {
	public static void main(String[] args) {

		nool t = new nool();//creating a object for  a class
		nool2 t2 = new nool2();
		nool3 t3 = new nool3();
		//general to access the method inside the clas
		//t.run();

		// setpriority to set which is important and to get more resources
		t.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(10);
		//start the thread
		t.start();
		t3.start();
		t2.start();
	}
}
