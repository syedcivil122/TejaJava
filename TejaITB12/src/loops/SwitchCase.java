package loops;

public class SwitchCase {
	public static void main(String[] args) {
		int id=10;  //initilization 
		
		switch(id) {//key  - initilized variable
		
		case 5:     // key== value   true
			System.out.println("case 5");
			break;
			
		case 7:
			System.out.println("case 7");
			break;
			
		case 9:
			System.out.println("case 9");
			break;
			
		case 10:
			System.out.println("case 10");
			break;
			
		default:
			System.out.println("default case");
		
		}
	}

}
