package multi;

public class CustomerImp {
	public static void main(String[] args) throws InterruptedException {
		Customer c=new Customer();
		new Thread() {
			@Override
			public void run() {
				try {
					c.withdraw(10000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();	
				}
				
			}
		}.start();
		
		
		
	}

}
