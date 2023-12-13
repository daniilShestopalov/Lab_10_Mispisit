
public class Dean extends Employee {
    public Dean(String name) {
       this.name = name;
    }

    public Dean() {
    }

    @Override
    public String toString() {
        return "Dean{" +
                "name='" + name + '\'' +
                '}';
    }

    public void makeTransferStudents() {
        System.out.println("Студенты переведены на следующий курс");
    }

    public void expelStudent() {
        System.out.println("Студент отчислен");
    }

}
