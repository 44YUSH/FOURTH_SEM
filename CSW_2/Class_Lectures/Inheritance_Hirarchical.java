package Class_Lectures;
class Mamals{
	public void sound() {
		System.out.println("Sound");
	}
}
	class kutta extends Mamals{
		public void wowo() {
			System.out.println("Wow..wowo..wo");
		}
	}
	class billi extends Mamals{
		public void meow() {
			System.out.println("Meow...meow");
		}
	}

public class iii_Hirarchica_Inheritancel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kutta M=new kutta();
		M.wowo();
		billi N=new billi();
		N.meow();

	}

}

/*
OUTPUT

Wow..wowo..wo
Meow...meow
*/
