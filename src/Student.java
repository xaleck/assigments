import java.util.HashSet;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>(courses);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getCourses() { return courses; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourses(Set<String> courses) {
        this.courses = new HashSet<>(courses);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", courses=" + courses +
               '}';
    }
}
