public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(String name) {
        this.name = name;
    }

    public void checkEquipment() {
        System.out.println("Оборудование исправно");
    }

    public AdministrativeEmployee() {
    }

    @Override
    public String
    toString() {
        return "AdministrativeEmployee{" +
                "name='" + name + '\'' +
                '}';
    }
}