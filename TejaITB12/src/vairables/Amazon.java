package vairables;

public class Amazon {
	
	public int mobiles() {
		int relame = 10000;
		int vivo = 15000;
		int total = relame+vivo;
		return total;
	}

	public int cloths() {
		int shirt = 700;
		int tshort = 450;
		int total= shirt+tshort;
		return total;
	}

	public int electronics() {
		int tv = 21000;
		int laptop = 35000;
		int total = tv+laptop;
		return total;
	}
	public static void main(String[] args) {
		Amazon f=new Amazon();
		int mobileBill=f.mobiles();
		System.out.println("mobiles=="+mobileBill);
		
		int clothsbill = f.cloths();
		System.out.println("cloths=="+clothsbill);
		
		int electronicbill = f.electronics();
		System.out.println("electronics=="+electronicbill);
		
		int totalbill = mobileBill+clothsbill+electronicbill;
		System.out.println("total bill=="+totalbill);
	}


}
