package CAPITULO_4;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){

        /* 4.35 (Lados de un triángulo) */

        int a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de lado 1");
        a = entrada.nextInt();

        System.out.println("Ingrese el valor de lado 2");
        b = entrada.nextInt();

        System.out.println("Ingrese el valor de lado 3");
        c = entrada.nextInt();

        if(a != 0 && b != 0 && c != 0){
            if((a + b) > c && (a + c) > b && (b + c) > a){
                System.out.println("Si es un Triangulo!!");
            }else{
                System.out.println("No es un Triangulo!!");
            }
        }else{
            System.out.println("Debe ingresar un valor diferente a 0");
        }

    }


}
