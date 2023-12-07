package exercise.equals;

import java.io.IOException;
import java.util.Scanner;

public class Equals {
	
	static  void  v() throws IOException   {
		System.out.println("hii");
		boolean a=true;
		if(a) {
			throw new IOException();
	}
//		throw new IOException();
	}
	
	public void pattern() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int r=sc.nextInt();
		int f=1;
		for(int i=1;i<=r;i++,f=1) {
		for(int j=r;j>i;j--) {
			System.out.print(" ");
		}
		while(f<=((2*i)-1)) {
			System.out.print('*');
			f++;
		}
		System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) throws IOException  {
		
//		int a=5;
//		int b=5;                     //5=a,b
//		
//		String s="hello";             //"hello"=a,b
//		String ss="hello";    
//		//true only because it is in String constant pool area
//		
//		String y=new String("yellow");  //y=yellow
//		String z=new String("yellow");  //z=yellow
//		
//		System.out.println((a==b) +" "+ (s==ss));  //true true
//		System.out.println(s.equals(ss));          //true
//		System.out.println(y==z);                
//		System.out.println(y.equals(z));
//		
//		System.out.println(ss.equals(z));
//		v();
//		ArithmeticException n = new ArithmeticException("hello");
//		throw n ;
		Equals e=new Equals();
	    e.pattern();	
		
		
	}
	
}
