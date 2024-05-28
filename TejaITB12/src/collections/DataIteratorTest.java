package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class DataIteratorTest {
	
	//for each - iterator, list iterator, enumeration
	
	public void iteratorTest() {
		//iterator - to iterate the non - legacy classes on forward direction
		List<Integer> li=new ArrayList<Integer>();
		              li.add(25);
		              li.add(35);
		              li.add(45);
		              li.add(55);
		              li.add(65);
		              li.add(15);
		              
		Iterator<Integer> itr=li.iterator();
		           while(itr.hasNext()) { // it check the element present or not
		        	   //25 - true, 35 - true, 45 - true, 55 - true, 65 - true, 15 - true,
		        	   Integer val=itr.next(); //return the element
		        	   
		        	   System.out.println(val);
		           }
	}
	
	public void listIteratorTest() {
		//listitertor - traverse the data form forward the direction to backward direction
		List<Integer> li=new ArrayList<Integer>();
						li.add(25);
				        li.add(25);
				        li.add(45);
				        li.add(55);
				        li.add(65);
				        li.add(15);
				       li.set(0,22);
								
	    ListIterator<Integer> listltr= li.listIterator();
	    while(listltr.hasNext()) {
	    	Integer ele=listltr.next();
	    	System.out.println(ele);
	    }
	    
	    System.out.println("================================");
	    
	    while(listltr.hasPrevious()) {
	    	Integer ele=listltr.previous();
	    	System.out.println(ele);
	}
	    
	}
	
	
	public void enumerationTest() {
		
		Vector<Integer> v=new Vector<Integer>();
						v.add(20);
				        v.add(30);
				        v.add(40);
				        v.add(50);
				        v.add(60);
				        
		Enumeration<Integer> en=v.elements();
		
		while(en.hasMoreElements()) {
			Integer i=en.nextElement();
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		 DataIteratorTest dt=new DataIteratorTest();
		                  //dt.iteratorTest();
		                  dt.listIteratorTest();
//		                  dt.enumerationTest();
	}

}
