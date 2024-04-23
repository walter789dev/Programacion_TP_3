package ejercicio_1;

public class Subject {
    private final int id_subject;
    private int classroom;
    private String hours;
    private String name;
    private Teacher teacher;
    private Group group;

    private static int nextId = 1;

    public Subject(String name, int classroom, String hours, Teacher teacher, Group group) {
        this.classroom = classroom;
        this.hours = hours;
        this.name = name;
        this.teacher = teacher;
        this.group = group;
        this.id_subject = nextId;
        nextId++;

        teacher.addSubject(this);
        group.addSubject(this);
    }

    public int getIdSubject(){
        return id_subject;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void addGroup(Group group) {
        this.group = group;
    }
}
