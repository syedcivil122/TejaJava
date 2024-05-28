package concurrentprograms;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentTest {
	
	public void mapTest() {
		
		Map<String, Integer> map=new ConcurrentHashMap<String, Integer>();
		                     map.put("AA", 1);
		                     map.put("BB", 2);
		                     map.put("CC", 3);
		                     map.put("DD", 4);
		                     
		          for(Entry<String, Integer> entry:map.entrySet()) {
		        	  
		        	  if(entry.getKey().equals("CC")) {
		        		  map.put("EE", 5);
		        		  map.remove("DD");
		        	  }
		        	  System.out.println(entry);
		        	  
			          }
//		          for(Entry<String, Integer> ent:map.entrySet()) {
//			        	  System.out.println(ent);
//		          }
		          
		          System.out.println("==========Modify the data===============");
		          
		          for(Entry<String, Integer> entry:map.entrySet()) {
		        	  System.out.println(entry);
		          }
	}
	
	
	public void listTest() {
		System.out.println("********ArrayList***********");
		List<Integer> list=new CopyOnWriteArrayList<Integer>();
		              list.add(12);
		              list.add(13);
		              list.add(14);
		              list.add(15);
		              list.add(16);
		              
		        for(Integer val:list) {
		        	if(val==15) {
		        		list.add(19);
		        	}
		        	System.out.println(val);
		        }
		        
		    System.out.println("===========Modifi the data================");
		    
		    for(Integer val:list) {
		    	System.out.println(val);
		    }
	}
	
public void setTest() {
		System.out.println("********Set***********");
		Set<Integer> list=new CopyOnWriteArraySet<Integer>();
		              list.add(20);
		              list.add(30);
		              list.add(40);
		              list.add(50);
		              list.add(60);
		              
		        for(Integer val:list) {
		        	if(val==60) {
		        		list.add(90);
		        	}
		        	System.out.println(val);
		        }
		        
		    System.out.println("===========Modify the data================");
		    
		    for(Integer val:list) {
		    	System.out.println(val);
		    }
	}
	
	
	public static void main(String[] args) {
		ConcurrentTest ct=new ConcurrentTest();
		ct.mapTest();
//		ct.listTest();
//		ct.setTest();
	}

}
