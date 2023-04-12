package Class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.next();

        if (name.equals("Elena")) {
            System.out.println("Mac User");
        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");
        } else if (name.equals("Axel")) {
            System.out.println("Bad Boy");

        }
    }
}
