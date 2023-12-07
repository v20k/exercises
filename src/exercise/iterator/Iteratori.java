package exercise.iterator;



import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Iteratori {
	
	 

	public static void main(String[] args) {
		
	   List<String> name=new LinkedList<>() ;
	     name.add("vinoth");
	     name.add("4");
	     System.out.println(name);
	     name.add(1,"vasanth");
	     
	     System.out.println(name);
	    Iterator<String> iterator = name.iterator();
	    System.out.println("iterator"+" "+iterator);
	    while(iterator.hasNext()) {
	    	String value = iterator.next();
	    	System.out.println(value);
	    	System.out.println(iterator+" "+"going to remove");
	    	if(value.equals("vasanth")) {
	    	iterator.remove();
	    	System.out.println(iterator);}
	    	
	    }
	    System.out.println(name);
    }
	
}