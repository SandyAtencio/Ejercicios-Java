package CAPITULO_3.Employee;

public class Employee {
    private String name;
    private String lastName;
    private double salary;

    public Employee(String name, String lastName ){
        this.name = name;
        this.lastName = lastName;
        this.salary = 0.0;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary*12;
        }
    }

    public double incrementSalary(){
        double increment = (getSalary()*0.1);
        return increment;
    }

    public double totalSalary(){
        double total = (getSalary()) + (incrementSalary());
        return  total;
    }
}
