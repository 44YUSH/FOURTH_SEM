class Student<T>
{
    private String name;
    private T roll; 
    private int age;

    public Student(String name, T roll, int age)
    {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public void displayStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Age: " + age);
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        Student<Integer> student1 = new Student<>("Adarsh", 104531, 19);
        Student<String> student2 = new Student<>("Ayush", "S22034", 19); 

        System.out.println("Student 1:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}
