package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public void hashSetTest() { //it does't allow duplicate elements
		Set<String> set=new HashSet<String>();
		Set<Integer> set1=new HashSet<Integer>();
		Set<Long> l=new HashSet<Long>();
		Set<Float> set2=new HashSet<Float>();
		            set.add("AA");
		            set.add("BB");
		            set.add("CC");
		            set.add("ADD");
		            set.add("EE");
		            set.add("FF");
		            set.add("AA");
		            set.add(null);
		            set.add(null);
		            set1.add(1);
		            l.add(123456786L);
		            set2.add(12.34f);
		            
		           
		   System.out.println("*********hashset***************");         
		   for(String s:set) {
			   System.out.println(s);
		   }
	}
	
	public void linkedhashSet() {
		Set<String> set=new LinkedHashSet<String>();
					set.add("AA");
				    set.add("BB");
				    set.add("CC");
				    set.add("ADD");
				    set.add("EE");
				    set.add("FF");
				    set.add("AA");
				    set.add(null);
				    set.add(null);																															
							
				    System.out.println("************linkedset***************");
				for(String s:set)	{
					System.out.println(s);
				}
																																        
	}
	
	public void treeSetTest() {
		Set<String> set=new TreeSet<String>();
					set.add("AA");
				    set.add("BB");
				    set.add("CC");
				    set.add("ADD");
				    set.add("EE");
				    set.add("FF");
				    set.add("AA");
//				    set.add(null);
				    set.add("null"
				    		);																															
				
				    System.out.println("************treeset***************");
				for(String s:set)	{
					System.out.println(s);
				}
																																        
	}
	public static void main(String[] args) {
		SetTest st=new SetTest();
		        // st.hashSetTest();
//		        st.linkedhashSet();
//		        st.treeSetTest();
	}
}
