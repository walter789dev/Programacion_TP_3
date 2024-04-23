package ejercicio_1;

public abstract class Person {
    private String name;
     private final int dni;

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }
}
