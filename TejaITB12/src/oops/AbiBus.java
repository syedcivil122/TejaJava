package oops;

public class AbiBus implements phonepe{

	@Override
	public void ticketBooking() {
		// implementation
		String customer = "chaitanya";
		int age = 22;
		long mobile = 123456789l;
		String from="hyderabad";
		String to="guntur";
		System.out.println("customer name: "+customer);
		System.out.println("age :"+age);
		System.out.println("mobile :"+mobile);
		System.out.println("location from :"+from);
		System.out.println("location to :"+to);
		//id=25; we can't create re-initilization variable
		System.out.println(phonepe.id);
		
	}
	
	public static void main(String[] args) {
		AbiBus ab=new AbiBus();
				ab.ticketBooking();
	}
	

}
