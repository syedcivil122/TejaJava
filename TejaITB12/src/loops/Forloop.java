package loops;

public class Forloop {
	public static void main(String[] args) {
		
		int id=10;// Intilization 
		//30>20 // condition
		
		// Initilization  condtion  loopexecutive  increment/decrement
		// Initilization  condition  increment/decrement
		for(int i=1;         i<10;    i++  ) {//i+1
			
			System.out.println(i);
			
		}
		
		System.out.println("***********decrement***********");
		
		for(int i=10;         i>1;    i--  ) {//i+1
			
			System.out.println(i);
			
		}
		
		System.out.println("***********String*********");
		
		String s="Syed Arifullah"; // initilization
		
		for(int i=0;  i<14;  i++  ) {
			System.out.println(s.charAt(i));
			
		}
		
		System.out.println("************Reverse String ***********");
		
		for(int i=13;  i>0;  i--) {
			System.out.println(s.charAt(i));
		}
		
	}

}
