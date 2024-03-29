package Class_Lectures;
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
public class Polymorphism_RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c=new Ford();
		c.run();
	}
}

/*
OUTPUT

Running at 80 kmph
*/