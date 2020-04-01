package CAPITULO_4;

public class AsterisksPattern {
    public static void main(String[] args) {

        /*Exercise 4.32 (Patrón de asteriscos en forma de tablero de damas)*/

        for (int i = 1; i <= 4 ; i++) {
            System.out.print("* * * * * * * *");
            System.out.print(" ");
            System.out.println();
            for (int j = i; j <= i; j++) {
                System.out.print(" * * * * * * * *");
                System.out.print(" ");
                System.out.println();
            }
        }
    }
}
