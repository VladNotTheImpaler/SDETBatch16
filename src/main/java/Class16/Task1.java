package Class16;

public class Task1 {
    /*
    Create a method that will accept an array as parameters and will return a
     sum of all elements from that array. Method should be visibly only within same
      package and accessible by the creating an instance of the class.
     */
    int sumArray(int[] arr){
        int sum = 0;

        for (int num: arr) {
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int result = task1.sumArray(new int [] {10,10,10});
        System.out.println(result);
    }
}
