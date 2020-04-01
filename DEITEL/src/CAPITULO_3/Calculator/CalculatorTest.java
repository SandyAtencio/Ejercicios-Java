package CAPITULO_3.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        /* Exercise 3.16 (Calculadora de la frecuencia cardiaca esperada) */

        Calculator patient = new Calculator("Sergio","Rodriguez",17,01,1990);

        System.out.println("Paciente: " + patient.getName() + " " + patient.getLastName());
        System.out.println("Fecha de nacimiento: " + patient.getDay() + "/" + patient.getMonth() + "/" + patient.getYear());
        System.out.println("Edad: " + patient.calculateAge() + " años");
        System.out.println("Frecuencia cardiaca máxima: " + patient.maximumFrequency() + " ppm");
        System.out.println("Rango de frecuencia cardiaca esperada: " + patient.expectedFrequency() + " ppm");
    }
}
