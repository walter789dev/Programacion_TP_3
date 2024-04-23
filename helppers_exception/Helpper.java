package helppers_exception;
import java.util.InputMismatchException;
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
        int option = 0;
        boolean validate = true;

        do {
            System.out.print(msj);
            try{
                option = input.nextInt();
                validate = Helpper.validateOption(max, option);
            }catch (InputMismatchException e){
                System.out.println("\nError: Ingrese un número válido.\n");
                input.nextLine();
            }
        }while (validate);
        return option;
    }

    private static boolean validateOption(int max, int option){
        if (option > max || option <= 0){
            System.out.println("\nLa opción elegida es invalida, intente nuevamente");
            return true;
        } else return false;
    }
}
