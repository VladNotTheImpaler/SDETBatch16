package HW.Project1;

public class Task8 {
    public static void main(String[] args) {

        int[] values = {44, 56, 95, 64, 75, 86, 97, 75, 46, 65, 10};
        int max = values[0];
        int min = values[0];
        for (int a = 0; a < values.length; a++) {
            if (values[a] > max) {
                max = values[a];
            }
        }
        System.out.println("Maximum value is " + max);
        System.out.println();
        for (int b = 0; b < values.length; b++) {
            if (values[b] < min) {
                min = values[b];
            }
        }
        System.out.println("Minimum value is " + min);
    }
}