package Class_Lectures;
class Pashu{
	void khana() {
		System.out.println("Kha raha hai...");
	}
}
class Sher extends Pashu{
	void khana() {
		System.out.println("Sher khana kha raha hai...");
	}
}
public class Polymorphism_RunTime_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pashu p=new Sher();
		p.khana();
	}
}

/*
OUTPUT

Sher khana kha raha hai...
*/