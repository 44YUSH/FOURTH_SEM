package Class_Lectures;
public class Inheritance {
	int salary = 40000;
}

class programmer extends Inheritance{
	int bonus = 10000;
	public static void main(String[]args) {
		programmer p=new programmer();
		System.out.println("Programmer Salary : "+p.salary);
		System.out.print("Bonus of Programmer is "+p.bonus);
	}
}

/*
OUTPUT

Programmer Salary : 40000
Bonus of Programmer is 10000
*/