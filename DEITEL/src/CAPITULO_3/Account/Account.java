package CAPITULO_3.Account;

public class Account {

    private String nombre;
    private double saldo;

    public Account(String nombre, double saldo){
        this.nombre = nombre;

        if(saldo > 0.0){
            this.saldo = saldo;
        }
    }

    /**
     * Descripcion: Funcion que permite validar que el monto a depositar sea mayor a 0
     * @param montoDeposito Cantidad del dinero que se va a depositar en la cuenta
     *
     * */
    public void depositar(double montoDeposito){
        if(montoDeposito > 0.0){
            saldo = saldo + montoDeposito;
        }
    }

    /**
     * Descripcion: Funcion que permite validar que el saldo sea mayor al monto que se desea retirar.
     * @param montoRetirar Cantidad de dinero que se retira de la cuenta
     *
     * */
    public void retirar(double montoRetirar){
        if(saldo > montoRetirar){
            saldo = saldo - montoRetirar;
        }else{
            saldo = saldo;
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return nombre;
    }
}
