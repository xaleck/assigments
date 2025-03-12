import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Set<String> courses1 = new HashSet<>(Arrays.asList("Java Programming", "Data Structures"));
        Student s1 = new Student(1, "Alice Johnson", 20, courses1);

        Set<String> courses2 = new HashSet<>(Arrays.asList("Python Programming", "Algorithms"));
        Student s2 = new Student(2, "Bob Smith", 22, courses2);

        Set<String> courses3 = new HashSet<>(Arrays.asList("Java Programming", "Operating Systems"));
        Student s3 = new Student(3, "Charlie Davis", 21, courses3);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.displayStudentsSortedById();

        Student foundStudent = manager.searchStudentById(2);
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }
        manager.listStudentsByCourse("Java Programming");
        Set<String> newCourses = new HashSet<>(Arrays.asList("Advanced Java", "Data Structures"));
        manager.updateStudent(1, "Alice Johnson Updated", 21, newCourses);
        manager.displayStudentsSortedByName();
        manager.listStudentsByCourse("Data Structures");
        manager.removeStudent(2);
        manager.displayStudentsSortedById();
    }
}
