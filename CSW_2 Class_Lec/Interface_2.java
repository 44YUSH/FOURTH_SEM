interface stand{
	public void method1();
}
interface walk{
	public void method2();
}
interface run{
	public void method3();
}
class Persons implements stand, walk, run{
	public void method1() {
		System.out.println("I am Standing");
	}
	public void method2() {
		System.out.println("I am Walking");
	}
	public void method3() {
		System.out.println("I am Running");
	}
}
public class Interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons P=new Persons();
		P.method1();
		P.method2();
		P.method3();
	}

}
