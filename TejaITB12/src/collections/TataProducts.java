package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts>{
	int pid;
	String name;
	int price;
	int qty;
	
	
	public TataProducts(int pid, String name, int price, int qty) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
		
		
	}
	

	@Override
	public String toString() {
		return "TataProducts [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}


	public static void main(String[] args) {
		TataProducts t1=new TataProducts(104, "tansiqu", 250, 12);
		TataProducts t2=new TataProducts(101, "salt", 450, 10);
		TataProducts t3=new TataProducts(100, "tetly", 550, 15);
		TataProducts t4=new TataProducts(102, "tatamotore", 650, 12);
		TataProducts t5=new TataProducts(105, "tcs", 150, 12);
		       
		List<TataProducts> list=new ArrayList<TataProducts>();
		                   list.add(t1);
		                   list.add(t2);
		                   list.add(t3);
		                   list.add(t4);
		                   list.add(t5);
		                   
		           Collections.sort(list);
		       
		           for(TataProducts t:list) {
		        	   System.out.println(t);
		           }
	}


	@Override
	public int compareTo(TataProducts o) { //we have to specify on which property want sorting
		
		return this.pid-o.pid;
//		return this.name.compareTo(o.name);
//		return this.price-o.price;
//		return this.qty-o.qty;
	}
	

}
