package CAPITULO_4;

public class TabularOutput {
    public static void main(String[] args) {

        /*Exercise 4.22 (Salida tabular) */

        System.out.println("N   10*N    100*N   1000*N");

       for (int n = 1; n <= 5 ; n++) {
            System.out.printf("%d     %d      %d     %d%n", n, 10*n, 100*n, 1000*n);
        }

    }
}
