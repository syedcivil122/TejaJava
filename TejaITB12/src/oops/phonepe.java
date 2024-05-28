package oops;

public interface phonepe {

	//which hide the data
	//interface allows only abstract methods
	public void ticketBooking(); //declaration
	
	public static final int id=10;
	
	public phonepe() {
		//we can't create constructor
	}
	
	{
		//we can't create instance block
	}
	
	static {
		//we can;t create static blocks
	}
	public static void main(String[] args) {
		phonepe ph=new phonepe(); //we can;t create object for interface
	}
	
}
