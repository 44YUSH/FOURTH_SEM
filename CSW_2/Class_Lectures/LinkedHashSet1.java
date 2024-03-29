package Class_Lectures;
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>Lset=new LinkedHashSet<>();
		Lset.add("One");
		Lset.add("Two");
		Lset.add("Three");
		Lset.add("Four");
		Lset.add("Five");
		Iterator<String>i=Lset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(Lset);
	}

}
