package CAPITULO_3.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        /*Exercise 3.11 - 3.15*/

        Account account1 = new Account("Sergio",100.000);
        Account account2 = new Account("Sandy",50.000);

        mostrarCuenta(account1);
        mostrarCuenta(account2);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar en la account1: ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.3f al saldo  de account1%n%n", montoDeposito);
        account1.depositar(montoDeposito);

        mostrarCuenta(account1);
        mostrarCuenta(account2);

        System.out.print("Escriba el monto a depositar en la account2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.3f al saldo  de account2%n%n", montoDeposito);
        account2.depositar(montoDeposito);

        mostrarCuenta(account1);
        mostrarCuenta(account2);

        System.out.println("Escriba el monto a retirar en la account1: ");
        double montoRetirar = entrada.nextDouble();
        System.out.printf("%nRetirando %.3f del saldo  de la account1%n%n", montoRetirar);
        account1.retirar(montoRetirar);

        System.out.printf("El nuevo saldo de %s: $%.3f%n", account1.obtenerNombre(), account1.obtenerSaldo());

        System.out.println("Escriba el monto a retirar en la account2: ");
        montoRetirar = entrada.nextDouble();
        System.out.printf("%nRetirando %.3f del saldo  de la account1%n%n", montoRetirar);
        account2.retirar(montoRetirar);

        System.out.printf("El nuevo saldo de %s: $%.3f%n", account2.obtenerNombre(), account2.obtenerSaldo());
    }

    public static void mostrarCuenta(Account account){

        System.out.printf("Saldo de %s: $%.3f%n", account.obtenerNombre(), account.obtenerSaldo());
    }
}
