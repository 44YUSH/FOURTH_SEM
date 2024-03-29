package Class_Lectures;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String>hmap=new Hashtable<Integer, String>();
		hmap.put(100, "Amit");
		hmap.put(102, "Ravi");
		hmap.put(101, "Vijay");
		hmap.put(103, "Rahul");
		
		for(Map.Entry m:hmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("");
		System.out.println(hmap.getOrDefault(101, "Not Found"));
	}

}
