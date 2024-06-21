package vairables;

public class Method2 {
	
	String firstname = "ch"; // instance variable
	public String name() {// instance method
		return "syed";
	}
	
	static double amt =123.34; // static variable 
	
	public static String lastname() {// static method
		return "arif";
	}
	
	public static void main(String[] args) {
		Method2 m=new Method2();
		System.out.println(m.name()); // objectreference.variablename
		System.out.println(m.firstname);// objectreference.Methodname
		
		System.out.println(Method2.amt); // classname.variablename
		System.out.println( Method2.lastname()); // classname.methodname
		
	}

}
