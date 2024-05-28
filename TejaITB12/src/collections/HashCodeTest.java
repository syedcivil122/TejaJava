package collections;

public class HashCodeTest {
	//hascode & equals
	
	public static void main(String[] args) {
	//if the content is same then hashcode will be same
	//if content is not same then hashcode will be different
		
		String s1="lokesh";
		String s2="pavan";
		String s3="prudvi";
		String s4="pavan";
		String s5="lokesh";
		String s6="lokesh";
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s5.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s6.hashCode());
		
		System.out.println(s1.hashCode()==s2.hashCode());//false
		System.out.println(s2.hashCode()==s2.hashCode());//true
		System.out.println(s2.hashCode()==s4.hashCode());//true
		System.out.println(s5.hashCode()==s6.hashCode());//true
		
		//equals method will compare the content
		System.out.println(s1.equals(s2));//false
		System.out.println(s2.equals(s4));//true
		
		
	}

}
