package exercise_4_exception;

public class Student {
    private String name;
    private int age;
    private double note;

    public Student(String name, int age, double note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Estudiante: " + getName() + ", edad: " + getAge() + ", nota: " + getNote();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
