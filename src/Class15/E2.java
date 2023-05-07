package Class15;

public class E2 {
    // create a method call it method1. in the body
    // it should print hello world
    void method1(){
        System.out.println("hello world");
    }

    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr
    // sumArr({10,10,10}) => 30
    // sumArr({10,10,40}) => 60
    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        E2 e2=new E2();
        int sum=e2.sumArr(new int[]{10,10,10});
        System.out.println(sum);
        // break till 11:58

    }
}