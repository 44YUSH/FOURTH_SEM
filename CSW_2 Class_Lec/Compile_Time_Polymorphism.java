class Multiply{
	static int mult(int a, int b) {
		return a*b;
	}
	static int mult(int a, int b, int c) {
		return a*b*c;
	}
}
public class Compile_Time_Polymorphism {
	public static void main(String[]args) {
		System.out.println(Multiply.mult(3, 5));
		System.out.println(Multiply.mult(3, 5, 2));
	}
}
