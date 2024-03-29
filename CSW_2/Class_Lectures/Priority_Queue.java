package Class_Lectures;
import java.util.*;
public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("Where");
		pq.add("Have");
		pq.add("You");
		pq.add("Been");
		System.out.println("Initial PriorityQueue : "+pq);
		pq.remove("Have");
		System.out.println("After remove : "+pq);
		System.out.println("After poll method : "+pq);
		System.out.println("After peek method : "+pq);
		System.out.println("After PriorityQueue : "+pq);
		
	}
}
