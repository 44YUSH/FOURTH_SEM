/* Second way to achive abstraction is INTERFACE CLASS. */
package Class_Lectures;
abstract class shape{
	abstract void draw();
}
class circle extends shape{
	void draw() {
		System.out.println("Drawing a CIRCLE.");
	}
}
class rectangle extends shape{
	void draw() {
		System.out.println("Drawing a RECTANGLE.");
	}
}
public class Abstraction_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape c=new circle();
		c.draw();
		shape r=new rectangle();
		r.draw();
	}

}

/*
OUTPUT

Drawing a CIRCLE.
Drawing a RECTANGLE.
*/