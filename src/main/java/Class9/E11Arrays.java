package Class9;

public class E11Arrays {
    public static void main(String[] args) {
        /*
        There are two of creating arrays
        new int[5]=> create an array of int with size 5
        */
        int[] numbers = new int[5];
        numbers[0] = 50;
        numbers[1] = 60;
        numbers[2] = 70;
        numbers[3] = 80;
        numbers[4] = 90;
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
