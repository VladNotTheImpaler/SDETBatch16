package Class13;

public class Math {

    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void multiply(int num3, int num4) {
        System.out.println(num3 * num4);
    }

    public static void main(String[] args) {
        // creating the object of Math class calling it math
        Math math = new Math();
        //calling the method add and passing two values
        math.add(10, 10);
        math.multiply(10, 10);
    }
}
