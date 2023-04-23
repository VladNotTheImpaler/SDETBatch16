package HW.Project1;

public class Task9 {
    public static void main(String[] args) {

        int largest = 0;
        int secondLargest = 0;
        int[] nums = {423, 67, 42, 97, 88, 64, 47, 7, 46, 45, 43, 31, 86};
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] > largest) {
                secondLargest = largest;
                largest = nums[a];
            } else if (nums[a] > secondLargest) {
                secondLargest = nums[a];
            }
        }
        System.out.println(secondLargest);
    }
}
