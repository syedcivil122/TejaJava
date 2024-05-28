package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		              list.add(23);
		              list.add(25);
		              list.add(15);
		              list.add(34);
		              list.add(31);
		              list.add(29);
		              System.out.println(list);
		              
		              Collections.sort(list); //we can sort the data in ascending order
		              for(Integer l:list) {
		            	  System.out.println("ascending order:- "+l);
		              }
		              
		              Integer min=Collections.min(list);
		              System.out.println("min value is - "+min);
		              
		              Integer max=Collections.max(list);
		              System.out.println("max value is - "+max);
		              
		              List<Integer> asyncList=new ArrayList<Integer>();
		              List<Integer> synchList=Collections.synchronizedList(asyncList);
		              synchList.add(12);
		              System.out.println("**********stnchList******** ");
		              for(Integer L:synchList) {
		              System.out.println(L);
		              }
		              
		              Set<Integer> asyncSet=new HashSet<Integer>();
		              Set<Integer> synchSet=Collections.synchronizedSet(asyncSet);
		              System.out.println("***********stnchset************ " );
		              for(Integer L1:list) {
			              System.out.println(L1);
		              }
		              
		              Map<Integer, Integer> asyncMap=new HashMap<Integer, Integer>();
		              Map<Integer, Integer> synchMap=Collections.synchronizedMap(asyncMap);
		              System.out.println("*****stnchmap *****" );
		              for(Integer L2:list) {
			              System.out.println(L2);
		              }
		              Object[] arr=list.toArray();
		              List<Object> list2=Arrays.asList(arr);
		              
		              
		              
	}

}
