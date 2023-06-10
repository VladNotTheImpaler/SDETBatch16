package HW.Project1;

public class Task6 {
    public static void main(String[] args) {

        int num = 9;
        int counter = 0;
        for (int a = 1; a <= num; a++) {
            if (num % a == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

