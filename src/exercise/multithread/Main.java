package exercise.multithread;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Hello ");

		M m=new M();
		m.start();
		
		R r=new R();
		Thread thread=new Thread(r);
		thread.start();      
		

		System.out.println("hii");
		System.out.println("vinoth");
		System.out.println("how");
		System.out.println("are");
		System.out.println("you?");
	}
}
