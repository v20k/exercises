package exercise.multithread;

public class M extends Thread{
	static {
		System.out.println("sssssssssssssssssssssssssssssssssssssss");
	}
	
	{
		System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}
	
	
	
	public void run() {
		System.out.println("static");
		System.out.println("initializers");
		System.out.println("is");
		System.out.println("it");
		System.out.println("ordered?");
		
	}
	

//	public void A()  {
//		System.out.println("AAA");
//		System.out.println("BBB");
//		System.out.println("CCC");
//	}
//	
//	public void B() {
//		System.out.println(111);
//		System.out.println(222);
//		System.out.println(333);
//	}
	
	
}
