package Class_Lectures;
import java.util.*;
public class LinkedHashSet_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String>set=new LinkedHashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements : "+set);
		System.out.println();
		
		
		//Removing specific elements.
		set.remove("Ravi");
		System.out.println("After invoking remove(object) method : "+set);
		
		LinkedHashSet <String> set1=new LinkedHashSet<>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Update list : "+set);
		
		//Remove all elements from HashSet.
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method : "+set);
		
		
		//Removing elements on basis of specific conditions.
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("After invoking removeIf() method : "+set);
		
		
		//Removing all elements.
		set.clear();
		System.out.println("After invoking clear() method : "+set);
	}

}
