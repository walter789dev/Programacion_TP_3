package ejercicio_2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSupervisor(Employee employee){
        supervisor = employee;
    }

    public String getSupervisor(){
        if (supervisor == null) return "Sin supervisor";
        else return supervisor.getName();
    }
}
