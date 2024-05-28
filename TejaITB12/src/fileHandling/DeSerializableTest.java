package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\OneDrive\\Documents\\customer.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		       Object obj=ois.readObject();// read byte data to object
		  if(obj!=null) {
			  Customer c=(Customer)obj;
			  System.out.println(c.id+ "  " +c.name+"  "+c.CVV) ;
		  }
		  ois.close();
		  fis.close();
				
	}

}
