package oops;

public class Data2  extends Data1{
	
	@Override
	public void m1() {
		System.out.println("Data2 m1 method");
	}
	
	@Override
	public void m2(int id) {
		System.out.println("Data2 m2 method");
	}
	
	@Override
	public void m3() { // private methods we can't override
		System.out.println("Data2 m3 method");
	}
	
	@Override
	public void m4() { // final methods we can't override
		System.out.println("Data2 m4 method");
	}
	
	@Override
	public void m5() { // static methods we can't override
		System.out.println("Data2 m5 method");
	}
}
