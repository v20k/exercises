package exercise.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Patterns {

	private void pattern() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
//
//		System.out.println("Enter the columns");
//		int columns = sc.nextInt();
		
		System.out.println(Math.floor(2.5)+"\n"+Math.round(5/2)+
				"\n");
		int k=0;
		for(int i=1;i<=rows;i++,k=0) {
//			System.out.println(k);
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
	}
	
	private void triangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int input = sc.nextInt();
		int k=0;
		for (int i=1; i <=input; i++,k=0) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			while(k!=(2*(input-i)+1)) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
		
	}
	
	private void downSteps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows");
		int input = sc.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private void upStairs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of rows");
		int input = sc.nextInt();
		sc.close();
		for(int i=1;i<=input;i++) {
			for(int j=input;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private void rightPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int input = sc.nextInt();
		for(int i=0;i<=input/2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=(input/2)+2;i<=input;i++) {
			for(int j=i;j<=input;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	
	
	public static void main(String []args) {
		
		Patterns patterns = new Patterns();
//		patterns.pattern();
//		patterns.triangle();
//		patterns.downSteps();
//		patterns.upStairs();
//		patterns.rightPattern();
//		patterns.triangle1();
//		patterns.palindrome();
		patterns.anagram();
//		patterns.reversingNumber();
	}
	
	private void triangle1() {
		Scanner sc=new Scanner(System.in);
		
		                
		System.out.println(5/2+" "+5/2.0+" "+Math.floor(2.8)+" "+Math.round(2.8));     
//floor is used to convert double to integer-double 
		
		
		//(5/2                           = 2)               
		//(5/2.0 =2.5 => Math.floor(2.5) = 2.0)  
		               //Math.round(2.3) = 2   
                       //Math.round(2.5) = 3  
		
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=(rows-i);j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	Scanner sc=new Scanner(System.in);
	
	private void palindrome() {
		System.out.println("Enter the word");
		String word = sc.next();
		
		StringBuffer s=new StringBuffer(word);
		StringBuffer ss = s.reverse();
		String sss=new String(ss);
		System.out.println(ss+"  right");
		  String c = (word.equals(sss))?"palindrome":"non-palindrome";
		 System.out.println(c+"   bbbbbbbbbbbbbbbbbbbbbb");
		 
		char[] letters = word.toCharArray();
		for(int i=0;i<letters.length/2;i++) {        //5/2=2   ->  0,1,2,3,4
//			System.out.println(i);
			char a=letters[i];
		   System.out.println(letters[i]=letters[letters.length-(i+1)]);
		   System.out.println( letters[letters.length-(i+1)]=a);
		   System.out.println(Arrays.toString(letters));
		}
//		String newWord = letters.toString();
		String string = String.valueOf(letters);
		System.out.println(word+" "+String.valueOf(letters));
		
		if(word.equals(string)) {
			System.out.println("The Given word is Palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
		
	}
	
	private void anagram() {
		System.out.println("Enter the first word");
		String word1 = sc.next();
		System.out.println("Enter the second word");
		String word2 = sc.next();
		
		char[] c1 = word1.toCharArray();
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		
		char[] c2 = word2.toCharArray();
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.toString(c1).equals(Arrays.toString(c2))) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	
	private void reversingNumber() {
		System.out.println("Enter a number");
		long l = sc.nextLong();
		String s = String.valueOf(l);
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rsb = sb.reverse();
		String rs=new String(rsb);
		long pl = Long.parseLong(rs);
		System.out.println(pl);
	}
}

