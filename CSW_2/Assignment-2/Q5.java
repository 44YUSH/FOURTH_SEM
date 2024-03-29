class Student2 implements Comparable<Student2>
{
    private String name;
    private int rn; 
    private int totalMark;

    public Student2(String name, int rn, int totalMark)
    {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String toString()
    {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }

    public int compareTo(Student2 otherStudent)
    {
        return Integer.compare(this.rn, otherStudent.rn); 
    }
}

public class Q5
{
    public static void bubbleSort(Student2[] students)
    {
        int n = students.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {
                    // Swap elements
                    Student2 temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args)
    {
        Student2[] students = {
            new Student2("Sambhu", 101, 450),
            new Student2("Shiv", 105, 380),
            new Student2("Bhole", 103, 420)
        };

        System.out.println("Before sorting:");
        for (Student2 student : students)
            System.out.println(student);

        bubbleSort(students);

        System.out.println("\nAfter sorting:");
        for (Student2 student : students)
            System.out.println(student);
    }
}
