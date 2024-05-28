package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirlaProducts {
int pid;
String name;
int price;


public BirlaProducts(int pid, String name, int price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
}


@Override
public String toString() {// 
	return "BirlaProducts [pid=" + pid + ", name=" + name + ", price=" + price + "]";
}


public static void main(String[] args) {
	BirlaProducts b1=new BirlaProducts(104, "Birlasoft", 250);
	BirlaProducts b2=new BirlaProducts(103, "Birlacement", 300);
	BirlaProducts b3=new BirlaProducts(106, "ultaratech", 600);
	BirlaProducts b4=new BirlaProducts(101, "pantaloons", 350);
	BirlaProducts b5=new BirlaProducts(102, "ides", 400);
	
	List<BirlaProducts> list=Arrays.asList(b1,b2,b3,b4,b5);//using convert type list to array
	
//	Collections.sort(list);
//	BasedonId bid=new BasedonId();
//	Collections.sort(list, bid); //  ascending order
//	
//	Collections.sort(list, new BasedonName());//object 
//	
//	Collections.sort(list, new BasedonPrice());
	
	String property ="name";
	
	if(property.equals("pid")){
	BasedonId bid=new BasedonId();
	Collections.sort(list, bid); //  ascending order
	}else if(property.equals("name")) {
	Collections.sort(list, new BasedonName());//object 
	}else if(property.equals("price")) {
	Collections.sort(list, new BasedonPrice());
	}
	
//	 desending order
	String ordertype = "desc";
	if(ordertype.equals("desc")) {
		Collections.reverse(list);
	}
	
	
	
	for(BirlaProducts b:list) {// for each method to iterate the values
		System.out.println(b);
	}
}
	

}
