package oops;

public class Constructor1 {
	
	int i; // declaration
	
	int id=25; // initialization
	
	public void test() {
		i=35; // re-initialization
		System.out.println(id); //25
		System.out.println(i); //35
		
		id=75;
		System.out.println(id); //75
		
	}
	
	public void test1(int id) {
		
		System.out.println("test2 "+i); //test2 35
		System.out.println(id); //22
		i=id;
		System.out.println(i); //22
	}
	
	public static void main(String[] args) {
		Constructor1 c1=new Constructor1();
		c1.test();
		c1.test1(22);
	}

}
