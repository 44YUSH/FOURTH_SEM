class Cars{
	void run() {
		System.out.println("Running");
	}
}
class Ford extends Cars{
	void run() {
		System.out.println("Running at 80 kmph");
	}
}
public class Run_Time_Polymorphism_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c=new Ford();
		c.run();
	}
}
