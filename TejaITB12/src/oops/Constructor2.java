package oops;

public class Constructor2 {
	
	int id; 
	String name;
	
	public Constructor2() {
		System.out.println("zero arg constructor..");
	}
	
	public Constructor2(int i) {
		System.out.println("int arg constructor"+i);
		id=i;
	}
	
	public Constructor2(String s) {
		System.out.println("String arg constructor"+s);
		name=s;
	}
	
	public Constructor2(int k, String s1) {
		System.out.println("int & String arg constructor"+k+" "+s1);
		id=k;
		name=s1;
	}
	
	public static void main(String[] args) {
		Constructor2 c1=new Constructor2();
		System.out.println(c1.id); //0
		System.out.println(c1.name); //null
		
		Constructor2 c2=new Constructor2(24);
		System.out.println(c2.id); //24
		System.out.println(c2.name);//null
		
		Constructor2 c3=new Constructor2("java");
	    System.out.println(c3.id);//0
	    System.out.println(c3.name);//java
	    
	    Constructor2 c4=new Constructor2(12, "sql");
	    System.out.println(c4.id);//12
	    System.out.println(c4.name);//sql
	}
	
	
	

}
