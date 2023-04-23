package Class12;

import java.util.Scanner;

public class E1StringDemo {

    public static void main(String[] args) {

        // create the object of that class
        //ClassName objectName = new ClassName();
        // same pattern as Scanner scanner = new Scanner(System.in);
        // String s = new String("Ana");
        String string1 = "Ana"; // most widely used one
        System.out.println(string1.length());

        String name = "Justin Chuckwudiuche";

        if (name.length() > 8) {
            System.out.println("Only 8 characters are allowed");
        }
    }
}
