class multiplys{
	static int mult(int a, int b) {
		return a*b;
	}
	static double mult(double a, double b) {
		return a*b;
	}
}
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplys.mult(7, 3));
		System.out.println(multiplys.mult(7.5, 3.5));
	}

}
