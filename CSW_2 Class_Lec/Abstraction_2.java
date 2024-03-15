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
public class Abstraction_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape c=new circle();
		c.draw();
		shape r=new rectangle();
		r.draw();
	}

}
