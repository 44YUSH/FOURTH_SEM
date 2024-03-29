import java.util.*;

interface EnrollmentSystem
{                                                                    // Interface for enrollment operations (Loose Coupling)
    void enrollStudent(student student, Course course);

    void dropStudent(student student, Course course);

    void displayEnrollmentDetails();
}

class student
{
    private String studentId;
    private String studentName;

    public student(String studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Course
{
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName)
    {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment implements EnrollmentSystem                   // Enrollment logic with interaction through interface (High Cohesion)
{
    private List<student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment()
    {
        this.enrolledStudents = new ArrayList<student>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollStudent(student student, Course course)
    {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Enrolled student " + student.getStudentName() + " in course " + course.getCourseName());
    }

    public void dropStudent(student student, Course course)
    {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Dropped student " + student.getStudentName() + " from course " + course.getCourseName());
        } else
            System.out.println("Student not enrolled in the specified course.");
    }

    public void displayEnrollmentDetails()
    {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++)
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() + ", Course: " + enrolledCourses.get(i).getCourseName());
    }
}

class Main
{
    public static void main(String[] args)
    {
        EnrollmentSystem enrollmentSystem = new Enrollment();
        student student1 = new student("6732", "abc");
        student student2 = new student("5246", "def");
        Course course1 = new Course("3733", "driver");
        Course course2 = new Course("8443", "sweeper");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}