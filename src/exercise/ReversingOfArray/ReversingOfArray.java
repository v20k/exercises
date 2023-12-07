package exercise.ReversingOfArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ReversingOfArray {
	
	public static void main(String[] args) {
//		int[] a= {5,1,2,3,4};
//		System.out.println(sort(a));
		
		ReversingOfArray r=new ReversingOfArray();
		System.out.println(r.recursionFactorial(5));
		r.fabb(9);
	}
	
	public void fabb(int finaal) {
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		while(b<finaal) {
			int c=a+b;  //0+1=1   //1+1=2
//			int temp=b;
			a=b;         //1       //2
			b=c;         //1       //1
			System.out.print(c+",");
		}
	}
	
	
	public static String sort(int[] b) {
		for(int i=0;i<b.length;i++) {
		 for(int j=i+1;j<b.length;j++) {
			 if(b[i]>b[j]) {
				 int temp=b[i];
				 b[i]=b[j];
				 b[j]=temp;
//				 System.out.println(Arrays.toString(b));
			 }
		 }
		}
		return Arrays.toString(b);
		
	}
	public ReversingOfArray() {
	   System.out.println("hello from constructor");
	}

	public void reversingOfArray(int[] a) {
		System.out.println(Arrays.toString(a));
		
		for (int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main1(String []args)   {
		
		int[] a= {4,5,78,21,2,34,65};
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.asList(Arrays.toString(a)));;
//		System.out.println(sort(a));
		
//		List as=new ArrayList<>();
//		for(int i=0;i<a.length;i++) {
//			as.add(a[i]);
//		}
//		
//		System.out.println(as);
		String[] s= {"hi","hello"};
		List as=Arrays.asList(s);
//		as.add("vanakam");
		
		String ss="ghjk yu vin";
		System.out.println('a'+'b');
		
		Iterator it = as.iterator();
		while(it.hasNext()) {
			 Object var = it.next();
//			if(var=="hi")
//			it.remove();
			
			System.out.println(var);
			
		}
		System.out.println(as);
		
		int[] b= {9,8,7,6,5,4,3,2,1,11};
		
		
		
		ReversingOfArray r=new ReversingOfArray();
		r.reversingOfArray(a);
		try {
			r.exceptionn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.fibnocci(50);
		r.factorial(0);
		System.out.println(r.recursionFactorial(0));
		String ssv="vinoth kumar";
		
		r.reversingAString(ssv);
		
//     primitive datatype into wrapper class
		int t=50;
	    //Integer tt = Integer.valueOf(t); //explicit
		Integer tt = t;                   //implicit
		System.out.println(tt==50);
		
//     primitive datatype into Non-primitive datatype		
		char c='E';
		 //boolean cc=true;
		int cc=4;
     	String v =String.valueOf(cc);
		
		System.out.println(v);
		
		
//      wrapper class into primitive datatype
		Integer m=45;
		//int mm = m.intValue();    //explicit
		int mm=m;                   //implicit
		System.out.println(mm);
		
//      Non-primitive datatype-Wrapper class-primitive datatype		
		String n="65";
		Integer nn = Integer.parseInt(n); //Non-primitive datatype into wrapper class
//		int nnn=nn;    
		int nnn=nn.intValue();
		System.out.println(nnn);
		
		palindrome("mom");
//		System.out.println(r.recursionPalindrome("vasanth"));
		r.recursionPalindromeMain("mam");
		
		anagrams("ram", "mra"); 
		
		int[] missingNumber= {2,3,5,1,7,4};
		r.missingNumberInNaturalNumbers(missingNumber);
		
		r.magicNumber(99999991);
	}


public void fibnocci(int finaal) {
	int a=0;
	int b=1;
	List as=new ArrayList<>();
	while(b<finaal) {
	                           //0,1,1,2,3,5
		 int temp=b;       //  c=a+b
		  b+=a;            //  a=b
		 a=temp;           //  b=c
	 
		 as.add(b);
//	 System.out.println(b);
	}
	System.out.println(as);
	Iterator it = as.iterator();
	while(it.hasNext()) {
		int val = (int) it.next();
		if(val>finaal) {
			it.remove();
		}
	}
	System.out.println(as);
	
	
}

public int factorial(int a) {
//  fact  : 0!=1
//	because 1!=1*0!
//	        1!=0!
//	        1 =0!
//	        0!=1
	int fac=1;
	for(int i=a;i>0;i--) {
		fac*=i;
	}
	System.out.println(fac);
	return fac;
}

public int recursionFactorial(int a) {
	if(a==0) return 1;
	return a*recursionFactorial(a-1);
	
}

public void exceptionn() throws Exception {
	throw new CustomException("my arithmetic exception");
}

public void reversingAString(String a) {
//	StringBuilder s=new StringBuilder(a);
//	System.out.println(s.reverse());
	
	char[] cc = a.toCharArray();
	for(int i=0,j=cc.length-1;i<cc.length/2;i++,j--) {
		char temp=cc[i];
		cc[i]=cc[j];
		cc[j]=temp;
	}
	System.out.println(String.valueOf(cc)+" 12345");
	
	
	
	
	
	char[] c=new char[a.length()];
//	String str=new String();
	for(int i=0,j=a.length()-1;i<a.length()/2;i++,j--) {
		c[i]=a.charAt(a.length()-1-i);
		c[j]=a.charAt(i);
//		str+=c[i];
	}
	System.out.println(Arrays.toString(c));
//	System.out.println(str);
	System.out.println(String.valueOf(c));    
	
	
}

public static void palindrome(String s) {
	
	char[] c = s.toCharArray();
	for(int i=0,j=c.length-1;i<c.length/2;i++,j--) {
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
	if(String.valueOf(c).equals(s)) {
		System.out.println("it is palindrome");
	}else {
		System.out.println("It is not a palindrome");
	}
}

public void recursionPalindromeMain(String a) {
	if(a.equals(recursionPalindrome(a))) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not a palindrome");
	}
	
	
}

public String recursionPalindrome(String a) {
	if(a.isEmpty()) {
		return a;
	}
	return a.charAt(a.length()-1) + recursionPalindrome(a.substring(0,a.length()-1));
	
	
}


public static void anagrams(String a,String b) {
	char[] c1 = a.toCharArray();
	char[] c2 = b.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1)+"\n"+Arrays.toString(c2));
	
	if(Arrays.toString(c1).equals(Arrays.toString(c2))) {
		System.out.println("It is an anagrams");
	}else {
		System.out.println("It is not an anagrams");
	}
	
}

public void missingNumberInNaturalNumbers(int[] a) {
	int n=a.length+1;
	int totalSum=(n*(n+1))/2;
	int actualSum=0;
	for(int i=0;i<a.length;i++) {
		actualSum+=a[i];
	}
	int missingNumber=totalSum-actualSum;
	System.out.println("Missing Number in Natural Number is " + missingNumber);
	
}

private void magicNumber(int a) {   //325 =>3+2+5=10 => 1+0=1

 int fac=0;

 while(a!=0) {
    
	fac+=a%10;            //fac=5        //5+2      //5+2+3
	a/=10;                //  a=32       //3        //0
	if(fac>9 && a==0 ) {
		 a=fac;
		 fac=0;
	 }
 }

 System.out.println(fac);
 if(fac==1) {
	System.out.println("It is a magic number");
 }else {
	System.out.println("It is not a magic number");
 }

}
}


@SuppressWarnings("serial")
class CustomException extends Exception {

	public CustomException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}