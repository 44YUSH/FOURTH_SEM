import java.util.*;
public class HashCode_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "Mango");
		hm.put(2, "Orange");
		hm.put(3, "Grape");
		hm.put(4, "Banana");
		System.out.println("----------------HASH MAP----------------");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		System.out.println("----------------------------------------");

		hm.putIfAbsent(5, "Apple");
		hm.putIfAbsent(6, "Guava");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		System.out.println("----------------------------------------");
		
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(7, "Kiwi");
		map.putAll(hm);
		System.out.println();
		System.out.println(map);
		
		map.remove(7);
		map.remove(7, "Kiwi");
		System.out.println(map+"            <---------- Removed Kiwi in no.7");
		
		map.replace(2, "Dragon Fruit");
		System.out.println(map+"      <---------- Replaced no. 2 with Dragon Fruit.");
		
		map.replaceAll((k,v)->"Pear");
		System.out.println(map+"                    <---------- All values changed to Pears.");
	}

}
