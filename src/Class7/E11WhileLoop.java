package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        //print numbers from 100 to 1
        int num = 100;
        while (num > 1) {
            System.out.print(num + " ");
            num--;
        }
        // Print even numbers from 20 ti 100
        num = 20; // assigning new value
        System.out.println(); // adding an empty line
        while (num <= 100) {
            System.out.print(num + " ");
            num += 2;
        }
        // print odd numbers from 100 to 1
        num = 100;
        System.out.println();
        while (num >= 1) {
            if (num % 2 != 0) { // our num % 2 + == 1
                System.out.print(num + " ");
            }
            num--;
        }
    }
}
