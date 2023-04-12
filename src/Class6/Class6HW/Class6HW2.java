package Class6.Class6HW;

import java.util.Scanner;

public class Class6HW2 {
    public static void main(String[] args) {

        /*
        Ask user to enter a number and then define
        if number is small, medium or large
        Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000
        */

            Scanner number=new Scanner(System.in);
            System.out.println("Please enter a number");

            int myNumber=number.nextInt();
            if (myNumber>0 && myNumber<11){
                System.out.println("Small number");
            } else if (myNumber>10 && myNumber<101) {
                System.out.println("Medium number");
            } else if (myNumber>100 && myNumber<1001){
                System.out.println("Large number");
            } else {
                System.out.println("Entered number is too large");
            }
    }
}
