package vairables;

/*Access modifier    method nmae
 *      |   return type|
 *      |      |       |
 *    public  int    id() {
 *            return  15;  |
 *               |     |
 *         return stmt |
 *                  return value
 */
public class Methods1 {
	String firstname ="abcd"; // instance variable
	public int id() { // instance method
		return 15;	
	}
	
	public long mobile() {   // instance variables
		return 123455666L;
	}
	
	public String hi() {
		return "Hello";
	}
	
	public short s() {
		return 123;
	}
	public byte by() {
		return 121;
	}
	
	public double d() {
		return 123.45;
	}
	
	public float f() {
		return 1.23f;
	}
	
	public boolean b() {
		return true;
	}
	
	public char c() {
		return 'a';
	}
	
public static void main(String[] args) {
	Methods1 m=new Methods1();
	 System.out.println(m.id());
	 System.out.println(m.mobile());
	 System.out.println(m.hi());
	 System.out.println(m.s());
	 System.out.println(m.by());
	 System.out.println(m.d());
	 System.out.println(m.f());
	 System.out.println(m.b());
	 System.out.println(m.c());
}
}
