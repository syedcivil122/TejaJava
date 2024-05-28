package multi;

public class Swiggy implements Runnable{

	@Override
	public synchronized void run() {//acquare a object level lock-s1 lock --t1  t2 t3
		//t2 - s1 lock
		//t3 - s1 lock
		//t1 - s1 lock
		for (int i=0; i<10; i++) {
			System.out.println("Thread -"+Thread.currentThread().getId());
		}
		//t2 release s1 lock
		//t3 release s1 lock
		//t1 release s1 lock
	}
	
	public static void main(String[] args) {
		Swiggy s1=new Swiggy();
		
		Thread t1=new Thread(s1);
		       t1.start();
		       
       Thread t2=new Thread(s1);
       t2.start();
       
       Thread t3=new Thread(s1);
       t3.start();

	}

}
