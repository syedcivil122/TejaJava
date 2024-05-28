package except;

public class ExceptionsTest6 {
	//if no exception - try & finally block will execute
	//if exception -  catch & finally block will execute
	
	public int test() {
		try {
			int i=100;
			int j = 0;
			int k = i/j;
			System.out.println(k);
			System.out.println("try block");
			return 25;
		}catch (Exception e) {
			System.out.println("cach block");
			return 30;
//			e.printStackTrace();
		}finally {
			System.out.println("finally block");
			return 40;
		}
	}
	
	public static void main(String[] args) {
		ExceptionsTest6 et = new ExceptionsTest6();
		System.out.println(et.test());
	}

}
