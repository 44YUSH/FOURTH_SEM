class complex3{
	private double re, im;
	public complex3(double re, double im) {
		this.re=re;
		this.im=im;
	}
	public boolean equals(Object o) {
		if(o==this) {
			return true;
		}
		if(!(o instanceof complex3)) {
			return false;
		}
		complex3 c=(complex3) o;
		return Double.compare(re, c.re)==0 && Double.compare(im,  c.im)==0;
	}
}
public class EqualOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex3 c1=new complex3(10.7, 2.2);
		complex3 c2=new complex3(10.7, 2.2);
		if(c1.equals(c2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
