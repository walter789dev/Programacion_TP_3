package ejercicio_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise_3 {
    public static void main(String[] args) {
        String [] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        ArrayList<String> days_list = new ArrayList<String>(Arrays.asList(days));
        int last_index = days_list.size() - 1;

        days_list.add(4, "Juernes");
        System.out.println("Posición 3: " + days_list.get(3) + " - Posición 4: " + days_list.get(4));
        System.out.println("Posición 0: " + days_list.get(0) + "Posición " + last_index + ": " + days_list.get(last_index));

        Iterator<String> iterator_list = days_list.iterator();
        while (iterator_list.hasNext()) {
            String next_item =  iterator_list.next();
            System.out.println(next_item);
        }

        System.out.println(days_list.contains("Lunes") ? "Existe el elemento 'Lunes'" : "No existe el elemento Lunes");
        for (String day : days_list)
            if (day.equalsIgnoreCase("Lunes"))
                System.out.println("Se encuentra Lunes");

        days_list.clear();
        System.out.println("Se han eliminado los elementos de la lista");
    }
}
