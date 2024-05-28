package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
	public void ArrayListTest() {
		//< > generic
		// <integer>  allows only integer values
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		                   
		                   a1.add(0,10);
		                   a1.add(20);
		                   a1.add(30);
		                   a1.add(40);
		                   a1.add(50);
		                   a1.add(60);
		                   a1.add(10);
		                   a1.add(50);
		                   a1.add(1, 54);
		                   a1.remove(5);
		                   Stack
		       Vector<E>
		       LinkedList<E>            
		       ArrayList          
		       PriorityQueue<E>            
//		                   a1.add(1, 77);
		                   
	  System.out.println("get "+a1.get(1));
	  System.out.println(a1);
		                   
//	   for(Integer val:a1) {
//		   System.out.println(val);
//	   }
	   
	}   
	   public void linkedListTest() {
		   
		   LinkedList<String> li=new LinkedList<String>();
		                      li.add("Teja");
		                      li.add("pavan");
		                      li.add("syed");
		                      li.add("prudvi");
		                      li.add(4, null);
		                      
		                      System.out.println(li.get(2));
		                      li.remove(2);
		                      System.out.println(li.get(2));
		                      li.add("Teja");
		                      System.out.println("=====================================");
		                      
		                      for(String va:li) {
		                    	  System.out.println("index - "+li + " value -");
		                      }
		                      
//		                      System.out.println(li);
		                      
		                      		
	   
	} 
	   
 public void linkedListTest1() {
		   
		   LinkedList li=new LinkedList();
		                      li.add("Teja");
		                      li.add("pavan");
		                      li.add("syed");
		                      li.add("prudvi");
		                      li.add(10);
		                      li.add(true);
		                      li.add(1234567891L);
//		                      li.add(10, null)
		                      
		                     
		                      System.out.println(li.get(6));
		                      System.out.println(li.get(2));
		                      li.remove(2);
		                      System.out.println(li.get(2));
		                      li.add("Teja");
		                      System.out.println("=====================================");
		                      
//		                      for(String va:li) {
//		                    	  System.out.println("index - "+li + " value -");
//		                      }
		                      
		                      System.out.println(li);
		                      
		                      		
	   
	} 
	   
	   public void vectorTest() {
		   
		   Vector<Integer> vc=new Vector<Integer>();
		                   vc.add(10);
		                   vc.add(20);
		                   vc.add(30);
		                  
		                   vc.add(40);
		                   vc.add(50);
		                   
//		                   for(Integer va:vc) {
//		                	   System.out.println(va);
//		                   }
//		                   
		                   System.out.println(vc);
	   }
	   
      public void stackTest() {
		   
		   Stack<Integer> st=new Stack<Integer>();
		                   st.push(10);
		                   st.push(20);
		                   st.push(30);
		                   st.push(40);
		                   st.push(50);
		              
		                   st.pop();// pop will remove last element
		                   System.out.println("peek "+st.peek());
		               
		                   
//		                   for(Integer va:st) {
//		                	   System.out.println(va);
//		                   }
		                   
		                   System.out.println(st);
		                   
	   }
	   
	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
//		         lt.ArrayListTest();
//		         lt.linkedListTest();
//		         lt.linkedListTest1();
		         lt.vectorTest();
		         lt.stackTest();
		         
	}

}
