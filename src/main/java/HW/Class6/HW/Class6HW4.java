package HW.Class6.HW;

import java.util.Scanner;

public class Class6HW4 {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
        Based on the month define the season.
        Example: if user is born in March, April, May → season = ” Spring ”
        if user is born in June, July, August → season = ” Summer ”  etc …
        At the end of the program we should see 1 output as
        “You were born is season __”.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month you are born in in numbers");
        int month = scanner.nextInt();
        //Seasons

        String season;

        if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month <= 11) {
            season = "Fall";
        } else {
            season = "Winter";
        }

        System.out.println("You were born in season " + season + ".");

    }
}
