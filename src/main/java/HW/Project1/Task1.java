package HW.Project1;

public class Task1 {
    public static void main(String[] args) {
        int[] temp = {85, 70, 65, 55, 60, 77, 80};

        int largest = temp[0];
        int lowest = temp[0];
        for (int num : temp) {
            if (num > largest) {
                largest = num;
            } else if (num < lowest) {
                lowest = num;
            }
        }
        System.out.println(largest);
        System.out.println();
        System.out.println(lowest);
    }
}


