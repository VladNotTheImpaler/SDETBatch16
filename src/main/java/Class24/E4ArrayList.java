package Class24;

public class E4ArrayList {
    public static void main(String[] args) {
//        convert the primitives to a wrapper type. this is called boxing
//        it was removed after JDK 11
//        Integer integer = new Integer(10); - BOXING
        Integer integer = 10; // AUTOBOXING

        int num=integer.intValue(); // unboxing
        int num2=integer; //auto unboxing

        Integer integer2 = 10;

        int number = integer2;

    }
}
