package exercise_4;
import helppers.Helpper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Scanner input = new Scanner(System.in);
        boolean validate = true;
        String msj = """
          ¿Que operación desea realizar: \s
          1. Agregar estudiante \s
          2. Buscar estudiante \s
          3. Ver estudiantes \s
          4. Promedio de notas \s
          5. Nota más alta \s
          6. Salir \s
          :""";

        while (validate){
            String name;
            int age, note;

            switch (Helpper.getOption(6, msj)){
                case 1: {
                    do {
                        System.out.print("\nIngrese nombre: ");
                        name = input.nextLine();
                    } while (Helpper.validateText(4, name, "Nombre"));

                    do {
                        System.out.print("Ingrese edad: ");
                        age = input.nextInt();
                    } while (validateInt(18, 70, age));

                    do {
                        System.out.print("Ingrese nota: ");
                        note = input.nextInt();
                    }while (validateInt(0, 10, note));

                    school.addStudent(new Student(name, age, note));
                    System.out.println();
                    input.nextLine();
                    break;
                }
                case 2: {
                    do {
                        System.out.print("\nIngrese nombre: ");
                        name = input.nextLine();
                    } while (Helpper.validateText(4, name, "Nombre"));

                    Student student = school.getStudent(name);
                    if (student == null) System.out.println("\nEstudiante no encontrado\n");
                    else System.out.println(student + "\n");
                    break;
                }
                case 3: {
                    if (school.isEmpty()) System.out.println("\nNo hay estudiantes inscriptos\n");
                    else {
                        System.out.println("\nEstudiantes");
                        school.showStudents();
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("\nEl promedio de las notas de los estudiantes es de: " + school.halfNotes() + "\n");
                    break;
                }
                case 5: {
                    System.out.println("\nEl alumno con la nota mayor es: \n" + school.getMaxNote() + "\n");
                    break;
                }
                case 6: {
                    validate = false;
                    System.out.println("\nSaliendo del programa");
                    break;
                }
            }
        }
    }

    private static boolean validateInt(int min , int max, int option){
        if (option < min || option > max) {
            System.out.println("El valor debe ser superior a " + min + " e inferior a " + max);
            return true;
        } else return false;
    }
}
