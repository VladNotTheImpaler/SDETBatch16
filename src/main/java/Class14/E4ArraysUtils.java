package Class14;

public class E4ArraysUtils {
    /*
    create a method to add int numbers, and it should return the results back when
    called name of the method should be add
     */

    /*
    return type => int
    name of the method => add
    parameters=> (int a, int b)
    body of the method => {
    int sum=a+b;
    }
     */

    int add(int a, int b){
        int sum=a+b;
        return sum;

    }

    public static void main(String[] args) {
        E4ArraysUtils obj = new E4ArraysUtils();
        /*we are calling the "add" method on "obj" object passing the arguments
        one is 10 other is 20 and storing the results from method call into the
        sum variable

         */
        int sum=obj.add(10, 20);
        System.out.println(sum);
        System.out.println(obj.add(10, 20));

    }
}
