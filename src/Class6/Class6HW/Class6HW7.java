package Class6.Class6HW;

import java.util.Scanner;

public class Class6HW7 {
    public static void main(String[] args) {

        /*
        Allow user to enter grade (A, B, or C etc...) and then provide
        explanation: A-Excellent, B-Good, C-Average, D-Bad,
        any other grade --> Not Acceptable. At the end your program
        should print which grade was entered by a user with explanation.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String grade = scanner.nextLine();

        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Good");
        } else if (grade.equals("C")) {
            System.out.println("Average");
        } else if (grade.equals("D")) {
            System.out.println("Bad");
        } else {
            System.out.println("Not Acceptable");
        }

        System.out.println("You entered grade " + grade);
    }
}
