package loops;

public class WhileLoop {
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("***************decrement the values********************");
		int i1=10;
		
		while(i1>1) {
			System.out.println(i1);
			i1--;
		}
		
		System.out.println("************* String **********************");
		
		String s="Teja IT Software";
		int I=1;
		while(I<16) {
			System.out.println(s.charAt(I));
			I++;
		}
		
		System.out.println("************Reverse String*****************");
		
		int st=15;
		while(st>0) {
			System.out.println(s.charAt(st));
			st--;
		}
	}

}
