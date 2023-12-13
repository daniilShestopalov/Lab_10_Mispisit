import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var institute = new Institute("ВГУ", "Университетская площадь 1", null);

        var lecture = new Lecturer(1, 23, "Соломатин", "dimok@gmail.com", 1);

        var dean = new Dean("Крыловецкий");

        ArrayList<Lecturer> lecturers = new ArrayList<>() {{
            add(lecture);
        }};

        var course = new Course(lecturers, "ООП", 1123, 321);

        ArrayList<Course> courses = new ArrayList<>() {{
            add(course);
        }};

        var department = new Department("Програмная инженерия", courses);

        var faculty = new Faculty(dean, "ФКН", new ArrayList<>() {{
            add(department);
        }});

        ArrayList<Faculty> faculties = new ArrayList<>() {{
            add(faculty);
        }};

        institute.setFaculties(faculties);

        var participation = new Participation(34);

        var project = new Project("WedCSF", new Date(167062077), new Date(999999999));

        var assistant = new ResearchAssociate("Сидоркин","IT");

        var admin = new AdministrativeEmployee("Шевцов");

        Object[] objects = new Object[]{admin, course, dean, department, faculty, institute, lecture, participation, project, assistant};


        System.out.println("-".repeat(50));
        for (Object cl : objects) {
            System.out.println(cl);
            System.out.println("-".repeat(50));
        }
        System.out.println();
        System.out.println("Работа методов");
        System.out.println();

        System.out.println("AdministrativeEmployee -->");
        admin.checkEquipment();
        System.out.println();
        System.out.println("Course -->");
        course.addNewTeacher(new Lecturer());
        System.out.println();
        System.out.println("Dean -->");
        dean.expelStudent();
        dean.makeTransferStudents();
        System.out.println();
        System.out.println("Department -->");
        department.addNewCourse(new Course());
        System.out.println();
        System.out.println("Faculty -->");
        faculty.addNewDepartment(new Department());
        faculty.updateDean(new Dean(""));
        System.out.println();
        System.out.println("Institute -->");
        institute.addNewFaculty(new Faculty());
        System.out.println();
        System.out.println("Lecturer -->");
        lecture.takeTest();
        lecture.tellTheMaterial();
        System.out.println();
        System.out.println("Participation -->");
        participation.addTime(2);
        System.out.println();
        System.out.println("Project -->");
        project.makeNewProjectData(new Date(), new Date());
        System.out.println();
        System.out.println("ResearchAssociate -->");
        assistant.updateFieldOfStudy("");
    }
}
