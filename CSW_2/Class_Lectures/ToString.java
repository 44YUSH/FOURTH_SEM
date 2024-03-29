package Class_Lectures;
public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexs c1=new complexs(10,15);
		System.out.println(c1);
	}
}
class complexs{
	private double re, im;
	public complexs(double re, double im) {
		this.re=re;
		this.im=im;
	}
	public double getReal() {
		return this.re;
	}
	public double getImaginary() {
		return this.im;
	}
	public void setReal(double re) {
		this.re=re;
	}
	public void setImaginary(double in) {
		this.im=im;
	}
	public String ToString() {
		return this.re+" + "+this.im+"i";
	}
}
