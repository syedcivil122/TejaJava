package multi;

public class BlockTest implements Runnable {

	@Override
	public void run() {
		 
		for(int i=0; i<10; i++) {
			System.out.println("loop1 - "+Thread.currentThread().getId());
			
		}
		synchronized (this) {
			for(int i=0; i<10; i++) {
				System.out.println("loop2 - "+Thread.currentThread().getId());
				}
		
	}
	

}
	public static void main(String[] args) {
		BlockTest b=new BlockTest();
		 Thread t=new Thread(b);
		        t.start();
		 
		 Thread t1=new Thread(b);
		        t1.start();
	}
}
