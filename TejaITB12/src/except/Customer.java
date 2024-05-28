package except;

public class Customer {
	
	int bal=1000;
	int bill = 1500;
	public void billing() {
		
		if(bal>bill) {
			System.out.println("transaction sucess");
		}else {
			System.out.println("transaction failed");
//			throw new InsufficcientFundException()
			throw new InsufficientFundsException("no funds, top up to use");
       }
	}
	
	public static void main(String[] args) {
		Customer c1=new Customer();
		          c1.billing();
	}

}
