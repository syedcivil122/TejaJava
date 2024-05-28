package oops;

public class OverLoading3 {

	public void data(int id, String name) {
		System.out.println("int String params " +id + " "+name);
	}
	public void data(String name, int id) {
		System.out.println("String int params" +name +""+id);
	}
	
	public static void main(String[] args) {
		OverLoading3 ov3=new OverLoading3();
		             ov3.data(12,"java");
		             ov3.data("sql",45);
	}
}
