package except;

public class StackOverFlowTest {
//	when we have a recursive method calling, then stack overflow error occurs.
	public void test1() {
		System.out.println("test1 method");
		test2();
	}
	public void test2() {
		System.out.println("test2 method");
		test3();
	}
	public void test3() {
		System.out.println("test3 method");
		test1();
	}
	
	public static void main(String[] args) {
		StackOverFlowTest st=new StackOverFlowTest();
		                   st.test1();
		                   //st.test2();
		                   //st.test3():
}
}
