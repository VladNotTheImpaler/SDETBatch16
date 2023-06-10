package Class10;

public class E4D2Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };
        for (int j = 0; j < matrix.length; j++) {
            int[] arr1 = matrix[j];
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();

        }
    }
}
