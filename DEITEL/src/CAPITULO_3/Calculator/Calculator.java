package CAPITULO_3.Calculator;

import java.util.Calendar;

public class Calculator {

    private String name;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public Calculator(String name, String lastName, int day, int month, int year) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
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

}
