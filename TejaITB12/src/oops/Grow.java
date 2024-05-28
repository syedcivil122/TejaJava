package oops;

public class Grow extends NSE{

	@Override
	public void brokercharges() {
		System.out.println("Grow brokercharges 20/-");
		
	}
	
	public static void main(String[] args) {
		Grow g=new Grow();
		     g.brokercharges();
		     g.stockinfo();
		     g.holidays();
		     g.IPO();
	}

}
