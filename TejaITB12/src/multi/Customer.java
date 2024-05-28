package multi;

public class Customer {
	
	int bankbal = 5000;
	public synchronized void withdraw(int withdrawAmt) throws InterruptedException{
		System.out.println("customer came to withdraw amt");
		if(bankbal < withdrawAmt) {//5000 < 10000
			System.out.println("insufficient funds please wait for some time");
			wait();
		}
		bankbal = bankbal + withdrawAmt;
		System.out.println("customer withdraw is successfull");
	}
	public synchronized void deposite(int depositeAmt) {// syed - 20000
		System.out.println("customer came to deposit amount");
		bankbal = bankbal+depositeAmt;
		System.out.println("deposit success");
		System.out.println("notify customer");
		notify();
		//notifyAll();
	}

}
