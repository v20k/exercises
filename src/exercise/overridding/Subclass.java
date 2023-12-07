package exercise.overridding;


public class Subclass extends Overridding{

	 public int method(String a) {
		System.out.println("subclass");
		return 6;
	}
	
	public void method(int a) {
		System.out.println(a);
		this.method();
	}
	
	public static void main(String[] args) {
//		Overridding o=new Overridding();
//		o.method();
//		Subclass s=(Subclass) o;
//		Overridding oo=s;
//		s.method();
		
		Subclass s=new Subclass();
		Overridding oo=s;
		oo.method("j");
		Subclass ss=(Subclass) oo;
		ss.method();
		ss.method(6);
		
	}
}
