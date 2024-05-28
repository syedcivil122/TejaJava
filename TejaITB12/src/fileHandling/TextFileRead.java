package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
	public static void main(String[] args) throws IOException {
		
File file=new File("C:\\Users\\User\\OneDrive\\Documents\\test.txt");
FileReader read=new FileReader(file);
BufferedReader br = new BufferedReader(read);
		
      String line=br.readLine();
               
      while(line!=null) {
    	  System.out.println(line);
    	  line=br.readLine();
      }
               
         br.close();
         read.close();
               
       
	}

}
