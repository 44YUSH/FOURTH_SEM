package Class_Lectures;
class Animals {
	
	void eat(){
		System.out.println("Eating...");
	}
}
class dog extends Animals{
	public void bark() {
		System.out.println("Baking...");
	}
}

public class i_Single_Inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.eat();
		obj.bark();
	}
 }

/*
OUTPUT

Eating...
Baking...
 */
