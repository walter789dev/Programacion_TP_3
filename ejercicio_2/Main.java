package ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Mariano");
        Employee employee_2 = new Employee("Jose");
        Employee supervisor = new Employee("Luis Miguel");

        employee_1.addSupervisor(supervisor);
        System.out.println("Supervisor de " + employee_1.getName() + ": " + employee_1.getSupervisor());
        System.out.println("Supervisor de " + employee_2.getName() + ": " + employee_2.getSupervisor());
    }
}
