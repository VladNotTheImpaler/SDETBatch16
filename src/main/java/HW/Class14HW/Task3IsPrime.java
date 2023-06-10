package HW.Class14HW;

import java.util.Scanner;

public class Task3IsPrime {
    /*
    Write a method to return whether given number is prime or not?
     */

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int takenNum = scanner.nextInt();

        boolean isInputPrime = isPrime(takenNum);

        if (isInputPrime) {
            System.out.println(takenNum + " is a prime number.");
        } else {
            System.out.println(takenNum + " is not a prime number.");
        }
    }
}