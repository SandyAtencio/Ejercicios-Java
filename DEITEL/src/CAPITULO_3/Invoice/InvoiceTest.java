package CAPITULO_3.Invoice;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        /*Exercise 3.12*/

        Invoice invoice1 = new Invoice("NXB","Tornillos medianos",5.000);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de articulos: ");
        int quantity = input.nextInt();
        System.out.printf("%nEl valor total de su factura es %.3f", invoice1.getInvoiceAmount(quantity) );
    }
}
