import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tr=new TreeSet<Integer>();
		tr.add(1);
		tr.add(2);
		tr.add(3);
		tr.add(4);
		System.out.println("Lowest Value : "+tr.pollFirst());
		System.out.println("Highest Value : "+tr.pollLast());
		
	}

}
