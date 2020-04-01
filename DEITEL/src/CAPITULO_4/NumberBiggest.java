package CAPITULO_4;

import java.util.Scanner;

public class NumberBiggest {
    public static void main(String[] args) {

        /*Exercise 4.21 (Encontrar el número más grande)*/

        Scanner input = new Scanner(System.in);
        int higher1 = 0;
        int counter = 1;
        int aux = 0;

        while(counter <= 10){

            System.out.println("Ingrese un numero");
            int number = input.nextInt();

                if (number > higher1) {
                    higher1 = number;
                    aux = number;
                } else {
                    aux = number;
                }

            counter++;
    }

        System.out.printf("El numero mas grande fue %d", higher1);

    }
}
