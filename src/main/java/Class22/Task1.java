package Class22;

import java.util.Scanner;

public class Task1 {
    Scanner input = new Scanner(System.in);

    public boolean numFromArr(int[] arr) {
        boolean isNumber = false;
        int a = input.nextInt();
        for (int i : arr) {
            if (i == a) {
                isNumber = true;
                break;
            }
        }
        return isNumber;
    }
}
