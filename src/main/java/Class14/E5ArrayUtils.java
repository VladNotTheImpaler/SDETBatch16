package Class14;

public class E5ArrayUtils {
    boolean contains(int[] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}