package Class19;

public class Math {
    /* method overloading with the same name but different signatures.
    difference can be
     -data type ( int to double to long, etc. )
     -data number of parameters (int(1 parameter) to int, double(2 parameters), etc.)
     -sequence (int, double to double, int) - here we have same data type with different sequence.
     */
   static void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    // we must have different 1)number of parameters 2) data type of parameters 3) sequence of dataTypes

    public static void main(String[] args) {
            add(10,10);
            add(10,20.5);
            add(2.5,2.5);

    }
}
