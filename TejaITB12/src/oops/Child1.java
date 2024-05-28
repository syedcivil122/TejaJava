package oops;

public class Child1 extends Parent1{
	//super- parent
	//sub class - child
	
	@Override
	public void home() {
		System.out.println("Child home");
	}
	public void car() {
		System.out.println("Child car");
	}
	public static void main(String[] args) {
		//parent
		Parent1 p1=new Parent1();// we can access only parent data
			p1.home();
			p1.land();
		Child1 c1=new Child1();// we can access parent & child classes data
			c1.home();
			c1.car();
			c1.land();
		
			Parent1 p=new Child1();// we cant't access subclass specific methods
			p.home();
			p.land();
			
	}
}
