
import java.util.*;

public class Course {

    Collection<Lecturer> teaches;
    public String name;
    public int id;
    public float hours;

    public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
        this.teaches = teaches;
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public Course() {
    }

    public void addNewTeacher(Lecturer lecturer) {
//        this.teaches.add(lecturer);
        System.out.println("Новый преподаватель зачислен на курс");
    }

    @Override
    public String toString() {
        return "Course{" +
                "teaches=" + teaches +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", hours=" + hours +
                '}';
    }

    public Collection<Lecturer> getTeaches() {
        return teaches;
    }

    public void setTeaches(Collection<Lecturer> teaches) {
        this.teaches = teaches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}