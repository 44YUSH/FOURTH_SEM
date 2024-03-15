
class Animaal {
	
	void eat(){
		System.out.println("Eating...");
	}
}
	class dogs extends Animaal{
		public void bark() {
			System.out.println("Baking...");
	}
}
	class pup extends dogs{
		public void weep() {
			System.out.println("Weep...");
		}
	}

 public class multilevel{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pup obj=new pup();
		obj.eat();
		obj.bark();
		obj.weep();
	}
 }

