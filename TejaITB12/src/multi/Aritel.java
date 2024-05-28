package multi;

public class Aritel extends Thread { // 1) extends the Thread
	
	@Override
	public void run() {// 2)override run()
		for(int i=0;i<10; i++) {
		System.out.println("Thread - "+Thread.currentThread().getId());
	  }
	}
	public static void main(String[] args) {
		Aritel a=new  Aritel();//3) create object of class Aritel
		
		Thread t1=new Thread(a);//4) create object of class Thread
		       t1.start();//5) call start(); to start the thread
		       
		Thread t2 = new Thread(a);
		       t2.start();
		
	}

}
