package oops;

public class FinalTest {
	int id=10; //initilization
	
	final int i=20; //declaration
	
	final String name ="java";
	public void test() {
		// i=30; //final variable we can't re-initilize
		id=45;
		System.out.println(i);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		FinalTest f1=new FinalTest();
		f1.test();
	}
	
	

}
