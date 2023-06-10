package Class15;

import java.util.Arrays;

public class E1 {
    /*
   The createArray(size) method takes an integer parameter size and
   creates an array of that size. It then fills the array with the number
   10 using a for loop, and finally returns the array.
    */
    // createArray(5) => {10,10,10,10,10}
    // createArray(3) => {10,10,10}
    int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =10;
        }
        return arr;
    }

    public static void main(String[] args) {

        E1 e1=new E1();
        int[] array = e1.createArray(5);
      //  System.out.println(Arrays.toString(array));
       /*
        for (int i : array) {
         System.out.println(i);
         }
        */
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
           
        
    }

}
