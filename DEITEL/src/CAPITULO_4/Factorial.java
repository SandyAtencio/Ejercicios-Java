package CAPITULO_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        /*4.37 (Factorial) */

        int factorial = 1;

        System.out.print("Ingrese un número: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        for (int i = numero; i > 0; i--) {
            factorial *=  i;
        }
        System.out.printf("El factorial de  %d es %d", numero, factorial);

    }
}
