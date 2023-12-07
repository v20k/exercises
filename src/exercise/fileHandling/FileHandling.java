package exercise.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	 void file() {
//		 FileWriter f=null;
//		
//		  try {
//			f = new FileWriter("./vin.txt");
//			
//			System.out.println(f);
//			f.write(" vinoth ");
//			f.append("a");
//			f.flush();
////			f.close();
//			
//			
//			
//			
//			  File ff=new File("./vin.txt");
//			
////			  ff.setReadOnly();
////			  System.out.println(ff.delete());
//			
//			  Scanner sc=new Scanner(ff);
//			  String s=sc.nextLine();
//			  System.out.println(s);
////			while(sc.hasNext()) {
////				
////			}
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		 File ff=new File("./vin.Txt");
		 try {
			 //create
			 ff.createNewFile();
			
			 //write
			 FileWriter f=new FileWriter("./vin.Txt");
			 f.write("Hii Hello");
			 f.flush();  //or  f.close();
			 f.close();
			 
			 //read
			 Scanner sc=new Scanner(ff);
			 String s = sc.nextLine();
			 System.out.println(s);
			 sc.close();			 
			
			 
			 //delete
			                                   //can able to delete after only close();
			 System.out.println(ff.delete());  // if it is not deleted means, file is in open stage(processing)
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
						
	}
	
	public static void main(String[] args) {
		FileHandling f=new FileHandling();
		f.file();
	}

}
