package except;

public class ExceptionsTest5 {
	
	public void test1() throws InterruptedException {
		System.out.println("start");
		Thread.sleep(2000);
		System.out.println("end");
	}
	
	public void test2() throws InterruptedException {
		System.out.println("test2");
		test1();
	}
	
	public void test3() throws InterruptedException {
		System.out.println("test3");
		test2();
	}
	public static void main(String[] args) throws InterruptedException {
		ExceptionsTest5 ex=new ExceptionsTest5();
		ex.test3();
		
	}

}
