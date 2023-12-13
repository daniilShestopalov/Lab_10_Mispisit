

import java.util.Collection;
import java.util.Collections;

public class Institute {

    public String name;
    public String address;
    Collection<Faculty> faculties;

    public Institute(String name, String address, Collection<Faculty> faculties) {
        this.name = name;
        this.address = address;
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculties=" + faculties +
                '}';
    }

    public Institute() {
    }

    public void addNewFaculty(Faculty faculty) {
//        this.faculties.add(faculty);
        System.out.println("Факультет добавлен");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Collection<Faculty> faculties) {
        this.faculties = faculties;
    }
}