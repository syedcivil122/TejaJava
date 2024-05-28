package oops;

public class AccountHolder {
	
	private String ifsc="ANBDG1234";
	private long Accountno=1234556667;
	private String Acholder="lokesh";
	private int balance= 200000;
	
	
	public AccountHolder() {
		
	}
	public AccountHolder(String ifsc, long accountno, String acholder, int balance) {
		super();
		this.ifsc = ifsc;
		this.Accountno = accountno;
		this.Acholder = acholder;
		this.balance = balance;
	}



	public String getIfsc() {
		return ifsc;
	}



	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}



	public long getAccountno() {
		return Accountno;
	}



	public void setAccountno(long accountno) {
		Accountno = accountno;
	}



	public String getAcholder() {
		return Acholder;
	}



	public void setAcholder(String acholder) {
		Acholder = acholder;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public static void main(String[] args) {
		AccountHolder ah=new AccountHolder();
		System.out.println(ah.ifsc);
		System.out.println(ah.Accountno);
		System.out.println(ah.Acholder);
		System.out.println(ah.balance);
	}

}
