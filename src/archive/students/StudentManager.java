import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        if (students.putIfAbsent(student.getId(), student) != null) {
            System.out.println("Student with id " + student.getId() + " already exists.");
        } else {
            System.out.println("Student added: " + student);
        }
    }

    public void removeStudent(int id) {
        Student removed = students.remove(id);
        System.out.println(removed != null 
            ? "Removed student: " + removed 
            : "Student with id " + id + " not found.");
    }

    public void updateStudent(int id, String newName, Integer newAge, Set<String> newCourses) {
        Student student = students.get(id);
        if (student == null) {
            System.out.println("Student with id " + id + " not found.");
            return;
        }
        
        if (newName != null) student.setName(newName);
        if (newAge != null) student.setAge(newAge);
        if (newCourses != null) student.setCourses(newCourses);
        
        System.out.println("Updated student: " + student);
    }

    public void displayStudentsSortedById() {
        students.values().stream()
            .sorted(Comparator.comparing(Student::getId))
            .forEach(System.out::println);
    }

    public Student searchStudentById(int id) {
        return students.get(id);
    }

    public void displayStudentsSortedByName() {
        students.values().stream()
            .sorted(Comparator.comparing(Student::getName)
                    .thenComparing(Student::getId))
            .forEach(System.out::println);
    }

    public void listStudentsByCourse(String course) {
        List<Student> enrolledStudents = students.values().stream()
            .filter(s -> s.getCourses().contains(course))
            .collect(Collectors.toList());
            
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled in course: " + course);
        } else {
            enrolledStudents.forEach(System.out::println);
        }
    }

    public Map<String, Set<Student>> getCourseStudentMap() {
        Map<String, Set<Student>> courseMap = new HashMap<>();
        
        students.values().forEach(student -> {
            student.getCourses().forEach(course -> {
                courseMap.computeIfAbsent(course, k -> new HashSet<>()).add(student);
            });
        });
        
        return courseMap;
    }
}