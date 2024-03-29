package Class_Lectures;
import java.util.*;
public class Linked_List1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("RAVI");
		ll.add("VIJAY");
		ll.add("RAVI");
		ll.add("Ajay");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
