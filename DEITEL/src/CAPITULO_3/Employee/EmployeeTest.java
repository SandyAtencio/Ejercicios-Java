package CAPITULO_3.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        /*Exercise 3.13*/

        Employee employeeOne = new Employee("Sergio", "Rodriguez");
        Employee employeeTwo = new Employee("Sandy","Atencio");
        Scanner input = new Scanner(System.in);

        showInformation(employeeOne, input);
        showInformation(employeeTwo, input);

    }

    public static void showInformation(Employee employee, Scanner input){
        System.out.println("EMPLEADO: " + employee.getName() + " " + employee.getLastName());
        System.out.println("Ingrese el salario");
        double salary = input.nextDouble();
        employee.setSalary(salary);
        System.out.printf("%nSu salario anual es ==> %.3f", employee.getSalary());
        System.out.printf("%nEl valor de su aumento es ==> %.3f", employee.incrementSalary());
        System.out.printf("%nSu salario total es ==> %.3f", employee.totalSalary());
        System.out.println("\n*********************************************");
    }

}
