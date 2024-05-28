package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	
	public void queueTest() {
		
		Queue<String> q=new LinkedList<String>();
		              q.add("BB");
		              q.add("HH");
		              q.add("AA");
		              q.add("CC");
		              q.add("NN");
		              q.add("GG");
		              q.add("DD");
		              q.add(null);
		              
		              System.out.println("before removing elements:- "+q);
		              q.remove();
		              q.remove();
		              q.remove();
		              q.remove();
		            
		              System.out.println("******linkedlisttest********");
		              System.out.println(q);
		              for(String s:q) {
		            	  System.out.println(s);
		              }
		              
		              
	}
	
public void queueTest1() {
		
		Queue<String> q=new PriorityQueue<String>();
		              q.add("BB");
		              q.add("HH");
		              q.add("AA");
		              q.add("CC");
		              q.add("NN");
		              q.add("GG");
		              q.add("DD");
//		              q.add(null);
		            
		            System.out.println("before removing elements:- "+q);
		              q.remove();
		              q.remove();
//		              q.remove();
//		              q.remove();
		            
		              System.out.println("******Priporitytest********");
		              System.out.println(q);
		              for(String s:q) {
		            	  System.out.println(s);
		              }
		              
		              
	}
	
	public static void main(String[] args) {
		QueueTest qt=new QueueTest();
//		          qt.queueTest();
		          qt.queueTest1();
	}

}
