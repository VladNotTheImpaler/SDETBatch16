package HW.Class14HW;

import java.util.Scanner;

public class Task2 {
    /*
    Create a method createEmail(). Based on values of users firstName,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    static String name, lastname, email;

    static String createdEmail() {

        System.out.println(name + lastname + email);

        return "";
    }

    public static void main(String[] args) {
       Task2 task2 = new Task2();
        email = "@gmail.com";

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name");
        name = scanner.nextLine();
        System.out.println("Lastname");
        lastname = scanner.nextLine();

        System.out.println(createdEmail());

    }
}