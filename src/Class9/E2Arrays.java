package Class9;
        /*
       create an array of int and store numbers from 30 40 50 90 inside it
       and access only the number 50
        */
public class E2Arrays {
    public static void main(String[] args) {

        int[] numbers={30,-5,50,90};
        /*
        When we try to access an element using an index which does not exist
         */
        // System.out.println(numbers[20]);
        //ArrayIndexOutOfBoundsException
        // System.out.println(numbers[-5]);
        System.out.println(numbers[1]);

    }
}
