package exercise_5;
import helppers.Helpper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListTasks pending_tasks = new ListTasks();

        boolean validate = true;
        String msj ="""
         ¿Que operación desea realizar: \s
         1. Agregar Tarea \s
         2. Ver Tareas \s
         3. Eliminar Tarea \s
         4. Salir \s
         :""";

        while (validate){
            String text;
            switch (Helpper.getOption(4, msj)){
                case 1: {
                    do {
                        System.out.print("\nIngrese descripción: ");
                        text = input.nextLine();
                    } while (Helpper.validateText(7, text, "Descripción"));

                    System.out.print("Ingrese prioridad: ");
                    int priority = input.nextInt();
                    pending_tasks.addTask(new Task(text, priority));
                    input.nextLine();
                    break;
                }
                case 2: {
                    if (pending_tasks.isEmpty()) System.out.println("\nNo hay tareas pendientes\n");
                    else {
                        System.out.println("\nCantidad de Tareas: " + pending_tasks.countTask());
                        for (Task pendingTask : pending_tasks)
                            System.out.println("Tarea: " + pendingTask.getDescription() +
                                    ", prioridad: " + pendingTask.getPriority());
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    do {
                        System.out.print("\nIngrese descripción: ");
                        text = input.nextLine();
                    }while (Helpper.validateText(7, text, "Descripción"));

                    pending_tasks.removeTask(text);
                    break;
                }
                case 4: {
                    validate = false;
                    System.out.println("\nSaliendo del programa");
                    break;
                }
            }
        }
    }
}
