package exercise.arrayString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayString {

	public static void array1() {
		String[] arr= {"hii",""};
		Array.set(arr, 1, "gvinoth");
		System.out.println(arr[0]);
		System.out.println(Array.get(arr, 0));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
	
		Integer[] a= {2,3,7,5,2,4,9,5,10,1};
		Integer[] b= {2,3,7,5,9,5,1};
		System.out.println(Arrays.compare(a, b));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 5));
		
//		Integer aaa=a;
		/* list------------------------------------------ */
		   List<Integer> aa = Arrays.asList(a);
		
		aa.forEach(System.out::println);
		
		System.out.println(aa);
		
//		System.out.println(a.toString());
		
		for(String s:arr) {
		
//			System.out.println(s);
		}
		
		char[] i= {'d','f','g'};
//		Integer.valueOf(i);
		String s = String.valueOf(i);
		System.out.println("cccccccccccccccccccccccc"+" "+s);//dfg
		Integer ii=5;
		ii.intValue();
		
		
//Array into List		       ////////////Arrays.asList(a)
//charArray into String	       ////////////String.ValueOf(a)   -> PrimitiveArray to Non-Primitive dataType
		    //otherwise forEach loop
		
//List into Array              ////////////a.toArray()
//List into String		       //////////////////////////using forEach loop
		
//String into Array            ////////////a.split('t')     or     a.toCharArray()
//String into(Array)into List  //////////////////////////Arrays.asList(a.toCharArray())
		                                                   // List <- Array <- String
	}
	
	public static void List1() {
		System.out.println("--------------List----------------");

		List a=new ArrayList<>();
		a.add(5);
		a.add(0, 4);
		System.out.println(a.set(0, 2));
		System.out.println(a);
		
		
		System.out.println("hello "+a.toString());
		
		String x="";
		for(Object aa:a) {
		 x += aa;
		}
		
		System.out.println(x);
		
		String s = a.toString();
		System.out.println(s);
		Object[] ss =  a.toArray();
//		System.out.println(ss);
		System.out.println(Arrays.toString(ss));
		
	}
	
	public static void String1() {
		System.out.println("--------------String---------------");
		String s=" assvinothkumar2";
		System.out.println(s);
		String[] x = s.split("t");
		System.out.println(Arrays.toString(x));
		System.out.println(s.toCharArray());
		char[] ss = s.toCharArray();
		System.out.println(Arrays.toString(ss));
		System.out.println(s.join(s, x));
		System.out.println(s.strip());     //removes white spaces before and after string
		System.out.println(s.trim());      //removes white spaces before and after string

	}
	

	
	//why we need args? To accept the command line arguments
	public static void main(String[] args) {
//		 array1();
//		 List1();
//		 String1();
		System.out.println("hii");
		for (String string : args) {             //args stores command line arguments
         //In command prompt
         //i.e.,[javac ArrayString.java]
         //     [ java ArrayString]        (if we give anything here, it will taken as command line argument)
//for example:  [ java ArrayString 1 2 3 ]
	                            // output will be 1 2 3
			System.out.println("hello"+string);
		}
		System.out.println("end");
	}
}
