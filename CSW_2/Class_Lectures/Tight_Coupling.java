package Class_Lectures;
class A{
	public String name;
	public String getName() {
		if(name!=null)
			return name;
		else
			return "not initilized";
	}

public void setName(String s) {
	if(s==null)
		System.out.println("You can't initialize name to a null");
	else
		name=s;
}
}
public class Tight_Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.name=null;
		System.out.println("Name is "+obj.name);
	}

}
