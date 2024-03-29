import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tr=new TreeSet<Integer>();
		tr.add(1);
		tr.add(2);
		tr.add(3);
		tr.add(4);
		Iterator<Integer>itr=tr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("The Set is : "+tr);
		Iterator i=tr.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+", ");
		}
		
	}

}
