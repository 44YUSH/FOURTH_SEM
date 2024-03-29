class Multiply{
	static int mult(int a, int b) {
		return a*b;
	}
	static int mult(int a, int b, int c) {
		return a*b*c;
	}
}
public class Polymorphism_CompileTime {
	public static void main(String[]args) {
		System.out.println(Multiply.mult(3, 5));
		System.out.println(Multiply.mult(3, 5, 2));
	}
}

/*
OUTPUT

15
30
*/