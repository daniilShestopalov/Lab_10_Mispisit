
import java.util.Collection;

public class Department {

    public String name;
    public Collection<Course> courses;

    public Department() {
    }

    public void addNewCourse(Course course) {
//        this.courses.add(course);
        System.out.println("Новый курс добавлен");
    }

    public Department(String name, Collection<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
