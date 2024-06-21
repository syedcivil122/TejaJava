package vairables;

public class Calculations {
	
	public int sum() {  // instance method
		int i=10; // local variables
		int j=20;
		int k=i+j;  // 10+20 = 30
		return k;   // 30
	}

	public double remaingBal() { // instance method
		double actualAmt =222.55;
		double transferredAmt = 100.45;
		double remainingAmt = actualAmt - transferredAmt; // 222.55 - 100.45
		return remainingAmt;
	}
	
	public String fullname() { // instance method
		String fname = "anad";
		String lname = "chon";
		String fullValue = fname + lname;
		return fullValue;
	}
	
	public void info() {
		System.out.println("This is information method..");
	}
	
	
	public static void main(String[] args) { // main method
		int id = 10; // local variable
		Calculations c1= new Calculations(); // object
		System.out.println(c1.sum());
		System.out.println(c1.remaingBal());
		System.out.println(c1.fullname());
		c1.info();
	}
}
