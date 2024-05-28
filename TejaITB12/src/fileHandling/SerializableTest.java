package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *  Serilization and Coneable both interfaces are marker interfaces
 */
public class SerializableTest {
	public static void main(String[] args) throws IOException {
		Customer c =new Customer(12, "syed", 123);
		
	FileOutputStream fos= new FileOutputStream("C:\\Users\\User\\OneDrive\\Documents\\customer.txt");
	
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	                   oos.writeObject(c);
	                   oos.close();
	                   fos.close();
	         System.out.println("Customer data serilized successfully");
	
	}
	
	

}
