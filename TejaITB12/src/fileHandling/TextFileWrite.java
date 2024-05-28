package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextFileWrite {
	// Write the data in txt file
//	public static void main2(String[] args) throws IOException {
//		
//File file=new File("C:\\Users\\User\\OneDrive\\Documents\\test.txt");
//FileWriter writer = new FileWriter(file); // we can the content in the file
//BufferedWriter bw=new BufferedWriter(writer);
//               bw.write("Your Java Stop");
//               bw.newLine();
//               bw.write(" SR Nagar");
//               bw.newLine();
//               bw.write("123456778");
//            System.out.println("file created successsfully");
//            bw.close();
//            writer.close();
//
//
//	}
	
	// read the txt file data
		public static void main1(String[] args) throws IOException {
			
	File file=new File("C:\\Users\\User\\OneDrive\\Documents\\test.txt");
	FileReader read=new FileReader(file);
	BufferedReader br = new BufferedReader(read);
			
	      String line=br.readLine();
	               
	      while(line!=null) {
	    	  System.out.println(line);
	    	  line=br.readLine();
	    	  System.out.println(br.readLine());
	      }
	      
	               
	         br.close();
	         read.close();
	
	        

		}
		// Deleting the txt file
		public static void main(String[] args) throws IOException {
			
			File file=new File("C:\\Users\\User\\OneDrive\\Documents\\test.txt");
			         boolean   filedeleting    =file.delete();
					
			         if(filedeleting) {
			        	 System.out.println("file deleting sucess");
			         }else {
			        	 System.out.println("file is not deleted");
			         }
			
			        

				}


}


