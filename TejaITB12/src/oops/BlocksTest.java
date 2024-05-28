package oops;

public class BlocksTest {
	public BlocksTest() {
		System.out.println("constructor");	
	}
	
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		BlocksTest bt=new BlocksTest(); // object creation
	}
}
