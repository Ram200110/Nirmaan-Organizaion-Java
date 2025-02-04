package interfac;

public interface calculator1 {
void add(int a ,int b);
	void div(int a,int b);
	void modul(int a,int b); 
		
	static void st() {
		System.out.println("static hi .....");
	
	}
	
	//default 
	
	default void de() {
		System.out.println("this is default...");
	}
}
