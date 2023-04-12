package Class3;

public class E13TypeCasting {
    public static void main(String[] args) {
        // byte>short>int>long>float>double

        byte num=127;
        short num2=num;
        //no issues as we are
        System.out.println(num2);

        int num3=1111120;
        double num4=num3;
        System.out.println(num4);

    }
}
