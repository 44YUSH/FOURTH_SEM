public class Try_Catch_Finally_1 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			int i = arr[4];
			System.out.println("Inside Try Block.");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exeception caught in catch block.");
		}
		System.out.println("Outside try-catch clause.");
		
		System.out.println("-------------------------------------------------------------");
		
		try {
			int data=100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		System.out.println("-------------------------------------------------------------");
			
		}
		finally {
			System.out.println("Finally block executed");
		}
		System.out.println("-------------------------------------------------------------");
		
		try {
			String str="abc";
			int num=Integer.parseInt(str);
			System.out.println("Inside my block.");
		}
		catch(NumberFormatException f){
			System.out.println("Catch block is executed.");
		}
		System.out.println("Outside TRY-CATCH clause.");
	}
}