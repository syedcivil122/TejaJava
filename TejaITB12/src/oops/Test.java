package oops;

public class Test extends Test2{
	
	int id = 10;// instance variable
	
	int i = 15;
	public void data() {
		int id = 20; // local variable
		System.out.println(id); //20
		System.out.println(id); //20
		System.out.println(id); //20
		
		System.out.println(this.id); //10 instance variable
		System.out.println(this.id); //10
		System.out.println(super.id); //66 super keywords is use for to call the same instance variable name
		System.out.println(k); //40 parent instance variable
		
		System.out.println(i); //15
	}
	
	public static void main(String[] args) {
		Test t1=new Test();
		t1.data();
	}

}
