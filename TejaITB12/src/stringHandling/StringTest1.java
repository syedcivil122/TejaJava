package stringHandling;

public class StringTest1 {
//	sequence of character - character array
//	objective datatype
//	string is a class

	public static void main(String[] args) {
		
		StringTest1 s=new StringTest1();  //string object
		
		String s1=new String("Java");
		System.out.println(s1);
		
		String s2 = "Java1";
		System.out.println(s2);
		
		char[] ch = {'J','a','v','a','2'};
		String s3=new String(ch);
		System.out.println(s3);
				
				
	}
	

}
