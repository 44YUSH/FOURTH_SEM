
class Student1 implements Comparable<Student1>
{
    private String name;
    private int rn;
    private int totalMark;

    public Student1(String name, int rn, int totalMark)
    {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public String toString() {
        return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
    }

    public int compareTo(Student1 otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn); // Compare based on roll number (rn)
    }
}

public class Q4
{
    public static Student1 linearSearch(Student1[] students, int targetRn)
    {
        for (Student1 student : students) {
            if (student.getRn() == targetRn) {
                return student;
            }
        }
        return null; // Student not found
    }

    public static void main(String[] args)
    {
        Student1[] students = {
            new Student1("Subham", 101, 450),
            new Student1("Sidlu", 102, 380),
            new Student1("Aayush", 103, 420)
        };

        int rnToSearch = 102;
        Student1 searchResult = linearSearch(students, rnToSearch);

        if (searchResult != null) {
            System.out.println("Student found: " + searchResult + ":)");
        } else {
            System.out.println("Student with roll number " + rnToSearch + " not found. TT");
        }
    }
}