package HW.Class6.HW;

import java.util.Scanner;

public class Class6HW3 {
    public static void main(String[] args) {

        /*
        Write a program that will ask user to input inputs the current
        time (use 24hour format).
        Based on the given time define:
        if hour is between 1-11 --> Morning
        if hour between 12-15 --> Afternoon
        if hour between 16-20 --> Evening
        if hour between 21-24 --> Night
        */

        Scanner i=new Scanner(System.in);
        System.out.println("Please enter current time(just hour) in 24h format");
        int time= i.nextInt();

        if (time>0 && time<12){
            System.out.println("Morning");
        } else if (time>11 && time<16) {
            System.out.println("Afternoon");
        } else if (time>15 && time<21) {
            System.out.println("Evening");
        } else if (time>20 && time<25){
            System.out.println("Night");
        } else {
            System.out.println("try again");
        }

    }
}
