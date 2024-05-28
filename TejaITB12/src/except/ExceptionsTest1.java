package except;

public class ExceptionsTest1 {
	
	// when
	public void arithmatic() {
		System.out.println("arithmatic start..");
			
		try {
		int i=10;
		int j =0;
		int k = i/j;   //10/0 = infinity
		System.out.println(k);
		}catch(ArithmeticException e) {
			e.printStackTrace();  // will print the exception
			
		}
		System.out.println("arithmatic end...");
	}
	
	//when we are trying to access index which is not present
	public void arrayIndex() {
		System.out.println("start array index");
		try {
			int []arr= {2,3,4,5,8};
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("end array index");
	}
	
	public void nullPointer() {
		System.out.println("start nullpointer");
		
		try {
			Integer i =null;
			int j = 20;
			int k = i+j;
			System.out.println(k);
		}catch(NullPointerException e) {
			   e.printStackTrace();
			
		}
		System.out.println("ends nullpointer");
		
	}
	
	public void test() {
	
	
		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
		System.out.println("line 4");
		System.out.println("line 5");
		try {
		int i = 10/0;
		System.out.println(i);
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}
		System.out.println("line 6");
		System.out.println("line 7");
		System.out.println("line 8");
		System.out.println("line 9");
		System.out.println("line 10");
		System.out.println("line 11");
		System.out.println("end");
		
	}
	
	public void numberFormat() {
		System.out.println("number format start");
		
		try {
			String s = "syed123";
			Integer i = Integer.valueOf(s);
			System.out.println(i);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("number format ends");
	}
	
	public void checkedException() {
		System.out.println("checkes exception start");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("check exception end..");
		
	}
	public static void main(String[] args) {
		ExceptionsTest1 e=new ExceptionsTest1();
		                //e.arithmatic();
		                //e.arrayIndex();
		                 // e.nullPointer();
		                 // e.numberFormat();
		                  //e.test();
		                  e.checkedException();
		}
	

}
