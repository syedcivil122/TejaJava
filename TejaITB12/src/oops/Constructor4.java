package oops;

public class Constructor4 {
	int id;
	String name;
	long salary;
	
	public Constructor4(int id,String name,long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}


public static void main(String[] args) {
	Constructor4 c1=new Constructor4(2, "syed", 25000L);
	System.out.println(c1.id);
	System.out.println(c1.name);
	System.out.println(c1.salary);
	
	Constructor3 c2=new Constructor3();
	System.out.println(c2.id);//0
	
}

}
