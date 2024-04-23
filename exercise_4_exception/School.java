package exercise_4_exception;
import java.util.ArrayList;

public class School {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(String name){
        for (Student student : students)
            if (student.getName().equalsIgnoreCase(name)) return student;
        return null;
    }

    public Student getMaxNote() {
        double max_note = 0;
        Student student_s = null;

        for (Student student : students){
            if (student.getNote() > max_note) {
                max_note = student.getNote();
                student_s = student;
            }
        } return student_s;
    }

    public double halfNotes(){
        double note = 0;
        for (Student student : students) note += student.getNote();
        return note / students.size();
    }

    public boolean isEmpty(){
        return students.isEmpty();
    }

    public void showStudents(){
        for (Student student : students) System.out.println(student);
    }
}
