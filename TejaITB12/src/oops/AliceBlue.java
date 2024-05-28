package oops;

public class AliceBlue extends NSE {

	@Override
	public void brokercharges() {
		System.out.println("AliceBlue broker charges 15/");
		
	}
	
	public static void main(String[] args) {
		AliceBlue a=new AliceBlue();
		          a.brokercharges();
		          a.stockinfo();
		          a.holidays();
		          a.IPO();
	}

}
