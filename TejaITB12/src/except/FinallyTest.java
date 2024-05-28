package except;

public class FinallyTest {
	public void test() {
		try {
			// if no exception try block will execute
			int i =100;
			int j =0;
			int k =i/j; // exception
			System.out.println(k);
			System.out.println("try blok");
		}catch (Exception e) {
			//if execution comes catch block will execute
			System.out.println("catch block");
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		FinallyTest f=new FinallyTest();
		f.test();
	}

}
