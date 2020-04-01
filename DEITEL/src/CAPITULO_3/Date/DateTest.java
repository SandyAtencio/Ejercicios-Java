package CAPITULO_3.Date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        /*Exercise 3.14*/

        Scanner input = new Scanner(System.in);
        Date date = new Date(01,01,1888);

        System.out.println("ingrese el dia");
        int day = input.nextInt();
        date.setDay(day);
        System.out.println("ingrese el mes");
        int month = input.nextInt();
        date.setMonth(month);
        System.out.println("ingrese el año");
        int year = input.nextInt();
        date.setYear(year);
        date.showDate();

    }
}
