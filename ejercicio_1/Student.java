package ejercicio_1;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Group> groups;

    public Student(String name, int dni) {
        super(name, dni);
        this.groups = new ArrayList<Group>();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addGroups(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + ", dni: " + getDni();
    }
}
