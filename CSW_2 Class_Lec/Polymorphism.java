/* To perform a single action in many ways. 
 * POLY - many, MORPH - forms. 
 * Two types : i. Compile_Time - 
                     o Function Overloading
                     o Operator Overloading

               ii. Run_Time
 */

class multiplys{
	static int mult(int a, int b) {
		return a*b;
	}
	static double mult(double a, double b) {
		return a*b;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplys.mult(7, 3));
		System.out.println(multiplys.mult(7.5, 3.5));
	}

}

/*
OUTPUT

21
26.25
*/