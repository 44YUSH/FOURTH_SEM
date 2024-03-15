
public class Employee {
	float salary;
}

class programmer extends Employee{
	int bonus = 10000;
	public static void main(String[]args) {
		programmer p=new programmer();
		System.out.println("Programmer Salary : "+p.salary);
		System.out.print("Bonus of Programmer is "+p.bonus);
	}
}