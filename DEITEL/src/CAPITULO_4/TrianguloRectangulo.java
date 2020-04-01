package CAPITULO_4;

import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args){

        /* 4.36 (Lados de un triángulo Rectangulo) */

        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de lado a");
        a = entrada.nextInt();

        System.out.println("Ingrese el valor de lado b");
        b = entrada.nextInt();

        System.out.println("Ingrese el valor de lado c");
        c = entrada.nextInt();

        if(a != 0 && b != 0 && c != 0){

            double sumaCuadrados = Math.pow(a,2) + Math.pow(b, 2);
            double cuadradoLado  = Math.pow(c, 2);

            if( sumaCuadrados == cuadradoLado){
                System.out.println("Si es un triangulo rectangulo");
            }else{
                System.out.println("No es un triangulo rectangulo");
            }

        }else{
            System.out.println("Debe ingresar un valor diferente a 0");
        }

    }


}
