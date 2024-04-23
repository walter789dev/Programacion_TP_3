package exercise_5_exception;
import java.util.ArrayList;
import java.util.Iterator;

public class ListTasks implements Iterable<Task>{
    private ArrayList<Task> list_tasks = new ArrayList<Task>();

    public void addTask(Task task){
        list_tasks.add(task);
        System.out.println("\nSe ha creado la tarea con éxito\n");
    }

    public void removeTask(String description){
        for (Task listTask : list_tasks) {
            if (listTask.getDescription().equalsIgnoreCase(description)) {
                list_tasks.remove(listTask);
                break;
            }
        }
        System.out.println("\nSe ha eliminado la tarea con éxito\n");
    }

    public int countTask(){
        return list_tasks.size();
    }

    public boolean isEmpty(){
        return list_tasks.isEmpty();
    }

    @Override
    public Iterator<Task> iterator() {
        return new listTaskIterator();
    }

    // Iterator de Lista de Tareas
    private class listTaskIterator implements Iterator<Task>{
        // Creo una copia de la lista para manejar prioridades
        private ArrayList<Task> copy_list = new ArrayList<Task>();
        private int index = 0;

        public listTaskIterator() { // Obtengo el mayor nivel de prioridad
            copy_list.addAll(list_tasks);
            for (Task task : copy_list) if (task.getPriority() > index) index = task.getPriority();
        }

        @Override
        public boolean hasNext() {
            return !copy_list.isEmpty();
        }

        @Override
        public Task next() {
            while (true){ // Sí existen 2 tareas con la misma prioridad
                for (Task task : copy_list) { // Elimino para que siga el siguiente en prioridad
                    if (task.getPriority() == index){
                        copy_list.remove(task);
                        return task;
                    }
                }
                index--; // Disminuyo la prioridad
            }
        }
    }
}
