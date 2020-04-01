package CAPITULO_4;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {

        /*Exercise 4.19 (Calculadora de comisiones de ventas) */

        Scanner input = new Scanner(System.in);

        final int valueWeek = 200;
        final double percentage = 0.09;
        double totalSales = 0;

        System.out.println("Ingrese el numero del articulo , 0 para terminar");

        int flag = input.nextInt();

        while(flag != 0){

            switch (flag){
                case 1:
                    double article1 = 239.99;
                    totalSales += article1;
                    break;
                case 2:
                    double article2 = 129.75;
                    totalSales += article2;
                    break;
                case 3:
                    double article3 = 99.95;
                    totalSales += article3;
                    break;
                case 4:
                    double article4 = 350.89;
                    totalSales += article4;
                    break;
            }
            System.out.println("Ingrese un nuevo numero de articulo, 0 para terminar");
            flag = input.nextInt();
        }
        System.out.println("los ingresos del vendedor son: " + (totalSales * percentage + valueWeek) );
    }
}
