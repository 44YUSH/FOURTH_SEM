class Complexx{
	private double re, im;
	public Complexx(double re, double im) {
		this.re=re;
		this.im=im;
	}
}
public class OverridingEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Complexx c1=new Complexx(10.7, 2.2);
	Complexx c2=new Complexx(10.7, 2.2);
	if(c1==c2)
		System.out.println("equal");
	else
		System.out.println("not equal");
	}

}