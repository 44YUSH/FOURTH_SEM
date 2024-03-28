class complex_number{
	private double re, in;
	public complex_number(double re, double in) {
		this.re=re;
		this.in=in;
	}
}
public class Complex {

	public static void main(String[] args) {
	    complex_number c1=new complex_number(10.7, 15.9);
	    System.out.println(c1);
	}

}
