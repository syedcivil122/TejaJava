package oops;

public abstract class NSE {
	
	//necessary - normal
	public void stockinfo() {
		System.out.println("TCS,infosys,hindalic,zomato,adani ports,jsw");
	}
	
	public void holidays() {
		System.out.println("aug -15,jan 16,dec 25");
	}
	
	public void IPO() {
		System.out.println("Swiggy,flipcart,tesla,amazon");
	}
	
	//un-necessary - abstract
	public abstract void brokercharges();
	
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}
	
	public NSE() {
		System.out.println("NSE constructor");
	}
	
	public static void main(String[] args) {
		//NSE n=new NSE();  we can't create object for abstract class
	}
	
}
