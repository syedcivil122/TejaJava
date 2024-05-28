package multi;

public class Zomato implements Runnable{

	@Override
	public void run() {
		order();
	}
	
	public static synchronized void order() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread -"+Thread.currentThread().getId());
		}
	}
	
	public static void main(String[] args) {
		Zomato z1=new Zomato();
		       
	    Thread t1=new Thread(z1);
	           t1.start();
	           
        Thread t2=new Thread(z1);
        t2.start();
        
        Zomato z2=new Zomato();
        
        Thread t3=new Thread(z2);
               t3.start();
        Thread t4=new Thread(z2);
               t4.start();
	}

}
