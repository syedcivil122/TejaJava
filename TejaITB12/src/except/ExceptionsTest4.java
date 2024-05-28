package except;

public class ExceptionsTest4 {
	
	// we can't add child exception in catch blocks after adding parent class
	public void test() {
		System.out.println("starts");
		try{int a= 100;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		}catch (Exception e) {
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("ends");
	}
	
	public static void main(String[] args) {
		ExceptionsTest4 ca = new ExceptionsTest4();
		ca.test();
	}

}
