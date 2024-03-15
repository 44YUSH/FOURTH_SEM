interface myInterface1{
	public void method1(); 
}
interface myInterface2{
	public void method2();
}
class DemoClass implements myInterface1, myInterface2{
	public void method1() {
		System.out.println("My method 1");
	}
	public void method2() {
		System.out.println("My method 2");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass D=new DemoClass();
		D.method1();
		D.method2();
	}

}
