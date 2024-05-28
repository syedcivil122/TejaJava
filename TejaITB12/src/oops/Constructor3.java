package oops;

public class Constructor3 {
	
	int id; // declaration
	String name;
	long salary;
	
	public Constructor3(int i,String s,long l) { //parameterized constructor
		id=i; // insilization
		name=s;
		salary=l;
	}
	
	public Constructor3() { // No-argument constructor
		
	}
	
	
public static void main(String[] args) {
	Constructor3 c1=new Constructor3(2, "syed", 25000L);
	System.out.println(c1.id); //2
	System.out.println(c1.name); //syed
	System.out.println(c1.salary);// 25000
	
	Constructor3 c2=new Constructor3();
	System.out.println(c2.id);//0
	
}
}
