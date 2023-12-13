

public class Lecturer extends ResearchAssociate {

    public Lecturer(int ssNo,
                    float workExperience,
                    String name,
                    String email,
                    int counter) {
        super(name,"");
        this.name = name;
        this.counter = counter;
        this.workExperience = workExperience;
        this.ssNo = ssNo;
        this.email = email;
    }

    public Lecturer() {
        this(0, 0, "", "", 0);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "ssNo=" + ssNo +
                ", workExperience=" + workExperience +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", counter=" + counter +
                '}';
    }

    public void takeTest() {
        System.out.println("Сегодня пишем аттестацию по моему предмету");
    }

    public void tellTheMaterial() {
        System.out.println("Рассказывает материалы дисциплины");
    }

}