package HW.Project1;

public class Task3 {
    public static void main(String[] args) {


        int[][] num = {{25, 62, 36, 95, 22},
                {23, 56, 34, 96,},
                {11, 26, 55, 15, 12},
        };

        for (int[] j : num) {
            for (int i : j) {

                if (i % 2 == 0) {

                    System.out.print(i + " ");
                }
            }
        }
    }
}