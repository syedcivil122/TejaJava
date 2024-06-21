package oops;

public class unknown {
	public static void main(String[] args) {
		AccountHolder ah=new AccountHolder();
		System.out.println(ah.getIfsc());
		System.out.println(ah.getAccountno());
		System.out.println(ah.getAcholder());
		System.out.println(ah.getBalance());
		
	System.out.println("************************************");
	AccountHolder a1=new AccountHolder("HDFC1234",1234563l,"prudvi",287532);
	System.out.println(a1.getIfsc());
	System.out.println(a1.getAccountno());
	System.out.println(a1.getAcholder());
	System.out.println(a1.getBalance());
	
	AccountHolder a2=new AccountHolder("HDFC1234",1234563l,"prudvi chown",287532);
			System.out.println(a2.getAcholder());
			a2.setAcholder("prudvi hyd");
			System.out.println(a2.getAcholder());
			
   System.out.println("============================================");
   AccountHolder a3=new AccountHolder();
   			a3.setAcholder("prudvi");
   			System.out.println(a3.getAcholder());
   			a3.setAcholder("prudvi king");
   	System.out.println(a3.getAcholder());
   		    a3.setAcholder("prudvi rowdi");
   		    System.out.println(a3.getAcholder());	
   		    
   		    System.out.println(ah.getAccountno());
   
	}
	

}
