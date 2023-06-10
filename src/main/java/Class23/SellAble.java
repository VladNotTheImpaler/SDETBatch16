package Class23;

public interface SellAble {

//    private int PRICE = 12000; private access modifier not allowed
//    protected int PRICE = 12000; protected access modifier not allowed
        int PRICE = 12000;

//    ONLY and ONLY public because its public static final by default

//    final abstract void sell();
//    final not allowed as methods are abstract by default

//    static void sell();
//    not allowed as static methods can`t be overridden

//    private void sell();
//    not allowed as not one will be able to provide implementations

//    protected void sell(); not allowed

    static void sell(){
        System.out.println("Static is ALLOWED because you dont need to create an object");
    }
}
class Tester1{
    public static void main(String[] args) {

    }
}
