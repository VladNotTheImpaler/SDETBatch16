package HW.Class13HW;

import java.util.Scanner;

public class Task2Palindrome {
    /*
    How would you check if String is palindrome or not? aba=> true
Abbc =>false
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String noSpaces = scan.nextLine().replace(" ", "");

        StringBuilder reversing = new StringBuilder(noSpaces);
        reversing.reverse();
        String checker = reversing.toString();

        boolean isPalindrome = checker.equalsIgnoreCase(noSpaces);

        System.out.println(isPalindrome);



    }
}
