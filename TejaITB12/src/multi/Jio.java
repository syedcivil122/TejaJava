package multi;

public class Jio implements Runnable {//execute run() method - running state

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		
		 try {
			Thread.sleep(2000); //waiting state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
// completion of run() execution - add state
		
}
	public static void main(String[] args) {
		Jio j=new Jio();
		
		Thread t=new Thread(j); //born state - creating a thread object
		       t.start(); // calling start(); - runnable state
		       }
}