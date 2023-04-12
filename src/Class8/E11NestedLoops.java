package Class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        /*
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
    2 4 6 8 10
     */

        for (int i = 2; i < 10; i += 2) {
            for (int j = 2; j <= 10; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println("--------or--------");

        int counter = 0;
        while (counter < 4) {
            System.out.println(counter);
            counter++;

        }
    }
}
