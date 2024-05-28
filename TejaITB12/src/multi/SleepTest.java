package multi;

public class SleepTest extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	public static void main(String[] args) {
		SleepTest st=new SleepTest();
		Thread t=new Thread(st);
		           t.start();
	}

}
