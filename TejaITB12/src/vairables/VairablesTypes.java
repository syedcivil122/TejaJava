package vairables;
/*
 * Variables: 3 types
 * Local Variables:
 * --> declare in methode inside
 * --> we can access local vairables directly
 * --> local variable stored in stack memory
 * 
 * Instance Variables:
 * --> declare in method outside or class inside
 * --> by creating object we can access instance variables
 * --> instance vairables stored in Heap memory
 * 
 * Static Variables:
 * --> by adding static keyword to instance vairables we can make variables are static
 * -->  we can access classnmae.vairableName
 * --> static variables stored in stack memory
 */
public class VairablesTypes {
	String name = "Syed"; // instance vairable
	static double amt = 125.55; // if we are adding static keyword to instance type - static vairable
	
	public static void main(String[] args) {
		int id=10; //local vairables - method inside declaration
		System.out.println(id); // we can access local vairables direstly
		
		VairablesTypes v = new VairablesTypes();
		 System.out.println(v.name);// object refernce.vairablename
		 System.out.println(VairablesTypes.amt);// Classname.vairablename
	}

}
