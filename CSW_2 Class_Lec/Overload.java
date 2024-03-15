class sum{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum.add(3, 7));
		System.out.println(sum.add(3, 7, 10));
	}

}
