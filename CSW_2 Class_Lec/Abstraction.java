abstract class Bike{
	abstract void run();
	
}
class RE extends Bike{
	public void run() {
		System.out.println("Running...RoyalEnfield");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike B=new RE();
		B.run();

	}

}
