package Class10;

public class E2D2Arrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0]=10;
        matrix[1][1]=20;
        matrix[2][2]=50;

        //error as max index for column is 2
        //System.out.println(matrix[1][3]);
        System.out.println(matrix[2][1]);



        }
    }
