package Class14;

public class E6 {
    boolean isEven(int number) {
        /* or write line #12
        boolean even = false;
        if (number % 2 == 0) {
            even = true;
        }
        return even;
        */
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        E6 obj = new E6();
        /*
        int num = 20;
        boolean result = obj.isEven(num);
         */
        System.out.println(obj.isEven(15));

    }
}