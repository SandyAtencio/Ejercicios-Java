package CAPITULO_3.Medical;

import java.util.Calendar;

public class medicalProfile {
    private String name;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private int weight;

    public medicalProfile(String name, String lastName, String gender, int day, int month, int year, double height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0) {
            this.year = year;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int calculateAge(){
        Calendar date = Calendar.getInstance();
        int age = (date.get(Calendar.YEAR) - getYear());
        return age;
    }

    public double maximumFrequency(){
        double maximum = 220 - calculateAge();
        return maximum;
    }

    public double expectedFrequency(){
        double expected = maximumFrequency()*0.85;
        return expected;
    }

    public double BMI(){
        return getWeight() /(getHeight() * getHeight());
    }

    public void bmiValues(){
        System.out.println("*************************************");
        System.out.println("=>VALORES DEL BMI<=");
        System.out.println("Bajo peso:  menos de 18.5");
        System.out.println("Normal:     entre 18.5 y 24.9");
        System.out.println("Sobrepeso:  entre 25 y 29.9");
        System.out.println("Obeso:       30 o mas");
    }

}
