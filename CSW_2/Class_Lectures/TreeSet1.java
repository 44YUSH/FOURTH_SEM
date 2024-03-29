package Class_Lectures;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tr=new TreeSet<String>();
		tr.add("Ravi");
		tr.add("Vijay");
		tr.add("Ravi");
		tr.add("Ajay");
		Iterator<String>itr=tr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(tr);
	}

}
