
public class Generic_Method {
	
	public static <E> void printArray(E[]elements) {
		for(E element : elements) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] intArray= {10, 20, 30, 40, 50};
		Character [] charArray= {'A', 'B', 'C', 'D', 'E'};
		
		printArray(intArray);
		printArray(charArray);
	}

}
