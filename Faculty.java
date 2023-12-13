
import java.util.Collection;

public class Faculty {

    public Dean dean;
    public String name;
    public Collection<Department> departments;

    public Faculty(Dean dean, String name, Collection<Department> departments) {
        this.dean = dean;
        this.name = name;
        this.departments = departments;
    }

    public Faculty() {
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "dean=" + dean +
                ", name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }

    public void addNewDepartment(Department department) {
//        if (!departments.contains(department)) {
//            this.departments.add(department);
            System.out.println("Добавлена новая кафедра");
//        } else {
//            System.out.println("Кафедра уже существует");
//        }
    }

    public void updateDean(Dean dean) {
//        setDean(dean);
        System.out.println("Поприветсвуем нового декана " + dean);
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }
}