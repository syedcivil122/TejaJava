package vairables;

public class Method3 {
	
	public int id() {
		System.out.println("this is Id method..");
		return 5;
	}
	
	public String name() {
		System.out.println("this is name method..");
		return "ABCD";
	}
	
	public static void main(String[] args) {
		Method3 m3=new Method3();
		System.out.println(m3.id());
		System.out.println(m3.name());
	}

}
