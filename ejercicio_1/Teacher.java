package ejercicio_1;
import java.util.ArrayList;

public class Teacher extends Person {
    private String department;
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Teacher (String name, int dni, String department) {
        super(name, dni);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects(){
        return subjects;
    }
}
