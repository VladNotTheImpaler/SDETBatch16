package Class4.Class4HW;

import java.util.Scanner;

public class Class4HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        if (age == 15 || age == 16 || age == 17) {
            System.out.println("You can apply for a learners permit until you will turn 18");
        }
        if (age < 15) {
            System.out.println("To begin the process, the applicant must be 15 years old, be enrolled");
            System.out.println("in an approved driver education course, and have the consent of a parent");
            System.out.println("or legal guardian. Once a vision and written exam have been passed,");
            System.out.println("the permit must be held for a minimum of nine months and maximum of two years.");
        }
        if (age >= 18) {
            System.out.println("Please proceed to counter number 13 to apply for your Driver License");
        }
    }
}

