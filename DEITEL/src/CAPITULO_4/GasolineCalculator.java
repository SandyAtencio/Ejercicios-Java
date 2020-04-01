package CAPITULO_4;

import java.util.Scanner;

public class GasolineCalculator {
    public static void main(String[] args) {

        /*Exercise 4.17 (Kilometraje de gasolina)*/

        Scanner input = new Scanner(System.in);

        int totalKilometres = 0;
        int totalLiters = 0;

        System.out.println("Introduzca 1 para registar el viaje, 0 para terminar");
        int flag = input.nextInt();


        while(flag != 0){

            System.out.println("Introduzca la cantidad de kilometros");
            int kilometres = input.nextInt();

            System.out.println("Introduzca la cantidad de litros");
            int liters = input.nextInt();

            totalKilometres += kilometres;
            totalLiters += liters;

            if(liters != 0 && kilometres != 0){
                double kilometresPerLiters = (double) kilometres / liters;
                System.out.printf("los kilómetros por litro obtenidos son %.2f", kilometresPerLiters);
                System.out.println();
                System.out.println("***************************");
            }else{
                System.out.println("No se recorrio ningun kilometro");
            }

            System.out.println("Introduzca 1 para registar el siguiente viaje, 0 para terminar");
            flag = input.nextInt();

        }
                if (totalLiters == 0 ) {
                    System.out.println("Adios!!!");
                }else{
                    double totalKilometresPerLiters = (double) totalKilometres / totalLiters;
                    System.out.printf("el total de kilómetros por litro obtenidos en todos los viajes hasta este punto es %.2f", totalKilometresPerLiters);
                }
    }

}
