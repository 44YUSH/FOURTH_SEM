package Class_Lectures;
class B{
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
public class Loose_Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.setName (null);
		System.out.println("Name is "+obj.getName());
	}

}
