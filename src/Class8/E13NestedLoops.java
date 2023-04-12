package Class8;

public class E13NestedLoops {
    public static void main(String[] args) {

        /*
        print this
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */
        for (int j = 1; j <= 3; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}