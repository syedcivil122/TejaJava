package oops;

public class Dhan extends NSE{

	@Override
	public void brokercharges() {
		System.out.println("Dhan broker charges 10/");
		
	}
	
	public static void main(String[] args) {
		Dhan d=new Dhan();
		     d.brokercharges();
		     d.stockinfo();
		     d.holidays();
		     d.IPO();
	}

}
