package Class11;

public class E1D2Array {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        // print only odd numbers from this 2d array using loop
        //arr[i] => gives me the array at specific index by i
        // int [] innerArray=arr[i]; => innerArray.length

        for (int rowNo = 0; rowNo <arr.length ; rowNo++) {
            for (int colNo = 0; colNo <arr[rowNo].length ; colNo++) {
                int element=arr[rowNo][colNo];
                if(element%2!=0){
                    System.out.println(element);
                }

            }
        }

    }
}