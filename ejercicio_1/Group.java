package ejercicio_1;
import java.util.ArrayList;

public class Group {
    private String course;
    private char letter;
    private final ArrayList<Subject> subjects = new ArrayList<Subject>();
    private final ArrayList<Student> students;

    public Group(String course, char letter) {
        this.course = course;
        this.letter = letter;
        students = new ArrayList<Student>();
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(String name, int dni) {
        students.add(new Student(name, dni));
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}
