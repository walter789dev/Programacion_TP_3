package helppers;

import java.util.Scanner;

public class Helpper {
    private static final Scanner input = new Scanner(System.in);

    public static boolean validateText(int max, String text, String msj){
        if(text.length() <= max){
            System.out.println("\n" + msj + " debe contener como mínimo 7 caracteres");
            return true;
        } else return false;
    }

    public static int getOption(int max, String msj){
        int option;
        do {
            System.out.print(msj);
            option = input.nextInt();
        }while (Helpper.validateOption(max, option));
        return option;
    }

    private static boolean validateOption(int max, int option){
        if (option > max || option <= 0){
            System.out.println("\nLa opción elegida es invalida, intente nuevamente");
            return true;
        } else return false;
    }
}
