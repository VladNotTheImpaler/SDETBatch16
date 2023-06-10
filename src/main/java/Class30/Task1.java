package Class30;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a method that will take an array of ints and will return the sum of the elements of the array method
        should be accessible throughout the project and method should be callable by just writing the name of the class.
         */
        int[] nums = {13,23,232};
        int result = sumArr(nums);
        System.out.println(result);
    }

    public static int sumArr(int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum+=num;
        }
        return sum;
    }
}