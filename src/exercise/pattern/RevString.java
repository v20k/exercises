package exercise.pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevString {
	public void dupArray() {
		int []a= {1,2,1,1,1};
		List<Integer> aa =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
		aa.add(a[i]);
		}
		System.out.println(aa);
		
		
		
		
		for(int i=0;i<aa.size();i++) {
			for(int j=i+1;j<aa.size();j++) {
				if(aa.get(i)==aa.get(j)) {
					System.out.println("Size is "+aa.size());
					System.out.println(aa.get(j));
					aa.remove(j);
					System.out.println("-----"+aa.size());
					System.out.println(aa);
					j--;
				}else {
					System.out.println(aa.get(i)+"!equalto"+aa.get(j));
				}
				
			}
		
		}
		System.out.println(aa);
		
		Object[] s = aa.toArray();
	System.out.println("Array is "+ Arrays.toString(s));
		
		
//		Iterator<int[]> aaa = aa.iterator();
//		while(aaa.hasNext()) {
//			
//		}
		
		
		
//		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {

//		String s="hello";
//		char []c=s.toCharArray();
//		for(int i=0;i<c.length/2;i++) {
//		char temp=c[i];
//		c[i]=c[c.length-1-i];
//		c[c.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(c));
//		String revString=String.valueOf(c);
//		System.out.println(revString);
		
		RevString rS=new RevString();
		rS.dupArray();
	}

}
