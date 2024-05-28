package except;

public class ExceptionsTest2 {
	public void test() {
		System.out.println("start......");
		try {
		int i = 100;
		int j =0;
		int k = i/j;
		System.out.println(k);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end.......");

	}
public static void main(String[] args) {
	ExceptionsTest2 e1=new ExceptionsTest2();
	e1.test();
}
}
