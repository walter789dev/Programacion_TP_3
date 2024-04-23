package excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2, resultado;
        int option;

        System.out.println("Ingrese el primer número:");
        num1 = getNumber();

        System.out.println("Ingrese el segundo número:");
        num2 = getNumber();

        String msj = """
        Seleccione la operación: \s
        1. Suma \s
        2. Resta \s
        3. Multiplicación \s
        4. División
        """;

        option = getOption(4, msj);
        try {
            switch (option) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                default:
                    System.out.println("Operador no válido.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double getNumber() {
        double number = 0;
        boolean validate = true;

        while (validate) {
            try {
                number = input.nextDouble();
                validate = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
        return number;
    }

    public static int getOption(int max, String msj){
        int option = 0;
        try{
            do {
                System.out.print(msj);
                option = input.nextInt();
            }while (validateOption(max, option));
        }catch (InputMismatchException e){
            System.out.println("Error: Ingrese un número válido.");
        }
        return option;
    }

    private static boolean validateOption(int max, int option){
        if (option > max || option <= 0){
            System.out.println("\nLa opción elegida es invalida, intente nuevamente");
            return true;
        } else return false;
    }
}
