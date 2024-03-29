package Class_Lectures;
import java.util.*;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Stream_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>productList=new ArrayList<Product>();
		//Adding Products
		productList.add(new Product(1, "APPLE Laptop", 90000f));
		productList.add(new Product(2, "HP Laptop", 25000f));
		productList.add(new Product(3, "DELL Laptop", 30000f));
		productList.add(new Product(4, "SONY Laptop", 28000f));
		productList.add(new Product(5, "LENOVO Laptop", 40000f));
		List<Float>productPriceList=new ArrayList<Float>();
		for(Product product: productList) {
			//filtring data of list
			if(product.price<30000) {
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);
	}

}
