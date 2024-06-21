package vairables;

public class FlipKart {
	
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
	FlipKart f=new FlipKart();
	System.out.println("mobiles=="+f.mobiles());
	System.out.println("cloths=="+f.cloths());
	System.out.println("electronics=="+f.electronics());
}
}
