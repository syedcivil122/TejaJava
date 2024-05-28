package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	
	public void hashMapTest() {
	//k - key  v - value ->pair-> entry
	
	Map<String, String> map=new HashMap<String, String>();
	                    map.put("W22345I", "lokesh");
	                    map.put("A12345R", "pavan");
	                    map.put("Q77745I", "prudvi");
	                    map.put("X567845I", "chaintanya");
	                    map.put(null, "vaibhav");
	                    map.put("A43567U", null);
	                    map.put("D2347V", null);
	                    
	                    System.out.println("**********hashmap*****************");
	                    for(Entry<String, String> entry:map.entrySet()) {
//	                    	System.out.println(entry);
	                    	System.out.println(entry.getKey()+" "+entry.getValue());
//	                    	System.out.println(entry.getKey().hashCode()+"   "+entry.getValue().hashCode());
	                    }
	                    
	}      
	
	public void linkedHashMapTest() {
		Map<String, String> map=new LinkedHashMap<String, String>();
		 map.put("W22345I", "lokesh");
         map.put("A12345R", "pavan");
         map.put("Q77745I", "prudvi");
         map.put("X567845I", "chaintanya");
         map.put(null, "vaibhav");
         map.put("A43567U", null);
         map.put("D2347V", null);
         
         System.out.println("**********linkedhashmap*****************");
         for(Entry<String, String> entry:map.entrySet()) {
        	 System.out.println(entry);
         }
		
	}
	
	public void treeMapTest() {
		//does't allow null key & following shorting order
		Map<String, String> map=new TreeMap<String, String>();//sorting order
		 map.put("W22345I", "lokesh");
         map.put("A12345R", "pavan");
         map.put("Q77745I", "prudvi");
         map.put("X567845I", "chaintanya");
//         map.put(null, "vaibhav");
         map.put("A43567U", null);
         map.put("D2347V", null);
         
         System.out.println("************treemap***********");
         for(Entry<String, String> entry:map.entrySet()) {
        	 System.out.println(entry);
         }
		
	}
	Integer
	public void hastableMapTest() {
		//hastable doesn't allow null keys & null values 
		Map<String, String> map=new Hashtable<String, String>();
		 map.put("W22345I", "lokesh");
         map.put("A12345R", "pavan");
         map.put("Q77745I", "prudvi");
         map.put("X567845I", "chaintanya");
//         map.put(null, "vaibhav");
//         map.put("A43567U", null);
//         map.put("D2347V", null);
         
         System.out.println("*************hastable**********************");
         for(Entry<String, String> entry:map.entrySet()) {
        	 System.out.println(entry);
         }
		
	}
	
	public static void main(String[] args) {
		MapTest maptest=new MapTest();
		        maptest.hashMapTest();
//		        maptest.linkedHashMapTest();
//		        maptest.treeMapTest();
//		        maptest.hastableMapTest();
	}

}
