package HW.Class12HW;

public class Task2 {
    public static void main(String[] args) {
    /*
              Create a String and print it in reverse order (Sunday → yadnuS).
    */
        String string = "Sunday";
        System.out.println();
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));

        }
    }
}