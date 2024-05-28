package stringHandling;

public class StringTest2 {
public static void main(String[] args) {
	
	String s1=new String("Java");
	String s2="Teja";
	String s3="Java";
	String s4="anand";
	String s5=new String("Java");
	String s6=new String("anand");
	String s7="Teja";
	
	System.out.println(s1==s2);//false
	System.out.println(s1==s3);//false
	System.out.println(s2==s3);//false
	System.out.println(s2==s7);//true
	System.out.println(s1==s5);//false
	System.out.println(s4==s6);//false
	System.out.println(s3==s5);//false
	
	System.out.println("=============equals=============");
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s3.equals(s5));
	System.out.println(s2.equals(s7));
	
}

}
