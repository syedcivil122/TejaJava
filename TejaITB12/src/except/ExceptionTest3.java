package except;
import oops.Test;

public class ExceptionTest3 {
	
	public void test() {
		System.out.println("start");
		try {
			int i =10;
			int j = 0;
			int k = i/j;
			System.out.println(k);
		}catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
//		}catch (RuntimeException e) {
//			System.out.println("runtimeexception");
//			e.printStackTrace();
//		}catch (Exception e) {
//			System.out.println("exception");
//			e.printStackTrace();
//		}catch (Throwable e) {
//			System.out.println("throwable");
//			e.printStackTrace();
		}
		System.out.println("end..");
		
	}
	public static void main(String[] args) {
		ExceptionTest3 e1=new ExceptionTest3();
		e1.test();
	}

}
