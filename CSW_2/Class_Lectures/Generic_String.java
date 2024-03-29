package Class_Lectures;
import java.util.ArrayList;
import java.util.List;
public class Generic_String {
	public static void main(String[]args) {
		List<String>list=new ArrayList<String>();
		list.add("RadheKrisn");
		
		// list.add("10"); ---------> Only Strings can be executed as It is defined <Strings>. 
		//                            And Integers can't be executed.
		System.out.println(list.get(0));
	}
}
