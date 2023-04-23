package HW.Class6.HW;

import java.util.Scanner;

public class Class6HW1 {
    public static void main(String[] args) {

        /*
        Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, any day from 6-7 →
        output “It is a weekend”, any other day → output “Invalid day”
         */


        Scanner dayOfTheWeek = new Scanner(System.in);
        System.out.println("Please enter day# of the week 1 to 7 ");

        int day = dayOfTheWeek.nextInt();
        if (day > 5 && day < 8){
            System.out.println("It is a Weekend");

        }else if (day > 0 && day < 6) {
            System.out.println("It is a Weekday");
        }else{
            System.out.println("Invalid Day");
        }
    }
}


