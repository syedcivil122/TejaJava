package collections;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit type casting
		
		int i = 10;
		int j = 20;
		int d = i+j;
		double d1 = d;
		System.out.println(d1);
		
		double a = 12.34;
		double b = 34.56;
		double c = a+b;
		
//		int d2 = c; // we can't convert
		int d3 = (int)c; // convert double type to int type
		System.out.println(d3);
		
		Object o1 ="java";
//		String s1 = o1; we can't object to sting 
		String s1 = (String)o1; // string convert
		
		char r = 'a';
		char r1 = 'b';
//		String r2 = (String)r1;
		
	}

}
