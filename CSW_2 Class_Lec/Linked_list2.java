import java.util.*;
public class Linked_list2 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		System.out.println("Initial list of elements: "+ ll);
		ll.add("RAVI");
		ll.add("VIJAY");
		ll.add("RAVI");
		ll.add("Ajay");
		System.out.println("After add method: "+ ll);
		//Adding an element at specific position
		ll.add(1, "Adarsh");
		System.out.println("After using add(index, element) method: "+ll);
		LinkedList<String> ll2=new LinkedList<>();
		ll2.add("Sunoo");
		ll2.add("Hanumat");
		//Adding 2nd list elements to 1st list.
		ll.addAll(ll2);
		System.out.println("After using addAll() method: "+ ll);
		LinkedList<String> ll3=new LinkedList<>();
		ll3.add("Jhon");
		ll.add("Rahul");
		ll.addAll(1,ll3);
		System.out.println("using addAll(int,element)"+ll);
		ll.addFirst("LOkesh");
		System.out.println("after using addfirst: "+ll);
		ll.addLast("Dhokesh");
		System.out.println("after using addlast: "+ll);
		// TODO Auto-generated method stub

	}

}
