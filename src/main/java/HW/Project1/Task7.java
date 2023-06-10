package HW.Project1;

public class Task7 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1, total = 0;
        for (int a = 0; a < 10; a++) {
            total = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = total;
        }
    }
}