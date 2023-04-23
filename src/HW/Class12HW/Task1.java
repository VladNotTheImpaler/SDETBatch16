package HW.Class12HW;

public class Task1 {

    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        For Example String str=hello =>l

         */
        String str = "Hello World";
        if (str.isEmpty()) {
        } else if (str.length() % 2 == 1 && str.length() >= 3) {
            System.out.println(str.substring(5, 7));

        }
    }
}

