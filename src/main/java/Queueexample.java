import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueexample {
public static void main(String[] args) {
	Queue<Integer> Q= new LinkedList<Integer>();
//	
//	Q.add(30);
//	Q.add(20);
//	Q.add(10);
	System.out.println(Q);
	System.out.println(Q.peek());
	//System.out.println(Q.remove());
	System.out.println(Q.poll());
	System.out.println(Q);
	
//	Deque<Integer> de=new ArrayDeque<Integer>();
//	de.add(50);
//	de.add(60);
//	de.add(90);
//	de.add(70);
//	System.out.println(de);
//	System.out.println(de.peek());
//	System.out.println(de.remove());
//	System.out.println(de);
//	de.add(30);
//	System.out.println(de);
	
//	PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
//	
//	pq.add(40);
//	pq.add(5);
//	pq.add(10);
//	System.out.println(pq.peek());
//	System.out.println(pq);
}
}
