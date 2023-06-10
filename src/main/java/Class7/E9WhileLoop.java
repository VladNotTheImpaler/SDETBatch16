package Class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        // print 25 20 10 5 using a while loop hint using if condition
        int counter = 25; // 25 is where we start counting

        while (counter >= 5) { // this is where we stop

            if (counter != 15) {// we do not want to print 15
                /* printing our list of numbers from 25 to 5
                without printing 15
                 */

                System.out.print(counter + " "); // printing our list with a space between numbers

            }
            counter -= 5; // counter=counter-5
            /* minus 5 every output
            so starting point is 25-5=20 (printing 20)
            now 20-5= 15 We do not want to print 15 so keep counting
            15-5=10 (printing 10)
            10-5=5 (printing 5)
            and this is our final number.
             */
        }

    }
}