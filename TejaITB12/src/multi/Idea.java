package multi;

public class Idea implements Runnable{
	
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Thread -"+Thread.currentThread().getId());
		}
	}
	public static void main(String[] args) {
		Idea i=new Idea();
		
		Thread t1=new Thread(i);
		       t1.start();
		
	    Thread t2=new Thread(i);
	           t2.start();
	}
	

}
