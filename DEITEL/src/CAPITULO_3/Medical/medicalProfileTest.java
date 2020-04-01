package CAPITULO_3.Medical;

public class medicalProfileTest {

    public static void main(String[] args) {

        /*Exercise 3.17 (Computarización de los registros médicos) */

        medicalProfile patient = new medicalProfile("Sergio","Rodriguez","male",17,01,1990,1.90,94);

        showInformation(patient);
        patient.bmiValues();
    }

    public static void showInformation(medicalProfile patient){
        System.out.println("Paciente: " + patient.getName() + " " + patient.getLastName());
        System.out.println("Fecha de nacimiento: " + patient.getDay() + "/" + patient.getMonth() + "/" + patient.getYear());
        System.out.println("Sexo: " + patient.getGender());
        System.out.println("Altura: " + patient.getHeight() + " Mts.");
        System.out.println("Peso: " + patient.getWeight() + " Kg.");
        System.out.println("Edad: " + patient.calculateAge() + " años");
        System.out.println("BMI: " + patient.BMI());
        System.out.println("Frecuencia cardiaca máxima: " + patient.maximumFrequency() + " ppm");
        System.out.println("Rango de frecuencia cardiaca esperada: " + patient.expectedFrequency() + " ppm");
    }

}
