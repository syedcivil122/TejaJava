package stringHandling;

public class StringTricky {
	
	public void m1(String s ) {
		System.out.println("string");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("string buffer");
	}
	
	public void m1(StringBuilder sbu) {
		System.out.println("string builder");
	}
public static void main(String[] args) {
	StringTricky st=new StringTricky();
	//st.m1(null); ambiguity issue
	st.m1("java");
	
	StringBuffer sb=new StringBuffer();
	st.m1(sb);
	
	StringBuilder sbu=new StringBuilder();
	st.m1(sbu);
	
}
}
