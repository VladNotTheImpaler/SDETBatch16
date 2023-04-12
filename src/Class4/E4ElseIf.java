package Class4;

public class E4ElseIf {
    public static void main(String[] args) {
        String fruit = "Apple";

        if (fruit.equals("Orange")) {
            System.out.println("You have to pay $12");
        } else if (fruit.equals("Banana")) {
            System.out.println("You have to pay $5");
        } else if (fruit.equals("Apple")) {
            System.out.println("You have to pay $4");
        } else {
            System.out.println("This fruit is not available");

        }
    }

}
