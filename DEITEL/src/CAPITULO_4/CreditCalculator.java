package CAPITULO_4;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {

        /*Exercise 4.18 (Calculadora de limite de credito)*/

        Scanner input = new Scanner(System.in);
        System.out.println("1. Para verificar credito, 0 para terminar");
        int flag = input.nextInt();

        while(flag != 0){
            System.out.println("Ingrese el numero de cuenta");
            int account = input.nextInt();
            System.out.println("Ingrese el saldo al inicio del mes");
            int balanceMonth = input.nextInt();
            System.out.println("Ingrese el total de los artículos cargados");
            int totalArticle = input.nextInt();
            System.out.println("Ingrese el total de todos los créditos");
            int totalCredit = input.nextInt();
            System.out.println("Ingrese el limite de créditos permitidos");
            int creditLimit = input.nextInt();

            int balance = balanceMonth + totalArticle - creditLimit;

            System.out.printf("El nuevo saldo para la cuenta %d es de %d%n", account, balance);

            System.out.println("*******************************************");

            if(balance > creditLimit){
                System.out.println("Se excedio el limite de su credito");
            }

            System.out.println("1. Para verificar credito, 0 para terminar");
            flag = input.nextInt();
        }

    }
}
