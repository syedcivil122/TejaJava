package modifiers1;

public class AA {
	
  protected int id=25;
   
   protected void test() {
	   System.out.println("test method..");
   }
   
   public static void main(String[] args) {
	   AA a=new AA();
		   a.test();
	   System.out.println(a.id);
}
	
		

}
