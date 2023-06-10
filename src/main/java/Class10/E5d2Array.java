package Class10;

public class E5d2Array {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 50, 65, 20},
                {102, 54, 60},
                {20, 55}
        };
//matrix[i]=> will return the complete 1D array at the index specified by the value of 1
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println();
        }
    }
}
