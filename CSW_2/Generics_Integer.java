import java.util.*;
public class Generics_Integer {
	public static void main(String[]args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		
		// list.add("10"); ---------> Only integers can be executed as It is defined <Integers>. 
		//                            And Strings can't be executed.
		
		System.out.println(list.get(0));
	}
}
