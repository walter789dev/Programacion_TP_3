package ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group g1 = new Group("Comisión 1", 'A');
        g1.addStudent("Marcelo", 67809123);
        g1.addStudent("Josefina", 67849173);

        Group g2 = new Group("Comisión 2", 'B');
        g2.addStudent("Pedro", 34123456);
        g2.addStudent("Ignacio", 67345123);

        Group g3 = new Group("Comisión 3", 'C');
        g3.addStudent("Roberto", 341246456);
        g3.addStudent("Esteban", 67390123);

        Teacher t1 = new Teacher("Jose", 56900124, "Matemática");
        Teacher t2 = new Teacher("Luis Miguel", 24045123, "Administración");

        Subject algebra = new Subject("Algebra", 10, "10:00", t1, g1);
        Subject statistics = new Subject("Estadística", 8, "13:30", t1, g2);
        Subject physical = new Subject("Física", 8, "08:30", t1, g2);
        Subject accounting = new Subject("Contabilidad", 3, "10:30", t2, g3);

        System.out.println("3ra Asignatura del profesor '" + t1.getName());
        Subject subj = t1.getSubjects().get(2);
        System.out.println("Asignatura: " + subj.getName() + ", Aula: " + subj.getClassroom());

        System.out.println("\n-----------------------------------\n");

        System.out.println("El profesor '" + t1.getName() + "' imparte: ");
        for (Subject subject : t1.getSubjects()) System.out.println(subject.getName());

        System.out.println("\n-----------------------------------\n");

        System.out.println("Estudiantes de " + algebra.getName());
        for (Student student : algebra.getGroup().getStudents()) System.out.println(student);

        System.out.println("\n-----------------------------------\n");

        System.out.println("'El alumno '" + g1.getStudents().get(0) +
                "' perteneciente a " + g1.getCourse() + " cursan: ");
        for (Subject subject : g1.getSubjects()) System.out.println(subject.getName());

        System.out.println("\n-----------------------------------\n");

        Scanner sc = new Scanner(System.in);
        boolean validate = true;

        while (validate) {
            System.out.print("Ingrese el nombre de la asignatura: \n1. Algebra \n2. Estadística \n3. Contabilidad \n4. Física \n5. Salir");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Su profesor es: " + algebra.getTeacher());
                }
                case 2: {
                    System.out.println("Su profesor es: " + statistics.getTeacher());
                    break;
                }
                case 3: {
                    System.out.println("Su profesor es: " + accounting.getTeacher());
                    break;
                }
                case 4: {
                    System.out.println("Su profesor es: " + physical.getTeacher());
                    break;
                }
                case 5: {
                    validate = false;
                    break;
                }
                default: {
                    System.out.println("Opción invalida");
                    break;
                }
            }
        }

        System.out.println("\n-----------------------------------\n");

        System.out.println("La 2da asignatura del profesor " + t1.getName() + " es "
                + t1.getSubjects().get(1).getName() + " la cual se imparte al grupo "
                + t1.getSubjects().get(1).getGroup().getCourse());

        System.out.print("Los alumnos son: ");
        for (Student student : t1.getSubjects().get(1).getGroup().getStudents())
            System.out.println(student.getName());


        System.out.println("En una asociación, dos instancias A y B relacionadas entre sí existen de forma independiente. No hay una relación fuerte.");
        System.out.println("La agregación es un tipo de relación que indica que un objeto forma parte o le pertenece a otro objeto. Una clase (la clase contenedora) \ncontiene una referencia a otra clase (la clase contenida) como uno de sus campos. Esta relación indica que la clase contenedora tiene una parte que es otra clase.");
        System.out.println("La composición es una relación como la agregación, pero más fuerte, es decir, un objeto no puede ser ese objeto sin otros objetos.");
    }
}
