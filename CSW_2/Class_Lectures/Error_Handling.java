package Class_Lectures;
import java.util.*;
public class Error_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=5+4*3/2;
		int v2=(5+4)*3/2;
		int v3=(5+4)*(3/2);
		int v4=(5+(4*3))/2;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		int c;
		for(c=1; c<10; c++)
			System.out.println("Counter is "+c);
	}

}
