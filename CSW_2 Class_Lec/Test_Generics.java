class MyGen<T>{
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}
public class Test_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGen<Integer>m=new MyGen<Integer>();
		m.add(2);
		System.out.println(m.get());
	}

}
