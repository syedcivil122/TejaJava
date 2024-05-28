package stringHandling;

public class StringMethods {
	public static void main(String[] args) {
		
		String s=" Your Java Stop ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.concat("Teja It"));
		System.out.println(s.endsWith("op"));
		System.out.println(s.equals("Your Java Stop"));
		System.out.println(s.equalsIgnoreCase("your java code"));
		System.out.println(s.hashCode());
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.replace("a", "b"));
		System.out.println(s.startsWith("Yo"));
		char[] ch=s.toCharArray();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String[] str=s.split(" ");
		for(String data:str) {
		System.out.println(data);
		System.out.println(s.strip());
		System.out.println(s.getClass());
		System.out.println(s.repeat(3));
		System.out.println(s.trim());
		System.out.println(s.subSequence(1, 7));
		}
	}

}
