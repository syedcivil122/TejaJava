package stringHandling;

public class Employee {
	
	private final int id;
	private final String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(10, "chintu");
//		e.id = 25;
//		e.name = "syed";
		System.out.println(e.getId()+"     "+e.getName());
	}

}
