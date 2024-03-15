import java.util.ArrayList;
import java.util.List;
public class Non_Generic {
	public static void main(String[]args) {
		List list=new ArrayList();
		list.add(10);
		list.add("RadheKrisn");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}