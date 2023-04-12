package Class6.Class6HW;

import java.util.Scanner;

public class Class6HW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country using capital letters ONLY : ");
        String country = scanner.nextLine();

        if (country.equals("USA")) {
            System.out.println("You speak English.");
        } else if (country.equals("MEXICO")) {
            System.out.println("You speak Spanish.");
        } else if (country.equals("GERMANY")) {
            System.out.println("You speak German.");
        } else if (country.equals("CHINA")) {
            System.out.println("You speak Chinese.");
        } else {
            System.out.println("Unknown country entered.");
        }
    }
}
